package com.xuhui.wb.domain.base;

/**
 * 基础返回结果
 * @author anling.xlj
 *
 */
public class BaseResult extends BaseVO {

	private static final long serialVersionUID = 3962215109252373857L;
	
	/**
	 * 操作是否成功
	 */
	private boolean success = true;		
	
	
	/**
	 * 当前操作是否成功
	 * @return
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * 设置操作结果
	 * @param success
	 */
	public void setSuccess(boolean success) {
		this.success = success;
	}

	
	
	
}
