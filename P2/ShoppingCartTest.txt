import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

	@BeforeEach
	  public void setUp() 
	{
		this.testCart = new ShoppingCart();
		System.out.println("Setup method test environment");
		
	}
	@AfterEach
	  public void tearDown() 
	{
		this.testCart = null;
		System.out.println("Cleared method test environment");
		
	}
	
	@Test
	public void testGetSameObject() 
	{
		assertSame(testCart, testCart);
		assertNotSame(testCart, "ShoppingCart");
	}
	
	@Test
	public void testAssertingNotNull() 
	{
		assertNotNull(testCart, "The cart should not be empty");
	}
	
	@Test
	public void whenAssertNull_thenTrue() 
	{
		this.testCart = null;
		assertNull(testCart, "The cart should be null");
	}
	
	@Test
	public void testGetCustomerName() 
	{
		testCart = new ShoppingCart("dave", "December 12, 2010");
		
		assertEquals("dave", testCart.getCustomerName(), "The name must be dave");
	 }
	
	@Test
	public void testRemoveItem()
	{
		ItemToPurchase item = new ItemToPurchase("fruit", "yummy", 7, 1);
		testCart.addItem(item);
		testCart.removeItem("fruit");
		
		assertEquals(0, testCart.getNumItemsInCart(), "The cart should be empty");
	}
	
	@Test
	public void testGetCostOfCart() 
	{
		ItemToPurchase item = new ItemToPurchase("fruit", "yummy", 71, 1);		
		testCart.addItem(item);
		
		assertEquals(71, testCart.getCostOfCart(), "The price of the cart should be 7");
	}
	
	@Test
	public void testRemoveItemOnEmptyCart() 
	{
		ItemToPurchase item = new ItemToPurchase("fruit", "yummy", 7, 1);
		testCart.addItem(item);
		testCart.removeItem("fruit");
		testCart.removeItem("fruit");
		
		assertEquals(0,testCart.getNumItemsInCart(), "The cart cant have less than 0 items");
	}
	
	@Test
	public void testGetDate() 
	{
		assertEquals("January 1, 2016", testCart.getDate(), "The default date is January 1, 2016");
	}
	
	@Test
	public void testAddItem() 
	{
		ItemToPurchase item = new ItemToPurchase("fruit", "yummy", 7, 1);
		testCart.addItem(item);
		
		assertEquals(1, testCart.getNumItemsInCart(), "The cart shouldnt be empty");
	
	}
	
	@Test
	public void testGetNumItemsInCart() 
	{
		ItemToPurchase item = new ItemToPurchase("fruit", "yummy", 20, 3);
	    testCart.addItem(item);
	    
		assertEquals(3, testCart.getNumItemsInCart(), "The cart should have 3 items");
	}
	 
	
	public ShoppingCart testCart;
	
	
}