package com.ugur.mapper;

import com.ugur.dto.request.RegisterRequestDto;
import com.ugur.dto.request.UserProfileSaveRequestDto;
import com.ugur.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthMapper {
    AuthMapper INSTANCE = Mappers.getMapper(AuthMapper.class);

    Auth fromDto(final RegisterRequestDto dto);

    //List<Auth> authListFromDto(final List<RegisterRequestDto> dtos);
    @Mapping(source = "id",target = "authId")
    UserProfileSaveRequestDto fromAuth(final Auth auth);
}
