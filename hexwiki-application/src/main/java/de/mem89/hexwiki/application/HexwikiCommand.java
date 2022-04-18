package de.mem89.hexwiki.application;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.mem89.hexwiki.core.CoreModule;
import de.mem89.hexwiki.core.TileProcessorLoop;
import de.mem89.hexwiki.examples.ExampleModule;
import picocli.CommandLine;

import java.io.File;
import java.util.concurrent.Callable;

@CommandLine.Command(
        name = "hexwiki",
        resourceBundle = "de.mem89.hexwiki.application.messages",
        mixinStandardHelpOptions = true,
        version = "hexwiki 1.0.0"
)
public class HexwikiCommand implements Callable<Integer> {
    @CommandLine.Parameters(index = "0", descriptionKey = "file")
    private File file;

    @Override
    public Integer call() throws Exception {
        Injector injector = Guice.createInjector(new CoreModule(), new ExampleModule());
        injector.getInstance(TileProcessorLoop.class).process();

        return 0;
    }
}
