package com.matuageorge.springcourse;

import org.springframework.stereotype.Component;

@Component("jazz")
public class JazzMusic implements Music{

    @Override
    public String getSong() {
        return "It's a wonderful world";
    }
}
