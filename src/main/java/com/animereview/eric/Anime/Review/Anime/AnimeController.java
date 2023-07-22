package com.animereview.eric.Anime.Review.Anime;
import org.apache.coyote.Response;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/animes")
public class AnimeController {
    @Autowired
    private AnimeService animeService;
    @GetMapping
    public ResponseEntity<List<Anime>> getAllMovies(){
        return new ResponseEntity<List<Anime>>(animeService.allAnimes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Anime>> getAnime(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<Anime>>(animeService.singleAnime(id), HttpStatus.OK);
    }

    @GetMapping("/vincent")
    public ResponseEntity<String> getVincent(){
        return new ResponseEntity<String>("Im about to cum", HttpStatus.OK);
    }
}
