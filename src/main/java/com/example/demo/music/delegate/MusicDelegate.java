package com.example.demo.music.delegate;

import com.example.demo.music.musicdto.MusicDto;

import java.util.List;

public interface MusicDelegate {

    List<MusicDto> findAllMusic();
}
