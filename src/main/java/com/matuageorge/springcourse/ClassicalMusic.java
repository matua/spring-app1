package com.matuageorge.springcourse;

import org.springframework.stereotype.Component;

@Component("classy")
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
}
