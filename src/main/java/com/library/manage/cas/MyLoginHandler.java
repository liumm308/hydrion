package com.library.manage.cas;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service("myLoginHandler")
public class MyLoginHandler implements AuthenticationSuccessHandler {

	@Value("${lmLoginUrl}")
	private String lmLoginUrl;

	private static Logger logger = LoggerFactory.getLogger(MyLoginHandler.class);


	@Override
	public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {

		User userBeanInfo = (User) authentication.getPrincipal();
		logger.info("==================" + userBeanInfo.getUsername() + "登录系统========================");
		httpServletResponse.sendRedirect(lmLoginUrl);
	}
}
