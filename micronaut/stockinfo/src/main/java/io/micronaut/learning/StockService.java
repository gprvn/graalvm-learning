package io.micronaut.learning;

import jakarta.inject.Singleton;

import java.util.List;

@Singleton
public class StockService {
    private List<Stock> stocks;

    public StockService() {
        stocks = List.of(
          new Stock("orcl",80),
          new Stock("spgi",150),
          new Stock("adg",1500), new Stock("amzn",2000)
        );
    }

    public List<Stock> getStocks() {
        return stocks;
    }
}
