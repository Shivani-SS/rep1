package ca.genworth.poc;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;




@RestController
public class ProductResource {

	@Autowired
	private ProductRepository productRepository;


	@GetMapping("/products")
	public List<Product> retrieveAllProducts() {
		return productRepository.findAll();
	}

	@GetMapping("/id/{id}")
	public Product retrieveProduct(@PathVariable long id) throws Exception {
		Optional<Product> product = productRepository.findById(id);

		if (!product.isPresent())
			throw new Exception("id-" + id);

		return product.get();
	} 
//		@GetMapping("/name/{name}")
//			public Optional<Product> retrieveProductname(@PathVariable String name) throws Exception {
//			
//				return  productRepository.findBykeyword(name);
//			} 
//		@GetMapping("/brand/{brand}")
//		public Optional<Product> retrieveProductbrand(@PathVariable String brand) throws Exception {
//		
//			return  productRepository.findBykeyword(brand);
//		} 
//		 



	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable long id) {
		productRepository.deleteById(id);
	}

	@PostMapping("/products")
	public ResponseEntity<Object> createProduct(@RequestBody Product student) {
		Product savedProduct = productRepository.save(student);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedProduct.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<Object> updateStudent(@RequestBody Product product, @PathVariable long id) {

		Optional<Product> productOptional = productRepository.findById(id);

		if (!productOptional.isPresent())
			return ResponseEntity.notFound().build();

		product.setId(id);
		
		productRepository.save(product);

		return ResponseEntity.noContent().build();
	}
}