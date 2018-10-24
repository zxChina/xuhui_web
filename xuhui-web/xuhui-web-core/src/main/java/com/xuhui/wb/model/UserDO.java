package com.xuhui.wb.model;

import com.xuhui.wb.model.base.BaseDO;

/**
 * 用户实体
 * 
 * @author apple
 *
 */
public class UserDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 620934042231796717L;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
