package com.matuageorge.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
//    @Autowired

    private Music music;
    @Value("${musicPlayer.name}")

    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    private List<Music> musicList = new ArrayList<>();

    {
        musicList.add(ClassicalMusic.getClassicalMusic());
        musicList.add(new TranceMusic());
        musicList.add(new JazzMusic());
    }

    public MusicPlayer() {
    }


    //    @Autowired
    public MusicPlayer(@Qualifier("jazz") Music music) {
        this.music = music;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
//        musicList.forEach(music -> System.out.println("Playing " + music.getSong()));
        Random random = new Random();
        return musicList.get(random.nextInt(musicList.size())).getSong();
    }

//    @Autowired

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
