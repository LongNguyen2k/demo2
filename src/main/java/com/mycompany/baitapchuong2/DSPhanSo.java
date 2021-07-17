/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class DSPhanSo {
    private ArrayList<PhanSo> ds = new ArrayList<>();
    
    
    public ArrayList<PhanSo> getDS()
    {
        return ds;
    }
    public void setDS( ArrayList<PhanSo> ds)
    {
        this.ds = ds;
    }
    public void themPhanSo( PhanSo ps)
    {
        this.ds.add(ps);
    }
    public void themPhanSo(Scanner scanner)
    {
        PhanSo ps = new PhanSo();
        ps.nhapPhanSo(scanner);
        this.themPhanSo(ps);
    }
    public void xoaPhanSo(int so)
    {
        this.ds.remove(so);
    }
    public void hienThiDS()
    {
        for( PhanSo ps: this.ds)
        {
            ps.hienThi();
            System.out.println(" =============");
        }
    }
    public PhanSo tinhTong()
    {   PhanSo kq = new PhanSo();
        for( PhanSo ps : this.ds)
        {
             kq = kq.congPhanSo(ps);
        }
        return kq;
    }
    public void sapXep()
    {
        this.ds.sort( ( PhanSo ps1 , PhanSo ps2)->
        {
            //  có 2 kiểu trả về nếu là số dương thì ps1 > ps2 và số âm thì là ps1 < ps2
            double kq1 =  (ps1.getTuSo()/ps1.getMauSo() );
            double kq2 =  (ps2.getTuSo()/ps2.getMauSo()) ;
            if( kq1 > kq2)
                return -1;
            else if( kq1 < kq2)
                return 1;
            return 0 ;
        });
    }
}
