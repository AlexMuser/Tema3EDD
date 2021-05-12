/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packPilas;

import java.util.ArrayList;

/**
 *
 * @author Muse1
 */
public class Principal
{

    Pila var, op;
    PilaNum evalua;
    boolean rep = false;
    ArrayList<Character> varc = new ArrayList<>();

    public Pila infPso(String expr)
    {
        var = new Pila(expr.length());
        op = new Pila(expr.length());
        for (int i = 0; i < expr.length(); i++)
        {
            if (Character.isLetter(expr.charAt(i))) //1
            {
                var.push(expr.charAt(i));
            }
            if (expr.charAt(i) == '(') //2
            {
                op.push(expr.charAt(i));
            }
            if (expr.charAt(i) == '$') //3
            {
                if (op.empty()==false && op.stacktop() == '$')
                {
                    var.push(op.pop());
                }
                op.push(expr.charAt(i));
            }
            if (expr.charAt(i) == '*' || expr.charAt(i) == '/') //4
            {
                while (op.empty() == false && (op.stacktop()=='$'||op.stacktop()=='*'||op.stacktop()=='/'))
                {
                    var.push(op.pop());
                }
                op.push(expr.charAt(i));
            }
            if (expr.charAt(i) == '+' || expr.charAt(i) == '-') //5
            {
                while (op.empty() == false && (op.stacktop() == '$' || op.stacktop() == '*' || op.stacktop() == '/' || op.stacktop() == '+' || op.stacktop() == '-'))
                {
                    var.push(op.pop());
                }
                op.push(expr.charAt(i));
            }
            if (expr.charAt(i) == ')')
            {
                while (op.stacktop() != '(')
                {
                    var.push(op.pop());
                }
                op.pop();
            }
        }
        while (var.empty() == false)
        {
            op.push(var.pop());
        }
        return op;
    }

    public ArrayList<Character> arrChar(String expr)
    {
        for (int i = 0; i < expr.length(); i++)
        {
            if (Character.isLetter(expr.charAt(i)))
            {
                if (varc!=null)
                {
                    for (int j = 0; j < varc.size(); j++)
                    {
                        if (varc.get(j)==expr.charAt(i))
                        {
                            rep = true;
                        }
                    }
                    if (rep==false)
                    {
                        varc.add(expr.charAt(i));
                    }
                }else  
                {
                    varc.add(expr.charAt(i));
                }
            }
        }
        return varc;
    }
    
    public double evalCadPsa(Pila posf, ArrayList<Character> caract, ArrayList<Double> nums)
    {
        evalua = new PilaNum(nums.size());
        double res = 0;
        if (nums.size()==1)
        {
            return nums.get(0);
        }
        while (posf.empty()==false)
        {
            if (Character.isLetter(posf.stacktop()))
            {
                int pos = caract.indexOf(posf.stacktop());
                double num = nums.get(pos);
                evalua.push(num);
                posf.pop();
            }
//            if (posf.stacktop()=='$')
//            {
//                double x1 = evalua.pop(), x2 = evalua.pop();
//                res= x2^x1;
//                posf.pop();
//            }
            if (posf.empty()==false && posf.stacktop()=='*')
            {
                double x1 = evalua.pop(), x2 = evalua.pop();
                res= x2 * x1;
                evalua.push(res);
                posf.pop();
            }
            if (posf.empty()==false && posf.stacktop()=='/')
            {
                double x1 = evalua.pop(), x2 = evalua.pop();
                res= x2/x1;
                evalua.push(res);
                posf.pop();
            }
            if (posf.empty()==false && posf.stacktop()=='+')
            {
                double x1 = evalua.pop(), x2 = evalua.pop();
                res= x2 + x1;
                evalua.push(res);
                posf.pop();
            }
            if (posf.empty()==false && posf.stacktop()=='-')
            {
                double x1 = evalua.pop(), x2 = evalua.pop();
                res= x2 - x1;
                evalua.push(res);
                posf.pop();
            }
        }
        return res;
    }
}
