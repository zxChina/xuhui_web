package com.xuhui.wb.base.controller;

import com.xuhui.wb.domain.base.Response;

public class BaseController {
    /**
     * 封装成功返回结果
     *
     * @param object
     * @return
     */
    protected Response<Object> getSuccessResponse(Object object) {
        Response<Object> response = new Response<>();
        response.setSuccess(true);
        response.setResult(object);

        return response;
    }

    protected Response<Object> getErrorResponse(String errorMessage) {
        return this.getErrorResponse(errorMessage, null);
    }
    
    protected Response<Object> getErrorResponse(String errorMessage, Object object) {
        Response<Object> response = new Response<>();
        response.setSuccess(false);
        response.setResult(object);
        response.setErrorMessage(errorMessage);

        return response;
    }
}
