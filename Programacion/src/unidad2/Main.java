package unidad2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.xml.transform.Source;

/**
 * @author YeronBM_Sobremesa
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  -");
            System.out.println("1. Introducir Números");
            System.out.println("2. Mostar Fecha y Hora");
            System.out.println("3. Pagar IRPF");
            System.out.println("4. Apruebas o Suspendes");
            System.out.println("5. Condicionales Dobles");
            System.out.println("6. Estructuras condicionales anidadas");
            System.out.println("7. Ifs anidados Número randomy temperaturas");
            System.out.println("8. Else Ifs y notas");
            System.out.println("9. SwitchVehiculos");
            System.out.println("10. Dia Laborable o Fin de Semana");
            System.out.println("11. Numero par o no");
            System.out.println("12. Deternina si un año es bisiesto");
            System.out.println("13. Usuario Password");
            System.out.println("14. Ordenar números");
            System.out.println("15. Pedir Numero Y Decir Numero De Cifras");
            System.out.println("16. Casos de la Farmacia");
            System.out.println("17. Aplicación de Cajero.");
            System.out.println("18. mostrarPares");
            System.out.println("19. mostrar_rango");
            System.out.println("20. mostrarTablaDeMultiplicar");
            System.out.println("30. Salir");

            boolean datosCorrectos;
            do {
                datosCorrectos = true;

                try {
                    System.out.println("Selecciona el método");
                    menu = teclado.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduce el NÚMERO ENTERO ADECUADO para el método que quieres ejecutar");
                    datosCorrectos = false;

                }
            } while (!datosCorrectos);

            switch (menu) {
                case 1:
                    introducirNumeros(teclado);
                    break;
                case 2:
                    mostrarFechaYHora();
                    break;
                case 3:
                    pagarIRPF();
                case 4:
                    preguntarNotaApruebasOSuspendes(teclado);
                    break;
                case 5:
                    condicionalesDobles(teclado);
                    break;
                case 6:
                    estructuraIfAnidada(teclado);
                    break;
                case 7:
                    ifsAnidadosNumeroRandom(teclado);
                    break;
                case 8:
                    elseIfs(teclado);
                    break;
                case 9:
                    switchVehiculos(teclado);
                    break;
                case 10:
                    diaLaboralONo(teclado);
                    break;
                case 11:
                    numeroParONo(teclado);
                    break;
                case 12:
                    anoBisiesto(teclado);
                case 13:
                    usuarioPassword(teclado);
                case 14:
                    ordenarNumeros(teclado);
                    break;
                case 15:
                    pedirNumeroYDecirNumeroDeCifras(teclado);
                    break;
                case 16:
                    farmacia(teclado);
                    break;
                case 17:
                    cajero(teclado);
                    break;
                case 18:
                    mostrarPares(teclado);
                    break;
                case 19:
                    mostrar_rango(teclado);
                    break;
                case 20:
                    mostrarTablaMultiplicar(teclado);
                    break;

                case 21:
                case 30://Salir
                    break;
            }
        } while (menu != 30);
    }

    public static void introducirNumeros(Scanner teclado) {
        /*
        Estructura secuencial: Lee dos números por pantalla y muestra su suma
         */

        int n1 = 0, n2, suma;

        boolean datosCorrectos;
        do {
            datosCorrectos = true;

            try {
                System.out.println("Introduce un número entero;");
                n1 = teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce el NÚMERO ENTERO ADECUADO para el método que quieres ejecutar");

                datosCorrectos = false;
            }
        } while (!datosCorrectos);

        System.out.println("Introduce otro número entero");
        n2 = teclado.nextInt();
        suma = n1 + n2;

        System.out.println("Ha introducido los números " + n1 + " y " + n2 + "\n"
                + "de los cuales la suma es " + suma);
    }

    public static void mostrarFechaYHora() {
        Date myDate = new Date();

        SimpleDateFormat myDF1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat myDF2 = new SimpleDateFormat("kk:mm:ss");

        System.out.println("La fecha actual es " + myDF1.format(myDate));
        System.out.println("La hora actual es " + myDF2.format(myDate));
    }

    public static void pagarIRPF() {
        Scanner teclado = new Scanner(System.in);

        double ingresos;
        System.out.println("Introduce tus ingresos anuales:");
        ingresos = teclado.nextDouble();

        if (ingresos < 12450) {
            System.out.println("No tienes que pagar IRPF");
        }
    }

    public static void preguntarNotaApruebasOSuspendes(Scanner teclado) {
        /*
        Alternativa doble: Pregunta la nota, y si es >=5 => aprobado sino ==> suspenso
         */
        System.out.println("Introduce la nota del examen:");
        int nota = teclado.nextInt();

        if (nota >= 5) {
            System.out.println("Enhorabuena, has aprobado");
        } else {
            System.out.println("Lo siento, has suspendido");
        }
    }

    public static void condicionalesDobles(Scanner teclado) {
        /*
        Estructuras de control condicionales dobles
        Uso de cuadros de diálogo de la librería Swing
        Calcula la nota media de 3 notas dadas e informa al usuario
        es necesario importar la clase javax.swing.JOptionPane;
         */

        double notaM, notaH, notaI, media;

        //uso de cuadros de diálogo swing
        notaM = Double.parseDouble(JOptionPane.showInputDialog("Nota de Matematicas"));
        notaH = Double.parseDouble(JOptionPane.showInputDialog("Nota de Historia"));
        notaI = Double.parseDouble(JOptionPane.showInputDialog("Nota de Informática"));

        //calculo de la nota media
        media = (notaM + notaH + notaI) / 3;

        //Control de la nota media y uso de ventanas swing
        if (media >= 5) {
            JOptionPane.showMessageDialog(null, "¡Enhorabuena! tu media es de " + media);
        } else {
            JOptionPane.showMessageDialog(null, "¡Recuperación! tu media es de " + media);
        }

    }

    public static void estructuraIfAnidada(Scanner teclado) {
        /*
            Estructura if anidada: pregunta por el nombre, 
        si es Ana pregunta por la edad y le dice sies mayor de edad o no
         */

        int edad;
        String nombre;

        System.out.println("Introduce tu nombre:");
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
        nombre = teclado.nextLine();
        System.out.println("introduce tu edad:");
        edad = teclado.nextInt();

        if (nombre.equalsIgnoreCase("Ana")) {
            if (edad >= 18) {
                System.out.println("Enhorabuena " + nombre + " eres mayor de edad");
            } else {
                System.out.println("Lo sentimos " + nombre + " aún eres menor de edad");
            }
        } else {
            System.out.println("No eres bienvenido " + nombre);
        }
    }

    public static void ifsAnidadosNumeroRandom(Scanner teclado) {
        /*
        Estructura de control:
        if anidados
        Genera un nº que representa la temperatura
        Muestra un mensaje según el rango del número
         */
        String mensaje;

        //Crear un objeto aleatorio
        Random elRandom = new Random();
        //Genera un número entre 0 y 50
        int temp = elRandom.nextInt(50);

        if (temp < 10) {
            mensaje = "Hace mucho frío";
        } else {
            if (temp < 15) {
                mensaje = "Hace poco frío";
            } else {
                if (temp < 25) {
                    mensaje = "Hace una temperatura agradable";
                } else {
                    if (temp < 30) {
                        mensaje = "Hace un poco de calor";
                    } else {
                        mensaje = "hace mucho calor";
                    }
                }
            }
        }

        System.out.println("La temperatura actual es de %d grados " + temp);
        System.out.println("\n" + mensaje);
    }

    public static void elseIfs(Scanner teclado) {
        System.out.println("Nota (0-10):");
        double nota = teclado.nextDouble();

        if (nota == 10) {
            System.out.println("Matricula de Honor");
        } else if ((nota >= 9) && (nota < 10)) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7) {
            System.out.println("Notable");
        } else if (nota >= 5) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }

    public static void switchVehiculos(Scanner teclado) {
        /*
        Estructura condicional switch.
        Pregunta por el tipo de coche
        En funcion del valor introducido muestra información
         */

        String tipoVehiculo;

        System.out.println("Introduce el tipo de coche:");
        System.out.println("Posibles casos de vehiculos: coche, camion, moto, otros...");
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
        tipoVehiculo = teclado.nextLine();

        switch (tipoVehiculo.toLowerCase()) {
            case "coche":
                System.out.println("Puedes pasar de 00:00 a 08:00");
                break;
            case "camion":
                System.out.println("Puedes pasar de 08:00 a 16:00");
                break;
            case "moto":
                System.out.println("Puedes pasar de 16:00 a 24:00");
                break;
            default:
                System.out.println("No puedes pasar con " + tipoVehiculo);
        }
    }

    public static void diaLaboralONo(Scanner teclado) {

        System.out.println("Introduce el numero del dia de la semana que quieras saber si es laborable:");
        int dia = teclado.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Es lunes, dia laborable.");
                break;
            case 2:
                System.out.println("Es martes, dia laborable.");
                break;
            case 3:
                System.out.println("Es miercoles, dia laborable.");
                break;
            case 4:
                System.out.println("Es jueves, dia laborable.");
                break;
            case 5:
                System.out.println("Es viernes, dia laborable.");
                break;
            case 6:
                System.out.println("Es sabado, Fin de Semana.");
                break;
            case 7:
                System.out.println("Es domingo, Fin de Semana.");
                break;
            default:
                System.out.println("Una semana solo tiene 7 dias");
        }
    }

    public static void numeroParONo(Scanner teclado) {
        //Determina si un número introducido por pantalla es par o no.
        System.out.println("Introduce un numero para saber si es par");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par");
        } else {
            System.out.println(numero + " es un número impar");
        }
    }

    public static void anoBisiesto(Scanner teclado) {
        System.out.println("Introduce un año:");
        int ano = teclado.nextInt();

        if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static void usuarioPassword(Scanner teclado) {

        String usuarioRegistrado = "root", passwordRegitrada = "abc123.";

        System.out.println("En el sistema esta registrado es usuario 'root' con la contraseña 'abc123.'");
        System.out.println("\n" + "Introduce tu usuario");
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
        String user = teclado.nextLine();
        System.out.println("Introduce la contraseña:");
        String password = teclado.nextLine();

        if (user.equals(usuarioRegistrado) && password.equals(passwordRegitrada)) {
            System.out.println("Bienvenido " + usuarioRegistrado);
        } else {
            System.out.println("Los datos introducidos no son correctos, por favor intentelo de nuevo.");
        }
    }

    public static void ordenarNumeros(Scanner teclado) {
        /*
        Pedir 3 números y mostrarlos  en orden de menor a mayor
         */
        //int[] araayDeNumeros = {1, 2, 3};

        System.out.println("Por favor, introduzca 3 números entero");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int num3 = teclado.nextInt();

        teclado.nextLine();

        if (num1 <= num2) {
            if (num3 <= num1) {
                System.out.println("Los números son " + num3 + ", " + num1 + ", " + num2 + ".");
            } else if (num3 >= num2) {
                System.out.println("Los números son " + num1 + ", " + num2 + ", " + num3 + ".");
            } else if (num3 >= num1 && num3 <= num2) {
                System.out.println("Los números son " + num1 + ", " + num3 + ", " + num2 + ".");
            }
        } else if (num1 <= num3) {
            if (num2 <= num1) {
                System.out.println("Los números son " + num2 + ", " + num1 + ", " + num3 + ".");
            } else if (num2 >= num3) {
                System.out.println("Los números son " + num1 + ", " + num3 + ", " + num2 + ".");
            } else if (num2 >= num1 && num2 <= num3) {
                System.out.println("Los números son " + num1 + ", " + num2 + ", " + num3 + ".");
            }
        } else if (num2 <= num3) {
            if (num1 <= num2) {
                System.out.println("Los números son " + num1 + ", " + num2 + ", " + num3 + ".");
            } else if (num1 >= num3) {
                System.out.println("Los números son " + num2 + ", " + num3 + ", " + num1 + ".");
            } else if (num1 >= num2 && num1 <= num3) {
                System.out.println("Los números son " + num2 + ", " + num1 + ", " + num3 + ".");
            }
        }
    }

    public static void pedirNumeroYDecirNumeroDeCifras(Scanner teclado) {
        //Pedir un número entre 0 y 99_999y decir cuantas cifras tiene

        System.out.println("Por favor inserte un número entre 0 y 99.999");
        int numero = teclado.nextInt();

        if (numero >= 0 || numero <= 99_999) {
            System.out.println("El número introducido tiene " + String.valueOf(numero).length() + " cifras");
        } else {
            System.out.println("El número introducido es incorrecto, intentelo de nuevo.");
            pedirNumeroYDecirNumeroDeCifras(teclado);
        }
    }

    public static void farmacia(Scanner teclado) {
        /*
        Una farmacia desea un programa para ingresar el valor de compra y calcular lo siguiente:
        
        -si el pago se efectúa al "contado", calcular un descuento del 5%.
        -pero si el pago es con "tarjeta" se incrementa un recargo del 3% al valor de compra
        
        Calcular y visualizar el descuento o recargo según sea el caso y el total a pagar de la compra.
        
         */

        System.out.println("Cuál es la cantidad a pagar:");
        double cantidadAPagar = teclado.nextDouble();
        System.out.println("Desea pagar en [efectivo] o [tarjeta]");
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
        String metodoDeago = teclado.nextLine();

        switch (metodoDeago.toLowerCase()) {
            case "efectivo":
                double descuento = cantidadAPagar / 100 * 5;
                double cantidadDPagoFinalEnEfectivo = cantidadAPagar - descuento;

                System.out.println("El descuento es de " + String.format("%.2f", descuento));
                System.out.println("La precio final es de " + String.format("%.2f", cantidadDPagoFinalEnEfectivo));
                /*System.out.println("Cuanto dinero a entregado el cliente");
                double dineroEntregado = teclado.nextDouble();*/
                break;

            case "tarjeta":
                double recargo = cantidadAPagar / 100 * 3;
                double cantidadDpagoFinalConTarjeta = cantidadAPagar + recargo;

                System.out.println("El recargo es de " + String.format("%.2f", recargo));
                System.out.println("El precio final es de " + String.format("%.2f", cantidadDpagoFinalConTarjeta));
                break;

        }
    }

    public static void cajero(Scanner teclado) {
        /*
        hacer un programa que simule un cjaero automático con un saldo inidial de 400€,
        con el siguiente menú de opciones:
        
        Elige una operación:
        1.Ingresar
        2.Retirar
        3.Salir
         */
        int saldo = 400;//Euros

        System.out.println("Eligre una operación;");
        System.out.println("1. Ingresar");
        System.out.println("2. Retirar");
        System.out.println("3. Salir");
        int menu = teclado.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Cuanto dinero desea ingresar? (Sólo enteros):");
                int cantidadAIngresar = teclado.nextInt();
                saldo = saldo + cantidadAIngresar;
                System.out.println("Su saldo es de " + saldo + "€.");
                break;
            case 2:
                System.out.println("Cuanto dinero desea retirar? (Sólo enteros):");
                int cantidadARetirar = teclado.nextInt();
                saldo = saldo - cantidadARetirar;
                System.out.println("Su saldo es de " + saldo + "€.");
                break;
            case 3:
                //Salir
                break;
        }
    }

    public static void mostrarPares(Scanner teclado) {
        int num_maximo;

        System.out.println("Introduce el nº máximo de valores pares a mostrar");
        num_maximo = teclado.nextInt();

        for (int i = 0; i <= num_maximo; i++) {
            System.out.println(i);
        }
    }

    public static void mostrar_rango(Scanner teclado) {
        System.out.println("introduce el número mayor:");
        int mayor = teclado.nextInt();

        System.out.println("Introduce el número menor:");
        int menor = teclado.nextInt();

        if (menor > mayor) {
            System.out.println("Datos incorrectos");
        } else {
            //Voy decrementando desde el número grande al pequeño
            for (int i = mayor; i >= menor; i--) {
                System.out.println("Estoy en el bucle");
                System.out.println(i);
            }
        }
        teclado.close();
    }

    public static void mostrarTablaMultiplicar(Scanner teclado) {
        for (int i = 1; i <= 9; i++) {
            //para cada valor de i, se genera valores j
            //de 1 a 9

            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

}
