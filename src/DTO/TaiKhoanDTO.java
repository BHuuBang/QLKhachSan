/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Trang
 */
public class TaiKhoanDTO {
    public String manv, tentaikhoan, matkhau;
    public boolean trangthai;
    public TaiKhoanDTO(){}
    
    public TaiKhoanDTO(String manv, String tentaikhoan, String matkhau, boolean trangthai){
        this.manv=manv;
        this.tentaikhoan= tentaikhoan;
        this.matkhau=matkhau;
        this.trangthai= trangthai;
    }
    public String getManhanvien(){
        return manv;
    }
    public void setManhanvien(String manv){
        this.manv = manv;
    }
    public String getTentaikhoan(){
        return tentaikhoan;
    }
    public void setTentaikhoan(String tentaikhoan){
        this.tentaikhoan = tentaikhoan;
    }
    public boolean getTrangthai(){
        return trangthai;
    }
    public void setTrangthai(boolean trangthai){
        this.trangthai = trangthai;
    
    }
    public String getMatkhau(){
        return matkhau;
    }
    public void setMatkhau(String matkhau){
        this.matkhau = matkhau;
    }
    
}
