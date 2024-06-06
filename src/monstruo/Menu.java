/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monstruo;

/**
 * Clase que dispone del desarrollo del menú principal y de sus indicativos al menú 
 * donde nos encontramos, según la elección.
 * @author Oscar Delgado Huertas
 */
public class Menu {

    public static void menu() {
        System.out.println("Configuracion de Monstruos.\n");
        System.out.println("==============================================================");
        System.out.println("1.- Crear un nuevo monstruo sin datos. \n"
                        + "2.- Crear una nuevo monstruo con datos conocidos.\n"
                        + "3.- Asignar nombre a un monstruo. \n"
                        + "4.- Asignar posicion X a un monstruo. \n"
                        + "5.- Asignar posicion Y a un monstruo. \n"
                        + "6.- Asignar color a un monstruo. \n"
                        + "7.- Matar un monstruo.\n"
                        + "8.- Mostrar por pantalla los datos de un monstruo.\n"
                        + "9.- Mostrar por pantalla los datos de un monstruo aleatoriamente.\n"
                        + "10. Mata a varios monstruos a la vez. \n"
                        + "0.- Salir de la aplicacion.\n"
                        + "=================================================================\n");
    }

    public static void menuPart1() {
        System.out.println("======================================");
        System.out.println("1.- Crear un nuevo monstruo sin datos.");
        System.out.println("======================================\n");
    }

    public static void menuPart2() {
        System.out.println("=================================================");
        System.out.println("2.- Crear una nuevo monstruo con datos conocidos.");
        System.out.println("===============================================\n");
    }

    public static void menuPart3() {
        System.out.println("=================================");
        System.out.println("3.- Asignar nombre a un monstruo.");
        System.out.println("=================================\n");

    }

    public static void menuPart4() {
        System.out.println("================================");
        System.out.println("4.- Asignar posicion X a un monstruo.");
        System.out.println("================================\n");
    }

    public static void menuPart5() {
        System.out.println("=====================================");
        System.out.println("5.- Asignar posicion Y a un monstruo.");
        System.out.println("=====================================\n");
    }

    public static void menuPart6() {
        System.out.println("=================================");
        System.out.println("6.- Asignar color a un monstruo. ");
        System.out.println("=================================\n");
    }
    
    public static void menuPart7() {
        System.out.println("======================");
        System.out.println("7.- Matar un monstruo.");
        System.out.println("======================\n");
    }
    
    public static void menuPart8() {
        System.out.println("==================================================");
        System.out.println("8.- Mostrar por pantalla los datos de un monstruo.");
        System.out.println("==================================================\n");
    }
    
    public static void menuPart9() {
        System.out.println("=================================================================");
        System.out.println("9.- Mostrar por pantalla los datos de un monstruo aleatoriamente.");
        System.out.println("=================================================================\n");
    }
    
    public static void menuPart10() {
        System.out.println("=============================");
        System.out.println("10.- Mata a varios monstruos.");
        System.out.println("=============================\n");
    }
    
}
