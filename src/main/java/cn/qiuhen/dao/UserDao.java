package cn.qiuhen.dao;

import org.springframework.stereotype.Repository;

import cn.qiuhen.domain.User;

/**
 * @author kangjian
 * @date 2019/10/13
 * @description
 */
@Repository
public interface UserDao {
	
    User findByUsernameOrTelephone(User user);
}
