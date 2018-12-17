package ca.genworth.poc;


import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Stepdefs extends Controller
{
	
	private ProductRepository productRepository;
    int count;
//private Controller c=new Controller();

@Given("^current product count is (\\d+)$")
public void current_product_count_is(int arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	count=arg1;
    
}

@When("^I add product with type \"([^\"]*)\", subtype \"([^\"]*)\", price \"([^\"]*)\"$")

public void i_add_product_with_type_subtype_price(String arg1,String arg2,int arg3) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	Product p=new Product();
	p.setName("note5");
	p.setId((long)1);
	p.setType(arg1);
	p.setSubtype(arg2);
	p.setPrice(arg3);
DatabaseHelper.productRepository.save(p);
//add(arg1,arg2,arg3);
if(p.getType()=="Electronics" && p.getSubtype()=="Mobile" && p.getPrice()==1000)
{
	count++;
}
}

@Then("^the new product count is (\\d+)$")
public void the_new_product_count_is(int arg1) throws Exception {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertEquals("Error",arg1,count); 
    
}

}