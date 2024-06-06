/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monstruo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase que amplia con varios métodos las acciones con nuestros Monstruos
 *
 * @author Oscar Delgado Huertas
 */
public class Otros {

    /**
     * Método que muestra de forma aleatoria un Monstruo creado.
     *
     * @param arrayMonstruos recoge un array de Monstruos
     * @param paso booleano que impide el acceso a todo el array cuando
     * encuentra un monstruo.
     */
    public static void aleatorio(Monstruo[] arrayMonstruos, boolean paso) {

        int aleatorio;
        aleatorio = (int) (Math.random() * Monstruo.getNumMonstruosTotales());

        for (int i = 0; i <= arrayMonstruos.length && paso == true; i++) {

            if (Monstruo.getNumMonstruosTotales() == 0) {
                System.out.println("No hay monstruos creados");
                paso = false;
            } else {
                System.out.println("\nMONSTRUO:");
                System.out.println("--------\n" + arrayMonstruos[aleatorio].toString());
                System.out.println("La posicion de este Monstruo en su guarida es : " + aleatorio);
                System.out.println("");

                paso = false;
            }
        }
    }

    /**
     * Método que recibe una array Monstruo y hace diversas operaciones con ella.
     * @param arrayMonstruos array de Monstruos que recibe del programa.
     */
    public static void matarMonstruos(Monstruo[] arrayMonstruos) {

        boolean salir = true;
        Monstruo[] aux = new Monstruo[arrayMonstruos.length];

        Scanner entrada = new Scanner(System.in);

        if (Monstruo.getNumMonstruosTotales() == 0) {
            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");

        } else {

            int contador = 0;
            for (int i = 0; i < arrayMonstruos.length; i++) {

                if (arrayMonstruos != null) {
                    aux[i] = arrayMonstruos[i];
                    contador++;
                } else {
                    System.out.println("Todos los monstruos están muertos");
                }
            }

            Monstruo[] monstruosVivos = new Monstruo[contador];

            System.out.print("Elija \n\n");

            try {
                do {

                    System.out.println("1. Mostrar donde moran los monstruos vivos");
                    System.out.println("2. Mata a uno/varios a elegir");
                    System.out.println("3. Matar a todos");
                    System.out.println("4. Salir\n");
                    System.out.print("Opcion: ");

                    String indice = entrada.next();
                    System.out.println("");
                    int cantidad = 0;

                    switch (indice) {
                        case "1": {

                            for (int i = 0; i < aux.length; i++) {

                                if (aux[i] != null) {
                                    if (aux[i].getIsVivo() == true) {

                                        cantidad++;
                                    }
                                }

                            }
                            System.out.println("\nHay " + cantidad + " MONSTRUOS vivos en las posiciones siguientes");

                            System.out.print("Posicion: ");
                            for (int i = 0; i < aux.length; i++) {

                                if (aux[i] != null) {
                                    if (aux[i].getIsVivo() == true) {
                                        System.out.print(+i + ", ");

                                    }
                                }

                            }

                            System.out.println("");
                            System.out.println("");

                            break;
                        }

                        case "2": {

                            System.out.print("Si sabe donde se esconden los mosntruos teclee 'y' o 'n'");
                            System.out.println("");

                            indice = entrada.next();
                            boolean ya = true;

                            if (null == indice) {
                                System.out.println("Opción incorrecta. Saliendo al menu");
                            } else {
                                switch (indice) {
                                    
                                    case "y":
                                        do {
                                            System.out.println("\nDame alguna posicion en las que haya algun monstruo");
                                            int in = entrada.nextInt();

                                            if (arrayMonstruos[in].getIsVivo() == true) {

                                                arrayMonstruos[in].muere();
                                                System.out.println("\nTenemos las manos manchadas.");
                                                System.out.println("\nQuiere salir de la matanza. Indique 'y' o 'n'");

                                                indice = entrada.next();
                                                switch (indice) {
                                                    case "n":
                                                        System.out.println(ya);
                                                        ya = false;
                                                        break;
                                                    case "y":
                                                        ya = true;
                                                        break;
                                                    default:
                                                        System.out.println("\nOpcion no valida\n");
                                                        break;
                                                }

                                            } else {
                                                System.out.println("\nEse monstruo ya esta fuera de juego");
                                            }

                                        } while (!ya);
                                        
                                        System.out.println("");
                                        break;
                                        
                                    case "n":
                                        System.out.println("\nSaliendo al menu\n");
                                        break;
                                    default:
                                        
                                        System.out.println("\nOpcion incorrecta. Saliendo al menu\n");
                                        break;
                                }
                            }

                            break;
                        }

                        case "3": {

                            int cuantos=0;
                            for (int i = 0; i < arrayMonstruos.length; i++) {
                                
                                if (arrayMonstruos[i] != null){
                                    if (arrayMonstruos[i].getIsVivo() == true) {

                                    arrayMonstruos[i].muere();
                                    cuantos++;
                                    }
                                }
                            }
                            if (cuantos==0){
                                    System.out.println("\nESTABAN TODOS MUERTOS\n");
                            }else {
                                System.out.println("\nSe han matado " +cuantos+ " MONSTRUOS\n");
                            }
                            break;
                        }

                        case "4": {
                            salir = false;
                            break;
                        }

                        default: {
                            System.out.println("\nOpcion incorrecta\n");
                            break;
                        }
                    }

                } while (salir);

            } catch (InputMismatchException e) {

                System.out.println("\nError al pasar la posicion\n");
            } catch (IllegalArgumentException e) {
                System.out.println("\nIntroduccion incorrecta " + entrada.next());

            } catch (NullPointerException e) {
                System.out.println("\nEsa posicion esta libre de monstruos\n");
            }
        }
    }
}
