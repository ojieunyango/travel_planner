package com.example.tour_backend.dto.user;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String username; // 유저네임 추가
    private String email;
    private String password;
    private String name;
    private String phone;
    private String nickname;
}
