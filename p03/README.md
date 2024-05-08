# Práctica 03.2 - Modelado y Programación
Integrantes del equipo:
Del Monte Ortega Maryam Michelle-320083527

Díaz Reyes Lilith Jaquelin-320277571

Monroy Romero Sahara Mariel-320206391

## Descripción del Proyecto

El objetivo de esta práctica es aprender a usar los patrones "Composite, Decorator y Adapter" mediante la construcción de soldados, su integración a una jerarquía y la adaptación de un código externo al inicialmente creado-

## Estructura del Proyecto

src/: Esta carpeta contiene los archivos fuente de Java.

UML.png contiene el diagrama UML que representa al proyecto.

## Compilación y Ejecución

Para compilar y ejecutar este proyecto, asegúrate de tener instalado java en tu sistema (preferentemente java 11 en adelante). Luego, sigue estos pasos:

1. Abre una terminal y navega hasta la carpeta raíz del proyecto (`\practica-03\src\`).

2. Compila el proyecto ejecutando el siguiente comando:

```bash
javac *.java
```
3. Ejecuta el programa con el siguiente comando:
```bash
java Main
```
## Observaciones

1. Al ejecutar el programa te llevara a un menú, dentro de él debes escoger la opción que desees.

2. En caso de escoger "2. Reportar Batallones", se te desplegará un submenú con otras multiples opciones, así como en caso de escoger "3. .

3. En caso de escoger "1. Crear soldado", te pedirá inicialmente ingresar el nombre para tu soldado, luego se desplegará un submenú para elegir tu rol militar, después de llevará a otro submenú donde podrás personalizarlo libremente con las armas que quieras, cuantas veces quieras (a excepción de IronCheems que solo puede ser usado por Cheems y Capitan, y una sola vez). Cada que agregas un arma, el menú te mostrará cómo va tu soldado y te preguntará si deseas seguir agregando armamento, en caso de que no, seleccionas 0 y terminará la creación del personaje y te mostrará finalmente cómo quedó, luego te regresará al menú principal por si deseas hacer otra cosa(si quieres salir del programa solo tendrías que seleccionar "0. Salir" del menú principal.)

4. Los únicos cambios que se le hicieron al código original fueron las variable int a double, de forma que Cheems no perdiese poderes, además de aádir un nuevo método getSoldado a la clase abstracta ArmamentoDecorator.

## Créditos

Este proyecto fue desarrollado por:

- [Maryamoww1](https://github.com/maryamoww1)
- [MarielCat](https://github.com/MarielCat)
- [jackDiazz](https://github.com/jackDiazz)
