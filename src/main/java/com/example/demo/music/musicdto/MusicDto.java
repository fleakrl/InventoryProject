package com.example.demo.music.musicdto;

import com.example.demo.music.entity.Music;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@Builder
public class MusicDto {

    @NotNull
    @JsonProperty
    private Integer musicId;

    @NotNull
    @JsonProperty
    private String type;

    @NotNull
    @JsonProperty
    private String title;

    @NotNull
    @JsonProperty
    private String artist;

    @NotNull
    @JsonProperty
    private Integer yearPublished;

    @NotNull
    @JsonProperty
    private String recordLabel;

    @JsonProperty
    private String genre;


    /**
     *
     * Converts a MusicDto object into a Music object

     *
     * @param musicDto the musicDto object to be transformed by this function
     * @return Music A music object constructed from the input musicDto
     */
    public static Music convertDtoToMusic(MusicDto musicDto){
        return Music.builder()
                .musicId(musicDto.getMusicId())
                .type(musicDto.getType())
                .title(musicDto.getTitle())
                .artist(musicDto.getArtist())
                .yearPublished(musicDto.getYearPublished())
                .recordLabel(musicDto.getRecordLabel())
                .genre(musicDto.getGenre())
                .build();
    }


    /**
     *
     * Converts a Music object into a MusicDto object
     *
     * @param music the music object to be transformed by this function
     * @return MusicDto a MusicDto object constructed from the input music object
     */
    public static MusicDto convertMusicToDto(Music music){
        return MusicDto.builder()
                .musicId(music.getMusicId())
                .type(music.getType())
                .title(music.getTitle())
                .artist(music.getArtist())
                .yearPublished(music.getYearPublished())
                .recordLabel(music.getRecordLabel())
                .genre(music.getGenre())
                .build();
    }
}
