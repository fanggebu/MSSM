package cn.qiuhen.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
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
    
    @Select("select * from user limit #{0},#{1}")
	List<User> userList(int page, int nextpage);
}
