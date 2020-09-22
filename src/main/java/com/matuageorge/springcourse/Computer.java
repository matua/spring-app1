package com.matuageorge.springcourse;

//@Component
public class Computer {
    private final int id;
    private final MusicPlayer musicPlayer;

//    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + musicPlayer.playMusic();
    }
}
