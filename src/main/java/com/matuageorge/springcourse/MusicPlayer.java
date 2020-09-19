package com.matuageorge.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPlayerBean")
public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;
    private List<Music> musicList = new ArrayList<>();

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
//        musicList.forEach(music -> System.out.println("Playing " + music.getSong()));
        System.out.println(music.getSong());
    }

    public MusicPlayer setMusic(Music music) {
        this.music = music;
        return this;
    }

    public String getName() {
        return name;
    }

    public MusicPlayer setName(String name) {
        this.name = name;
        return this;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer setVolume(int volume) {
        this.volume = volume;
        return this;
    }

    public MusicPlayer setMusicList(List<Music> musicList) {
        this.musicList = musicList;
        return this;
    }

    private void initMusicPlayer() {
        System.out.println("Music Player initialization");
    }

    private void destroyPlayer() {
        System.out.println("Music Player vanished");
    }
}
