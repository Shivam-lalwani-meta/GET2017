/** 
 * @author Shivam Lalwani
 * @version 1.0
 * @Date 16 August 2017
 */
package com.DAO;

/**
 * A factory for creating Dao objects.
 */
public class DaoFactory {
    
    /** The dao. */
    private static BaseDao dao;
   
    /**
     * Instantiates a new dao factory.
     */
    private DaoFactory(){
        
    }
    
    /**
     * Gets the dao instance.
     *
     * @param name the name
     * @return the dao instance
     */
    public static BaseDao getDaoInstance(String name){
    	switch(name){
         	case "MY_SQL":
         	dao = new MYSqlDao();
         	break;
         	case "In_Memory":
         	dao = new InMemoryDao();
         	break;
         	case "File":
         	dao = new FileDao();
         	break;
         	case "Cart":
         	dao = new CartDao();
         	break;
    	} 
        return dao;
    }
}

