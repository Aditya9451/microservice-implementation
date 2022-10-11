package com.learning.springbootmicrometer.appbeans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
public class SingletonBean {

    @Autowired
    private ProtoTypeBean protoTypeBean;

    public SingletonBean() {
        log.info(" Singleton Bean instance is created");
    }

    private ProtoTypeBean getProtoTypeBean() {

        return protoTypeBean;
    }

}
