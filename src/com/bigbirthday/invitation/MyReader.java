package com.bigbirthday.invitation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {
    private File file;
    public MyReader(File file) {
        this.file = file;
    }

    public String read() throws IOException {
        FileReader fileReader = new FileReader(file);
        char[] rowData = new char[(int)file.length()];
        fileReader.read(rowData);
        return new String(rowData);
    }
}
