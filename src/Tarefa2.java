import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Author: Lucas Jardim
 */
public class Tarefa2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula, e com seu respectivo sexo. Ex: João-M ou Maria-F");
        String names = s.nextLine();

        String[] namesArray = names.split(",");

        ArrayList<String> masculineList = new ArrayList<>();
        ArrayList<String> femaleList = new ArrayList<>();

        for (String namesGender : namesArray) {
            String[] dash = namesGender.split("-");

            if(dash.length == 2) {
                String name = dash[0].trim();
                String gender = dash[1].trim();

                if (gender.equals("M")) {
                    masculineList.add(name);
                } else {
                    femaleList.add(name);
                }
            }
        }

        Collections.sort(masculineList);
        Collections.sort(femaleList);

        System.out.println("\nLista Masculina:");
        for (String male : masculineList) {
            System.out.println(male);
        }

        System.out.println("\nLista Feminina:");
        for (String female : femaleList) {
            System.out.println(female);
        }
    }
}
