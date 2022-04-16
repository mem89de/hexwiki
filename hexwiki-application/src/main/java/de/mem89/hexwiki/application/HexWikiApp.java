package de.mem89.hexwiki.application;

import picocli.CommandLine;

public class HexWikiApp {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new HexwikiCommand()).execute(args);
        System.exit(exitCode);
    }
}
