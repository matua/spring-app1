package com.matuageorge.springcourse;

//@Component("jazz")
public class JazzMusic implements Music{

    @Override
    public String getSong() {
        return "It's a wonderful world";
    }
}
