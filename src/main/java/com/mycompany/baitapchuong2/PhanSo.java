/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class PhanSo {
    
    private int tuSo;
    private int mauSo;
    // phương thức getter và  setter
    public int getTuSo()
    {
        return tuSo;
    }
    public void setTuSo(int tuSo)
    {
        this.tuSo = tuSo;
    }
      public int getMauSo()
    {
        return mauSo;
    }
    public void setMauSo(int mauSo)
    {
        this.mauSo = mauSo;
    }
    // phương thức tĩnh 
    public static int timUCLN( int a , int b )
    {
        int tmp;
        while( b != 0 )
        {
            tmp = a % b ;
            a = b; 
            b = tmp;
        }
        return a ;
    }
    // phương thức khởi tạo 
    public PhanSo ()
    {
        this.tuSo = 0 ;
        this.mauSo = 1 ;
    }
    public PhanSo( int tuSo , int mauSo)
    {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    public void rutGonPhanSo()
    {
        int UCLN = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= UCLN;
        this.mauSo /= UCLN;
        
    }
    public PhanSo   congPhanSo( PhanSo ps)
    {
        PhanSo kq = new PhanSo(( this.tuSo * ps.mauSo) + ( this.mauSo * ps.tuSo),this.mauSo * ps.mauSo);
        kq.rutGonPhanSo();
        return kq;
    }
    public PhanSo truPhanSo( PhanSo ps)
    {
        PhanSo kq = new PhanSo(( this.tuSo * ps.mauSo) - ( this.mauSo * ps.tuSo),this.mauSo * ps.mauSo);
        kq.rutGonPhanSo();
        return kq;
    }
    public PhanSo nhanPhanSo( PhanSo ps)
    {
        PhanSo kq = new PhanSo( (this.tuSo * ps.tuSo) , ( this.mauSo * ps.mauSo));
        kq.rutGonPhanSo();
        return kq;
    }
    public PhanSo chiaPhanSo( PhanSo ps)
    {
        PhanSo kq = new PhanSo( (this.tuSo * ps.mauSo) , ( this.mauSo * ps.tuSo));
        kq.rutGonPhanSo();
        return kq;
    }
    public int soSanh( PhanSo ps)
    {
        double soSanh1 = this.tuSo / this.mauSo;
        double soSanh2 = ps.tuSo / ps.mauSo;
        if( soSanh1 == soSanh2)
            return 0;
        if( soSanh1 > soSanh2)
            return 1 ;
        else
            return -1;
    }
    public void hienThi()
    {
        System.out.println( " PhanSo co Dang :");
        System.out.println( this.tuSo + "/" + this.mauSo);
    }
    public void nhapPhanSo(Scanner scanner )
    {
        System.out.print( " Nhap vao Tu So :");
        this.tuSo = scanner.nextInt();
        System.out.print( " Nhap vao Mau So : ");
        this.mauSo = scanner.nextInt();
    }
    
}
