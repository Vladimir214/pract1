import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        FileReader fr= new FileReader("file3.txt");
        Scanner scan = new Scanner(fr);
        int num = 0;
        int resultOne = 0;
        int resultTwo = 0;
        int a = 0;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file3.txt"))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                num++;
                a++;
                int symbols = string.length();
                int words = string.split("\\s+").length;
                resultOne += symbols;
                resultTwo += words;
                System.out.println("Количество символов в " + a + " строке: " + symbols);
                System.out.println("Количество слов в " + a + " строке: "+ words);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Нет файла");
        }

        System.out.println("Количество строк в файле: " + num);
        System.out.println("Количество символов в файле: " + resultOne);
        System.out.println("Количество слов в файле: " + resultTwo);
    }
}



