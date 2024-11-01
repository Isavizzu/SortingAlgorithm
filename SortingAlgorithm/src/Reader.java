import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Reader {

    private String separator;


    public Reader () {
        this.separator = ",";
    }

    public void insertInVector (ArrayList<Integer> vector, String path) {
        vector.clear();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] numbers = line.split(this.separator);

                for (String number : numbers) {
                    try {
                        int n = Integer.parseInt(number.trim());
                        vector.add(n);
                    } catch (NumberFormatException e) {
                        System.out.println("Número inválido: " + number);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
