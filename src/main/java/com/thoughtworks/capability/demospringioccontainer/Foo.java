package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;

//    public Foo(Bar bar) {
//        this.bar = bar;
//    }
    @Autowired
    public void setBar(Bar bar) {
        this.bar = bar;
    }
}
