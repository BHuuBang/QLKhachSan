/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.luongDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TRAN VAN BO
 */
public class luongDAO {
     public ArrayList docdsluong ()
    {
         MySQLConnect ConnectData = new MySQLConnect();
         ArrayList <luongDTO> ds = new ArrayList <luongDTO> (); 
          try
          {
            String qry = "select * from `luong`";
            ConnectData.st=ConnectData.conn.createStatement();
          ConnectData.rs = ConnectData.st.executeQuery(qry);
             while(ConnectData.rs.next())
              {
                  luongDTO tk = new luongDTO();
                  tk.setManv(ConnectData.rs.getString(1));
                  tk.setLuongcoban(ConnectData.rs.getFloat(2));
                  tk.setTonggiolam(ConnectData.rs.getFloat(3));
                  tk.setTongluong(ConnectData.rs.getFloat(4));
                   tk.setTongngaylam(ConnectData.rs.getFloat(5));
                   tk.setThang(ConnectData.rs.getFloat(6));
                  ds.add(tk);
                           
              
               
             
          }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
        ConnectData.MySQLDisconnect();
        return ds;
    }
    
}
