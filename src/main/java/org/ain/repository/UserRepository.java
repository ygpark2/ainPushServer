package org.ain.repository;

import org.ain.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
