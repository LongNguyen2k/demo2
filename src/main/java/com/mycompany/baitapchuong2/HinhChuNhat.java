/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.baitapchuong2;

/**
 *
 * @author Windows 10
 */
public class HinhChuNhat {

    public Diem getTrenTrai() {
        return trenTrai;
    }

    public void setTrenTrai(Diem trenTrai) {
        this.trenTrai = trenTrai;
    }

    public Diem getDuoiPhai() {
        return duoiPhai;
    }

    public void setDuoiPhai(Diem duoiPhai) {
        this.duoiPhai = duoiPhai;
    }
    private Diem trenTrai;
    private Diem duoiPhai;
    
    public HinhChuNhat(Diem trenTrai , Diem duoiPhai ) throws Exception
    {
        if(trenTrai.GethoanhDo() < duoiPhai.GethoanhDo() && trenTrai.GettungDo() > duoiPhai.GettungDo())
        {
            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        }
        else
            throw new Exception(" Du Lieu Dau vao khong hop le \n");
    }
    public void hienThi()
    {
        StringBuilder s = new StringBuilder();
        s.append(" Hinh Chu Nhat Co dang \n");
        s.append(String.format("( %.1f , %.1f)", this.trenTrai.GethoanhDo() , this.trenTrai.GettungDo()));
        s.append(String.format("\n( %.1f , %.1f)", this.duoiPhai.GethoanhDo() , this.duoiPhai.GettungDo()));
        s.append(String.format("\nDien Tich : %.1f \n", this.tinhDienTich()));
        s.append(String.format("Chu Vi : %.1f \n" , this.tinhChuVi()));
        
        System.out.println(s);
        
    }
    public double tinhDienTich()
    {
        return  ( this.duoiPhai.GethoanhDo() - this.trenTrai.GethoanhDo() ) * ( this.trenTrai.GettungDo() - this.duoiPhai.GettungDo() );
    }
    public double tinhChuVi()
    {
        return (( this.duoiPhai.GethoanhDo() - this.trenTrai.GethoanhDo() ) + ( this.trenTrai.GettungDo() - this.duoiPhai.GettungDo() )) *2;
    }
}
