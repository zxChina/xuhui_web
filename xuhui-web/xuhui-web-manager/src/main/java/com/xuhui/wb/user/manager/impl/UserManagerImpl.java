package com.xuhui.wb.user.manager.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xuhui.wb.domain.user.UserVO;
import com.xuhui.wb.model.UserDO;
import com.xuhui.wb.user.dao.UserDao;
import com.xuhui.wb.user.manager.UserManager;
import com.xuhui.wb.util.ListUtils;

@Service
public class UserManagerImpl implements UserManager{

	@Resource
	private UserDao  userDao;
	@Override
	public List<UserVO> getUserList() {
		// TODO Auto-generated method stub
		List<UserDO> userDOList = userDao.searchUserList();
		List<UserVO> userVOList = new ArrayList<UserVO>();
		if(ListUtils.isEmpty(userDOList)){
			return userVOList;
		}
		for(UserDO userDO : userDOList){
			UserVO vo = new UserVO();
			BeanUtils.copyProperties(userDO, vo);
			userVOList.add(vo);
		}
		return userVOList;
	}

	@Override
	public Boolean updateUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.updateUser(id);
		return true;
	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
		return true;
	}

	@Override
	public Integer insertUser(UserVO userVO) {
		// TODO Auto-generated method stub
		if(userVO == null){
			return 0;
		}
		UserDO userDO = new UserDO();
		BeanUtils.copyProperties(userVO, userDO);
		
		return userDao.insertUser(userDO);
	}

}
