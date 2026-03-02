package com.example.smart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.smart.dto.partner.PartnerCreate;
import com.example.smart.dto.partner.PartnerResponse;
import com.example.smart.dto.partner.PartnerUpdate;
import com.example.smart.enums.Role;
import com.example.smart.mapper.PartnerMapper;
import com.example.smart.model.Partner;
import com.example.smart.model.User;
import com.example.smart.repository.PartnerRepository;
import com.example.smart.repository.UserRepository;

@Service
public class PartnerService extends AbstractService<PartnerRepository> implements GenericService<
     PartnerResponse,PartnerUpdate,PartnerCreate,Long>{

    private final UserRepository userRepository;
    private final PartnerMapper partnerMapper;

    protected PartnerService(PartnerRepository repository,UserRepository userRepository,PartnerMapper partnerMapper) {
        super(repository);
        this.userRepository = userRepository;
        this.partnerMapper = partnerMapper;
     }

    @Override
     public PartnerResponse create(PartnerCreate createDto) {
         User user = userRepository.findById(createDto.userId).get();
          if (user.getRole() != Role.USER) {
             throw new RuntimeException("User role must be PARTNER");
          }
         user.setRole(Role.PARTNER);
         userRepository.save(user);
         Partner partner = partnerMapper.fromCreateDto(createDto);
         partner.setUser(user);
         Partner savedPartner = repository.save(partner);
         return partnerMapper.toDto(savedPartner);
     }

     @Override
     public PartnerResponse update(PartnerUpdate updateDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
     }

     @Override
     public Long delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
     }

     @Override
     public PartnerResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
     }

     @Override
     public List<PartnerResponse> getAll() {
        return partnerMapper.toPubDto(repository.findAll());
     }
    
}
