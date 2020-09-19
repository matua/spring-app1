package com.matuageorge.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println("(musicPlayer1==musicPlayer2) = " + (musicPlayer1 == musicPlayer2));
//        System.out.println(musicPlayer1);
//        System.out.println(musicPlayer2);
////        musicPlayer1.playMusic();
////        musicPlayer2.playMusic();
//        Music music = ClassicalMusic.getClassicalMusic();
//        System.out.println(music.getSong());
//
//        System.out.println(musicPlayer1.getName() + " " + musicPlayer2.getVolume());

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);

        context.close();
    }
}
