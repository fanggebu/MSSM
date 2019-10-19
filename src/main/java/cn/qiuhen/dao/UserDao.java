package cn.qiuhen.dao;

import cn.qiuhen.domain.User;

/**
 * @author kangjian
 * @date 2019/10/13
 * @description
 */
public interface UserDao {

    User findByUsernameOrTelephone(String username, String username1);
}
