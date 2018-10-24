package com.xuhui.wb.user.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xuhui.wb.base.controller.BaseController;
import com.xuhui.wb.domain.base.Response;
import com.xuhui.wb.domain.user.UserVO;
import com.xuhui.wb.user.manager.UserManager;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {

	@Resource
	private UserManager userManager;

	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	public Response<Object> getUserList() {
		return this.getSuccessResponse(userManager.getUserList());
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	public Response<Object> updateUser(Integer id) {
		Boolean result = userManager.updateUser(id);
		if (result) {
			return this.getSuccessResponse("修改成功");
		}
		return this.getErrorResponse("修改失败");
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public Response<Object> saveUser(@RequestBody UserVO userVO) {
		return this.getSuccessResponse(userManager.insertUser(userVO));
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public Response<Object> deleteUser(Integer id) {
		Boolean result = userManager.deleteUser(id);
		if (result) {
			return this.getSuccessResponse("删除成功");
		}
		return this.getErrorResponse("删除失败");
	}

}
