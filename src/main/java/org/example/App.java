package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App 
{
    private static final String FILE_PATH = "src/main/java/org/example/city_ru.csv";
    public static void main(String[] args ){
        try {
            Path path = Paths.get(FILE_PATH);
            Scanner scanner = new Scanner(path);
            while(scanner.hasNext()) {
                String oneLineText = scanner.nextLine();
                String[] parse = oneLineText.split(";");
                System.out.println(parse[0] + new City(parse[1], parse[2], parse[3], Integer.parseInt(parse[4]), parse[5]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден " + FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
