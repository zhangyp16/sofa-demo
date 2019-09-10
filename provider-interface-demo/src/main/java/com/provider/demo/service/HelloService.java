package com.provider.demo.service;

import com.provider.demo.model.HelloRequest;
import com.provider.demo.model.HelloResponse;


public interface HelloService {

    HelloResponse getMessage(HelloRequest request);
}
