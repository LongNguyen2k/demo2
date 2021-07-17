/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapChuong2OnLai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

/**
 *
 * @author Windows 10
 */
public class HocVien {
  public static int dem = 0;
  public final int  SO_MON_HOC = 3; 
  private int maHocVien;
  private String hoTen;
  private Date ngaySinh;
  private String gioiTinh;
  
  private double[] diem ; 
  {
      this.maHocVien = ++dem;
      
  }
  public HocVien(String hoTen , Date ngaySinh , String gioiTinh )
  {
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh ;
      this.gioiTinh = gioiTinh ; 
      this.diem  = null;
  }
  public void nhapThongTin(Scanner scanner) throws ParseException
  {
      System.out.println(" Nhap Vao ho Ten : ");
      this.hoTen = scanner.nextLine();
      System.out.println(" Nhap Vao Ngay Sinh : dd/MM/yyyy ");
      String s = scanner.nextLine();
      SimpleDateFormat f  = new SimpleDateFormat("dd/MM/yyyy");
      this.ngaySinh = f.parse(s);
      
      
  }
  
  public void nhapDiem(Scanner scanner )
  {
      this.diem = new double[SO_MON_HOC];
      for( int i  = 0 ; i < SO_MON_HOC ; i++)
      {
          System.out.printf( " Nhap diem mon thu  %d  " , i  + 1);
          this.diem[i] = scanner.nextInt();
          
      }
  }
  public double tinhDiemTrungBinh()
  {
      return DoubleStream.of(this.diem).average().getAsDouble();
  }
    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
       StringBuilder s = new StringBuilder();
        s.append(String.format(" Ma Hoc Vien  : %s \n", this.maHocVien));
       s.append(String.format(" Ho Ten : %s \n", this.hoTen));
        s.append(String.format("  NGaySinh   : %s \n", f.format(this.ngaySinh)));
         s.append(String.format(" Gioi Tinh   : %s \n", this.gioiTinh));
         s.append("Diem 3 Mon : ");
         for( int i = 0 ; i < SO_MON_HOC ; i++)
         {
             s.append(String.format(" %.1f", this.diem[i]));
         }
         
       
       
       
       return s.toString();
       
    }
  
    
    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double[] getDiem() {
        return diem;
    }

    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}
