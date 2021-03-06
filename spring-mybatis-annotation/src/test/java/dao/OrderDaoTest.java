package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.DBConfig;
import dao.impl.OrderDaoImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DBConfig.class, OrderDaoImpl.class})
public class OrderDaoTest {
	
	@Autowired
	@Qualifier("orderDaoImpl")
	private OrderDao orderDao; 
	
	@Test
	public void testGet() {
		System.out.println(orderDao.getOrder(1));
	}
}
