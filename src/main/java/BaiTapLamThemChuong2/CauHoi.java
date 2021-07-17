///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package BaiTapLamThemChuong2;
//
//import java.util.List;
//
///**
// *
// * @author Admin
// */
//public class CauHoi {
//    private static final int SO_LUONG_PA = 4;
//    private String noiDung;
//    private List<PhuongAn> phuongAn;
//    private PhuongAn dapAn;
//    
//    public CauHoi(String nd) {
//        this.noiDung = nd;
//    }
//    
//    public boolean isChinhXac(int idx) {
//        return this.dapAn == this.phuongAn.get(idx);
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder b = new StringBuilder();
//        b.append(this.noiDung).append("\n");
//        
////        for (PhuongAn p: this.phuongAn)
////            b.append(p.getNoiDung() + "\n");
//        for (int i = 0; i < this.phuongAn.size(); i++)
//            b.append(String.format("%d. %s\n", (i+1), 
//                    this.phuongAn.get(i).getNoiDung()));
//        
//        return b.toString();
//    }
//    
//
//    /**
//     * @return the noiDung
//     */
//    public String getNoiDung() {
//        return noiDung;
//    }
//
//    /**
//     * @param noiDung the noiDung to set
//     */
//    public void setNoiDung(String noiDung) {
//        this.noiDung = noiDung;
//    }
//
//    /**
//     * @return the phuongAn
//     */
//    public List<PhuongAn> getPhuongAn() {
//        return phuongAn;
//    }
//
//    /**
//     * @param phuongAn the phuongAn to set
//     * @throws java.lang.Exception
//     */
//    public void setPhuongAn(List<PhuongAn> phuongAn) throws Exception {
//        if (phuongAn.size() != SO_LUONG_PA)
//            throw new Exception("So luong phuong phai la 4");
//        this.phuongAn = phuongAn;
//    }
//
//    /**
//     * @return the dapAn
//     */
//    public PhuongAn getDapAn() {
//        return dapAn;
//    }
//
//    /**
//     * @param dapAn the dapAn to set
//     */
//    public void setDapAn(PhuongAn dapAn) {
//        this.dapAn = dapAn;
//    }
//}
