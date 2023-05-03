package com.cjc.main.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.Model.Info;

@Repository
public interface IRepositoryi extends JpaRepository<Info, Integer> {

}
