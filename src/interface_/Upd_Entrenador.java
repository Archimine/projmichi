/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interface_;

import karate_project.CConexion;
import karate_project.Entrenador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevin
 */
public class Upd_Entrenador extends javax.swing.JFrame {

    /**
     * Creates new form Upd_Entrenador
     */
    public Upd_Entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public int ID;

    public void getID(int a) {
        ID = a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelR_Ent = new javax.swing.JLabel();
        jLabelIng_Horario = new javax.swing.JLabel();
        jLabelIng_Cedula1 = new javax.swing.JLabel();
        jLabelIng_Cedula2 = new javax.swing.JLabel();
        Ing_Horario_up = new javax.swing.JTextField();
        Ing_Cedula_up = new javax.swing.JTextField();
        Ing_Sueldo_up = new javax.swing.JTextField();
        Regresar3 = new javax.swing.JButton();
        Ing_Act = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelR_Ent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelR_Ent.setText("Actualizar Entrenadores");
        jPanelFondo.add(jLabelR_Ent, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 33));

        jLabelIng_Horario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Horario.setText("Horario");
        jPanelFondo.add(jLabelIng_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabelIng_Cedula1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Cedula1.setText("Ingrese Cedula");
        jPanelFondo.add(jLabelIng_Cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabelIng_Cedula2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Cedula2.setText("Ingrese Sueldo");
        jPanelFondo.add(jLabelIng_Cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));
        jPanelFondo.add(Ing_Horario_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 210, -1));
        jPanelFondo.add(Ing_Cedula_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, -1));
        jPanelFondo.add(Ing_Sueldo_up, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 210, -1));

        Regresar3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Regresar3.setText("Regresar");
        Regresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar3ActionPerformed(evt);
            }
        });
        jPanelFondo.add(Regresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        Ing_Act.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Ing_Act.setText("Actualizar");
        Ing_Act.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_ActActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_Act, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        getContentPane().add(jPanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ing_ActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_ActActionPerformed

        
            int Cedula = Integer.parseInt(Ing_Cedula_up.getText());
            double Sueldo = Double.parseDouble(Ing_Sueldo_up.getText());
            String Horario = Ing_Horario_up.getText();
            Entrenador ent = new Entrenador(ID, Cedula, Sueldo, Horario);
            ent.ActualizarEntrenador();
        
    }//GEN-LAST:event_Ing_ActActionPerformed

    private void Regresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar3ActionPerformed
        Menu_Principal men = new Menu_Principal();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Regresar3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(Upd_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Upd_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Upd_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Upd_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Upd_Entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ing_Act;
    private javax.swing.JTextField Ing_Cedula_up;
    private javax.swing.JTextField Ing_Horario_up;
    private javax.swing.JTextField Ing_Sueldo_up;
    private javax.swing.JButton Regresar3;
    private javax.swing.JLabel jLabelIng_Cedula1;
    private javax.swing.JLabel jLabelIng_Cedula2;
    private javax.swing.JLabel jLabelIng_Horario;
    private javax.swing.JLabel jLabelR_Ent;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
