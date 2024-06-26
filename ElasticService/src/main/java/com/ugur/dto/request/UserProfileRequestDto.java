package com.ugur.dto.request;

import com.ugur.utility.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfileRequestDto {
    String id;
    Long authId;
    String userName;
    String email;
    String name;
    String photo;
    String phone;
    State state;
}
