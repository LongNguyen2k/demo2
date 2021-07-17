/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class QuanLyHocVien {
    private ArrayList<HocVien> ds = new ArrayList<>();
    
    
    public  void themHocVien( HocVien hv)
    {
        this.ds.add(hv);
    }
    public void themHocVien( Scanner scanner ) throws ParseException
    {
        HocVien h = new HocVien();
        h.nhapHocVien(scanner);
        this.ds.add(h);
        // this.themHocVien(h);
    }
    public void hienthiDs()
    {
        this.ds.forEach( (HocVien h ) -> {
            h.hienThi();
            System.out.println("=========="); });
        // for( HocVien h : this.ds ) 
         //     h.hienThi();
    }
    public HocVien timKiem( int maSo)
    {
        for( HocVien h: this.ds)
            if( h.getmaSo() == maSo)
                return h;
        
        return null;
    }
    public ArrayList<HocVien> timKiem( String keyWork)
    {
        ArrayList<HocVien> kq = new ArrayList<> ();
        
        // cach tim kiem linh hoat 
        keyWork = keyWork.toLowerCase();
        for( HocVien h : this.ds)
        {   
            if( h.gethoTen().toLowerCase().contains(keyWork) == true ||
                    h.getqueQuan().toLowerCase().contains(keyWork) == true)
                 kq.add(h);
        }
        
        return kq;
    }
    public void sapXep()
    {
        this.ds.sort( (HocVien h1 , HocVien h2 ) -> {
            
            //return h1.getmaSo() - h2.getmaSo();
            double tb1 = h1.diemTrungBinh();
            double tb2 = h2.diemTrungBinh();
            if( tb1 >tb2 )
                return 1 ;
            else if( tb1 < tb2 )
                return -1;
            return 0 ; // đây là sắp xếp tăng vì giá trị trả về là 1 để sắp xếp thì đảo chiều lại 
            //  sắp xếp giảm 
            // if( tb1 > tb2)
               // return -1;
               // else ifif( tb1 < tb2 )
               // return 1;
            
            
        });
    }
    public ArrayList<HocVien> xetHocBong( )
    {
        ArrayList<HocVien> kq = new ArrayList<>();
        for( HocVien h : this.ds)
        {
            if( h.isHocBong() == true )
                kq.add(h);
        }
        return kq;
    }
    public void nhapDiemDs(Scanner scanner )
    {
        for( HocVien h :  this.ds)
        {
           System.out.printf( " Nhap Diem cho %s\n" ,h.gethoTen());
            h.nhapDiem(scanner);
        }
    }
    public ArrayList<HocVien> getds()
    {
        return ds ;
    }
    public void setds( ArrayList<HocVien>  ds)
    {
        this.ds = ds;
    }
}
