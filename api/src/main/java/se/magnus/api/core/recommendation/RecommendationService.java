package se.magnus.api.core.recommendation;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getRecommendations(
            @RequestParam(value = "productId", required = true) int productId
    );
}
