package com.learning.springbootmicrometer.configuration;

import com.learning.springbootmicrometer.appbeans.ProtoTypeBean;
import com.learning.springbootmicrometer.appbeans.SingletonBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean()
    @Scope("singleton")
    public SingletonBean getSingletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope("prototype")
    public ProtoTypeBean getProtoTypeBean() {
        return new ProtoTypeBean();
    }


}
