package dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.OrderDao;
import entity.Order;

@Repository(value = "orderDaoImpl")
public class OrderDaoImpl implements OrderDao {

	@Autowired private SqlSession sqlSession; 
	
	@Override
	public Order getOrder(long id) {
		return sqlSession.selectOne("dao.mapper.OrderMapper.getOrder", id);
	}
 
}
