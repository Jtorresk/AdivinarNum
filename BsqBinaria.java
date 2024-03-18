package BUSQUEDAS;

import java.util.Random;
import java.util.Scanner;

public class BsqBinaria {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = rand.nextInt(100) + 1;
        int intentos = 0;
        int limiteInferior = 1;
        int limiteSuperior = 100;

        System.out.println("Adivinare por ti el número aleatorio entre 1 y 100 en tan solo 7 oportunidades.");
        try {
            while (intentos < 7) {
                int respuesta = (limiteInferior + limiteSuperior) / 2;
                System.out.println("Intento " + (intentos + 1) + ": ¿Sera el numero " + respuesta + "? \ndigitalo:");
                respuesta = scanner.nextInt();
    
                if (respuesta == numeroAdivinar) {
                    System.out.println("¡Adiviné el número " + respuesta + " en el respuesta " + (intentos + 1) + "!");
                    break;
                } else if (respuesta < numeroAdivinar) {
                    System.out.println("No es ese número. Es más alto.");
                    limiteInferior = respuesta + 1;
                } else {
                    System.out.println("No es ese número. Es más bajo.");
                    limiteSuperior = respuesta - 1;
                }
    
                intentos++;
            }
        }catch (Exception e) {
            System.out.println("Se ha producido un error, procura NO digirar letras");
        }

        if (intentos == 7) {
            System.out.println("No pude adivinar el número. El número era " + numeroAdivinar + ".");
        }
    }
}

