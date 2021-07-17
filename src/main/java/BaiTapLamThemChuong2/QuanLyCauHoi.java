///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package BaiTapLamThemChuong2;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
///**
// *
// * @author Admin
// */
//public class QuanLyCauHoi {
//    private List<CauHoi> ds = new ArrayList<>();
//    
//    public void themCauHoi(CauHoi ch) {
//        this.ds.add(ch);
//    } 
//    
//    public void luyenTap(Scanner scanner) {
//        for (CauHoi c: this.ds) {
//            System.out.println(c);
//            System.out.print("Cau tra loi: ");
//            int t = scanner.nextInt();
//            if (c.isChinhXac(t - 1))
//                System.out.println("CHINH XAC!!!");
//            else
//                System.out.println("SAI ROI!!!");
//        }
//    }
//    
//    public void napDsCauHoi() throws FileNotFoundException {
//        File f = new File("D:\\LaptrinhHuongDoiTuong\\BaiTapChuong2\\src\\main\\java\\BaiTapLamThemChuong2\\cauhoi.txt");
//        try (Scanner s = new Scanner(f)) {
//            while (s.hasNext()) {
//                String ch = s.nextLine();
//                String a = s.nextLine();
//                String b = s.nextLine();
//                String c = s.nextLine();
//                String d = s.nextLine();
//                int idx = Integer.parseInt(s.nextLine());
//                
//                CauHoi c1 = new CauHoi(ch);
//        
//                PhuongAn pa = new PhuongAn(a);
//                PhuongAn pb = new PhuongAn(b);
//                PhuongAn pc = new PhuongAn(c);
//                PhuongAn pd = new PhuongAn(d);
//                List<PhuongAn> p = new ArrayList<>();
//                p.addAll(Arrays.asList(new PhuongAn[]{pa, pb, pc, pd}));
//                c1.setDapAn(p.get(idx));
//                
//                try {
//                    c1.setPhuongAn(p);
//                    this.themCauHoi(c1);
//                 } catch (Exception ex) {
//                     System.err.println(ex.getMessage());
//                 }
//            }
//        }
//    }
//
//    /**
//     * @return the ds
//     */
//    public List<CauHoi> getDs() {
//        return ds;
//    }
//
//    /**
//     * @param ds the ds to set
//     */
//    public void setDs(List<CauHoi> ds) {
//        this.ds = ds;
//    }
//    
//    
//}
