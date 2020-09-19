package com.matuageorge.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer1  = context.getBean("musicPlayerBean", MusicPlayer.class);
        MusicPlayer musicPlayer2  = context.getBean("musicPlayerBean", MusicPlayer.class);
        System.out.println("(musicPlayer1==musicPlayer2) = " + (musicPlayer1==musicPlayer2));
        System.out.println(musicPlayer1);
        System.out.println(musicPlayer2);
        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        System.out.println(musicPlayer1.getName()  + " " + musicPlayer2.getVolume());
        context.close();
    }
}
