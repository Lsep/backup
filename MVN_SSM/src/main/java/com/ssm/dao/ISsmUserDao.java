package com.ssm.dao;

import java.util.List;

import com.ssm.pojo.SsmUser;

public interface ISsmUserDao {
	List<SsmUser> getUserByDId(int id);
	SsmUser getUserById(int id);
}
