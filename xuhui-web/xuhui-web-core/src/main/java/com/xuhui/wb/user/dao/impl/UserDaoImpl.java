package com.xuhui.wb.user.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.xuhui.wb.dao.MysqlServerDao;
import com.xuhui.wb.model.UserDO;
import com.xuhui.wb.user.dao.UserDao;

@Repository
public class UserDaoImpl extends MysqlServerDao implements UserDao {

	@Override
	public List<UserDO> searchUserList() {
		// TODO Auto-generated method stub

		return this.mysqlSessionTemplate.selectList("test_tb_user.getUserList");
	}

	@Override
	public void updateUser(Integer id) {
		// TODO Auto-generated method stub
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("id", id);
		this.mysqlSessionTemplate.update("test_tb_user.updateUser", param);
	}

	@Override
	public Integer insertUser(UserDO userDO) {
		// TODO Auto-generated method stub
		this.mysqlSessionTemplate.insert("test_tb_user.saveUser", userDO);
		return userDO.getId();
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		Map<String, Integer> param = new HashMap<String, Integer>();
		param.put("id", id);
		this.mysqlSessionTemplate.delete("test_tb_user.deleteUser", param);
	}

}
