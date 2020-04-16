package com.example.user.UserManagerment.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user.UserManagerment.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
