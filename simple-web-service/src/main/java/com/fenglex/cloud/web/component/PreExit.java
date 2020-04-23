package com.fenglex.cloud.web.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Slf4j
public class PreExit {
    @PreDestroy
    public void exit(){
        log.warn("cloud-service-web exist");
    }
}
