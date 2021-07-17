/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 *
 * @author Windows 10
 */
public class HocVien {
    private final int SO_MON_HOC = 3 ;
    private static int dem = 0 ;
    private int maso = ++dem;
    private String hoTen;
    private String queQuan;
    private Date ngaySinh;
    private double[] diem ; 
    
    
    
    /** phuomg thức khởi tạo 
     * 
     * @param ht : hoTen
     * @param qq : queQuan 
     * @param ns : ngaySinh
     */
    public HocVien( String ht, String qq , Date ns)
    {   
        this.hoTen = ht;
        this.queQuan = qq;
        this.ngaySinh = ns;
        this.diem =     null;
     }
    public HocVien( )
    {
        
    }
    public void hienThi()
    {   // M là tháng // m là phút 
        SimpleDateFormat  f = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf( " Ma Hoc Vien : %d \nHoTen :%s\n Quê Quán : %s\n Ngày Sinh %s\n ",
                this.maso , this.hoTen , this.queQuan, f.format(this.ngaySinh));
        if( this.diem != null )
        {
            System.out.print( " Diem cac mon hoc : ");
            for( double d: this.diem)
                System.out.printf( "%2f\t" , d );
            System.out.printf(" Diem Trung BInh %2f\n" , this.diemTrungBinh() );
           
        }
        
    }
    public void nhapHocVien(Scanner scanner) throws ParseException
    {
        System.out.print(" Nhap Vao Ho Ten :");
        this.hoTen = scanner.nextLine();
        System.out.print(" Nhap Vao Que Quan : ");
        this.queQuan = scanner.nextLine();
        System.out.print(" Nhap vao ngay SInh : dd/MM/yyyy");
        String ns = scanner.nextLine();
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        this.ngaySinh = f.parse(ns);
    }
    public double diemTrungBinh( )
    {
        return DoubleStream.of(this.diem).average().getAsDouble();
    }
    public void nhapDiem(Scanner scanner )
    {   this.diem = new double[SO_MON_HOC];
        for( int i = 0 ; i < SO_MON_HOC ; i++ )
        {
            System.out.printf( " Nhap Mon thu %d: " ,i );
            this.diem[i] = scanner.nextDouble();
        }
    }
    public boolean isHocBong()
    {
        for(double d: this.diem)
        {
            if( d < 5 )
                return false;
        }
        return this.diemTrungBinh() >= 8 ;
    }
    // phương thức getter và setter
    public int getmaSo()
    {
        return this.maso;
    }
    public String gethoTen()
    {
        return this.hoTen;
    }
    public void sethoTen( String hoTen)
    {
        this.hoTen = hoTen;
    }
    public String getqueQuan()
    {
        return queQuan;
    }
    public void setqueQuan(String queQuan)
    {
         this.queQuan = queQuan;
    }
    public Date getngaySinh()
    {
        return this.ngaySinh;
    }
    public void setngaySinh( Date ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }
     public double[] getdiem()
     {
         return this.diem ;
     }
     public void setdiem(double[] diem )
     {
         this.diem = diem ;
     }
    
}
