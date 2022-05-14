package main;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
	List<Product> findAllByOrderByDescriptionAsc();
}