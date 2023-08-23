package com.example.demo;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class FileHandlingService {
    private static FileWriter filewriter;

    public static void write(String path, String content) throws IOException {
        filewriter = new FileWriter("path");
        filewriter.write(content);
        filewriter.close();
    }


}
