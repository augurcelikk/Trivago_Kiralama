package com.ugur.utility;

import com.ugur.manager.ElasticSearchUserProfileManager;
import com.ugur.mapper.UserProfileMapper;
import com.ugur.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;

//@Component
@RequiredArgsConstructor
public class TestAndRun {

    private final UserProfileRepository repository;
    private final ElasticSearchUserProfileManager manager;
    //@PostConstruct
    public void init(){
       repository.findAll().forEach(u->{
           manager.update(UserProfileMapper.INSTANCE.toUserProfileRequestDto(u));
           System.out.println("gönderildi... "+ u.getUserName());
       });
    }
}
