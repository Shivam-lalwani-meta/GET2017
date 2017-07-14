import static org.junit.Assert.assertEquals;


import org.junit.Test;
public class ConvertorTest {				//test function

	@Test
	  public void evaluatesExpression() {
	    Convertor calculator = new Convertor();		//an object of convertor class to examine output to expexted output
	    int ans= calculator.convertBinaryToOctal(100100); 	//calling function of convertor class
	    assertEquals(44, ans);
	    //assertEquals(56, sum);

}
}
