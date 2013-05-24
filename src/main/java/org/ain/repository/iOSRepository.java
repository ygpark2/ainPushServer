package org.ain.repository;

import org.ain.domain.User;
import org.ain.domain.iOS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface iOSRepository extends PagingAndSortingRepository<iOS, Long> {
// public interface iOSRepository extends JpaRepository<iOS, Long> {
	
	// User findByApiKey(String apiKey);
}
