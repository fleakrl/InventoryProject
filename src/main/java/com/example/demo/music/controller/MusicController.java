package com.example.demo.music.controller;

import com.example.demo.music.delegate.MusicDelegate;
import com.example.demo.music.musicdto.MusicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<MusicDto> findAllMusic() {

        return musicDelegate.findAllMusic();
    }


    /**
     * On POST Requests to /music add music to the music table
     *
     * @param musicToAdd JSON Request body data that gets mapped to a MusicDto Object
     * @return Music DTO of Music added to the database
     */
    @RequestMapping(method = RequestMethod.POST, path = "/music")
    public MusicDto addMusic(@RequestBody MusicDto musicToAdd) {

        return musicDelegate.addMusic(musicToAdd);
    }


    /**
     * On DELETE requests to /music/{musicId} where {musicId} is an integer;
     * delete the record with the musicId from the music table.
     *
     * @param musicId integer id of the music record in the music table to be deleted
     */
    @RequestMapping(method = RequestMethod.DELETE, path = "/music/{musicId}")
    public void deleteMusic(@PathVariable Integer musicId) {

        musicDelegate.deleteMusic(musicId);
    }


    /**
     * On PUT Requests to /music edit an existing item in the music table;
     * if musicId is not in the music table returns a runtime exception
     *
     * @param musicToEdit Music object with the edits in place
     * @return MusicDto object of the object after the edits have been made.
     */
    @RequestMapping(method = RequestMethod.PUT, path = "/music")
    public MusicDto editMusic(@RequestBody MusicDto musicToEdit) {
        return musicDelegate.editMusic(musicToEdit);
    }
}
