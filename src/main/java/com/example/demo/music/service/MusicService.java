package com.example.demo.music.service;

import com.example.demo.music.entity.Music;

import java.util.List;

public interface MusicService {
    /**
     *
     * @return list of all music in the music table of the database
     */
    List<Music> findAllMusic();

    Music addMusic(Music musicToAdd);

    void deleteMusic(Integer musicId);
}
