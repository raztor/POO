# Apuntes Notion Vid 1
By Raztor

# Introducción a Java

al crear una clase en java se debe crear un método en donde se escribirá todo el código “básico”

La syntaxis básica se asemeje mucho a C y C++

```java
package fcc;

public class vid1_p1 {
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```

## Variables y tipos de datos

El tipo de dato de una variable se debe declarar al igual que en C y C++.

```java
package fcc;

public class vid1_p2 {
    public static void main(String[] args){
        int variable_demo = 2;
        System.out.println(variable_demo);
    };
}
```

Los tipos de datos funcionan casi igual que en C++ a diferencia del float/double.

- Tipos de datos y declaraciones

    ```java
    package fcc;
    
    public class vid1_p2 {
        public static void main(String[] args){
            // Primitive data types
            int variable_demo = 2;
            double variable_double = 5.3;
            boolean variable_booleana = true;
            char variable_char = 'A';
            
            // Data types no primitivos
            String variable_string = "Variable String";
    
            System.out.println(variable_demo);
        };
    }
    ```

- Asignando variables a otras variables

    ```java
    package fcc;
    
    public class vid1_p2 {
        public static void main(String[] args){
            // Primitive data types
            int variable_demo = 2;
            double variable_double = 5.3;
            boolean variable_booleana = true;
            char variable_char = 'A';
    
            // Data types no primitivos
            String variable_string = "Variable String";
            
            int copiar_valor = variable_demo;
            
            System.out.println(copiar_valor);
            // Da como resultado el valor de variable_demo = 2
    
            System.out.println(variable_demo);
        };
    }
    ```


## Operaciones básicas

Las operaciones son similares a otros lenguajes de programación, se respeta la prioridad de operaciones.

```java
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
```

- Para hacer cast de una variable

  Se debe poner (entre parentesis) el tipo de dato al que se quiere convertir ANTES de la variable

    ```java
    package fcc;
    
    public class vid1_p3 {
        public static void main(String[] args){
            // Se respeta el orden de operaciones matemático
            int x = 5;
            int y = 7;
            int z = 56;
    
            double resultado_decimales = x / (double)y;
            System.out.println(resultado_decimales);
        };
    }
    ```


## input y scanners

Para poder recibir inputs, primero se debe importar la librería de scanners (java.util.Scanner).

Existen scanners para distintos tipos de datos y no se deben mezclar.

Es útil utilizar el parse para evitar errores en el scanner.

```java
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
```