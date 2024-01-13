package com.example.policybazaar.com.customer.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.policybazaar.com.customer.Entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
		
	Optional<UserInfo> findByName(String name);
}
