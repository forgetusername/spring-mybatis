package dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import entity.Order;

public interface OrderMapper {

	/* 字段不同可以使用别名 */
	@Select("SELECT id, create_at createAt FROM orders WHERE id = #{id}")
	public Order getOrder(@Param("id") long id);
} 
 
