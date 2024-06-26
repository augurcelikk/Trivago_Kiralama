package com.ugur.graphql.query;

import com.ugur.dto.request.UserProfileRequestDto;
import com.ugur.graphql.model.UserProfileInput;
import com.ugur.repository.entity.UserProfile;
import com.ugur.service.UserProfileElasticService;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserProfileQueryResolver {

    private final UserProfileElasticService userProfileElasticService;
    @QueryMapping
    public Iterable<UserProfile> findAll(){
        return userProfileElasticService.findAll();
    }
    @QueryMapping
    public UserProfile findById(@Argument String id){
        return userProfileElasticService.findById(id);
    }

    @MutationMapping
    public UserProfile saveUser(@Argument UserProfileInput input){
        userProfileElasticService.save(UserProfileRequestDto.builder()
                        .userName(input.getUserName())
                        .authId(input.getAuthId())
                        .email(input.getEmail())
                        .phone(input.getPhone())
                        .name(input.getName())
                        .photo(input.getPhoto())
                .build());
        return new UserProfile(); 
    }
}
