package com.animereview.eric.Anime.Review.Anime;

import com.animereview.eric.Anime.Review.Reviews.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "animes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Anime {
    @Id
    private ObjectId id;
    private List<String> sources;
    private String title;
    private String type;
    private int episodes;
    private String status;
    private AnimeSeason animeSeason;
    private String picture;
    private String thumbnail;
    private List<String> synonyms;
    private List<String> relations;
    private List<String> tags;
    @DocumentReference
    private List<Review> reviewIds;
}
