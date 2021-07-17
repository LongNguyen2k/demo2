/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLamTHemBai3Chuong2;

/**
 *
 * @author Windows 10
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLyCauHoi {
   private List<CauHoi> quanLyCauHoi = new ArrayList<>();
   public void themCauHoi(CauHoi ch)
   {
       this.quanLyCauHoi.add(ch);
   }
   public void luyenTap(Scanner scanner)
   {    int t;
       for(CauHoi c : this.quanLyCauHoi)
       {
           System.out.println(c);
           System.out.println(" Phuong An tra loi cua Ban : ");
           t = scanner.nextInt();
           if(c.isChinhXac(t-1))
               System.out.println("Chinh xac !");
           else
               System.out.println(" Sai roi !");
       }
   }
       public void napDsCauHoi() throws FileNotFoundException {
        File f = new File("src\\main\\java\\BaiTapLamTHemBai3Chuong2\\cauhoi.txt");
        try (Scanner s = new Scanner(f)) {
            while (s.hasNext()) {
                String ch = s.nextLine();
                String a = s.nextLine();
                String b = s.nextLine();
                String c = s.nextLine();
                String d = s.nextLine();
                int idx = Integer.parseInt(s.nextLine());
                
                CauHoi c1 = new CauHoi(ch);
        
                PhuongAn pa = new PhuongAn(a);
                PhuongAn pb = new PhuongAn(b);
                PhuongAn pc = new PhuongAn(c);
                PhuongAn pd = new PhuongAn(d);
                List<PhuongAn> p = new ArrayList<>();
                p.addAll(Arrays.asList(new PhuongAn[]{pa, pb, pc, pd}));
                c1.setDapAn(p.get(idx));
                
                try {
                    c1.setPa(p);
                    this.themCauHoi(c1);
                 } catch (Exception ex) {
                     System.err.println(ex.getMessage());
                 }
            }
        }
    }
    public List<CauHoi> getQuanLyCauHoi() {
        return quanLyCauHoi;
    }

    public void setQuanLyCauHoi(List<CauHoi> quanLyCauHoi) {
        this.quanLyCauHoi = quanLyCauHoi;
    }
    
}