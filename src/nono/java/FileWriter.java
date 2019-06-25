package nono.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class FileWriter implements nono.java.Writer {

    private String filename;
    private Path path;
    private String content;

    public FileWriter(String filename) {
        this.filename = filename;
    }

    @Override
    public void start() {
        this.path = Paths.get(filename);
        this.content = "";
    }

    @Override
    public void stop() {
        try
        {
            Files.write(this.path, String.format(content).getBytes());
        }
        catch (IOException e)
        {
            System.err.println("Impossible de rédiger la facture");
        }
    }

    @Override
    public void writeLine(String line) {
        this.content += line + "%n";
    }
}
