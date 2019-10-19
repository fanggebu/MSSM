package cn.qiuhen.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @author kangjian
 * @date 2019/8/30
 * @description
 */
@Repository
public interface BookDao {

    /*
     *  添加
     * @author kangjian
     * @date 2019/8/30
     * @paramas [nn]
     * @return void
     */
//    @Insert("insert into book(name) value(#{nn})")          //注解方式插入操作
    void add(String nn);
}
