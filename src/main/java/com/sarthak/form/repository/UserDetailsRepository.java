package com.sarthak.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.form.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{

}
