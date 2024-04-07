/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg119420343pp4;

/**
 *
 * @author Alexander
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primer ejercicio 
        Arbol arbolA = new Arbol();
        arbolA.raiz = new NodoArbolPrimerEjercicico(1);
        arbolA.raiz.izquierda = new NodoArbolPrimerEjercicico(2);
        arbolA.raiz.derecha = new NodoArbolPrimerEjercicico(3);

        Arbol arbolB = new Arbol();
        arbolB.raiz = new NodoArbolPrimerEjercicico(1);
        arbolB.raiz.izquierda = new NodoArbolPrimerEjercicico(2);
        arbolB.raiz.derecha = new NodoArbolPrimerEjercicico(3);

        // Llamar al método idénticos para comparar los árboles
        boolean resultado = arbolA.idénticos(arbolA.raiz, arbolB.raiz);
        System.out.println(resultado);  // Debería imprimir true, ya que los árboles son idénticos en este ejemplo
        //Segundo Ejercicio
        ArbolSegundoEjercicio arbol = new ArbolSegundoEjercicio();
        arbol.raiz = new NodoArbolSegundoEjercicio(1);
        arbol.raiz.izquierda = new NodoArbolSegundoEjercicio(2);
        arbol.raiz.derecha = new NodoArbolSegundoEjercicio(3);
        arbol.raiz.izquierda.izquierda = new NodoArbolSegundoEjercicio(4);
        arbol.raiz.izquierda.derecha = new NodoArbolSegundoEjercicio(5);
        arbol.raiz.derecha.izquierda = new NodoArbolSegundoEjercicio(6);
        arbol.raiz.derecha.derecha = new NodoArbolSegundoEjercicio(7);

        arbol.LDCPrimos(arbol.raiz, arbol.inicioLDC);
        arbol.imprimirLDC();  // Debería imprimir los nodos primos en la Lista Doble Circular
        //tercer ejercicio
        ArbolTercerEjercicio arbol3 = new ArbolTercerEjercicio();
        arbol3.raiz = new NodoArbolTercerEjercicio("+");
        arbol3.raiz.izquierda = new NodoArbolTercerEjercicio("*");
        arbol3.raiz.derecha = new NodoArbolTercerEjercicio("/");

        arbol3.raiz.izquierda.izquierda = new NodoArbolTercerEjercicio("3");
        arbol3.raiz.izquierda.derecha = new NodoArbolTercerEjercicio("5");
        arbol3.raiz.derecha.izquierda = new NodoArbolTercerEjercicio("8");
        arbol3.raiz.derecha.derecha = new NodoArbolTercerEjercicio("2");

        System.out.print("Expresión en orden: ");
        arbol3.inOrder(arbol3.raiz);
        System.out.println();
        try {
            double resultado3 = arbol3.evaluarExpresion(arbol3.raiz);
            System.out.println("Resultado de la expresión: " + resultado);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 

