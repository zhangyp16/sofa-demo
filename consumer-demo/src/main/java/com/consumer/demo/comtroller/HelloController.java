package com.consumer.demo.comtroller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaReferenceBinding;
import com.provider.demo.model.HelloRequest;
import com.provider.demo.model.HelloResponse;
import com.provider.demo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @SofaReference(binding = @SofaReferenceBinding(bindingType = "bolt", directUrl = "127.0.0.1:12200", timeout = 10000, retries = 3))
    private HelloService helloService;

    @GetMapping(value = "/index")
    public HelloResponse getMsg(){
        return helloService.getMessage(new HelloRequest("consumer req :"));
    }
}
