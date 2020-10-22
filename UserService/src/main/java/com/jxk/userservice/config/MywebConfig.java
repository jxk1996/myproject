package com.jxk.userservice.config;

import com.jxk.userservice.listener.MyListener;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionListener;

@Configuration
public class MywebConfig  implements WebMvcConfigurer {
    @Bean
    public ServletListenerRegistrationBean<ServletRequestListener> listenerRegist() {
        ServletListenerRegistrationBean<ServletRequestListener> srb = new ServletListenerRegistrationBean();
        srb.setListener(new MyListener());
        return srb;
    }
}
