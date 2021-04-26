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
public class PrbIterativo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Iterativos obj2 = new Iterativos();
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
                    + "11.Multiplicación de numeros pares\n"
                    + "12.Contador de monedas\n"
                    + "13.Salir");
            System.out.println("Escoga la opcion");
            int opc = sc.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.println("Escriba el numero");//Listo
                    x = sc.nextInt();
                    System.out.println("Factorial de " + x + " es " + obj2.fact(x));
                    break;
                case 2:
                    System.out.println("Escriba el numero");//Listo
                    x = sc.nextInt();
                    System.out.println("La suma secuencial de " + x + " es " + obj2.sumaSecuencia(x));
                    break;
                case 3:
                    System.out.println("Escriba el numero");//Listo
                    x = sc.nextInt();
                    System.out.println("El resultado de la secuencia de fibonacci de " + x + " es " + obj2.secuenciaDeFibonacci(x));
                    for (int i = 0; i < x; i++)
                        System.out.print("\t" + obj2.secuenciaDeFibonacci(i));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("El resultado de la suma del vector es: ");//Listo
                    System.out.println(obj2.sumaElementosVector(arr));
                    break;
                case 5:
                    System.out.println("Escriba el numero");//Listo
                    int n = sc.nextInt();
                    System.out.println("Escriba la potencia");
                    x = sc.nextInt();
                    System.out.println("El resultado de la potencia es:" + obj2.potencia(n, x));
                    break;
                case 6:
                    int resultado = 0;//Listo
                    System.out.println("Escriba el numerador");
                    num = sc.nextInt();
                    System.out.println("Escriba el denominador");
                    n = sc.nextInt();
                    System.out.println("El resultado es; " + obj2.divRestaEntero(num, n));
                    break;
                case 7:
                    System.out.println("Escriba el numero");//Listo
                    num = sc.nextInt();
                    System.out.println("Escriba el multiplicador");
                    n = sc.nextInt();
                    System.out.println("El resultado es; " + obj2.multSuma(num, n));
                    break;
                case 8:
                    System.out.println("Escriba el numero de busqueda");//Listo
                    n = sc.nextInt();
                    int res = obj2.busqDatoVector(arr, n);
                    if (res>=0)
                        System.out.println("El numero se encontro en la posicion: " + res);
                    else
                        System.out.println("Dato no encontrado");
                    break;
                case 9:
                    obj2.despCadenaRecur("perro");
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("El total de numeros pares del arreglo es " + obj2.numerosParesArr(arr));
                    break;
                case 11:
                    System.out.println("La suma de los pares en el arreglo es " + obj2.numerosParesArrMult(arr));
                    break;
                case 12:
                    System.out.println("Ingrese el monto");
                    n = sc.nextInt();
                    obj2.contadorMonedas(n, 0, 0, 0, 0);
                    break;
                case 13:
                    llave = false;
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
        } while (llave);
    }
}
