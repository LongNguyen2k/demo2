/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newDemoChuong4;

/**
 *
 * @author Windows 10
 */
public class A extends M{
    public A(double A1 , double A2 , double A3)
    {
        super(A1, A2,A3);
    }

    @Override
    public double cal() {
        return (this.m1 * 2 + this.m2 + this.m3);
       
    }

    @Override
    public String formula() {
         return String.format("%.1f *2 + %.1f + %.1f",this.m1 , this.m2 , this.m3);
    }

    @Override
    public void show() {
        super.show(); 
        System.out.println(this.formula() + " = " + this.cal());
    }
    
    
    
}
