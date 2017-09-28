/**
 * 
 * @author Shivam
 * @Date: 26-07-2017
 * Class Name: Order 
 * @description This class is getting the inputs from main class and returning corresponding requirements
 */



public class Order{
	Reader readerObj = new Reader();	
	Product prod = new Product();//Reader class object
	/**
	 * 
	 * @param productObj, passing productobj to get access to all properties of that product like price, code and name
	 * @return	tempTotal, temporary total value
	 */
		
	/**
	 * 
	 * @param productObj, passing productobj to get access to all properties of that product like price, code and name
	 * @return Name , product-name that has to be displayed on bill 
	 */
	
	/**
	 * 
	 * @param tempTotalWithoutDiscount, the subtotal of all undiscounted products
	 * @param productCode, code of product
	 * @return , the maximum discount that can be applied to subtotal
	 */
	public String isApplicableProductLevel(String tempTotal, String productCode, int quantity) {
		String discountedPriceAfterProductPromo = readerObj.isApplicableProductPromo(tempTotal,productCode,quantity);
		//String discountedPriceAfterOrderPromo = readerObj.isApplicableOrderPromo(discountedPriceAfterProductPromo);
		//System.out.println(discountedPriceAfterOrderPromo);
		//return Integer.toString(Math.min(Integer.parseInt(discountedPriceAfterProductPromo),Integer.parseInt(discountedPriceAfterOrderPromo)));
		return discountedPriceAfterProductPromo;
	}
	
	public String isApplicableOrderLevel(String discountedPrice, String productCode, int quantity) {
		//String discountedPriceAfterProductPromo = readerObj.isApplicableProductPromo(tempTotal,productCode,quantity);
		String discountedPriceAfterOrderPromo = readerObj.isApplicableOrderPromo(discountedPrice);
		//System.out.println(discountedPriceAfterOrderPromo);
		//return Integer.toString(Math.min(Integer.parseInt(discountedPriceAfterProductPromo),Integer.parseInt(discountedPriceAfterOrderPromo)));
		return discountedPriceAfterOrderPromo;
	}
}
