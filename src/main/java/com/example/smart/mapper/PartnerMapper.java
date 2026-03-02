package com.example.smart.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.example.smart.dto.partner.PartnerCreate;
import com.example.smart.dto.partner.PartnerResponse;
import com.example.smart.dto.partner.PartnerUpdate;
import com.example.smart.model.Partner;

@Mapper(componentModel = "spring",uses = LessonMapper.class,nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface PartnerMapper extends BaseMapper<
    Partner,
    PartnerResponse,
    PartnerCreate,
    PartnerUpdate
    
    >  {
    List<PartnerResponse> toPubDto(List<Partner> partner);
}
