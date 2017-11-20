package com.example.demo.music.delegate;

import com.example.demo.music.entity.Music;
import com.example.demo.music.musicdto.MusicDto;
import com.example.demo.music.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MusicDelegateImpl implements MusicDelegate {

    private final MusicService musicService;

    @Override
    public List<MusicDto> findAllMusic() {

        return musicService.findAllMusic().stream()
                .map(MusicDto::convertMusicToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MusicDto addMusic(MusicDto musicToAdd) {
        Music addedMusic = musicService.addMusic(MusicDto.convertDtoToMusic(musicToAdd));
        return MusicDto.convertMusicToDto(addedMusic);
    }

    @Override
    public void deleteMusic(Integer musicId) {
        musicService.deleteMusic(musicId);
    }

    @Override
    public MusicDto editMusic(MusicDto musicToEdit) {
        Music music = musicService.editMusic(MusicDto.convertDtoToMusic(musicToEdit));

        return MusicDto.convertMusicToDto(music);
    }
}
