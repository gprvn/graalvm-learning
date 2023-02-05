package io.micronaut.learning;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
@Client(id = "stockclient")
public interface StockClient {
    @Get("/{ticker}")
    public Stock getStock(String ticker);
}
