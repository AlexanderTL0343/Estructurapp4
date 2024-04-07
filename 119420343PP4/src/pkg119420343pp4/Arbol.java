/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg119420343pp4;

/**
 *
 * @author Alexander
 */
public class Arbol {

    NodoArbolPrimerEjercicico raiz;

    Arbol() {
        raiz = null;
    }

    // Método recursivo para verificar si dos árboles son idénticos
    boolean idénticos(NodoArbolPrimerEjercicico raiz_a, NodoArbolPrimerEjercicico raiz_b) {
        // Si ambos nodos son nulos, son idénticos
        if (raiz_a == null && raiz_b == null) {
            return true;
        }

        // Si solo uno de los nodos es nulo o los valores son diferentes, no son idénticos
        if (raiz_a == null || raiz_b == null || raiz_a.valor != raiz_b.valor) {
            return false;
        }

        // Llamadas recursivas para los subárboles izquierdos y derechos
        return idénticos(raiz_a.izquierda, raiz_b.izquierda) && idénticos(raiz_a.derecha, raiz_b.derecha);
    }

}
