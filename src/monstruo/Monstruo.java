/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monstruo;

/**
 * Clase Monstruo que tiene métodos básicos para crear,matar y mover monstruos.
 *
 * @author serporion
 */
public class Monstruo {

    //Atributos de objeto
    private String nombre;
    private int posicionX;
    private int posicionY;
    private String color;
    private boolean vivo;

    //Constantes de clase
    public static final int MIN_POSICION_X = 0, MAX_POSICION_X = 80;
    public static final int MIN_POSICION_Y = 0, MAX_POSICION_Y = 60;

    //Atributos de clase
    private static int numMonstruosTotales;
    private static int numMonstruosVivos;

    //Enum con los colores que se establecen como únicos para nuestros monstruos. Usado en el método setColor
    public enum Colores {
        BLANCO, ROSA, AMARILLO, ROJO, AZUL, VERDE
    }
    
    //Array de colores. Otra forma de comprobar los colores. Usado en el constructor con parámetros
    Colores[] coloresDelMontruo = Colores.values();
    boolean encontrado = false;

    /**
     * Constructor que asigna los parámetros de creación de un monstruo
     *
     * @param nombre String que asigna el nombre del monstruo a crear.
     * @param posicionX int que asigna la posicionX del monstruo al ser creado.
     * @param posicionY int que asigna la posicionY del monstruo al ser creado.
     * @param color String que asigna el color al monstruo al ser creado y que será comprobado.
     * @throws IllegalArgumentException mostrando errores si los valores introducidos no son los correctos.
     */
    public Monstruo(String nombre, int posicionX, int posicionY, String color) throws IllegalArgumentException {

        if (posicionX < MIN_POSICION_X || posicionY < MIN_POSICION_Y || posicionX > MAX_POSICION_X || posicionY > MAX_POSICION_Y) {
            throw new IllegalArgumentException("Error: Posicion de 'X' debe estar entre 0 y 80. Posicion de 'Y' debe estar "
                    + "entre 0 y 60");
        }

        String mayuscula = color.toUpperCase();

        for (int i = 0; (i < coloresDelMontruo.length && encontrado == false); i++) {

            if (String.valueOf(coloresDelMontruo[i]).equals(mayuscula)) {

                encontrado = true;
            }

        }
        if (!encontrado) {
            throw new IllegalArgumentException("\nEl color no es correcto");
        }

        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.color = color;
        this.vivo = true;

        numMonstruosTotales++;
        numMonstruosVivos++;
    }

    /**
     * Constructor por defecto. Al monstruo se le asignan los valores que se han
     * establecido por defecto de forma directa.
     */
    public Monstruo() {

        nombre = "Sin nombre";
        posicionX = 0;
        posicionY = 0;
        color = "rojo";
        vivo = true;

        numMonstruosTotales++;
        numMonstruosVivos++;
    }

    /**
     * Método que devuelve el nombre de nuestro monstruo.
     *
     * @return String, con el nombre del monstruo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que permite establecer el nombre al monstruo.
     *
     * @param nombre String con el nombre del monstruo pasado como parámetro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve la coordenada posicionX del monstruo.
     *
     * @return int, entero con la posicionX de nuestro monstruo.
     */
    public int getPosicionX() {
        return posicionX;
    }

    /**
     * Método que permite establecer la posiciónX del monstruo.
     *
     * @param posicionX int, entero que establece la coordenada posicionX pasado como parámetro.
     * @throws IllegalArgumentException que mostrara errores si el valor introducido para posicionX no es correcto.
     */
    public void setPosicionX(int posicionX) throws IllegalArgumentException {

        if (posicionX < MIN_POSICION_X) {
            throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo: " + MIN_POSICION_X);

        }
        if (posicionX > MAX_POSICION_X) {
            throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo: " + MAX_POSICION_X);
        }

        this.posicionX = posicionX;
    }

    /**
     * Método que devuelve la coordenada posicionY del monstruo
     *
     * @return int, entero con la posicionY de nuestro monstruo.
     */
    public int getPosicionY() {
        return posicionY;
    }

    /**
     * Método que permite establecer la coordenada posicionY del monstruo.
     *
     * @param posicionY int, entero con la posicionY del monstruo pasado como parámetro.
     * @throws IllegalArgumentException que mostrará errores si el valor introducido para posicionY no es correcto.
     */
    public void setPosicionY(int posicionY) throws IllegalArgumentException {

        if (posicionY < MIN_POSICION_Y) {
            throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo: " + MIN_POSICION_Y);

        }
        if (posicionY > MAX_POSICION_Y) {
            throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo: " + MAX_POSICION_Y);
        }

        this.posicionY = posicionY;
    }

    /**
     * Método que devuelve el color del monstruo.
     *
     * @return String, cadena con el color de nuestro monstruo.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que permite establecer el color de un monstruo.
     *
     * @param color String, con el color del monstruo pasado como parámetro.
     * @throws IllegalArgumentException que mostrará un error si el valor introducido para color no es correcto.
     */
    public void setColor(String color) throws IllegalArgumentException {

        String mayusColor = color.toUpperCase();

        if (String.valueOf(Colores.AMARILLO).equals(mayusColor)
                || String.valueOf(Colores.AZUL).equals(mayusColor)
                || String.valueOf(Colores.BLANCO).equals(mayusColor)
                || String.valueOf(Colores.ROJO).equals(mayusColor)
                || String.valueOf(Colores.ROSA).equals(mayusColor)
                || String.valueOf(Colores.VERDE).equals(mayusColor)) {

            this.color = color;
        } else {
            throw new IllegalArgumentException("\nEl color introducido NO es correcto\n");
        }

    }

    /**
     * Método que devuelve si el monstruo está vivo o no.
     *
     * @return Booleano que nos dice true si está vivo o false si no está vivo.
     */
    public boolean getIsVivo() {
        return vivo;
    }

    /**
     * Método que nos devuelve el total de número de monstruos en nuestra aplicación ejecutada.
     *
     * @return int entero con el numeró de monstruos totales de nuestra aplicación en ejecución.
     */
    public static int getNumMonstruosTotales() {
        return numMonstruosTotales;
    }

    /**
     * Método que nos devuelve el número de monstruos que están vivos en nuestra aplicación ejecutada.
     *
     * @return int, entero con el numeró de monstruos con la condición de estar vivos.
     */
    public static int getNumMonstruosVivos() {
        return numMonstruosVivos;
    }

    /**
     * Metodo que cambia la condición de un monstruo de vivo a muerto. El método descontará del atributo de clase
     * numMonstruosVivos en un monstruo cada vez que se ejecute el método.
     */
    public void muere() {
        this.vivo = false;
        numMonstruosVivos--;
    }

    /**
     * Metodo que hace desplazarse dentro de unos valores determinados al monstruo.
     *
     * @param unidadesX, int con las posiciones que se desplaza en el eje X.
     * @param unidadesY int con las posiciones que se desplaza en el eje Y.
     * @param derecha booleano que indica si se desplaza hacia la derecha, o no (entonces se desplazará hacia la izquierda).
     * @param arriba booleano que indica si se desplaza hacia arriba, o no (entonces se desplazará hacia abajo).
     * @throws IllegalArgumentException, excepcion que controlará que no se mueva fuera de los rangos establecidos.
     */
    public void desplazarse(int unidadesX, int unidadesY, boolean derecha, boolean arriba) throws IllegalArgumentException {

        if (unidadesX < MIN_POSICION_X || unidadesY < MIN_POSICION_Y) {
            throw new IllegalArgumentException("Error: Posicion de 'X' o de 'Y' introducida debe ser mayor o igual a 0");

        }
        if (unidadesX > MAX_POSICION_X || unidadesY > MAX_POSICION_Y) {
            throw new IllegalArgumentException("Error: Posicion de 'X' introducida mayor de 80 o \n       Posicion de 'Y' introducida mayor a 60");
        }

        if (derecha == true && arriba == true) {
            if ((posicionX + unidadesX) > MAX_POSICION_X) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo a la derecha");

            }
            if ((posicionY + unidadesY) > MAX_POSICION_Y) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo hacia arriba");

            }

            posicionX += unidadesX;
            posicionY += unidadesY;

        } else if (derecha == false && arriba == true) {
            if ((posicionX - unidadesX) < MIN_POSICION_X) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo hacia la izquierda");

            }
            if ((posicionY + unidadesY) > MAX_POSICION_Y) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo hacia arriba");

            }

            posicionX -= unidadesX;
            posicionY += unidadesY;

        } else if (derecha == true && arriba == false) {
            if ((posicionX + unidadesX) > MAX_POSICION_X) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango maximo del movimiento del monstruo a la derecha");

            }
            if ((posicionY - unidadesY) < MIN_POSICION_Y) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo hacia abajo");
            }//-=

            posicionX += unidadesX;
            posicionY -= unidadesY;

        } else if (derecha == false && arriba == false) {
            if ((posicionX - unidadesX) <= MIN_POSICION_X) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo hacia la izquierda");

            }
            if ((posicionY - unidadesY) < MIN_POSICION_Y) {
                throw new IllegalArgumentException("No es posible hacer el movimiento. \nFuera de rango minimo del movimiento del monstruo hacia abajo");
            }//-=

            posicionX -= unidadesX;
            posicionY -= unidadesY;
        }

    }

    @Override
    public String toString() {
        return ("Nombre: " + getNombre() + "\nColor: " + getColor() + "\nposicionX: " + getPosicionX() + "\nposicionY: "
                + getPosicionY() + "\nEsta vivo : " + (getIsVivo() ? "Si" : "No"));
    }

}
