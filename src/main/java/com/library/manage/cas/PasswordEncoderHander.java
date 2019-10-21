package com.library.manage.cas;

import com.library.manage.utils.MD5Util;
import org.springframework.security.crypto.password.PasswordEncoder;


public class PasswordEncoderHander implements PasswordEncoder {

    private static final PasswordEncoder INSTANCE = new PasswordEncoderHander();

    @Override
    public String encode(CharSequence charSequence) {
        if (charSequence != null && charSequence != "") {

            return (String) charSequence;
        }
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String password) {

        // 必须校验密码
        return password.equals(MD5Util.encode((String) charSequence));
    }

    public static PasswordEncoder getInstance() {
        return INSTANCE;
    }

    private PasswordEncoderHander() {
    }
}
