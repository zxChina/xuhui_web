package com.xuhui.wb.user.test;

import javax.annotation.Resource;




import org.junit.Assert;
import org.junit.Test;

import com.xuhui.wb.base.test.BaseTest;
import com.xuhui.wb.domain.user.UserVO;
import com.xuhui.wb.user.manager.UserManager;

public class UserManagerTest extends BaseTest{

	@Resource
	private UserManager userManager;
	@Test
	public void testInsert(){
		UserVO userVO = new UserVO();
		userVO.setAge(111);
		userVO.setName("测试");
		userVO.setPhone("123123");
		int result = userManager.insertUser(userVO);
		System.out.println(result);
		Assert.assertEquals(3, result);
	}
}
