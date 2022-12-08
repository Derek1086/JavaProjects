import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.*; 
import static org.hamcrest.Matchers.*;

public class ItemToPurchaseHamcrestTest {
	
	@BeforeEach
	  public void setUp() {
		this.testItem = new ItemToPurchase();
		System.out.println("Setup method test environment");
		
	}
	
	@AfterEach
	  public void tearDown() {
		this.testItem = null;
		System.out.println("Cleared method test environment");
		
	}
	
	@Test
	public void testEquals()
	{
		ItemToPurchase testItem2 = testItem;
		assertThat(testItem, equalTo(testItem2)); 
	}
	
	@Test
	public void testNotEquals()
	{
		ItemToPurchase testItem2 = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat(testItem, is(not(testItem2))); 
	}
	
	@Test
	public void testPrice()
	{
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat(testItem.getPrice(), greaterThan(19));
	}
	
	@Test
	public void testEmptyString()
	{
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat(testItem.getName(), not(emptyString()));
	}
	
	@Test
	public void testInstanceOf()
	{
		assertThat(testItem, instanceOf(ItemToPurchase.class));
	}
	
	@Test
	public void testHasValue()
	{
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat(testItem, hasProperty("name"));
	}
	
	@Test
	public void testGetName() {
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat("fruit", equalTo(testItem.getName()));
	}
	
	@Test
	public void testGetDesc() {
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat("yummy", equalTo(testItem.getDescription()));
	}
	
	@Test
	public void testGetPrice() {
		testItem = new ItemToPurchase("fruit", "yummy", 20, 1);
		assertThat(20, equalTo(testItem.getPrice()));
	}
	
	@Test
	public void testGetQuantity() {
		testItem = new ItemToPurchase("fruit", "yummy", 20, 10);
		assertThat(10, equalTo(testItem.getQuantity()));
	}
	
	
	public ItemToPurchase testItem;

}