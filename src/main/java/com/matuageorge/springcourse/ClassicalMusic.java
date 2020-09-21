package com.matuageorge.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("classy")
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    @PostConstruct
    public void doMyinit() {
        System.out.println("Init method");
    }

    @PreDestroy
    public void doMyDestory() {
        System.out.println("Destroy method");
    }
}
