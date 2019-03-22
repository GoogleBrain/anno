package cn.hu.anno.service.impl;

import org.springframework.stereotype.Service;

import cn.hu.anno.an.OperationLogDetail;
import cn.hu.anno.an.OperationType;
import cn.hu.anno.an.OperationUnit;
import cn.hu.anno.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@OperationLogDetail(detail = "通过手机号[{{tel}}]获取用户名", level = 3, operationUnit = OperationUnit.USER, operationType = OperationType.SELECT)
	@Override
	public String findUserName(String tel) {
		System.out.println("tel:" + tel);
		return "zhangsan";
	}
}