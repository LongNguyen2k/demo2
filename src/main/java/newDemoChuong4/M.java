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
public abstract class M {
    public static int dem = 0;
    protected double m1;
    protected double m2;
    protected double m3;
    public M(double m1 , double m2 , double m3)
    {   
        dem ++;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public abstract double cal();
    public abstract String formula();
    public void show()
    {
        System.out.println(" Diem môn So " + dem +" he so 2 ");
        System.out.println(String.format("Diem 3 mon : %.1f", this.m1));
    }
   
}
