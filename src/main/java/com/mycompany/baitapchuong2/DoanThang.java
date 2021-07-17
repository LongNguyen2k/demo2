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
public class DoanThang {
    private Diem a1;
    private Diem a2;
    public DoanThang()
    {
      this.a1.SethoanhDo(0);
      this.a1.SettungDo(0);
      this.a2.SethoanhDo(0);
      this.a2.SettungDo(0);
        
    }
    public DoanThang( Diem A , Diem B )
    {
       this.a1 = A;
       this.a2 = B;
    }
   public Diem getDiemDau()
   {
       return a1;
   }
   public void setDiemDau(Diem a1)
   {
      this.a1 = a1;
   }
    public Diem getDiemCuoi()
   {
       return a2;
   }
   public void setDiemCuoi(Diem a2)
   {
      this.a2 = a2;
   }
   
    public void hienThiDoanThang()
    {
System.out.println( " [(" + this.a1.GethoanhDo() + " ," + this.a1.GettungDo() +"),(" + this.a2.GethoanhDo() + "," + this.a2.GettungDo()+ ")]");
    }
    public double doDaiDoanThang()
    {
        
        double kq = Math.sqrt( Math.pow(this.a1.GethoanhDo() - this.a2.GethoanhDo(), 2) + Math.pow (this.a1.GettungDo() - this.a2.GettungDo() , 2  ));
        return kq ;
    }
    public Diem trungDiemDoanThang()
    {
        
       
        double hoanhDoI = (( this.a1.GethoanhDo() + this.a2.GethoanhDo()) / 2);
        double tungDoI  = ((this.a1.GettungDo() + this.a2.GettungDo()) / 2 );
        Diem I = new Diem( hoanhDoI , tungDoI);
        return I ;
    }
    public boolean kiemTraSongSong (  DoanThang B )
    {
        boolean kiemtra  ;
        double ve1 = ( this.a1.GethoanhDo() - this.a2.GethoanhDo()) / ( this.a1.GettungDo() - this.a2.GettungDo()) ;
        double  ve2 = ( B.a1.GethoanhDo() - B.a2.GethoanhDo()) / ( B.a1.GettungDo() - B.a2.GettungDo()) ;
        if( ve1 == ve2)
            kiemtra = true;
        else
            kiemtra = false;
        return kiemtra;
    }
}
