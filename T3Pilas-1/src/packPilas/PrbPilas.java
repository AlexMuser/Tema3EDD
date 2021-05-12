/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packPilas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muse1
 */
public class PrbPilas
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean rep=false;
        ArrayList<Double> nums = new ArrayList<>();
        Principal obj = new Principal();
        
        System.out.println("Ingrese la expresión");
        String exp = sc.next();
        
        ArrayList<Character> varc = obj.arrChar(exp);
        Pila res = obj.infPso(exp);
        Pila resPrint = obj.infPso(exp);
        
        System.out.println("Expresión Posfija");
        while (resPrint.empty() == false)
        {
            System.out.print(resPrint.pop());
        }
        System.out.println("");
        
        for (int i = 0; i < varc.size(); i++)
        {
            System.out.println("Ingresa el dato de " + varc.get(i));
            double x = sc.nextDouble();
            nums.add(x);
        }
        
        System.out.println("El resultado de la operacion posfija es " + obj.evalCadPsa(res, varc, nums));
    }
    
}
