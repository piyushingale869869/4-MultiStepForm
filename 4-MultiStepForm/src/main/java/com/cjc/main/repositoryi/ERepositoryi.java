package com.cjc.main.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Education;

@Repository
public interface ERepositoryi extends JpaRepository<Education, Integer> {

}
