package com.ivoyant.usermanagement.Admin.repository;


import com.ivoyant.usermanagement.Admin.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Long> {
}
