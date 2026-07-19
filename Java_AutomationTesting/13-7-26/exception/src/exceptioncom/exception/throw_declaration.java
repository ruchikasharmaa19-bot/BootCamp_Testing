package exceptioncom.exception;

import java.io.IOException;

public class throw_declaration {

    static void checkFile() throws IOException {
        throw new IOException("File not found.");
    }

    public static void main(String[] args) {

        try {
            checkFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}