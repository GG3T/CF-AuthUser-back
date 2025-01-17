package com.cf.authuser.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String cpf;
}
