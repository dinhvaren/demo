package com.cybersoft.cozastore03.Repository;

import com.cybersoft.cozastore03.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Integer> {
    UserEntity findByEmail (String email);

}
