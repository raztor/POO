package fcc;

public class vid1_p3 {
    public static void main(String[] args){
        // Se respeta el orden de operaciones matemático
        int x = 5;
        int y = 7;
        int z = 56;

        int sum = x+y+z;
        int mult = x*y*x;
        int div = x/y; // El resultado será 0, ya que son numeros enteros.


        // Así se puede hacer que el print contenga los decimales.
        double x_double = 5;
        double y_double = 7;
        double div_doubles = 5/7;
        System.out.println(div_doubles);

        double mod_doubles = 5%7; // Da el resto de la división
        System.out.println(mod_doubles);

        // Para hacer un elevado se puede usar la libreria Math
        double elevado = Math.pow(x,y); // equivale a 5^7
        System.out.println(elevado);
    };
}