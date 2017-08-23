package com.ssm.service.Impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.ssm.dao.IUserDao;
import com.ssm.pojo.User;
import com.ssm.service.IUserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements IUserService {
	@Resource    
    private IUserDao userDao;    
        
    public User getUserById(int userId) {    
        return userDao.queryByPrimaryKey(userId);    
    }    
    
    @Override 
    public void insertUser(User user) {    
        userDao.insertUser(user);    
    }
    
    @Override
    public void addUser(User user) {    
        userDao.insertUser(user);
    }    
    
    @Override    
    public List<User> getAllUser() {
        return userDao.getAllUser();    
    }
}
