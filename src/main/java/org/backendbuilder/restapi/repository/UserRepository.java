package org.backendbuilder.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import org.backendbuilder.restapi.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
