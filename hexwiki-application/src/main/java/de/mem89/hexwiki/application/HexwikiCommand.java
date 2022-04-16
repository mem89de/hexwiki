package de.mem89.hexwiki.application;

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
        return 0;
    }
}
