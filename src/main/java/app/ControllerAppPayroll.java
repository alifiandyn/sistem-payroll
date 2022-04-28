/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alif
 */
public class ControllerAppPayroll {
    
    private List<ModelGajiPegawai> komponenGaji;
    private ViewAppPayroll view;
    
    public ControllerAppPayroll(){
        initModel();
        initView();
    }
    
    public void show(){
        try{
        for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
            }
        }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(ViewAppPayroll.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(InstantiationException ex){
            java.util.logging.Logger.getLogger(ViewAppPayroll.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(IllegalAccessException ex){
            java.util.logging.Logger.getLogger(ViewAppPayroll.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }catch(javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(ViewAppPayroll.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPenjualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               view.setVisible(true);
            }
        });
    }
    
    private void initModel() {
        komponenGaji = new ArrayList<ModelGajiPegawai>();
        komponenGaji.add(new ModelGajiPegawai("Gaji Pokok"));
        komponenGaji.add(new ModelGajiPegawai("Tunjangan Transport"));
        komponenGaji.add(new ModelGajiPegawai("Tunjangan Anak"));
        komponenGaji.add(new ModelGajiPegawai("Tunjangan Kesehatan"));
        komponenGaji.add(new ModelGajiPegawai("Upah Lembur"));
        komponenGaji.add(new ModelGajiPegawai("Lain-lain"));
    }

    private void initView(){
        view = new ViewAppPayroll();
        view.initComboBox(komponenGaji);
        view.initBtnSimpan(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent ae){
                String message = view.getData();
                JOptionPane.showMessageDialog(view, message);
            }
        });
//        Gagal pake cara MVC
    }
}
