/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp4;

/**
 *
 * @author Alexander
 */
public class ArbolSegundoEjercicio {

    NodoArbolSegundoEjercicio raiz;
    NodoLDCSegundoEjercicio inicioLDC;

    // Constructor
    ArbolSegundoEjercicio() {
        raiz = null;
        inicioLDC = null;
    }

    // Método recursivo para obtener los nodos primos y almacenarlos en una Lista Doble Circular
    void LDCPrimos(NodoArbolSegundoEjercicio nodo, NodoLDCSegundoEjercicio nodoLDC) {
        if (nodo == null) {
            return;
        }

        if (esPrimo(nodo.valor)) {
            NodoLDCSegundoEjercicio nuevoNodoLDC = new NodoLDCSegundoEjercicio(nodo.valor);
            if (inicioLDC == null) {
                inicioLDC = nuevoNodoLDC;
                inicioLDC.siguiente = inicioLDC;
                inicioLDC.anterior = inicioLDC;
            } else {
                nuevoNodoLDC.siguiente = inicioLDC;
                nuevoNodoLDC.anterior = inicioLDC.anterior;
                inicioLDC.anterior.siguiente = nuevoNodoLDC;
                inicioLDC.anterior = nuevoNodoLDC;
            }
        }

        LDCPrimos(nodo.izquierda, nodoLDC);
        LDCPrimos(nodo.derecha, nodoLDC);
    }

    // Método auxiliar para verificar si un número es primo
    boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para imprimir la Lista Doble Circular
    void imprimirLDC() {
        if (inicioLDC == null) {
            System.out.println("La Lista Doble Circular está vacía.");
            return;
        }

        NodoLDCSegundoEjercicio actual = inicioLDC;
        do {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        } while (actual != inicioLDC);
    }

}
