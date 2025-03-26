package com.example.jikanApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Map;

@Service
public class AnimeService {

    private final String JIKAN_API_URL = "https://api.jikan.moe/v4/anime?q=";
    private final RestTemplate restTemplate;

    public AnimeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<Map<String, Object>> searchAnime(String query) {
        String url = JIKAN_API_URL + query;
        Map<String, Object> response = restTemplate.getForObject(url, Map.class);
        List<Map<String, Object>> animeData = (List<Map<String, Object>>) response.get("data");
        return animeData;
    }
}
