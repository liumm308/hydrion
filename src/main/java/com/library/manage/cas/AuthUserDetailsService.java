/*
package com.library.manage.cas;

import com.library.manage.bean.UserInfoBean;
import com.library.manage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "UserDetailsService")
public class AuthUserDetailsService implements UserDetailsService {

    private final UserInfoService userInfoService;

    @Autowired
    AuthUserDetailsService(UserInfoService userInfoService){
        this.userInfoService = userInfoService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfoBean userInfoBean = userInfoService.queryUserByUserName(username);

        if (userInfoBean == null){
            throw new UsernameNotFoundException("用户不存在！");
        }

        List<SimpleGrantedAuthority> simpleGrantedAuthorities = createAuthorities("ADMIN,USER");
        return new User(userInfoBean.getUserName(), userInfoBean.getUserPassword(), simpleGrantedAuthorities);


    }

    */
/**
     * 权限字符串转化
     *
     * 如 "USER,ADMIN" -> SimpleGrantedAuthority("USER") + SimpleGrantedAuthority("ADMIN")
     *
     * @param roleStr 权限字符串
     *//*

    private List<SimpleGrantedAuthority> createAuthorities(String roleStr){
        String[] roles = roleStr.split(",");
        List<SimpleGrantedAuthority> simpleGrantedAuthorities = new ArrayList<SimpleGrantedAuthority>();
        for (String role : roles) {
            simpleGrantedAuthorities.add(new SimpleGrantedAuthority(role));
        }
        return simpleGrantedAuthorities;
    }
}
*/
