package com.springboot.spring4.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class DemoPrototypeService {

}
