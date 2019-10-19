package cn.qiuhen.controller;

import cn.qiuhen.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author kangjian
 * @date 2019/8/29
 * @description
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    /*
    注入service
     */
    @Autowired
    private BookService bookService;

    /*
     *  添加
     * @author kangjian
     * @date 2019/8/30
     * @paramas []
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/index.action")
    public ModelAndView idnex() {
        System.out.println("执行了home");
//        bookService.add();                                               //执行添加
        ModelAndView mav = new ModelAndView();                           //模型视图
        mav.addObject("user", "name");     //设置返回的模拟数据
        mav.setViewName("/index");                                       //设置返回视图模版
        return mav;
    }
}
