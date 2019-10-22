package cn.qiuhen.controller;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import cn.qiuhen.domain.RestMsg;
import cn.qiuhen.domain.User;
import cn.qiuhen.service.UserService;



/**
 * @author kangjian
 * @todo
 * @time 2019下午6:34:04
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger log = Logger.getLogger(UserController.class);

    @Autowired
    UserService userSer;

    /**
     * @param
     * @return
     * @todo 用户登录
     * @since 获取当前用户，
     * 判断用户是否已经认证登录，
     * 用账号密码创建UsernamePasswordToken，
     * 调用subject的login方法
     */
    @RequestMapping(method = RequestMethod.POST, value = "/login.action")
    public String login(User user, Model model, String remember) {
        ModelAndView view = new ModelAndView("loginerro");
        String msg = "";
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword(), user.getUsername());
       /* if (remember != null) {
            if (remember.equals("记住我")) {//记住我
                token.setRememberMe(true);
            }
        }*/
        try {
            subject.login(token);
            log.info(user.getUsername()+"登录成功");
            return "redirect:/home/index.action";
        } catch (IncorrectCredentialsException e) {
            model.addAttribute("errorMsg", "抱歉，您的密码有误");
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
            model.addAttribute("errorMsg", "登录失败次数过多");
            System.out.println(msg);
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
            model.addAttribute("errorMsg", "帐号已被锁定");
            System.out.println(msg);
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
            model.addAttribute("errorMsg", "帐号已被禁用");
            System.out.println(msg);
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
            model.addAttribute("errorMsg", "帐号已过期");
            System.out.println(msg);
        } catch (UnknownAccountException e) {
            model.addAttribute("errorMsg", e.getMessage());
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权！" + e.getMessage();
            model.addAttribute("errorMsg", "您没有得到相应的授权");
            System.out.println(msg);
        } catch (AccountException e) {
            msg = e.getMessage();
            model.addAttribute("errorMsg", e.getMessage());
            System.out.println(msg);
        }
        return "redirect:/home/index.action";
    }


    @GetMapping("/login.action")
    public String login() {
    	log.info("执行了页面切换");
        return "user/login";
    }
    @GetMapping("/register")
    public String register(){
        return "redirect:user/register";
    }
    @PostMapping("/register")
    public String register(User user){
        return "redirect:user/login";
    }
    @GetMapping("/user_list.action")
    @ResponseBody
    public RestMsg userList(User user) {
    	RestMsg rest = new RestMsg();
    	rest.setCode(0);
    	rest.setCount(100);
    	rest.setData(userSer.userList(user));
    	return rest;
    }
    public String logout(){
        return "redirect:user/login";
    }
}

