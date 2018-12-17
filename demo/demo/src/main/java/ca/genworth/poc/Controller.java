package ca.genworth.poc;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.demo.DemoApplication;

@ContextConfiguration(
classes= DemoApplication.class, loader = SpringApplicationContextLoader.class)
@WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner.class)
public class Controller{
@Autowired
private ProductRepository productRepository;
  public void add(String arg1,String arg2,int arg3) {
//	Product p=new Product();
//	p.setName("note5");
//	p.setId((long)1);
//	p.setType(arg1);
//	p.setSubtype(arg2);
//	p.setPrice(arg3);
//	productRepository.save(p);
//	
	}
}
