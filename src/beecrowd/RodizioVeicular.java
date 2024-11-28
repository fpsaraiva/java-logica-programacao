package beecrowd;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RodizioVeicular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroTestes = sc.nextInt();
        String[] placas = new String[numeroTestes];
        String dia = "";

        for (int i = 0; i < numeroTestes; i++) {
            placas[i] = sc.next();
        }

        for (int i = 0; i < numeroTestes; i++) {
            boolean valid = Pattern.matches("\\p{Upper}{3}-\\d{4}", placas[i]);

            if(!valid) {
                dia = "FAILURE";
            } else {
                char ultimoDigito = placas[i].charAt(placas[i].length() - 1);

                switch (ultimoDigito) {
                    case '1':
                    case '2':
                        dia = "MONDAY";
                        break;
                    case '3':
                    case '4':
                        dia = "TUESDAY";
                        break;
                    case '5':
                    case '6':
                        dia = "WEDNESDAY";
                        break;
                    case '7':
                    case '8':
                        dia = "THURSDAY";
                        break;
                    case '9':
                    case '0':
                        dia = "FRIDAY";
                        break;
                    default:
                        break;
                }
            }

            System.out.println(dia);
        }
    }
}
