/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class ThietBi implements Serializable{
    public String maTB;
    public String tenTB;
    public String loaiTB;
    public int soLuongTB;
    public String hangSX;
    public float namSX;

    public ThietBi(String maTB, String tenTB, String loaiTB, int soLuongTB, String hangSX, float namSX) {
        this.maTB = maTB;
        this.tenTB = tenTB;
        this.loaiTB = loaiTB;
        this.soLuongTB = soLuongTB;
        this.hangSX = hangSX;
        this.namSX = namSX;
    }

    public ThietBi(String tenTB, String loaiTB, int soLuongTB, String hangSX, float namSX) {
        this.tenTB = tenTB;
        this.loaiTB = loaiTB;
        this.soLuongTB = soLuongTB;
        this.hangSX = hangSX;
        this.namSX = namSX;
    }
    
    public ThietBi() {
    }

    public String getMaTB() {
        return maTB;
    }

    public String getTenTB() {
        return tenTB;
    }

    public String getLoaiTB() {
        return loaiTB;
    }

    public int getSoLuongTB() {
        return soLuongTB;
    }

    public String getHangSX() {
        return hangSX;
    }

    public float getNamSX() {
        return namSX;
    }

    public void setMaTB(String maTB) {
        this.maTB = maTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public void setLoaiTB(String loaiTB) {
        this.loaiTB = loaiTB;
    }

    public void setSoLuongTB(int soLuongTB) {
        this.soLuongTB = soLuongTB;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void setNamSX(float namSX) {
        this.namSX = namSX;
    }
    
}
