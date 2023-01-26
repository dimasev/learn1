package reader;

import customexeption.CustomException;

import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

public interface ReaderFile {
    List <String> readFile(File file) throws CustomException;
    boolean isFileEmpty(File file);
}
