/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author TRAN VAN BO
 */
public class luongDTO {
    public String manv;
    public float luongcoban,tonggiolam,tongngaylam,tongluong,thang;
    public luongDTO() {
    }

    public luongDTO(String manv, float luongcoban, float tonggiolam, float tongngaylam, float tongluong, float thang) {
        this.manv = manv;
        this.luongcoban = luongcoban;
        this.tonggiolam = tonggiolam;
        this.tongngaylam = tongngaylam;
        this.tongluong = tongluong;
        this.thang = thang;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    public float getTonggiolam() {
        return tonggiolam;
    }

    public void setTonggiolam(float tonggiolam) {
        this.tonggiolam = tonggiolam;
    }

    public float getTongngaylam() {
        return tongngaylam;
    }

    public void setTongngaylam(float tongngaylam) {
        this.tongngaylam = tongngaylam;
    }

    public float getTongluong() {
        return tongluong;
    }

    public void setTongluong(float tongluong) {
        this.tongluong = tongluong;
    }

    public float getThang() {
        return thang;
    }

    public void setThang(float thang) {
        this.thang = thang;
    }
    
}
