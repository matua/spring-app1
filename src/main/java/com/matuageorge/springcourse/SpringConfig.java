package com.matuageorge.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan("com.matuageorge.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean("classy")
    ClassicalMusic classicalMusic() {
        return ClassicalMusic.getClassicalMusic();
    }

    @Bean
    Computer computer() {
        return new Computer(new MusicPlayer());
    }

    @Bean
    JazzMusic jazzMusic() {
        return new JazzMusic();
    }

    @Bean
    MusicPlayer musicPlayer() {
        return new MusicPlayer();
    }

    @Bean
    TranceMusic tranceMusic() {
        return new TranceMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), tranceMusic(), jazzMusic());
    }
}
