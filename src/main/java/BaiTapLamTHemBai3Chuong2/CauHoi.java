/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapLamTHemBai3Chuong2;

import java.util.List;

/**
 *
 * @author Windows 10
 */


/**
 *
 * @author Admin
 */
public class CauHoi {
 public static final int SO_LUONG_PA = 4 ;
 private String noiDung;
private List<PhuongAn> pa;
private PhuongAn dapAn;
 
public boolean isChinhXac(int inDex)
{
    return this.dapAn == this.pa.get(inDex);
}
 public CauHoi(String noiDung)
 {
     this.noiDung = noiDung;
 }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.noiDung).append(" \n ");
        for(int i = 0 ; i < this.pa.size() ; i ++)
        {
            s.append(String.format(" %d. %s \n ", (i+1) , this.pa.get(i).getNoiDung()));
        }
        return s.toString();
    }
//     @Override
//    public String toString() {
//        StringBuilder b = new StringBuilder();
//        b.append(this.noiDung).append("\n");
//        
////        for (PhuongAn p: this.phuongAn)
////            b.append(p.getNoiDung() + "\n");
//        for (int i = 0; i < this.pa.size(); i++)
//            b.append(String.format("%d. %s\n", (i+1), 
//                    this.pa.get(i).getNoiDung()));
//        
//        return b.toString();
//    }
    

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public List<PhuongAn> getPa() {
        return pa;
    }

    public void setPa(List<PhuongAn> pa) throws Exception {
        if(pa.size()!= SO_LUONG_PA)
            throw new Exception(" So Luong phuong An phai la 4 !\n");
        this.pa = pa;
    }

    public PhuongAn getDapAn() {
        return dapAn;
    }

    public void setDapAn(PhuongAn dapAn) {
        this.dapAn = dapAn;
    }
 
}