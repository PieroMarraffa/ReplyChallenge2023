package ClassiJava;

import java.util.ArrayList;
import java.util.List;

public class GestioneFile{

    private static volatile GestioneFile instance = null;
    private final String FILE_PATH = "/Users/pieromarraffa/Documents/GitHub/ReplyChallenge2023/File.txt";

    private GestioneFile() {
    }

    public static synchronized GestioneFile getInstance() {
        if (instance == null) {
            synchronized (GestioneFile.class) {
                if (instance == null) {
                    instance = new GestioneFile();
                }
            }
        }
        return instance;
    }

    public List<Object> leggiFile() {

        return new ArrayList<>();
    }
}