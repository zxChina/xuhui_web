package com.xuhui.wb.user.dao;

import java.util.List;

import com.xuhui.wb.model.UserDO;

public interface UserDao {

	/**
	 * 查询
	 */
	List<UserDO> searchUserList();

	/**
	 * 更新
	 * 
	 * @param id
	 */
	void updateUser(Integer id);

	/**
	 * 插入
	 * 
	 * @param userDO
	 * @return
	 */
	Integer insertUser(UserDO userDO);

	/**
	 * 删除
	 * 
	 * @param id
	 */
	void deleteUser(Integer id);

}
