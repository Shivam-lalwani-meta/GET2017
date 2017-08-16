/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.facade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.DAO.BaseDao;
import com.DAO.DaoFactory;
import com.model.BaseEntity;
import com.model.Product;

/**
 * The Class Facade to interact with DAO's
 */
public class Facade {
	
	/** The fileDao obj using FactoryDao */
	BaseDao fileObj = DaoFactory.getDaoInstance("File");
	
	/** The CartDao obj using FactoryDao */
	BaseDao cartObj = DaoFactory.getDaoInstance("Cart");
	
	/** The Reader. */
	BufferedReader Reader = null;
	
	/** The map to store Quantity in correspondance of Product-ID */
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	/** The Product list. */
	static String[] ProductList = null;
	
	/**
	 * Display method to display all the Products to custumer along with
	 * the Product Id, Product Name, Product Price and Product Type
	 */
	public void display() {
		try {
			Reader = new BufferedReader(new FileReader("E:\\ProductList.csv")); //Reader object to read file's data
		} catch (FileNotFoundException f) {	//catch block to handle the exception, if the file not found or their is any problem in fetching the file
			System.out.print("Error in fetching file");	//desired error to be displayed
			f.printStackTrace();
		}
		
		/**
		 * reading the file whose filepath is passed in parameter filepath
		 */
		try {
			String lineData = " ";	//string to store line by line data of a file and diplaying that to console 
			while ((lineData = Reader.readLine()) != null) {
				ProductList = lineData.split(",");
				//creating a Object from fetched details and adding it into a Product List
				Product pr = new Product();
				pr.setId(Integer.parseInt(ProductList[0]));
				pr.setProductName(ProductList[1]);
				pr.setProductPrice(Integer.parseInt(ProductList[2]));
				pr.setProductType(ProductList[3]);
				fileObj.addproduct(pr);
			}
			Reader.close();	//closing Reader Object
		} catch (IOException e) {	//catch block to handle the exception, if the file not found or their is any problem
			System.out.print("Error");	
			e.printStackTrace();
		}
		//Displaying List Of Product from Product-List
		System.out.println("**********List of Products**********");
		for (Object product: fileObj.getAllProduct()) {
			System.out.println(((Product) product).getProductName()+"\t"+((Product) product).getId()+"\t"+((Product) product).getProductPrice()+"\t"+((Product) product).getProductType());
		}
		System.out.println("\n");
	}

	/**
	 * Adds the product in Cart
	 *
	 * @param Entity, the Object to be added
	 * @param quantity, the quantity of product
	 * @return the string, the STATUS
	 */
	public String addProduct(BaseEntity Entity, int quantity) {
		map.put(Entity.getId(), quantity);	//adding quantity to map
		BaseEntity toAdd = fileObj.searchproduct(Entity);	//searching product in Product-List
		
		if(toAdd != null) {
			//If it is present in Cart, it will not be added again
			if(cartObj.searchproduct(toAdd) == null) {
				cartObj.addproduct(toAdd);
				return "Product "+toAdd.getId()+" is added\n";
			} else{
				return "Product "+toAdd.getId()+" is already added to Cart\n";
			}
		}else{
			return "Product is not in the Product-List\n";
		}
	}

	/**
	 * Delete the product from Cart
	 *
	 * @param Entity, the Object to be deleted/removed from cart
	 * @return the string, the STATUS
	 */
	public String deleteProduct(BaseEntity Entity) {
		//checking the Cart
		if(cartObj.isEmpty()) {
			return "Cart is Empty";
		} else {
			//checking Product in Cart
			BaseEntity toRemove = cartObj.searchproduct(Entity);
			if(toRemove != null) {
				cartObj.deleteproduct(toRemove);
				return "Product "+toRemove.getId()+" is removed\n";
			} else {
				return "Product "+Entity.getId()+ " is not in the Cart\n";
			}
		}	
	}

	/**
	 * Display cart Objects alongwith its attributes
	 */
	public void displayCart() {
		//checking whether the cart is empty or not
		if(cartObj.isEmpty()) {
			System.out.println("Cart is Empty");
		} else {
			//printing cart products/objects
			for (Object product: cartObj.getAllProduct()) {
				System.out.println(((Product) product).getId()+"\t"+((Product) product).getProductName()+"\t"+((Product) product).getProductPrice()+"\t"+(map.get(((Product) product).getId())));
		    }
		}	
		System.out.println("\n");
	}

	/**
	 * Generate bill of the Products(Subtotal, Total, Quantity) that are present in Cart
	 */
	public void generateBill() {
		//checking whether the cart is empty or not
		if(cartObj.isEmpty()) {
			System.out.println("Cannot generate bill, Cart is Empty");
		}else {
			int totalAmount = 0;
			System.out.println("Your bill is : \n");
			//printing bill
			for (Object cart: cartObj.getAllProduct()) {
				System.out.println("Product price : " + ((Product) cart).getProductPrice() + "\nQuantity is : " + (map.get(((Product) cart).getId()))+" SubTotal "+((Product) cart).getProductPrice()*(map.get(((Product) cart).getId())));
				totalAmount += ((Product) cart).getProductPrice()*(map.get(((Product) cart).getId()));		
		    }
			System.out.println("Total Bill "+totalAmount+"\n");
		}
	}

	/**
	 * Deduct quantity, deduct quantity of existing products in the cart-list
	 *
	 * @param id, the ID of Product whose quantity is to be deduct
	 * @param quantity, the quantity to be deduct
	 */
	public void deductQuantity(int id, int quantity) {
		boolean flag=false;
		//checking whether the ID is present in cart or not
		for(Object cart : cartObj.getAllProduct()){
			if(((Product) cart).getId() == id) {
				flag = true;
			}
		}
		//if the ID is present
		while(flag) {
			int originalQuantity = map.get(id);
			int newQuantity = (originalQuantity - quantity);
			if(newQuantity<1){
				System.out.println("Quantity can't be less than 1\n");
			} else {
				map.put(id, newQuantity);
				System.out.println("Quantity "+quantity+" is deducted from product "+id+"\n");
			}	
			return;
		}
		System.out.println("\nThis Product Id is not present in Cart\n");
	}
}
