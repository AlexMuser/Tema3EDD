/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

import java.util.Scanner;

/**
 *
 * @author Muse1
 */
public class PrbRecursivo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Recursividad obj = new Recursividad();
        boolean llave = true;
        int x;
        int arr[] = {5,4,3,2,1,4,4};
        int num;
        do
        {
            System.out.println("---------Menu----------\n"
                    + "1.Factorial\n"
                    + "2.Suma secuencial\n"
                    + "3.Secuencia De Fibonacci\n"
                    + "4.Suma del vector\n"
                    + "5.Potencia\n"
                    + "6.Division por resta\n"
                    + "7.Multiplicacion por suma\n"
                    + "8.Busqueda de un numero en un vector\n"
                    + "9.Desplegar una cadena\n"
                    + "10.Total de numeros pares\n"
                    + "11.Suma de numeros pares\n"
                    + "12.Salir");
            System.out.println("Escoga la opcion");
            int opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Escriba el numero");
                    x = sc.nextInt();
                    System.out.println("Factorial de " + x + " es " + obj.fact(x));
                    break;
                case 2:
                    System.out.println("Escriba el numero");
                    x = sc.nextInt();
                    System.out.println("La suma secuencial de " + x + " es " + obj.sumaSecuencia(x));
                    break;
                case 3:
                    System.out.println("Escriba el numero");
                    x = sc.nextInt();
                    System.out.println("El resultado de la secuencia de fibonacci de " + x + " es " + obj.secuenciaDeFibonacci(x));
                    obj.secuenciaDeFibonacciCompleto(x);
                    break;
                case 4:
                    System.out.println("El resultado de la suma del vector es: ");
                    System.out.println(obj.sumaElementosVector(arr, arr.length-1));
                    break;
                case 5:
                    System.out.println("Escriba el numero");
                    int n = sc.nextInt();
                    System.out.println("Escriba la potencia");
                    x = sc.nextInt();
                    System.out.println("El resultado de la potencia es:" + obj.potencia(n, x));
                    break;
                case 6:
                    int resultado = 0;
                    System.out.println("Escriba el numerador");
                    num = sc.nextInt();
                    System.out.println("Escriba el denominador");
                    n = sc.nextInt();
                    System.out.println("El resultado es; " + obj.divRestaEntero(num, n, resultado));
                    break;
                case 7:
                    System.out.println("Escriba el numero");
                    num = sc.nextInt();
                    System.out.println("Escriba el multiplicador");
                    n = sc.nextInt();
                    System.out.println("El resultado es; " + obj.multSuma(num, n));
                    break;
                case 8:
                    System.out.println("Escriba el numero de busqueda");
                    n = sc.nextInt();
                    int res = obj.busqDatoVector(arr, arr.length-1, n);
                    if (res>=0)
                        System.out.println("El numero se encontro en la posicion: " + res);
                    else
                        System.out.println("Dato no encontrado");
                    break;
                case 9:
                    obj.despCadenaRecur("perro", "perro".length()-1);
                    break;
                case 10:
                    System.out.println("El total de numeros pares del arreglo es " + obj.numerosParesArr(arr, arr.length-1));
                    break;
                case 11:
                    System.out.println("La suma de los pares en el arreglo es " + obj.numerosParesArrSuma(arr, arr.length-1));
                    break;
                case 12:
                    llave = false;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
        } while (llave);
    }
}
