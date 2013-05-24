package org.ain.repository;

import org.ain.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// List<User> foundSortedUsers = userRepository.findByUsername("username", new Sort(new Sort.Order(Sort.Direction.DESC, "username"))); //This method is implemented by Spring at runtime.

// List<User> foundOrderedUsers = userRepository.findByUsernameOrderByUsernameDesc("username");//This method is implemented by Spring at runtime. All you have to do is to follow naming convesion.

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

// public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
