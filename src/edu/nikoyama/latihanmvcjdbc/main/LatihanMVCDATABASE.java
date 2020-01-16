/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.nikoyama.latihanmvcjdbc.main;

import edu.nikoyama.latihanmvcjdbc.database.KingBarberShopDatabase;
import edu.nikoyama.latihanmvcjdbc.entity.Pelanggan;
import edu.nikoyama.latihanmvcjdbc.error.PelangganException;
import edu.nikoyama.latihanmvcjdbc.service.PelangganDao;
import edu.nikoyama.latihanmvcjdbc.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : 
 */
public class LatihanMVCDATABASE {

    public static void main(String[] args) throws SQLException, PelangganException {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(LatihanMVCDATABASE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

}
