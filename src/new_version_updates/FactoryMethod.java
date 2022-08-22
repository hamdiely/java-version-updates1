package new_version_updates;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FactoryMethod {
    public static void main(String[] args) {
        // before java 9
        List<String> course = Collections.unmodifiableList(Arrays.asList("Java","Spring", "Agile"));
        // After java9
        List<String> mycourse= List.of("Java","Python");

    }
}
