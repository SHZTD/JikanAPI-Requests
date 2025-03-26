package com.example.jikanApi;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private int mal_id;
    private String title;
    private String image_url;
    private String synopsis;
}
