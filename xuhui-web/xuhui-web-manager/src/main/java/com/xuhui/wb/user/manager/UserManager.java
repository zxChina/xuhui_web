package com.xuhui.wb.user.manager;

import java.util.List;

import com.xuhui.wb.domain.user.UserVO;

public interface UserManager {

	List<UserVO> getUserList();

	Boolean updateUser(Integer id);

	Boolean deleteUser(Integer id);

	Integer insertUser(UserVO userVO);
}
