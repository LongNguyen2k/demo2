/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapChuong2OnLai;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Main {
    public static void main(String[] args) throws ParseException
    {
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    Scanner scanner = new Scanner(System.in);
    HocVien h1 = new HocVien("Nguyen Van A",f.parse("16/09/2000"),"Nam");
  
   
    System.out.println("========= Phan thuc hien cua Cac mang COng  Viec ");
    HocVien h2 = new  HocVien(" Lam Van B ",f.parse("23/12/1898"),"Nam");
    
    QuanLyHocVien ql = new QuanLyHocVien();
    ql.themHocVien(h1);
    ql.themHocVien(h2);
    ql.nhapDiem();
    System.out.println(ql);
    
    
    
    
    
    }
}
