/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.ArrayList;

/**
 *
 * @author Muse1
 */
public class Recursividad
{

    /**
     * Metodo para realizar el factorial de un numero
     *
     * @param n numero para realizar el factorial
     */
    public int fact(int n)
    {
        if (n == 0)
            return 1;
        return (n * fact(n - 1));
    }

    /**
     * Metodo para realizar la suma secuencial hasta n numero
     *
     * @param n numero para realizar la suma secuencial
     */
    public int sumaSecuencia(int n)
    {
        if (n == 1)
            return 1;
        return (n + sumaSecuencia(n - 1));
    }

    /**
     * Metodo para realizar y obtener el resultado la secuencia de fibonacci
     *
     * @param n numero para realizar la secuencia fibonacci
     */
    public int secuenciaDeFibonacci(int n)
    {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return (secuenciaDeFibonacci(n - 1) + secuenciaDeFibonacci(n - 2));
    }

    /**
     * Metodo para mostrar los datos  de la secuencia de fibonacci
     *
     * @param n numero para obtener la secuencia de fibonacci
     */
    public void secuenciaDeFibonacciCompleto(int n)
    {
        for (int i = 1; i < n + 1; i++)
            System.out.print(secuenciaDeFibonacci(i) + "\t");
        System.out.println("\n");
    }

    /**
     * Metodo para realizar la suma de datos de un arreglo
     *
     * @param arr vector
     * @param indice tamaño para recorrer el vector
     */
    public int sumaElementosVector(int[] arr, int indice)
    {
        if (indice == 0)
            return arr[0];
        return arr[indice] + sumaElementosVector(arr, indice - 1);
    }

    /**
     * Metodo para realizar la potencia de un numero
     *
     * @param n numero 
     * @param x potencia
     */
    public int potencia(int n, int x)
    {
        if (x == 0)
            return 1;
        return n * potencia(n, x - 1);
    }

    /**
     * Metodo para realizar la division de un numero con operaciones de restas
     *
     * @param num numerador
     * @param den denominador
     * @param cont contador
     */
    public int divRestaEntero(int num, int den, int cont)
    {
        if (num >= den)
            return divRestaEntero(num - den, den, cont + 1);
        return cont;
    }

    /**
     * Metodo para realizar la multiplicacion con operaciones de suma
     *
     * @param num numero
     * @param mult multiplicador
     */
    public int multSuma(int num, int mult)
    {
        if (mult == 0)
            return 0;
        else
            return num + multSuma(num, mult - 1);
    }

    /**
     * Metodo para realizar la busqueda de un dato de un arreglo
     *
     * @param arr vector
     * @param i tamaño para recorrer el vector
     * @param numBusq numero a buscar
     */
    public int busqDatoVector(int[] arr, int i, int numBusq)
    {
        if (i < 0)
            return -1;
        if (arr[i] == numBusq)
            return i;
        return busqDatoVector(arr, i - 1, numBusq);
        
    }
    
    /**
     * Metodo para realizar el despliegue de una cadena con uso de caracteres
     *
     * @param cadena palabra o cadena
     * @param n tamaño de la palabra para su recorrido
     */
    public void despCadenaRecur(String cadena, int n)
    {
        if (n>0)
        {
            despCadenaRecur(cadena, n-1);
            System.out.println(cadena.charAt(n));
        }else
            System.out.println(cadena.charAt(n));
    }
}
