package com.example.demo.music.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "lc_portfolio_project", name = "music")
public class Music {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer musicId;

    @NotNull
    @Column(name = "media_type")
    private String type;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "artist")
    private String artist;

    @NotNull
    @Column(name = "year_published")
    private Integer yearPublished;

    @NotNull
    @Column(name = "record_label")
    private String recordLabel;

    @Column(name = "genre")
    private String genre;

    @NotNull
    @Column(name = "media_format")
    private String mediaFormat;

}
