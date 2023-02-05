package io.micronaut.learning;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import jakarta.inject.Inject;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "stockclient", description = "...",
        mixinStandardHelpOptions = true)
public class StockclientCommand implements Runnable {

    @Inject
    private StockClient stockClient;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(StockclientCommand.class, args);
    }

    public void run() {
        System.out.println(stockClient);
        System.out.println(stockClient.getStock("orcl"));
        System.out.println(stockClient.getStock("spgi"));
    }
}
