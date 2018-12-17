package ca.genworth.poc;

import java.util.List;
import java.util.Optional;

//StudentRepository

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
//	 @Query("SELECT c FROM Product  c where c.name= ?1")
//		public Optional<Product> findBykeyword(String name); 
	 /*@Query("SELECT c FROM Product  c where c.name= ?1")
		public Optional<Product> findBykeyword(String brand);*/ 
	 
}
