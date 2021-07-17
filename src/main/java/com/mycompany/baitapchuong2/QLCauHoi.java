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
public class QLCauHoi {
    private List<CauHoi> ds ;
    
    
    public QLCauHoi()
    {
        this.ds = new ArrayList<>();
    }
    public void themCauHoi(CauHoi ch)
    {
        this.ds.add(ch);
        
    }
   public void themCauHoi(Scanner scanner )
   {
       CauHoi ch = new CauHoi();
       ch.nhapCauhoi(scanner);
       this.ds.add(ch);
   }
    public void luyenTap(Scanner scanner)
    {
        for( CauHoi c: this.ds   )
        {
            System.out.println(c);
            System.out.print(" Trả lời của bạn : ");
            String da = scanner.next();
            if(c.ktDapAn(da) == true )
                System.out.println(" Chính Xác !! ");
            else
                System.out.println(" sai RỒi !! ");
        }
    }
   
    public List<CauHoi> getDS()
    {
        return ds;
    }
    public void setDS( List<CauHoi> ds)
    {
        this.ds = ds;
    }
}
