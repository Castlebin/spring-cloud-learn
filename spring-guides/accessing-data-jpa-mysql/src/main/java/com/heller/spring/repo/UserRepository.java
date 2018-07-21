package com.heller.spring.repo;

import com.heller.spring.entiry.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
