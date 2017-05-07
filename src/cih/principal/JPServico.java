package cih.principal;

import cci.CIInterface;
import cci.util.Cenario;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JFrame;

public class JPServico extends javax.swing.JPanel {

    private CIInterface ciInterface;
    private JFrame pai;
    private int MODULO;
    
    public JPServico(JFrame pai, int MODULO, CIInterface ciInterface) {
        initComponents();
        this.ciInterface = ciInterface;
        this.pai = pai;
        this.MODULO = MODULO;
        this.setBorder(BorderFactory.createTitledBorder("Gerenciar Serviços"));
        ciInterface.iniciarServico(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAgendar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonConcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        jButtonAgendar.setText("Agendar");
        jButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgendarActionPerformed(evt);
            }
        });
        add(jButtonAgendar);

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        add(jButtonAlterar);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        add(jButtonConsultar);

        jButtonConcluir.setText("Concluir");
        jButtonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConcluirActionPerformed(evt);
            }
        });
        add(jButtonConcluir);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        add(jButtonCancelar);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgendarActionPerformed
        ciInterface.identificarModulo(pai, MODULO, Cenario.AGENDAR);
    }//GEN-LAST:event_jButtonAgendarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        ciInterface.identificarModulo(pai, MODULO, Cenario.ALTERAR);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        ciInterface.identificarModulo(pai, MODULO, Cenario.CONSULTAR);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConcluirActionPerformed
        ciInterface.identificarModulo(pai, MODULO, Cenario.CONCLUIR);
    }//GEN-LAST:event_jButtonConcluirActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        ciInterface.identificarModulo(pai, MODULO, Cenario.CANCELAR);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    public void setIconAgendar(Icon icone) {
        this.jButtonAgendar.setIcon(icone);
    }

    public void setIconAlterar(Icon icone) {
        this.jButtonAlterar.setIcon(icone);
    }

    public void setIconConcluir(Icon icone) {
        this.jButtonConcluir.setIcon(icone);
    }

    public void setIconConsultar(Icon icone) {
        this.jButtonConsultar.setIcon(icone);
    }

    public void setIconCancelar(Icon icone) {
        this.jButtonCancelar.setIcon(icone);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgendar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConcluir;
    private javax.swing.JButton jButtonConsultar;
    // End of variables declaration//GEN-END:variables
}
