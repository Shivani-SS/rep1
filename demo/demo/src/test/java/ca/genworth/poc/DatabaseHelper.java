package ca.genworth.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseHelper {

	public static ProductRepository productRepository;
	
	@Autowired
	public DatabaseHelper(ProductRepository productRepository)
	{
		this.productRepository=productRepository;
	}
		
}
