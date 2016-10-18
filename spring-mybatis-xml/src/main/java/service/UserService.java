package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
 
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public void insert() {
		userDao.insertUser("test01", "HK");
		"".substring(11); // will rollback
	}
	
}
