package io.micronaut.learning;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class StockControllerTest {
    @Client("/")
    interface StockClient{
        @Get("/{ticker}")
        public Stock getStock(String ticker);
    }

    @Inject
    private StockClient stockClient;

    @Test
    void getPriceForORCL() {
        int price = stockClient.getStock("orcl").getPrice();
        assertEquals(80, price);
    }
}
