package algo3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        BackEnd backEnd = new BackEnd();
        FrontEnd frontEnd = new FrontEnd(backEnd);
        frontEnd.arrancar();
    }
}
