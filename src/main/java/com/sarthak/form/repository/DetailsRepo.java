package com.sarthak.form.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.form.entity.Details;

public interface DetailsRepo extends JpaRepository<Details, Long> {

}
