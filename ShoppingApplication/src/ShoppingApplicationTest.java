import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.facade.Facade;
import com.model.*;

public class ShoppingApplicationTest {
	
	@Before
	public void set() {
		Facade facadeObj = new Facade();
	}	
	
	@Test
	public void addingTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.addProduct(cart, 2);
		String expected = "Product 1001 is added\n";
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeAddingTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.addProduct(cart, 2);
		String expected = "Product not added added\n";
		assertFalse(expected == actual);
	}
	
	@Test
	public void removingTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.deleteProduct(cart);
		String expected = "Cart is Empty";
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeRemovingTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.deleteProduct(cart);
		String expected = "Cart is Full";
		assertFalse(expected == actual);
	}
	
	@Test
	public void displayCartTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.displayCart();
		String expected = "Cart is Empty";
		assertEquals(expected, actual);
	}
	
	@Test
	public void negativeDisplayCartTest() {
		Cart cart = new Cart();
		cart.setId(1001);
		Facade facadeObj = new Facade();
		facadeObj.display();
		String actual = facadeObj.displayCart();
		String expected = "Cart is not Empty";
		assertFalse(expected == actual);
	}
}
