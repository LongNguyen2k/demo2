/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLamTHemBai3Chuong2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10
 */
public class Tester {
    public static void main(String[] args)
    {
//        CauHoi c  = new CauHoi(" They ....... are DolPhin ! ");
//        PhuongAn p1 = new PhuongAn(" are ");
//        PhuongAn p2 = new PhuongAn("were");
//        PhuongAn p3 = new PhuongAn("is");
//        PhuongAn p4 = new PhuongAn(" there ");
//        List<PhuongAn> p = new ArrayList<>();
//        p.addAll(Arrays.asList(new PhuongAn[]{p1,p2,p3,p4}));
//        CauHoi c2  = new CauHoi(" They ....... are Shark ! ");
//        PhuongAn p5 = new PhuongAn(" are ");
//        PhuongAn p6 = new PhuongAn("were");
//        PhuongAn p7 = new PhuongAn("is");
//        PhuongAn p8 = new PhuongAn(" there ");
//        List<PhuongAn> pa2 = new ArrayList<>();
//        pa2.addAll(Arrays.asList(new PhuongAn[]{p5,p6,p7,p8}));
//        try{
//            c.setPa(p);  
//            c2.setPa(pa2);
//        }catch (Exception ex)
//        {
//            System.err.println(ex.getMessage());
//        }        
//        c.setDapAn(p1);
//        c.setDapAn(p2);
//        c2.setDapAn(p5);
//        System.out.print(c);
//        
//        System.out.println(" ========= Phan Luyen Tap");
//        QuanLyCauHoi ql = new QuanLyCauHoi();
//        
//        ql.themCauHoi(c);
//        ql.themCauHoi(c2);
//        Scanner scanner = new Scanner(System.in);
//        ql.luyenTap(scanner);
//        String s = scanner.nextLine();
        QuanLyCauHoi ql = new QuanLyCauHoi();
        try
        {
           ql.napDsCauHoi();
           Scanner scanner = new Scanner(System.in);
           ql.luyenTap(scanner);
        }catch (FileNotFoundException ex)
        {
            Logger.getLogger(Tester.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    }
