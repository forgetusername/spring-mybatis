package service;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:mybatis.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testInsert() {
		userService.insert();
	}
}
