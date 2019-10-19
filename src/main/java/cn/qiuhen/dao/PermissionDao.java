package cn.qiuhen.dao;

import org.apache.shiro.authz.Permission;

import java.util.List;

/**
 * @author kangjian
 * @date 2019/10/13
 * @description
 */
public interface PermissionDao {
    List<Permission> findAll();

    List<Permission> findByUserId(Long id);
}
