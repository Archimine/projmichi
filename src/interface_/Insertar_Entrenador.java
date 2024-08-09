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
public class Insertar_Entrenador extends javax.swing.JFrame {

    /**
     * Creates new form Insertar_Entrenador
     */
    public Insertar_Entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelIng_ID = new javax.swing.JLabel();
        jLabelIng_Horario = new javax.swing.JLabel();
        jLabelIng_Cedula1 = new javax.swing.JLabel();
        jLabelIng_Cedula2 = new javax.swing.JLabel();
        Ing_Horario = new javax.swing.JTextField();
        Ing_ID = new javax.swing.JTextField();
        Ing_Cedula = new javax.swing.JTextField();
        Ing_Sueldo = new javax.swing.JTextField();
        Ing_Entre = new javax.swing.JButton();
        Regresar3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelR_Ent.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabelR_Ent.setText("Registro de Entrenadores");
        jPanelFondo.add(jLabelR_Ent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 33));

        jLabelIng_ID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_ID.setText("Ingrese ID");
        jPanelFondo.add(jLabelIng_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabelIng_Horario.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Horario.setText("Horario");
        jPanelFondo.add(jLabelIng_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabelIng_Cedula1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Cedula1.setText("Ingrese Cedula");
        jPanelFondo.add(jLabelIng_Cedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabelIng_Cedula2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabelIng_Cedula2.setText("Ingrese Sueldo");
        jPanelFondo.add(jLabelIng_Cedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        Ing_Horario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_HorarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 210, -1));

        Ing_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_IDActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 210, -1));

        Ing_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_CedulaActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 210, -1));

        Ing_Sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_SueldoActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, -1));

        Ing_Entre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Ing_Entre.setText("Ingresar");
        Ing_Entre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ing_EntreActionPerformed(evt);
            }
        });
        jPanelFondo.add(Ing_Entre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        Regresar3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Regresar3.setText("Regresar");
        Regresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar3ActionPerformed(evt);
            }
        });
        jPanelFondo.add(Regresar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(622, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ing_HorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_HorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ing_HorarioActionPerformed

    private void Ing_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ing_IDActionPerformed

    private void Ing_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ing_CedulaActionPerformed

    private void Ing_SueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_SueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ing_SueldoActionPerformed

    private void Ing_EntreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ing_EntreActionPerformed

        int ID = Integer.parseInt(Ing_ID.getText());
        int Cedula = Integer.parseInt(Ing_Cedula.getText());
        double Sueldo = Double.parseDouble(Ing_Sueldo.getText());
        String Horario = Ing_Horario.getText();
        Entrenador ent = new Entrenador(ID, Cedula, Sueldo, Horario);
        ent.InsertarEntrenador();

    }//GEN-LAST:event_Ing_EntreActionPerformed

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
            java.util.logging.Logger.getLogger(Insertar_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertar_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertar_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertar_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertar_Entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ing_Cedula;
    private javax.swing.JButton Ing_Entre;
    private javax.swing.JTextField Ing_Horario;
    private javax.swing.JTextField Ing_ID;
    private javax.swing.JTextField Ing_Sueldo;
    private javax.swing.JButton Regresar3;
    private javax.swing.JLabel jLabelIng_Cedula1;
    private javax.swing.JLabel jLabelIng_Cedula2;
    private javax.swing.JLabel jLabelIng_Horario;
    private javax.swing.JLabel jLabelIng_ID;
    private javax.swing.JLabel jLabelR_Ent;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
