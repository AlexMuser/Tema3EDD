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

    public int fact(int n)
    {
        if (n == 0)
            return 1;
        return (n * fact(n - 1));
    }

    public int sumaSecuencia(int n) //1....N
    {
        if (n == 1)
            return 1;
        return (n + sumaSecuencia(n - 1));
    }

    public int secuenciaDeFibonacci(int n)
    {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return (secuenciaDeFibonacci(n - 1) + secuenciaDeFibonacci(n - 2));
    }

    public void secuenciaDeFibonacciCompleto(int n)
    {
        for (int i = 1; i < n + 1; i++)
            System.out.print(secuenciaDeFibonacci(i) + "\t");
        System.out.println("\n");
    }

    public int sumaElementosVector(int[] arr, int indice)
    {
        if (indice == 0)
            return arr[0];
        return arr[indice] + sumaElementosVector(arr, indice - 1);
    }

    public int potencia(int n, int x)
    {
        if (x == 0)
            return 1;
        return n * potencia(n, x - 1);
    }

    public int divRestaEntero(int num, int den, int cont)
    {
        if (num >= den)
            return divRestaEntero(num - den, den, cont + 1);
        return cont;
    }

    public int multSuma(int num, int mult)
    {
        if (mult == 0)
            return 0;
        else
            return num + multSuma(num, mult - 1);
    }

    public int busqDatoVector(int[] arr, int i, int numBusq)
    {
        if (i < 0)
            return -1;
        if (arr[i] == numBusq)
            return i;
        return busqDatoVector(arr, i - 1, numBusq);
        
    }
    
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
