package com.example.demo.music.delegate;

import com.example.demo.music.musicdto.MusicDto;

import java.util.List;

public interface MusicDelegate {

    List<MusicDto> findAllMusic();

    MusicDto addMusic(MusicDto musicToAdd);

    void deleteMusic(Integer musicId);

    MusicDto editMusic(MusicDto musicToEdit);
}
