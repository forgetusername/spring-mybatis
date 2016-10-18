package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.User;

public interface UserDao {

	/**
	 * 插入
	 * @param name 名字 
	 * @param city 城市
	 */
	public void insertUser(@Param("userName") String userName, @Param("city") String city);
	
	/**
	 * 删除
	 * @param id 用户 id 
	 */
	public void deleteUser(@Param("id") long id);
	
	/**
	 * 更新用户城市
	 * @param id 用户 id
	 * @param city 城市
	 */
	public void updateUserCity(@Param("id") long id, @Param("city") String city);
	
	/**
	 * 获取用户信息
	 * @param id 用户 id
	 * @return 用户信息
	 */
	public User getUser(@Param("id") long id);
	
	/**
	 * 获取所以用户信息
	 * @return
	 */
	public List<User> getAllUsers();
	
}
