package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.model.StudentPersonalDetails;

public interface StudentRepository extends JpaRepository<StudentPersonalDetails, Integer>{

}
