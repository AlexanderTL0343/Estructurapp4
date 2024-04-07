/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp4;

/**
 *
 * @author Alexander
 */
public class ArbolTercerEjercicio {
    NodoArbolTercerEjercicio raiz;

    // Constructor
    ArbolTercerEjercicio() {
        raiz = null;
    }

    // Método para recorrer el árbol en orden (in-order traversal)
    void inOrder(NodoArbolTercerEjercicio nodo) {
        if (nodo != null) {
            inOrder(nodo.izquierda);
            System.out.print(nodo.valor + " ");
            inOrder(nodo.derecha);
        }
    }

    // Método para evaluar la expresión del árbol
    double evaluarExpresion(NodoArbolTercerEjercicio nodo) {
        if (nodo == null) {
            return 0;
        }

        // Si es un número, lo devolvemos como double
        try {
            return Double.parseDouble(nodo.valor);
        } catch (NumberFormatException e) {
            // Evaluamos la expresión de forma recursiva
            double izquierda = evaluarExpresion(nodo.izquierda);
            double derecha = evaluarExpresion(nodo.derecha);

            switch (nodo.valor) {
                case "+":
                    return izquierda + derecha;
                case "-":
                    return izquierda - derecha;
                case "*":
                    return izquierda * derecha;
                case "/":
                    if (derecha != 0) {
                        return izquierda / derecha;
                    } else {
                        throw new ArithmeticException("División por cero");
                    }
                default:
                    throw new IllegalArgumentException("Operador no reconocido: " + nodo.valor);
            }
        }
    }
}
