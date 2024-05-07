import java.io.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> Splited = new ArrayList<String>();

        try {
            File file = new File("email.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split(";");
                Splited.add(Arrays.toString(words));
                for (String word : words) {
                    System.out.println(word);

                }

            }
        br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}