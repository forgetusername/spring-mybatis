package dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import entity.User;
 
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:mybatis.xml")
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao; 
 
	@Test
	@Ignore
	public void testInsertUser() {
		userDao.insertUser("John", "Shanghai");
		userDao.insertUser("Lucy", "UK");
	}
	
	@Test
	@Ignore
	public void testDeleteUserById() {
		userDao.deleteUser(1);
	}
	
	@Test
	@Ignore
	public void testUpdateUserCity() {
		userDao.updateUserCity(2, "Beijing");
	}
	
	@Test
	public void testGetUserById() {
		User user = userDao.getUser(2);
		System.out.println(user);
	}
	
	@Test
	public void testGetAllUsers() {
		List<User> users = userDao.getAllUsers();
		for (User user : users) {
			System.out.println(user);
		}
	}
}
