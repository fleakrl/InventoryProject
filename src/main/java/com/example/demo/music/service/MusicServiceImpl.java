package com.example.demo.music.service;

import com.example.demo.music.entity.Music;
import com.example.demo.music.repository.MusicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MusicServiceImpl implements MusicService{

    private final MusicRepository musicRepository;

    @Override
    public List<Music> findAllMusic() {
        return musicRepository.findAll();
    }

    @Override
    public Music addMusic(Music musicToAdd) {
        return musicRepository.save(musicToAdd);
    }

    @Override
    public void deleteMusic(Integer musicId) {
        musicRepository.delete(musicId);

    }
}
