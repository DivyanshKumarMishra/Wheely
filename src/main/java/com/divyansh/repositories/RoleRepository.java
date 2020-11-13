package com.divyansh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.divyansh.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	 Role findUserByName(String name);

}
