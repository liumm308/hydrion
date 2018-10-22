package com.library.manage.cas;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by yangpj on 2018/6/27.
 */
@Configuration
public class KaptchaConfig {

    @Bean
    public DefaultKaptcha producer() {
        Properties properties = new Properties();
        properties.put("kaptcha.border", "no");
        properties.put("kaptcha.border.color", "red");
        properties.put("kaptcha.border.thickness", "5");
        properties.put("kaptcha.image.width", "112");
        properties.put("kaptcha.image.height", "42");
        properties.put("kaptcha.textproducer.char.space", "5");
        properties.put("kaptcha.producer.impl", "com.google.code.kaptcha.impl.DefaultKaptcha");
        properties.put("kaptcha.textproducer.impl", "com.google.code.kaptcha.text.impl.DefaultTextCreator");
        properties.put("kaptcha.textproducer.char.string", "1234567890");
        properties.put("kaptcha.textproducer.char.length", "4");
        properties.put("kaptcha.textproducer.font.names", "Consolas,Arial,Courier");
        properties.put("kaptcha.textproducer.font.size", "23");
        properties.put("kaptcha.textproducer.font.color", "black");
        properties.put("kaptcha.noise.impl", "com.google.code.kaptcha.impl.NoNoise");
        properties.put("kaptcha.noise.color", "black");
        properties.put("kaptcha.obscurificator.impl", "com.google.code.kaptcha.impl.ShadowGimpy");
        properties.put("kaptcha.background.impl", "com.google.code.kaptcha.impl.DefaultBackground");
        properties.put("kaptcha.background.clear.from", "211,236,230");
        properties.put("kaptcha.background.clear.to", "211,237,228");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
