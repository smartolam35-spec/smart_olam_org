package com.example.smart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.smart.dto.application.ApplicationCreate;
import com.example.smart.dto.application.ApplicationResponse;
import com.example.smart.dto.application.ApplicationUpdate;
import com.example.smart.repository.ApplicationRepository;

@Service
public class ApplicationService extends AbstractService<ApplicationRepository> implements GenericService<
       ApplicationResponse,ApplicationUpdate,ApplicationCreate,Long> {

    protected ApplicationService(ApplicationRepository repository) {
        super(repository);
       }

    @Override
       public ApplicationResponse create(ApplicationCreate createDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
       }

       @Override
       public ApplicationResponse update(ApplicationUpdate updateDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
       }

       @Override
       public Long delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
       }

       @Override
       public ApplicationResponse get(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
       }

       @Override
       public List<ApplicationResponse> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
       }
    
}
