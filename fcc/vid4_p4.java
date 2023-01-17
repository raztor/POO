package fcc;
import java.util.Scanner;

public class vid4_p4 {
    public static void main(String[] args){

        Scanner string_scanner = new Scanner(System.in);
        // Existen más tipos de scanner que serán vistos más adelante
        String scanned = string_scanner.next();// Variable.next solo funciona con strings
        System.out.println(scanned);

        Scanner int_scanner = new Scanner(System.in);
        int scanned_int = int_scanner.nextInt();// Next int sirve para int
        System.out.println(scanned_int);

        Scanner bool_scanner = new Scanner(System.in);
        boolean scanned_bool = bool_scanner.nextBoolean();
        System.out.println(scanned_bool);

        Scanner double_scanner = new Scanner(System.in);
        boolean scanned_double = double_scanner.nextBoolean();
        System.out.println(scanned_double);

        // para evitar errores en el input es mejor usar siempre strings y
        // luego hacer parse a la variable que se quiera modificar

        Scanner parsed_scanner = new Scanner(System.in);
        String Scaneado = parsed_scanner.next();
        int parseado = Integer.parseInt(Scaneado);
        System.out.println(parseado);
    }
}
