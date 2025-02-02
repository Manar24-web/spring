package com.ecom.clients_service.dto.Security;

import com.ecom.clients_service.entity.Role;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class RegisterDto {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<Role> roles = new HashSet<>();
}
