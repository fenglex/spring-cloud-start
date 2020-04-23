package com.fenglex.cloud.web.controller;


import com.fenglex.cloud.web.util.NetUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/net")
@RestController
public class NetController {

    @GetMapping("/ip")
    public String remoteIp(HttpServletRequest request) {
        return NetUtil.getIp(request);
    }
}
