package com.aggregate.repository;

import com.aggregate.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {
//    @Query("SELECT * FROM test_table WHERE name = :name")
//    List<User> findByName(String name);

//    @Query("SELECT * FROM test_table")
//    List<User> findAll();
}
