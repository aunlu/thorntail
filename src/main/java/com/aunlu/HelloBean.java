package com.aunlu;

import org.apache.camel.util.InetAddressUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named
public class HelloBean {

    public String sayHello() throws Exception {
        String answer = "thorntail says hello from "
                + InetAddressUtil.getLocalHostName();
        return answer;
    }
}
