package com.example.lab_java_intro_to_jpa.repository;

import com.example.lab_java_intro_to_jpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{


}
