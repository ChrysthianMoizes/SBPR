package cih;

import cci.util.Crud;
import cci.CIInterface;
import javax.swing.Icon;
import javax.swing.JFrame;

public class JPCrud extends javax.swing.JPanel {
    private JFrame pai;
    private int codInicio;
    private CIInterface ciInterface;
   
    public JPCrud(JFrame pai, int inicio, CIInterface ciInterface) {
        initComponents();
        this.pai = pai;
        this.codInicio = inicio;
        this.ciInterface = ciInterface;
        this.ciInterface.iniciarCrud(codInicio, this);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCadastrar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        add(jButtonCadastrar);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        add(jButtonAlterar);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        add(jButtonConsultar);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        add(jButtonExcluir);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
       ciInterface.identificarInicio(pai, codInicio, Crud.EXCLUIR);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
       ciInterface.identificarInicio(pai, codInicio, Crud.CADASTRAR);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       ciInterface.identificarInicio(pai, codInicio, Crud.ALTERAR);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
       ciInterface.identificarInicio(pai, codInicio, Crud.CONSULTAR);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    public void setIconAlterar(Icon icone) {
        this.jButtonAlterar.setIcon(icone);
    }

    public void setIconCadastrar(Icon icone) {
        this.jButtonCadastrar.setIcon(icone);
    }

    public void setIconConsultar(Icon icone) {
        this.jButtonConsultar.setIcon(icone);
    }

    public void setIconExcluir(Icon icone) {
        this.jButtonExcluir.setIcon(icone);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    // End of variables declaration//GEN-END:variables

}
