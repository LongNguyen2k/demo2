/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author Windows 10
 */
public class Diem {
    private double hoanhDo ;
    private double tungDo;
    public Diem()
    {
        hoanhDo = 0;
        tungDo = 0 ;
    }
    public Diem ( double x , double y)
    {
        this.hoanhDo = x;
        this.tungDo = y;
    }
    // get cho HoanhDo
    public double GethoanhDo()
    {
        return hoanhDo;
    }
    // set cho HoanhDo
    public void SethoanhDo(double x)
    {
        this.hoanhDo = x ;
    }
    // get cho TungDo
    public double GettungDo()
    {
        return tungDo;
    }
    // set cho TungDo
    public void SettungDo(double y )
    {
        this.tungDo = y ;
    }
    public void HienThi()
    {
        System.out.println("(" + GethoanhDo() + ","+ GettungDo()+")"  );
    }
    public double khoangCachGiua2Diem( Diem B)
    {
      
       double kq = Math.sqrt( Math.pow( (this.hoanhDo - B.hoanhDo)   ,  2)+  Math.pow(  (this.tungDo - B.tungDo), 2 ));
         return kq;
        
    }
}
