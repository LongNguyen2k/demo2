/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapChuong2OnLai;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class QuanLyHocVien {
    private ArrayList<HocVien> ds = new ArrayList<>();
    
    public void themHocVien(HocVien h )
    {
        this.ds.add(h);
    }
    public void xoaHocVien(HocVien h)
    {
        this.ds.remove(h);
    }
    // tim kiem theo ten hay Ma So Que Quan 
    public ArrayList<HocVien> timKiem(String hoTenQueQuan)
    {   ArrayList<HocVien> kq  = new ArrayList<>();
        hoTenQueQuan = hoTenQueQuan.toLowerCase();
        for(HocVien h : this.ds )
        { 
            if( h.getHoTen().toLowerCase().contains(hoTenQueQuan) == true)
                kq.add(h);
        }
        return kq;
    }

    @Override
    public String toString() {
        StringBuilder kq = new StringBuilder();
        String s1;
       
        for(HocVien h : this.ds)
        {   s1 = h.toString();
           
            
           kq.append(s1);
        }
        return kq.toString();
    }
    
    public void sapXep()
    {
        this.ds.sort((HocVien hv1 ,HocVien  hv2) ->{
            double tb1 = hv1.tinhDiemTrungBinh();
            double tb2 = hv2.tinhDiemTrungBinh();
            return tb1 > tb2 ?1 :(tb1 < tb2 ? -1 : 0 );
            
        });
    }
    public void nhapDiem()
    { 
        Scanner scanner   = new Scanner(System.in);
        for(HocVien h : this.ds)
        {   
            System.out.printf("Nhap vao diem cua Sinh Vien thu %d \n ",h.getMaHocVien());
            h.nhapDiem(scanner);
        }
    }
}
