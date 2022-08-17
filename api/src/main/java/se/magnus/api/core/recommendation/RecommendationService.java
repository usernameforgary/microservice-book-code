package se.magnus.api.core.recommendation;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface RecommendationService {
    Mono<Recommendation> createRecommendation(Recommendation body);

    @GetMapping(
            value = "/recommendation",
            produces = "application/json"
    )
    Flux<Recommendation> getRecommendations(
            @RequestParam(value = "productId") int productId
    );

    Mono<Void> deleteRecommendations(int productId);
}
