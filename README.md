# Proyecto Monstruo

Este proyecto está creado en Java y fue desarrollado inicialmente en NetBeans. Define una clase llamada `Monstruo`, con varios atributos y métodos para manipular los objetos de esta clase. Además, incluye un menú interactivo para configurar y gestionar los monstruos.

## Descripción

El proyecto define una clase `Monstruo` con los siguientes atributos y métodos:

- **Atributos:**
  - Nombre
  - Posición X
  - Posición Y
  - Color (usando un enumerado de colores)
  - Otros atributos específicos del monstruo

- **Métodos:**
  - Constructores con y sin parámetros
  - Métodos para obtener y modificar los atributos del monstruo
  - Métodos específicos como `muere()` y `desplazarse()`

Se incluye un menú interactivo implementado en la clase `Menu` para realizar diversas operaciones con los monstruos:

1. Crear un nuevo monstruo sin datos.
2. Crear un nuevo monstruo con datos conocidos.
3. Asignar nombre a un monstruo.
4. Asignar posición X a un monstruo.
5. Asignar posición Y a un monstruo.
6. Asignar color a un monstruo.
7. Matar un monstruo.
8. Mostrar por pantalla los datos de un monstruo.
9. Mostrar por pantalla los datos de un monstruo aleatoriamente.
10. Matar a varios monstruos a la vez.
0. Salir de la aplicación.

## Estructura del Proyecto

```plaintext
Monstruo/
├── doc/
│   └── proyecto-descripcion.pdf
├── src/
│   └── monstruo/
│               ├── Menu.java
│               ├── Monstruo.java
│               ├── Otros.java
│               └── PruebaMonstruo.java
│   └── test/
└── pom.xml
```


## Requisitos
- Java 17
- Maven 3.6.0 o superior


## Instalación
Clona el repositorio:

```sh
git clone https://github.com/serporion/Monstruo.git
cd Monstruo
```

## Instala las dependencias y compila el proyecto:

```sh
mvn clean install
```

## Ejecución
Para ejecutar la aplicación, usa el siguiente comando:

```sh
java -cp target/Monstruo-0.0.1-SNAPSHOT.jar monstruo.PruebaMonstruo
```

O en cualquier IDE como por ejemplo Eclipse yendo a File / Import / Maven / Existing Maven Projects, o como por ejemplo en NetBeans yendo a File / Open Project. En cuanto importes tendrás las dependencias del proyecto instaladas.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.



## Contacto y Soporte

Para más información, puedes consultar el documento de descripción del proyecto en la carpeta doc.

Puedes contactar de las siguientes maneras:

- **Nombre**: Oscar
- **Correo Electrónico**: [serporionGit@hotmail.com](mailto:serporionGit@hotmail.com)
- **GitHub**: [serporion](https://github.com/serporion)


Si tienes alguna pregunta, encuentras un problema o tienes una sugerencia, por favor, abre un issue en este repositorio. Seguiremos el progreso y las discusiones a través de los issues para mantener todo organizado.

Puedes abrir un nuevo issue [aquí](https://github.com/serporion/mis-paginas-web/issues/new). Las contribuciones son bienvenidas


