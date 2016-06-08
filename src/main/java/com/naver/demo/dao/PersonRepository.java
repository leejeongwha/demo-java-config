package com.naver.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naver.demo.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
