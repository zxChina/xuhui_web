package com.xuhui.wb.domain.user;

import com.xuhui.wb.domain.base.BaseVO;

public class UserVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3762722008983246824L;
	private Integer id;
	private String name;

	private Integer age;

	private String phone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
