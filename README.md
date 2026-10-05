# Calculadora Java MVC

Este proyecto es una calculadora científica básica desarrollada en Java utilizando el patrón de arquitectura Modelo-Vista-Controlador (MVC). Fue creada como parte de una práctica de Programación Orientada a Objetos para implementar conceptos fundamentales como la herencia y el polimorfismo.

## ¿Qué hace la calculadora?

El programa proporciona una interfaz gráfica donde el usuario puede realizar diferentes cálculos matemáticos. El sistema captura posibles errores de formato (como ingresar letras en lugar de números) y maneja cálculos inválidos (como la división por cero).

Las operaciones soportadas se dividen en dos tipos:
*   **Operaciones binarias (requieren dos números):** Suma, Resta, Multiplicación y División.
*   **Operaciones unarias (requieren un solo número):** Raíz cuadrada, Raíz cúbica y Logaritmo natural.

## Estructura del Código

El proyecto está diseñado bajo la arquitectura MVC para separar la lógica de la interfaz:
*   **Modelo:** Define la lógica matemática. Cuenta con una clase padre `Operaciones` y varias clases hijas (una por cada operación). Se aplica herencia y polimorfismo sobre el método `calcular()`.
*   **Vista:** Interfaz gráfica construida con Java Swing (JFrame). Contiene los campos de texto y botones sin incluir lógica matemática.
*   **Controlador:** Escucha las acciones de la vista mediante `ActionListener`, obtiene los números ingresados e instancia de forma polimórfica la operación requerida del modelo para luego devolver el resultado a la pantalla.

## Cómo usarla

### Requisitos previos
*   Tener instalado Java JDK (versión 8 o superior).
*   Un IDE compatible con proyectos Maven, preferiblemente Apache NetBeans.

### Ejecución local
1. Clona este repositorio en tu computadora usando tu terminal:
   `git clone https://github.com/JheffreyUrbano/calculadora-java.git`
2. Ejecuta el archivo principal `Calculadora1.java` para abrir la interfaz gráfica.

### Instrucciones de uso en la interfaz
1. **Para operaciones de dos números (+, -, *, /):** 
   Ingresa el primer valor en la casilla "Numero 1", ingresa el segundo valor en la casilla "Numero 2" y haz clic en el botón de la operación que deseas realizar. El resultado aparecerá en la parte inferior.
2. **Para operaciones de un solo número (Raíces, Logaritmo):**
   Ingresa el valor únicamente en la casilla "Numero 1". Puedes dejar la casilla "Numero 2" vacía. Haz clic en el botón de la operación deseada y verás el resultado.

### Estructura
'''
calculadora-java/
├── src/
│   └── main/
│       └── java/
│           ├── com/mycompany/calculadora1/
│           │   └── Calculadora1.java
│           ├── Controlador/
│           │   └── ControladorCalculadora.java
│           ├── Modelo/
│           │   ├── Division.java
│           │   ├── LogaritmoNatural.java
│           │   ├── Multiplicacion.java
│           │   ├── Operaciones.java
│           │   ├── RaizCuadrada.java
│           │   ├── RaizCubica.java
│           │   ├── Resta.java
│           │   └── Suma.java
│           └── vista/
│               ├── calculadoraCientificaGUI.form
│               └── calculadoraCientificaGUI.java
├── pom.xml
└── README.md
'''
## Autores

Desarrollo colaborativo realizado por:
*   **David:** Desarrollo del modelo lógico y operaciones matemáticas.
*   **Sebastián:** Desarrollo del modelo lógico y operaciones matemáticas.
*   **Daniel:** Diseño y construcción de la interfaz gráfica (Vista).
*   **Jheffrey:** Desarrollo del Controlador, integración del patrón MVC y resolución de ramas.
