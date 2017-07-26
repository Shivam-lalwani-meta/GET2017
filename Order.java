/**
 * 
 * @author Shivam
 * @Date: 26-07-2017
 * Class Name: Order 
 * @description This class is getting the inputs from main class and returning corresponding requirements
 */
package ProductList;


public class Order{
	Reader readerObj = new Reader();	//Reader class object
	/**
	 * 
	 * @param productObj, passing productobj to get access to all properties of that product like price, code and name
	 * @return	tempTotal, temporary total value
	 */
	public int searchDetails(Product productObj) {
		//calling Reader class and passing product details in arguments and returning desired results
		int tempTotal = readerObj.searchDetail(productObj.getProductCode(),productObj.getProductQuantity());
		return (tempTotal);
		}	
	/**
	 * 
	 * @param productObj, passing productobj to get access to all properties of that product like price, code and name
	 * @return Name , product-name that has to be displayed on bill 
	 */
	public String searchName(Product productObj) {
		//calling Reader class and passing product details in arguments and returning desired results
		String Name = readerObj.searchName(productObj.productCode);
		return (Name);
		}
	/**
	 * 
	 * @param tempTotalWithoutDiscount, the subtotal of all undiscounted products
	 * @param productCode, code of product
	 * @return , the maximum discount that can be applied to subtotal
	 */
	public int isApplicable(int tempTotalWithoutDiscount, String productCode) {
		int discountedPriceAfterOrderPromo = readerObj.isApplicableOrderPromo(tempTotalWithoutDiscount);
		int discountedPriceAfterProductPromo = readerObj.isApplicableProductPromo(tempTotalWithoutDiscount,productCode);
		return Math.min(discountedPriceAfterOrderPromo,discountedPriceAfterProductPromo);
		//return discountedPriceAfterOrderPromo;
	}
	
}
