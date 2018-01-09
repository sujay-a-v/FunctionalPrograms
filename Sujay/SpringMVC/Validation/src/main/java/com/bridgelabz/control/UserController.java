package com.bridgelabz.control;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.model.User;
import com.bridgelabz.service.UserService;
import com.bridgelabz.service.userServiceImpl;
import com.mysql.fabric.Response;
import com.bridgelabz.model.StudentNameEditor;

@Controller
@RestController
public class UserController {
	
	/*@InitBinder
	public void InitBinder(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[] {"studentMobile"});
		//SimpleDateFormat dateFormat=new SimpleDateFormat("dd**MM**yyyy");
		//binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		//binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
	}*/
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public void addDetails(@RequestBody User user)throws Exception
	{
		boolean status=userService.isUserExist(user.getUserEmail());
		System.out.println(status);
		if(status)
		{
			System.out.println("User email already exit");
		}
		else
		{
			userService.saveUserData(user);
			System.out.println("register");
		}
		
		//User student=new User();
		
	}
	
	@RequestMapping(value="/RegisterData", method = RequestMethod.POST)
	public String doRegister(@RequestBody User user)throws Exception
		{
		
		/*if(result.hasErrors())
		{
			return "RegisterForm";
		}*/
		/*
			ModelAndView modelandview=new ModelAndView("RegisterForm");
			return modelandview;
		}
		userService.saveUserData(userForm);
		ModelAndView modelandview=new ModelAndView("RegisterSuccess");
		return modelandview;*/
		
		boolean status=userService.isUserExist(user.getUserEmail());
		System.out.println(status);
		userService.saveUserData(user);
		return "RegisterSuccess";
	}
	
	//******Retrieve all user objects*****//
	@RequestMapping(value="/userslist", method = RequestMethod.GET)
	public ArrayList<User> getUserList()
	{
		User user1=new User();
		user1.setId(1);
		user1.setUserName("ABC");
		
		User user2=new User();
		user2.setId(2);
		user2.setUserName("XYZ");
		
		ArrayList<User> userList=new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		
		return userList;
		
	}
	
	//******Retrieve  user by id*****//
		@RequestMapping(value="/userslist/{id}", method = RequestMethod.GET)
		public User getUserById(@PathVariable ("id") int id)
		{
			User user1=new User();
			user1.setId(id);
			user1.setUserName("ABC");
			
			User user2=new User();
			user2.setId(2);
			user2.setUserName("XYZ");
			
			ArrayList<User> userList=new ArrayList<User>();
			userList.add(user1);
			userList.add(user2);
			
			return user1;
			
		}
		
		//****** Updating the user records ******
		@RequestMapping(value="/userslist/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Boolean>  updateUserById(@PathVariable ("id") int id,@RequestBody User user)
		{
			System.out.println("user id="+id);
			System.out.println("Name = "+user.getUserName()+"\nEmail= "+user.getUserEmail());
			
			HttpHeaders httpHeader=new HttpHeaders();
			httpHeader.add("key1", "value1");
			httpHeader.add("key2", "value2");
			
			return new ResponseEntity<Boolean>(true,httpHeader,HttpStatus.OK);
		}
		
		
		//****** Retrieve All users *****//
		@RequestMapping(value="/register", method = RequestMethod.GET)
		public ResponseEntity<List<User>> retrieveAll()
		{
			List<User> users=userService.retrieveAllUsers();
			if(users.isEmpty())
			{
				return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<List<User>>(users,HttpStatus.OK);
		}
		
		//****** Retrieve All users *****//
				@RequestMapping(value="/register/{id}", method = RequestMethod.GET)
				public ResponseEntity<User> retrieveById(@PathVariable ("id") int id)
				{
					User user=userService.retrieveById(id);
					if(user==null)
					{
						return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
					}
					
					return new ResponseEntity<User>(user,HttpStatus.OK);
				}
				
		//******** Update the User ****//
		@RequestMapping(value="/register/{id}", method = RequestMethod.PUT)
		public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User user)
		{
			
			User currentUser=userService.retrieveById(id);
			if(currentUser==null)
			{
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
			
			currentUser.setUserName(user.getUserName());
			currentUser.setUserEmail(user.getUserName());
			currentUser.setUserMobile(user.getUserMobile());
			currentUser.setUserPassword(user.getUserPassword());
			
			userService.updateUser(currentUser);
			
			return new ResponseEntity<User>(currentUser,HttpStatus.OK);
		}
		
		//****** Delete User By Id ****//
		@RequestMapping(value="/register/{id}", method = RequestMethod.DELETE)
		public ResponseEntity<User> deleteUserById(@PathVariable ("id") int id)
		{
			User currentUser=userService.retrieveById(id);
			if(currentUser==null)
			{
				return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
			}
			userService.deleteUserById(id);
			return new ResponseEntity<User>(HttpStatus.OK);
			
		}

}
