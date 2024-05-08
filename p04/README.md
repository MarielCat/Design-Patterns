# Practica04_Michitas - Modelado y Programación
Integrantes del equipo:

Del Monte Ortega Maryam Michelle-320083527

Díaz Reyes Lilith Jaquelin-320277571

Monroy Romero Sahara Mariel-320206391

## Descripción del Proyecto y justificación del patrón

El Imperio Galáctico nos ha pedido diseñar un sistema que pueda crear naves espaciales. Hemos decidido usar el patrón de diseño Builder para la realización del sistema, ya que nos permite la construcción de nuestra nave paso a paso, además de que podríamos reutilizar código si quisieramos contruir otra representación de la nave. 

## Principios de diseño de los patrones 

Menciona los principios de diseño esenciales de los patrones Factory, Abstract Factory y Builder. Menciona una desventaja de cada patrón.
* Builder: Contruir objetos en un proceso de varios pasos y variable, además de producir distintos tipos y representaciones de estos empleando el mismo código de construcción.
  * Desventaja: La construcción de objetos requiere más conocimiento del dominio del cliente.
* Factory: Identificar los aspectos que cambian y encapsularlos para separarlos de los que son fijos.
  * Desventaja: Se necesita incorporar una multitud de nuevas subclases para implementar el patrón, y muchas veces vamos a tener que implementar secciones de código en ellas que casi no difieren en nada.
* Abstract Factory: Producir familias de objetos que comparten cosas en común sin especificar sus clases concretas.
  * Desventaja: Agregar nuevas clases derivadas a familias existentes es difícil, ya que hay que proporcionar una implementación para cada una de las fábricas. Esto  obliga a realizar cambios en la fábrica abstracta y en todas las implementaciones concretas. Además de que todas las familias deben tener una implementación de cada producto, aún si no hace mucho sentido para esa familiar en particular.
    
## Estructura del Proyecto

src/: Esta carpeta contiene los archivos fuente de Java.

UML.png contiene el diagrama UML que representa al proyecto.

## Compilación y Ejecución

Para compilar y ejecutar este proyecto, asegúrate de tener instalado java en tu sistema (preferentemente java 11 en adelante). Luego, sigue estos pasos:

1. Abre una terminal y navega hasta la carpeta raíz del proyecto (`\Practica04_Michitas\src\`).

2. Compila el proyecto ejecutando el siguiente comando:

```bash
javac *.java
```
3. Ejecuta el programa con el siguiente comando:
```bash
java Galactus 
```
## Observaciones

Una vez que el usuario ha elegido todos sus componentes y el presupuesto no le alcanza, se mostrá la opción de salir del programa.

## Créditos

Este proyecto fue desarrollado por:

- [Maryamoww1](https://github.com/maryamoww1)
- [MarielCat](https://github.com/MarielCat)
- [jackDiazz](https://github.com/jackDiazz)
