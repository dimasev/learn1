package reader.impl;

import customexeption.CustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import reader.ReaderFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReaderFileImpl implements ReaderFile {
    static Logger logger = LogManager.getLogger();
    final static String STR_REGEX = "\\n+";

    public List<String> readFile(File file) throws CustomException {

        List<String> list = new ArrayList<String>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String str;
                while ((str = reader.readLine()) != null) {
                    String[] strings = str.split(STR_REGEX);
                    for (String str1 : strings) {
                        list.add(str1);
                    }
                }
            } catch (IOException e) {
                throw new CustomException(e);
            }
        return list;
    }

    @Override
    public boolean isFileEmpty(File file) {
        return file.length() == 0;
    }
}
