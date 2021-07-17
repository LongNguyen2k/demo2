///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.baitapchuong2;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author Windows 10
// */
//public class Main {
//    // Bai 1 
////   public static  void NhapToaDo(Diem a)
////    {
////        Scanner scanner = new Scanner(System.in);
////        System.out.print ( " Nhap vao Hoanh Do :");
////        int x = scanner.nextInt();
////        double x1 = (double)x;
////        a.SethoanhDo(x1);
////        System.out.print( " Nhap vao Tung Do :");
////        int y = scanner.nextInt();
////        double y1 = (double)y;
////        a.SettungDo(y1);
////    }
//    public static void main(String[] args) throws ParseException
//    {
////       Diem A = new Diem( 3 , 7 );
////       Diem B = new Diem( 6 , 9 );
////       Diem C = new Diem( 6 , 9 );
////       Diem D = new Diem( 3 , 7 );
//////       System.out.print( " Nhap vao Hoanh Do va Tung Do cua Diem A :\n");
//////       NhapToaDo(A);
//////       System.out.print( " Nhap vao Hoanh Do va Tung Do cua Diem B :\n");
//////       NhapToaDo(B);
////      
////       double khoangCach2Diem = A.khoangCachGiua2Diem(B);
////       System.out.print( " Khoang cach giua 2 diem A va B la : " +  khoangCach2Diem);
////        
////       DoanThang dt = new DoanThang(A, B);
////       System.out.print( " Hien Thi Doan Thang : \n" );
////       dt.hienThiDoanThang();
////      Diem I = dt.trungDiemDoanThang();
////       System.out.println( " Trung Diem Doan Thang :\n" );
////       I.HienThi();
////        System.out.println( " Do dai  Doan Thang :" + dt.doDaiDoanThang());
////       DoanThang dt2 = new DoanThang( C , D );
////      if( dt.kiemTraSongSong(dt2) == true )
////          System.out.println( " 2 Doan Thang song song ");
////       else
////           System.out.println( " 2 Doan Thang  khong song song ");
//        
//        
////        // Bài Tập 4 
////        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
////      HocVien h1 = new HocVien("Nguyen Van A ",  " TP HCM ", f.parse("12/04/1999"));
////      HocVien h2 = new HocVien( " Tran Thi B " , " Binh Duong " , f.parse("31/04/1989"));
////      HocVien h3 = new HocVien( " Võ Hải Nguyên" , " Dong Nai " , f.parse("25/07/1997"));
////     
////      QuanLyHocVien ql = new QuanLyHocVien();
////      ql.themHocVien(h1);
////      ql.themHocVien(h2);
////      ql.themHocVien(h3);
////      Scanner scanner = new Scanner(System.in);
////      ql.themHocVien(scanner);
////      ql.hienthiDs();
//      
////      System.out.println( " ======Tim Kiem theo Ma HV");
////      HocVien k = ql.timKiem(2);
////      k.hienThi();
////      System.out.println( " ======Tim Kiem theo QueQuan ");
////     ArrayList<HocVien> k2 = ql.timKiem("hcm");
////     k2.forEach( ( HocVien h ) -> h.hienThi());
////       System.out.println( " ======Tim Kiem theo Ten ");
////     ArrayList<HocVien> k3 = ql.timKiem("Hải Nguyên");
////     k3.forEach( ( HocVien h ) -> h.hienThi());
//      
////     
////     System.out.println( " ======Sap Xep Danh Sach  ");
////     ql.sapXep();
////     ql.hienthiDs();
////
////    System.out.print( " ===== Nhap Diem ");
////    Scanner scanner = new Scanner(System.in);
////    ql.nhapDiemDs(scanner);
////    ql.hienthiDs();
////    
////    
//////         System.out.println( " ======Sap Xep Danh Sach  ");
//////     ql.sapXep();
//////     ql.hienthiDs();
////    System.out.print( " === DanhSach hocBong\n");
////    ArrayList<HocVien> hb = ql.xetHocBong();
////    hb.forEach( (HocVien h ) -> h.hienThi());
//    } 
//}
