package com.saksham.demo.service;

import java.util.List;

import com.saksham.demo.model.Role;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}
