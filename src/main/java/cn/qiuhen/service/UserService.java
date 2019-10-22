package cn.qiuhen.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qiuhen.dao.BookDao;
import cn.qiuhen.dao.UserDao;
import cn.qiuhen.domain.User;

@Service
public class UserService {
	
	@Autowired
    private UserDao userDao;


	public User selectOne(User pojo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> findRoleByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> findPermissionByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> userList(User user) {
		int page = 1;
		if(user.getPage()!=1) {
		  page = (user.getPage()-1)*10+1;
		}
		int nextpage = 10;
		return userDao.userList(page,nextpage);
	}



}
