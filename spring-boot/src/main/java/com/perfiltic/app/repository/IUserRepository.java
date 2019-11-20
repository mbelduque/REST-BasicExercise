package com.perfiltic.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perfiltic.app.entities.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {

}
