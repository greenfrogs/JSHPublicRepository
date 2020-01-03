package uk.ac.ucl.jsh.app;

import uk.ac.ucl.jsh.PathHolder;

import java.util.List;

public class Hello extends Application {

    public Hello(String input, List<String> arguments) {
        super(input, arguments);
    }

    @Override
    public ApplicationReturn run() {
        return new ApplicationReturn("Hello World");
    }
}
