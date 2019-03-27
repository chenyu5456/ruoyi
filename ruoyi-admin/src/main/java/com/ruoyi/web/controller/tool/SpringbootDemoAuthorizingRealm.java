package com.ruoyi.web.controller.tool;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Author: ChenYu
 * @Date: 2019/3/21 10:22
 * @Description:
 */
public class SpringbootDemoAuthorizingRealm extends AuthorizingRealm {
    /**
     * 授权
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        
        return null;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //强制转换token
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());

        //判断用户名或者密码是否为空
        if(StringUtils.isBlank(username)){
            throw new UnknownAccountException();
        }
        if(StringUtils.isBlank(password)){
            throw new IncorrectCredentialsException();
        }


        return null;
    }
}
