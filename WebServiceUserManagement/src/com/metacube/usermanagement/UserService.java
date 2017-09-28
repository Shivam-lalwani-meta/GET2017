
/** 
 * @author Shivam
 * @version 1.0
 * @Date 22-August-2017
 * @project Linked List menu-driven generic program.
 */
package com.metacube.usermanagement;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * The Class UserService.
 */
@Path("/UserService")
public class UserService {
	
   /** The user dao. */
   UserDao userDao =UserDao.getInstance();
   
   /** The Constant SUCCESS_RESULT. */
   private static final String SUCCESS_RESULT="<result>success</result>";
   
   /** The Constant FAILURE_RESULT. */
   private static final String FAILURE_RESULT="<result>failure</result>";


   /**
    * Gets the users.
    *
    * @return the users
    */
   @GET
   @Path("/users")
   @Produces(MediaType.TEXT_HTML)
   public String getUsers(){
      return userDao.getAllUsers();
   }
  
   /**
    * Gets the user.
    *
    * @param userid the userid
    * @return the user
    */
   @GET
   @Path("/users/{userid}")
   @Produces(MediaType.APPLICATION_XML)
   public User getUser(@PathParam("userid") String userid){
      return userDao.getUser(userid);
   }

   /**
    * Creates the user.
    *
    * @param id the id
    * @param name the name
    * @param profession the profession
    * @return the string
    */
   @POST
   @Path("/users/{userid}/{name}/{profession}")
   @Produces(MediaType.APPLICATION_XML)
   public String createUser(@PathParam("userid") String id,
		   @PathParam("name") String name,
		   @PathParam("profession") String profession) {
      User user = new User(id, name, profession);
      boolean result = userDao.addUser(user);
      if(result){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }

   /**
    * Delete user.
    *
    * @param userid the userid
    * @return the string
    */
   @DELETE
   @Path("/users/{userid}")
   @Produces(MediaType.APPLICATION_XML)
   public String deleteUser(@PathParam("userid") String userid){
      int result = userDao.deleteUser(userid);
      if(result == 1){
         return SUCCESS_RESULT;
      }
      return FAILURE_RESULT;
   }
}