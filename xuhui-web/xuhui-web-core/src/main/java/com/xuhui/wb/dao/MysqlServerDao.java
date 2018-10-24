package com.xuhui.wb.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
public class MysqlServerDao {
	@Resource
	@Qualifier("sqlSessionTemplate")
	protected SqlSessionTemplate mysqlSessionTemplate;
}
