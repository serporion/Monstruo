/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monstruo;

import java.util.InputMismatchException;
import java.util.Scanner;
import monstruo.Monstruo.Colores;


/**
 * Clase PruebaMonstruo, que tendrá el método main() ofreciendo la posibilidad
 * de uso de nuestra clase Monstruo mediante un menú, que se llama desde la clase
 * Menu de nuestro paquete.
 * @author serporion
 */
public class PruebaMonstruo {
    

    public static void main(String[] arg) {

        Scanner entrada = new Scanner(System.in);
        String opcion;
        Monstruo[] arrayMonstruos = new Monstruo[10];
        
        Menu.menu();

        do {
            boolean paso = true;
            System.out.print("\nIntroduzca la opcion elegida: ");
            opcion = entrada.next();
            System.out.println("");

            try {

                switch (opcion) {

                    case "1": {

                        Menu.menuPart1();

                        for (int i = 0; i < arrayMonstruos.length && paso == true; i++) {

                            if (arrayMonstruos[i] == null) {

                                arrayMonstruos[i] = new Monstruo();
                                paso = false;

                                System.out.println("Monstruos construidos: " + Monstruo.getNumMonstruosTotales());
                            } else if (Monstruo.getNumMonstruosTotales() >= arrayMonstruos.length) {

                                System.out.println("YA NO SE PUEDEN CREAR MAS MONSTRUOS");
                                paso = false;
                            }
                        }

                        System.out.println();
                        break;
                    }
                    case "2": {

                        Menu.menuPart2();

                        for (int i = 0; i < arrayMonstruos.length && paso == true; i++) {

                            if (Monstruo.getNumMonstruosTotales() >= arrayMonstruos.length) {
                                System.out.println("YA NO SE PUEDEN CREAR MAS MONSTRUOS");
                                paso = false;
                            } else if (arrayMonstruos[i] == null) {
                                String nombre, color;
                                int pX, pY;
                                
                                Colores[] col = Colores.values();

                                System.out.println("Inserte los datos correspondientes al monstruo nuevo\n");
                                System.out.print("Recuerde que los colores son: " );
                                for(Colores a:col){
                                    System.out.print(a+",");
                                }
                                    
                                System.out.println("");
                                System.out.print("Nombre: ");
                                nombre = entrada.next();
                                System.out.print("Color: ");
                                color = entrada.next();
                                System.out.print("PosicionX: ");
                                pX = entrada.nextInt();
                                System.out.print("PosicionY: ");
                                pY = entrada.nextInt();

                                arrayMonstruos[i] = new Monstruo(nombre, pX, pY, color);
                                paso = false;

                            }
                        }

                        System.out.println("Monstruos construidos: " + Monstruo.getNumMonstruosTotales());
                        System.out.println("");
                        break;

                    }
                    case "3": {

                        Menu.menuPart3();

                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            //try {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion:  ");
                            int indice = entrada.nextInt();

                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                System.out.println("\nEl nombre antiguo del monstruo era: " + arrayMonstruos[indice].getNombre());
                                System.out.print("Dame el nuevo nombre: ");
                                arrayMonstruos[indice].setNombre(entrada.next());
                                System.out.println("");
                                System.out.println("Gracias.\n");
                            } else {
                                System.out.println("\nPosicion incorrecta.");
                            }
                        }

                        break;
                    }
                    case "4": {

                        Menu.menuPart4();

                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion:  ");
                            int indice = entrada.nextInt();

                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                System.out.println("\nLa posicion de la coordena X del monstruo es: " + arrayMonstruos[indice].getPosicionX());
                                System.out.print("Dame la nueva posicion segun el rango correcto de la coordena X: ");
                                arrayMonstruos[indice].setPosicionX(entrada.nextInt());
                                System.out.println("");
                                System.out.println("Gracias.\n");
                            } else {
                                System.out.println("\nPosicion incorrecta.\n");
                            }

                        }
                        break;
                    }
                    case "5": {

                        Menu.menuPart5();

                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion:  ");
                            int indice = entrada.nextInt();

                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                System.out.println("La posicion de la coordena Y del monstruo es: " + arrayMonstruos[indice].getPosicionY());
                                System.out.print("Dame la nueva posicion segun el rango correcto de la coordena Y: ");
                                arrayMonstruos[indice].setPosicionY(entrada.nextInt());
                                System.out.println("");
                                System.out.println("Gracias.\n");
                            } else {
                                System.out.println("\nPosicion incorrecta.\n");
                            }

                        }
                        break;
                    }
                    case "6": {
                        
                        Menu.menuPart6();

                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion:  ");
                            int indice = entrada.nextInt();

                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                System.out.println("\nEl color actual del monstruo es: " + arrayMonstruos[indice].getColor());
                                System.out.print("Dame el nuevo color del monstruo: ");
                                arrayMonstruos[indice].setColor(entrada.next());
                                System.out.println("");
                                System.out.println("Gracias.\n");
                            } else {
                                System.out.println("\nPosicion incorrecta.\n");
                            }
                        }
                        break;
                    }

                    case "7": {

                        Menu.menuPart7();
                        
                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion  ");
                            int indice = entrada.nextInt();
                                                        
                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                if (arrayMonstruos[indice].getIsVivo()==false){
                                    System.out.println("\nEl monstruo ya esta muerto. Elija otro");
                                }else{
                                    arrayMonstruos[indice].muere();
                                    System.out.println("\nEl monstruo siguiente HA MUERTO:\n");
                                    System.out.println(arrayMonstruos[indice]);
                                    System.out.println("");
                                }
                                
                            } else {
                                System.out.println("\nPosicion incorrecta.\n");
                            }
                        }
                        break;
                    }
                    
                    case "8":{
                        Menu.menuPart8();
                        
                        if (Monstruo.getNumMonstruosTotales() == 0) {
                            System.out.println("No hay monstruos creados. Cree antes monstruos.\n");
                            break;
                        } else {
                            System.out.println("\nIntroduce el numero de la posicion de un monstruo ya creado ");
                            System.out.println("Existen monstruos en su guarida en las posiciones de 0 a la posicion " + (Monstruo.getNumMonstruosTotales() - 1) + "  ");
                            System.out.print("Elija la posicion  ");
                            int indice = entrada.nextInt();
                                                        
                            if (indice >= 0 && indice <= (Monstruo.getNumMonstruosTotales() - 1)) {
                                
                                System.out.println("\nMONSTRUO:");
                                System.out.println("--------\n" + arrayMonstruos[indice].toString());
                                
                            } else {
                                System.out.println("\nPosicion incorrecta.\n");
                            }
                        }
                        break;
                        
                    }
                    case "9": {
                        Menu.menuPart9();
                        Otros.aleatorio(arrayMonstruos,paso);
                    
                        break;
                    }
                    case "10":{
                        Menu.menuPart10();
                        Otros.matarMonstruos(arrayMonstruos);
                        break;
                    }

                    case "0": {
                        System.out.println("Saliendo del programa\n");
                        break;
                    }
                    
                    default: {
                        System.out.println("Elija una opcion correcta\n");
                        break;
                    }
                    
                }
                Menu.menu();

            } catch (InputMismatchException e) {
                System.err.println("\nNo metiste un numero correcto.");
                System.err.println("\nLa introduccion " + entrada.next() + " no es correcta ");
                System.out.println("\nSaliendo al menu principal\n");
                Menu.menu();
            } catch (IllegalArgumentException e) {
                System.err.println("\nIntroduccion incorrecta "+entrada.next());
                System.out.println("\nSaliendo al menu principal\n");
                Menu.menu();
            }

        } while (!opcion.equals("0"));
        System.out.println("===============================");
        System.out.println(  "Numero de Monstruos Totales: " + Monstruo.getNumMonstruosTotales());
        System.out.println(  "Numero de Monstruos Vivos:   " + Monstruo.getNumMonstruosVivos());
        System.out.println("===============================\n");

    }
}
