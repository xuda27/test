package cn.eden.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.eden.dao.UserMapper;
import cn.eden.domain.User;
import cn.eden.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int userId) {
		return this.userMapper.selectByPrimaryKey(userId);
	}

}
