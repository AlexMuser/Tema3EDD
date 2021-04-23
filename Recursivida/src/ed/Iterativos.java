/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed;

/**
 *
 * @author Muse1
 */
public class Iterativos
{

    public int fact(int n)
    {
        int x = 1;
        for (int i = 0; i < n; i++)
        {
            x = x * (i + 1);
        }
        return x;
    }

    public int sumaSecuencia(int n)
    {
        int x = 0;
        for (int i = 0; i < n; i++)
        {
            x += i + 1;
        }
        return x;
    }

    public int secuenciaDeFibonacci(int n)
    {
        int s = 1, a = 0, t = 0;
        for (int i = 0; i < n - 1; i++)
        {
            t = a;
            a = s;
            s = s + t;
        }
        return a;
    }

    public int sumaElementosVector(int[] arr)
    {
        int suma = 0;
        for (int i = 0; i < arr.length; i++)
        {
            suma += arr[i];
        }
        return suma;
    }

    public int potencia(int n, int x)
    {
        int res = 1;
        for (int i = 0; i < x; i++)
        {
            res *= n;
        }
        return res;
    }

    public int divRestaEntero(int num, int den)
    {
        int cont = 0;
        while (num > 0)
        {
            num -= den;
            cont++;
        }
        return cont;
    }

    public int multSuma(int num, int mult)
    {
        int res = 0;
        for (int i = 0; i < mult; i++)
        {
            res += num;
        }
        return res;
    }

    public int busqDatoVector(int[] arr, int numBusq)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == numBusq)
            {
                return i;
            }
        }
        return -1;
    }

    public void despCadenaRecur(String cadena)
    {
        for (int i = 0; i < cadena.length(); i++)
        {
            System.out.print(cadena.charAt(i));
        }
    }

    public int numerosParesArr(int[] arr)
    {
        int cont = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                cont++;
            }
        }
        return cont;
    }

    public int numerosParesArrSuma(int[] arr)
    {
        int suma = 0;
        if (arr != null)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] % 2 == 0)
                {
                    suma += arr[i];
                }
            }
        }
        return suma;
    }

    public void contadorMonedas(int dinero, int mon20, int mon10, int mon5, int mon1)
    {
        do
        {
            if (dinero / 1 > 0)
            {
                if (dinero / 5 > 0)
                {
                    if (dinero / 10 > 0)
                    {
                        if (dinero / 20 > 0)
                        {
                            mon20++;
                            dinero-=20;
                        } else
                        {
                            mon10++;
                            dinero-=10;
                        }
                    } else
                    {
                        mon5++;
                        dinero-=5;
                    }
                } else
                {
                    mon1++;
                    dinero-=1;
                }
            }
        } while (dinero > 0);

        System.out.println("Monedas de 20 = " + mon20);
        System.out.println("Monedas de 10 = " + mon10);
        System.out.println("Monedas de 5 = " + mon5);
        System.out.println("Monedas de 1 = " + mon1);
    }
}
