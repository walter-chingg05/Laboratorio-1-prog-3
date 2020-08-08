/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoralaboratorio1;

/**
 *
 * @author walle
 */
public class LogicaCalculadora {
    
    public double numero1;
    public double numero2;
    
    
    public LogicaCalculadora(){}
    
    public double opracionSuma(double num1, double num2)
    {
       return num1+num2;
    }
    
      public double opracionResta(double num1, double num2)
    {
       return num1-num2;
    }
    
        public double opracionMultiplicacion(double num1, double num2)
    {
       return num1*num2;
    }
        
       public double opracionDiv(double num1, double num2)
    {
       return num1/num2;
    }
    
         public double opracionSen(double num1, double num2)
    {
       return Math.sin(num1);
    }
    
           public double opracionCos(double num1, double num2)
    {
       return Math.cos(num1);
    }

}
