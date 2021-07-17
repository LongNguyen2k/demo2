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
public class MainBai1Bai2Bai3Chuong2 {
    public static void main(String[] args) throws Exception
    {
        Diem d1 = new Diem(13, 13); // trenTrai
        Diem d2 = new Diem( 12 , 6 ); // duoiPhai
        try{
        HinhChuNhat h1 = new HinhChuNhat(d1, d2);
         h1.hienThi();
        }
        catch(Exception ex)
        {
            System.err.println(ex.getMessage());
        }
        
       
    }
}
