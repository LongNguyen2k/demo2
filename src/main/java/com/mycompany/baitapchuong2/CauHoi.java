/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class CauHoi {
    private final String[] NHAN = {"A" , "B" , "C" , "D"};
    private static int dem = 0 ;
    private int id;
    private List<PhuongAn> phuongAn;
    private String noiDung;
    {
        id = ++dem;
        phuongAn = new ArrayList<>();
    }
    // phương thức khởi tạo 
    public CauHoi( String noiDung)
    {
        this.noiDung = noiDung;
    }
    public CauHoi()
    {
        
    }
    public void nhapCauhoi(Scanner scanner)
    {
        System.out.println(" Noi Dung Cau Hoi : ");
        this.noiDung = scanner.nextLine();
        for( int i = 0 ; i < NHAN.length ; i++)
        {
            System.out.printf(" Nhap Phuong An %s\n" , NHAN[i]);
            PhuongAn pa = new PhuongAn();
            pa.themPhuongAn(scanner);
            this.phuongAn.add(pa);
            
        }
    }
    public void themPhuongAn(PhuongAn pa)
    {  if( this.phuongAn.size() < NHAN.length)
        this.phuongAn.add(pa);
    }

    @Override
    public String toString() {
        String s = String.format("%s\n",this.noiDung);
//        for( PhuongAn p: this.phuongAn)
//        {
//            s +=p ;
//        }
           for( int i = 0 ; i < this.phuongAn.size() ; i++)
               s += String.format("%s.%s", NHAN[i] , this.phuongAn.get(i) );
           
        return s; 
    }
     public boolean ktDapAn(String da)
    {
        da = da.toUpperCase();
       for( int i =0 ; i < this.phuongAn.size() ; i++)
       {
           if( this.phuongAn.get(i).isdapAn() == true && NHAN[i].equals(da) == true )
               return true;
       }
       return false;
    }
    public int getID()
    {
        return id;
    }
   
    public void setID(int id)
    {
     this.id = id;   
    }
    public String getNoiDung()
    {
        return noiDung;
    }
    public void setNoiDung(String noiDung)
    {
        this.noiDung = noiDung;
    }
    
}

