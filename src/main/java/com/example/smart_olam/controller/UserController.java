package com.example.smart_olam.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smart_olam.dto.registerRequest.AuthResponse;
import com.example.smart_olam.dto.registerRequest.LoginRequest;
import com.example.smart_olam.dto.registerRequest.LoginResponse;
import com.example.smart_olam.dto.registerRequest.RefreshRequest;
import com.example.smart_olam.dto.registerRequest.RegisterRequest;
import com.example.smart_olam.dto.registerRequest.UserCheckRequest;
import com.example.smart_olam.model.User;
import com.example.smart_olam.security.JwtService;
import com.example.smart_olam.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder; 

    @PostMapping("/register")
    public AuthResponse register(@RequestBody RegisterRequest request) {
        User user = userService.createUser(
                request.getUsername(),
                request.getPassword(),
                request.getRole()
        );

        String accessToken = jwtService.generateToken(user);
        String refreshToken = jwtService.generateRefreshToken(user);

        return new AuthResponse(accessToken, refreshToken);
    }

    // Refresh token endpoint
    @PostMapping("/refresh-token")
    public AuthResponse refreshToken(@RequestBody RefreshRequest request) {
        String refreshToken = request.getRefreshToken();
        String username = jwtService.extractUsername(refreshToken);
        User user = userService.getByUsername(username);

        if (!jwtService.isTokenValid(refreshToken, user)) {
            throw new RuntimeException("Refresh token invalid or expired");
        }

        String newAccessToken = jwtService.generateToken(user);
        String newRefreshToken = jwtService.generateRefreshToken(user); // ixtiyoriy, agar refresh tokenni yangilamoqchi bo‘lsangiz

        return new AuthResponse(newAccessToken, newRefreshToken);
    }

    @PostMapping("/check-user")
    public ResponseEntity<?> checkUser(@RequestBody UserCheckRequest request) {
        User user = userService.getByUsername(request.getUsername());
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request) {
        User user = userService.getByUsername(request.getUsername());

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
           throw new RuntimeException("Invalid username or password");
        }

        String accessToken = jwtService.generateToken(user);
        String refreshToken = jwtService.generateRefreshToken(user); // refresh token yaratish

        return new LoginResponse(accessToken, refreshToken);
    }
}


