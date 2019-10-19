package cn.qiuhen.service;

import cn.qiuhen.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kangjian
 * @date 2019/8/30
 * @description
 */
@Service
public class BookService {
    /*
    注入dao
     */
    @Autowired
    private BookDao bookDao;
    /*
     *  添加
     * @author kangjian
     * @date 2019/8/30
     * @paramas []
     * @return void
     */
    public void add(){
        bookDao.add("nn");            //设置添加的模拟数据
    }
}
