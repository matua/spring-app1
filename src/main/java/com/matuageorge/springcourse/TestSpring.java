package com.matuageorge.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("(musicPlayer1==musicPlayer2) = " + (musicPlayer1 == musicPlayer2));
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
////        musicPlayer1.playMusic();
////        musicPlayer2.playMusic();
//
//        System.out.println(musicPlayer1.getName() + " " + musicPlayer2.getVolume());
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic1 = context.getBean("classy", ClassicalMusic.class);
//        ClassicalMusic classicalMusic2 = context.getBean("classy", ClassicalMusic.class);
//
//        System.out.println(classicalMusic1 == classicalMusic2);

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(musicPlayer.playMusic());

        context.close();
    }
}
