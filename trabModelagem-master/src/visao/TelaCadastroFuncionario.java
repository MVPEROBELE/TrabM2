/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author Miih Rantre
 */
public class TelaCadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
     String nome;
    String cpf;
    String cargo;
    String login;
    String senha;
 
    public TelaCadastroFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoCPFF = new javax.swing.JPasswordField();
        CampoNomeF = new javax.swing.JTextField();
        TCPFF = new javax.swing.JLabel();
        TNomeF = new javax.swing.JLabel();
        BotaoSalvar = new javax.swing.JButton();
        Formulario = new javax.swing.JLabel();
        CampoPlanoF = new javax.swing.JTextField();
        TCargoF = new javax.swing.JLabel();
        CampoLoginF = new javax.swing.JTextField();
        TLoginF = new javax.swing.JLabel();
        CampoSenhaF = new javax.swing.JTextField();
        TSenhaF = new javax.swing.JLabel();
        BotaoVoltar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CampoCPFF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoCPFFKeyReleased(evt);
            }
        });
        getContentPane().add(CampoCPFF);
        CampoCPFF.setBounds(100, 140, 240, 20);

        CampoNomeF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNomeFActionPerformed(evt);
            }
        });
        CampoNomeF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoNomeFKeyReleased(evt);
            }
        });
        getContentPane().add(CampoNomeF);
        CampoNomeF.setBounds(100, 60, 240, 20);

        TCPFF.setText("CPF:");
        getContentPane().add(TCPFF);
        TCPFF.setBounds(60, 140, 23, 14);

        TNomeF.setText("Nome Completo:");
        getContentPane().add(TNomeF);
        TNomeF.setBounds(10, 60, 90, 14);

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoSalvarMouseClicked(evt);
            }
        });
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });
        BotaoSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BotaoSalvarKeyReleased(evt);
            }
        });
        getContentPane().add(BotaoSalvar);
        BotaoSalvar.setBounds(280, 270, 110, 23);

        Formulario.setText("Formulário de Funcionario");
        getContentPane().add(Formulario);
        Formulario.setBounds(30, 20, 200, 14);

        CampoPlanoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPlanoFActionPerformed(evt);
            }
        });
        CampoPlanoF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoPlanoFKeyReleased(evt);
            }
        });
        getContentPane().add(CampoPlanoF);
        CampoPlanoF.setBounds(100, 100, 240, 20);

        TCargoF.setText("Cargo:");
        getContentPane().add(TCargoF);
        TCargoF.setBounds(50, 100, 90, 14);

        CampoLoginF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoLoginFActionPerformed(evt);
            }
        });
        CampoLoginF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoLoginFKeyReleased(evt);
            }
        });
        getContentPane().add(CampoLoginF);
        CampoLoginF.setBounds(100, 170, 240, 20);

        TLoginF.setText("Login:");
        getContentPane().add(TLoginF);
        TLoginF.setBounds(50, 170, 50, 14);

        CampoSenhaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSenhaFActionPerformed(evt);
            }
        });
        CampoSenhaF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoSenhaFKeyReleased(evt);
            }
        });
        getContentPane().add(CampoSenhaF);
        CampoSenhaF.setBounds(100, 200, 240, 20);

        TSenhaF.setText("Senha:");
        getContentPane().add(TSenhaF);
        TSenhaF.setBounds(50, 200, 90, 14);

        BotaoVoltar.setText("Voltar");
        BotaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoVoltarMouseClicked(evt);
            }
        });
        BotaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVoltarActionPerformed(evt);
            }
        });
        BotaoVoltar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BotaoVoltarKeyReleased(evt);
            }
        });
        getContentPane().add(BotaoVoltar);
        BotaoVoltar.setBounds(30, 270, 110, 23);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(-200, -120, 620, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCPFFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCPFFKeyReleased
        cpf = CampoCPFF.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCPFFKeyReleased

    private void CampoNomeFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNomeFActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeFActionPerformed

    private void CampoNomeFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNomeFKeyReleased

        nome = CampoNomeF.getText();      // TODO add your handling code here:
    }//GEN-LAST:event_CampoNomeFKeyReleased

    private void BotaoSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoSalvarMouseClicked
        // TODO add your handling code here:

        Atendente at = new Atendente();

       

    }//GEN-LAST:event_BotaoSalvarMouseClicked

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoSalvarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoSalvarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSalvarKeyReleased

    private void CampoPlanoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPlanoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPlanoFActionPerformed

    private void CampoPlanoFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPlanoFKeyReleased
        cargo = CampoPlanoF.getText();
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPlanoFKeyReleased

    private void CampoLoginFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoLoginFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoLoginFActionPerformed

    private void CampoLoginFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoLoginFKeyReleased
        login = CampoLoginF.getText();         // TODO add your handling code here:
    }//GEN-LAST:event_CampoLoginFKeyReleased

    private void CampoSenhaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSenhaFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSenhaFActionPerformed

    private void CampoSenhaFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoSenhaFKeyReleased
        // TODO add your handling code here:
        senha = CampoSenhaF.getText(); 
    }//GEN-LAST:event_CampoSenhaFKeyReleased

    private void BotaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoVoltarMouseClicked
        // TODO add your handling code here:

  this.setVisible(false);

    }//GEN-LAST:event_BotaoVoltarMouseClicked

    private void BotaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarActionPerformed

    private void BotaoVoltarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoVoltarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoVoltarKeyReleased

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
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JButton BotaoVoltar;
    private javax.swing.JPasswordField CampoCPFF;
    private javax.swing.JTextField CampoLoginF;
    private javax.swing.JTextField CampoNomeF;
    private javax.swing.JTextField CampoPlanoF;
    private javax.swing.JTextField CampoSenhaF;
    private javax.swing.JLabel Formulario;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel TCPFF;
    private javax.swing.JLabel TCargoF;
    private javax.swing.JLabel TLoginF;
    private javax.swing.JLabel TNomeF;
    private javax.swing.JLabel TSenhaF;
    // End of variables declaration//GEN-END:variables
}
