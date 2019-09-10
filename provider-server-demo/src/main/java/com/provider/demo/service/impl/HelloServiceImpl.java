package com.provider.demo.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.alipay.sofa.runtime.api.annotation.SofaServiceBinding;
import com.provider.demo.model.HelloRequest;
import com.provider.demo.model.HelloResponse;
import com.provider.demo.service.HelloService;
import org.springframework.stereotype.Service;

@Service
@SofaService(bindings = {@SofaServiceBinding(bindingType = "bolt", timeout = 30000)})
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloResponse getMessage(HelloRequest request) {
        return new HelloResponse(request.getReqMsg());
    }
}
