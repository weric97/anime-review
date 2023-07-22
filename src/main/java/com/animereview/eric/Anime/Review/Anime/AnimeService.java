package com.animereview.eric.Anime.Review.Anime;

import org.apache.coyote.Response;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;
    public List<Anime> allAnimes(){
        return animeRepository.findAll();
    }

    public Optional<Anime> singleAnime(ObjectId id){
        return animeRepository.findById(id);
    }
}
