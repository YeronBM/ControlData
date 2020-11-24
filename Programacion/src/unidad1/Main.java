package unidad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int menu = 0;

        do {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  -");
            System.out.println("Elige una opcion:");
            System.out.println("1. Escribir un número entre 0 y 10");
            System.out.println("2. PostIncremento");
            System.out.println("3. PreIncremento");
            System.out.println("4. Operadores Relacionales");
            System.out.println("5. Operador Ternario");
            System.out.println("6. Uso de parentesis");
            System.out.println("7. Preferencia de Operador");
            System.out.println("8. Métodos");
            System.out.println("9. Salir");
            menu = teclado.nextInt();

            switch (menu) {
                case 1:
                    escribirUnNumeroEntre0Y10();
                    espaciado();
                    break;
                case 2:
                    postIncremento();
                    espaciado();
                    break;
                case 3:
                    preIncremento();
                    espaciado();
                    break;
                case 4:
                    operadoresRelacionales();
                    espaciado();
                    break;
                case 5:
                    operadorTernario(teclado);
                    break;
                case 6:
                    usoDeParentesis(teclado);
                    break;
                case 7:
                    preferenciasDeOperador();
                    break;
                case 8:
                    metodos();
                    break;
                case 9:
                    break;
            }
        } while (menu != 9);

    }

    static void espaciado() {
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    static void escribirUnNumeroEntre0Y10() {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        boolean numeroEstaEntre0Y10;

        do {
            numeroEstaEntre0Y10 = true;
            System.out.println("Escribe un número entre 0 y 10:");
            try {
                numero = teclado.nextInt();
            } catch (Exception e) {
                teclado.nextLine();
                System.out.println(e);
                numeroEstaEntre0Y10 = false;
            }
            if (numero < 0) {
                numeroEstaEntre0Y10 = false;
            }
            if (numero > 10) {
                numeroEstaEntre0Y10 = false;
            }
            if (!numeroEstaEntre0Y10) {
                System.out.println("Este número no es válido!.");

            }
        } while (!numeroEstaEntre0Y10);
        System.out.println("Finalizada la prueba.");
    }

    static void postIncremento() {
        int a = 5;

        System.out.println("El valor inicial de a es:" + a);

        //operador postincremental
        //el valor actuald de "a" es usado y mostrado por pantalla, luego el valor se incrementa en una unidad
        System.out.println("Elvalor de a es: " + a++);

        //mostramos nuaevamente el valor de "a", donde podemos observarel incremento realizado
        System.out.println("El valor de a es: " + a);
    }

    static void preIncremento() {
        int a = 5;

        System.out.println("El valor inicial de a es:" + a);

        //operador postincremental
        //el valor actuald de "a" es usado y mostrado por pantalla, luego el valor se incrementa en una unidad
        System.out.println("Elvalor de a es: " + ++a);

        //mostramos nuaevamente el valor de "a", donde podemos observarel incremento realizado
        System.out.println("El valor de a es: " + a);
    }

    static void operadoresRelacionales() {
        int a = 20, b = 10;
        String x = "Supercaligragilistico";
        String y = "Supercaligragilistico";

        boolean condición = true;

        //varias condiciones adicionales
        System.out.println("a == b " + (a == b));
        System.out.println("a < b " + (a < b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a < b " + (a > b));
        System.out.println("a <= b " + (a >= b));
        System.out.println("a != b " + (a != b));

        if (x == y) {
            System.out.println("Las cadenas x e y son iguales");
        }
        System.out.println("condicion == true: " + (condición == true));
    }

    static void operadorTernario(Scanner teclado) {
        int menu = 0;

        System.out.println("Que ejercicio de operador ternacio quieres realizar?:");
        System.out.println("0. Operador Ternario Ejemplo");
        System.out.println("1. Operador Ternario Ejemplo");
        System.out.println("2.Operador Ternario1");
        System.out.println("9. Salir");
        menu = teclado.nextInt();

        switch (menu) {
            case 0:
                operadorTernaioEjemplo(teclado);
                break;
            case 1:
                operadorTernaioEjemplo2(teclado);
                break;
            case 2:
                operadorTernacio1();
                break;
            case 9:
                break;
        }
        while (menu != 9);

    }

    static void operadorTernaioEjemplo(Scanner teclado) {
        int a = 3, c = 4;

        String b;
        b = a < c ? "Es menor" : "Es mayor";
        System.out.println("El resultado es: " + b);
    }

    static void operadorTernaioEjemplo2(Scanner teclado) {
        int a = 18, b = 14, c = 22;

        String s = "";
        s = (a > b && a > c) ? "máximo= " + a : s + "";
        s = (b > a && b > c) ? "máximo= " + b : s + "";
        s = (c > a && c > b) ? "máximo= " + c : s + "";
        System.out.println(s);
    }

    static void operadorTernacio1() {
        int a = 18, b = 14, c = 22, maximo;

        maximo = a > b ? a : b;
        System.out.println(maximo);
        maximo = maximo > c ? maximo : c;
        System.out.println(maximo);
    }

    static void usoDeParentesis(Scanner teclado) {
        int a1 = 5 * 3 + 2;
        int a2 = (5 * 3) + 2;
        int a3 = 5 * (3 + 2);
        System.out.println("a1: " + a1 + " a2: " + a2 + " a3: " + a3);

        int b1 = 36 / 2 * 5;
        int b2 = 36 / (2 * 5);
        System.out.println("b1: " + b1 + " b2: " + b2);

        int c1 = 12 / 2 + 4;
        int c2 = 12 / (2 + 4);
        System.out.println("c1: " + c1 + " c2: " + c2);

        int d1 = 2 + (2 * (5 + 5));
        int d2 = (2 + 2) * (5 + 5);
        int d3 = 2 + (2 * 5) + 5;
        System.out.println("d1: " + d1 + ", d2: " + d2 + ", d3: " + d3);

        System.out.println("\n" + "\n");

        System.out.println("Resultados correctos" + "\n"
                + "a1: 17, a2: 17, a3: 25" + "\n"
                + "b1: 90, b2: 3" + "\n"
                + "c1: 10, c2: 2" + "\n"
                + "d1: 22, d2: 40, d3: 17");
    }

    static void preferenciasDeOperador() {
        int a = 5, b = 3, c = -12;

        System.out.println("Siendo a=" + a + ", b=" + b + ", c=" + c);

        System.out.println("a) A>B:" + (a > b));
        System.out.println("b) B!=C: " + (b != c));
        System.out.println("c) A==3: " + (a == 3));
        System.out.println("d) A*B==5: " + (a * b == 5));
        System.out.println("e) C/B!=-10: " + (c / b != -10));
        System.out.println("f) A*B==-30: " + (a * b == -30));
        System.out.println("g) C/B<A: " + (c * b < a));
        System.out.println("h) A+B+C==5: " + (a + b + c == 5));
        System.out.println("i) (A+B==8) && (A-B==2): " + ((a + b == 8) && (a - b == 2)));
        System.out.println("j) (A+B==8) || (A-B==6): " + ((a + b == 8) || (a - b == 6)));
        System.out.println("k) A>3 && B>3 && C<3: " + (a > 3 && b > 3 && c < 3));
        System.out.println("l) A>3 && B>=3 && C<-3: " + (a > 3 && c >= 3 && c < -3));
    }

    static void metodos() {
        String cadena = "No por mucho madrugar amanece más temprano";

        System.out.println(cadena.charAt(0));//Devuelve la primera letra de la cadena (posicion cero). Devuelve la letra en la posición
        System.out.println(cadena.charAt(9));//devuelve la decima letra de la cadena (posicion 9). Devuelve la letra en la posición

        System.out.println(cadena.endsWith("0"));
        //MÉTODO: endsWith; 
        //DESCRIPCIÓN: Indica si la cadena acaba con el String pasado por parámetro.
        //PARÁMETRO: String;
        //TIPO DE DATO DEVUELTO: boolean;

        System.out.println(cadena.startsWith("n"));
        //MÉTODO: startsWith; 
        //DESCRIPCIÓN: Indica si la cadena empieza por una cadena pasada por parámetro;
        //PARÁMETRO: String;
        //TIPO DE DATO DEVUELTO: boolean;

        System.out.println(cadena.equals("No por mucho madrugar amanece más temprano"));//compara el calor de la cadena con el valor de otra cedena. Devuelve tru/false
        //MÉTODO: equals; 
        //DESCRIPCIÓN: Indica si una cadena es igual a otra;
        //PARÁMETRO: String;
        //TIPO DE DATO DEVUELTO: boolean;

        System.out.println(cadena.indexOf("mucho"));
        //MÉTODO: indexOf; 
        //DESCRIPCIÓN: Devuelve la posición en la cadena pasada por parámetro desde el principio. -1 si no existe;
        //PARÁMETRO: String o char;
        //TIPO DE DATO DEVUELTO: int;

        System.out.println(cadena.length());
        //MÉTODO: lenght; 
        //DESCRIPCIÓN: Devuelve la longitud de la cadena;
        //PARÁMETRO: Ningún parámetro;
        //TIPO DE DATO DEVUELTO: int;

        System.out.println(cadena.replace('o', 'i'));
        //MÉTODO: replace; 
        //DESCRIPCIÓN: Devuelve un String cambiando los carácteres que nosotros le indiquemos;
        //PARÁMETRO: Dos parámetros char, el primero esel carácter que existe en el String y el segundo por el que queremos cambiar;
        //TIPO DE DATO DEVUELTO: String;

        System.out.println(cadena.toLowerCase());
        //MÉTODO: toLowerCase; 
        //DESCRIPCIÓN: Convierte el String a minúsculas;
        //PARÁMETRO: Ningún parámetro;
        //TIPO DE DATO DEVUELTO: String;

        System.out.println(cadena.toUpperCase());
        //MÉTODO: toUpperCase; 
        //DESCRIPCIÓN: Convierte el String a mayúsculas;
        //PARÁMETRO: Ningún parámetro;
        //TIPO DE DATO DEVUELTO: String;w

        //FUENTE: http://www.cpcppw.es/java-clase-string.html
    }

}
