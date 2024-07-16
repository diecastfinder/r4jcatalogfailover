package org.diecastfinder.r4jcatalogfailover.web;

import java.util.List;
import org.diecastfinder.r4jcatalogfailover.web.model.CatalogModelDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CatalogHandler {
    public Mono<ServerResponse> getAllFoundModels(ServerRequest request) {
        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(Mono.just(List.of(CatalogModelDto.builder()
                .uri("failover.stub.rerun.catalog.service")
                .build())), CatalogModelDto.class);
    }
}
