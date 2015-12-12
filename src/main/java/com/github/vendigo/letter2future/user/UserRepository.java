package com.github.vendigo.letter2future.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByNickname(@Param("nickname") String nickname);
}