import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Author: Lucas Jardim
 */
public class Tarefa1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println(("Digite nomes separados por vírgula: "));
        String text = s.nextLine();

        String[] namesArray = text.split(",");
        ArrayList<String> namesList = new ArrayList<>();

        for (String name : namesArray) {
            namesList.add(name.trim());
        }

        Collections.sort(namesList);

        System.out.println("Nomes ordenados: \n"+namesList);
    }
}
