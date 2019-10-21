package com.library.manage.cas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private AuthUserDetailsService authUserDetailsService;

    @Autowired
    public void setAnyUserDetailsService(AuthUserDetailsService authUserDetailsService){
        this.authUserDetailsService = authUserDetailsService;
    }

/**
 * 匹配 "/" 路径，不需要权限即可访问
 * 匹配 "/user" 及其以下所有路径，都需要 "USER" 权限
 * 登录地址为 "/login"，登录成功默认跳转到页面 "/user"
 * 退出登录的地址为 "/logout"，退出成功后跳转到页面 "/login"
 * 默认启用 CSRF
 * <p>
 * 添加 UserDetailsService， 实现自定义登录校验
 */

   @Override
    protected void configure(HttpSecurity http) throws Exception {

       http.authorizeRequests().antMatchers("/exit", "/login/captcha", "/preLogin/**").permitAll();

       http.formLogin()                                                                                    //  定义当需要用户登录时候，转到的登录页面。
               .loginPage("/login.html")                                                                   // 设置登录页面
               .loginProcessingUrl("/user/login")                                                          // 自定义的登录接口
               .and()
               .authorizeRequests()                                                                        // 定义哪些URL需要被保护、哪些不需要被保护
               .antMatchers("/login.html", "/oauth/authorize","/oauth/token").permitAll()      // 设置所有人都可以访问登录页面
               .anyRequest()                                                                               // 任何请求,登录后可以访问
               .authenticated()
               .and()
               .csrf().disable();                                                                          // 关闭csrf防护
    }

    /**
    * 添加 UserDetailsService， 实现自定义登录校验
    */

    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(authUserDetailsService)
                .passwordEncoder(PasswordEncoderHander.getInstance());
    }

    /**
     * 需要配置这个支持password模式 support password grant type
     *
     * @return
     * @throws Exception
     */
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
