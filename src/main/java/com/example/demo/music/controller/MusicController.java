package com.example.demo.music.controller;

import com.example.demo.music.delegate.MusicDelegate;
import com.example.demo.music.musicdto.MusicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Handles requests to /music
 */

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MusicController {

    private final MusicDelegate musicDelegate;


    /**
     * On GET Requests to /music return a List<MusicDto> of all music in the music table
     *
     * @return List<MusicDto> of music in the music table
     */
    @RequestMapping(method = RequestMethod.GET, path = "/music")
    public List<MusicDto> findAllMusic(){
        return musicDelegate.findAllMusic();
    }
}
