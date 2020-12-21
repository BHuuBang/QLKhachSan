/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.luongDAO;
import DTO.luongDTO;
import java.util.ArrayList;

/**
 *
 * @author TRAN VAN BO
 */
public class luongBUS {
        public static ArrayList<luongDTO> dsluong;  
   public luongBUS() {
    }

    public void docDSluong() {
        luongDAO data = new luongDAO();
        if (dsluong == null) {
            dsluong = new ArrayList<luongDTO>();           
        }
        dsluong = data.docdsluong();
    }
    
     public luongDTO getInfoRow(String Ma) {
        luongDTO nv= new luongDTO();
        docDSluong();
        for (luongDTO tempds : luongBUS.dsluong) {
            if (tempds.getManv().equals(Ma)) {
                nv = tempds;
                break;
            }
        }
        return nv;
         }
}
