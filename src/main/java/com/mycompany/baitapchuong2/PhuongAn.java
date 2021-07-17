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
public class PhuongAn {
    private static int dem = 0;
    private int id;
    private String noiDung;
    private boolean dapAn ;
    {
        id = ++dem;
        
    }
    public PhuongAn(String noiDung,  boolean dapAn)
    {
        this.noiDung = noiDung;
        this.dapAn = dapAn;
    }
    public PhuongAn()
    {
        
    }
    @Override
    public String toString() {
        return String.format("%s\n", this.noiDung); //To change body of generated methods, choose Tools | Templates.
    }
    public void themPhuongAn(Scanner scanner)
    {
        System.out.println(" Nhap Phuong An :");
        this.noiDung = scanner.nextLine();
        System.out.print("Dung/Sai (Y/N)");
        String da = scanner.nextLine();
        da = da.toUpperCase();
        if(da.equals("Y"))
            this.dapAn = true;
        else
            this.dapAn = false;
            
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
   public boolean isdapAn()
   {
       return dapAn;
   }
    public void setDapAn( boolean dapAn)
    {
        this.dapAn = dapAn;
    }
    
}
