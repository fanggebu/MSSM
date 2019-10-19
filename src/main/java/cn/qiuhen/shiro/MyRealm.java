package cn.qiuhen.shiro;

import javax.annotation.Resource;

import cn.qiuhen.dao.PermissionDao;
import cn.qiuhen.dao.UserDao;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;

import cn.qiuhen.domain.User;
import cn.qiuhen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**  
* @ClassName: MyRealm  
* @Description: shiro 认证 + 授权   重写 */
public class MyRealm extends AuthorizingRealm {


    @Autowired
    private UserDao userDao;
    @Autowired
    private PermissionDao permissionDao;


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // !这里的username可能并不是真正的username, 可能是手机号或者其他可以作为登录凭证的字段!
        String username = token.getUsername();

//        User u = userDao.findByUsernameOrTelephone(username, username);
        User u = new User();
        u.setUsername(token.getUsername());
        u.setPassword("123456");
        if (u == null) {
            return null;
        }
        AuthenticationInfo info = new SimpleAuthenticationInfo(u, u.getPassword(), this.getName());
        return info;
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }
}
