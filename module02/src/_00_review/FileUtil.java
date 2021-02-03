package _00_review;

import _16_io_text_file.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String FILE_PATH = "D:\\SynologyDrive\\Dell5590\\Work\\CodeGym\\Class\\A0920G1\\Module_2\\SourceDemo\\src\\_00_review\\student.csv";
    public static final String COMMA = ",";

    public static void writeCSV(Student student) {
        File file = new File(FILE_PATH);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            BufferedWriter buffWrite = new BufferedWriter(fileWriter);
            buffWrite.write(student.getId() + COMMA + student.getName() + "\n");

            buffWrite.flush();

            buffWrite.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readCSV(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buffRead = new BufferedReader(fileReader);

            String line;
            while ((line = buffRead.readLine()) != null){
                stringList.add(line);
            }
            buffRead.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
