package org.ain.repository;

import org.ain.domain.Android;
import org.ain.domain.iOS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface AndroidRepository extends PagingAndSortingRepository<Android, Long> {
// public interface AndroidRepository extends JpaRepository<Android, Long> {
	
	Android findByApiKey(String apiKey);
}
