package com.fullstackapp.repository;

import com.fullstackapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<User,Long> {

}
