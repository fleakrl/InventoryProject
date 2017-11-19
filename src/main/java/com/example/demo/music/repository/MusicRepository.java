package com.example.demo.music.repository;

import com.example.demo.music.entity.Music;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends CrudRepository<Music,Integer> {

    /**
     *
     * @return list of all music in the music table of the database
     */
    List<Music> findAll();
}
