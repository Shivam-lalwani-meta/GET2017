
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Linked List menu-driven generic program.
 */
package com.metacube.usermanagement;
import java.io.Serializable;

/**
 * The Class User.
 */
public class User implements Serializable {

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 1L;
   
   /** The id. */
   private String id;
   
   /** The name. */
   private String name;
   
   /** The profession. */
   private String profession;

   /**
    * Instantiates a new user.
    */
   public User(){}

   /**
    * Instantiates a new user.
    *
    * @param id the id
    * @param name the name
    * @param profession the profession
    */
   public User(String id, String name, String profession){
      this.id = id;
      this.name = name;
      this.profession = profession;
   }

   /**
    * Gets the id.
    *
    * @return the id
    */
   public String getId() {
      return id;
   }
   
   /**
    * Sets the id.
    *
    * @param id the new id
    */
   public void setId(String id) {
      this.id = id;
   }
   
   /**
    * Gets the name.
    *
    * @return the name
    */
   public String getName() {
      return name;
   }
      
      /**
       * Sets the name.
       *
       * @param name the new name
       */
      public void setName(String name) {
      this.name = name;
   }
   
   /**
    * Gets the profession.
    *
    * @return the profession
    */
   public String getProfession() {
      return profession;
   }
   
   /**
    * Sets the profession.
    *
    * @param profession the new profession
    */
   public void setProfession(String profession) {
      this.profession = profession;
   }	

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object object){
      if(object == null){
         return false;
      }else if(!(object instanceof User)){
         return false;
      }else {
         User user = (User)object;
         if(id == user.getId()
            && name.equals(user.getName())
            && profession.equals(user.getProfession())
         ){
            return true;
         }			
      }
      return false;
   }	
}