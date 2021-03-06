package cih.tipoMaquina;

import cci.CIInterface;
import cci.util.Cenario;
import cdp.TipoMaquina;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class JDCadastroTipoMaquina extends javax.swing.JDialog {
    
    private int CENARIO;
    private CIInterface ciInterface;
    private TipoMaquina tipoMaquinaAtual;

    public JDCadastroTipoMaquina(Frame parent, boolean modal, int CENARIO, CIInterface ciInterface, TipoMaquina tipoMaquina) {
        super(parent, modal);
        initComponents();
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        this.ciInterface = ciInterface;
        this.tipoMaquinaAtual = tipoMaquina;
        this.CENARIO = CENARIO;
        identificarCenario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelTipoDeMaquina = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Tipo de Máquina");

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        jButtonConfirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonConfirmarKeyPressed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setMaximumSize(new java.awt.Dimension(79, 23));
        jButtonLimpar.setMinimumSize(new java.awt.Dimension(79, 23));
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(79, 23));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        jButtonLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonLimparKeyPressed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setMaximumSize(new java.awt.Dimension(79, 23));
        jButtonCancelar.setMinimumSize(new java.awt.Dimension(79, 23));
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(79, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonConfirmar)
                .addGap(29, 29, 29)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTipoDeMaquina.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jLabelNome.setText("Nome:");

        jLabelDescricao.setText("Descrição:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout jPanelTipoDeMaquinaLayout = new javax.swing.GroupLayout(jPanelTipoDeMaquina);
        jPanelTipoDeMaquina.setLayout(jPanelTipoDeMaquinaLayout);
        jPanelTipoDeMaquinaLayout.setHorizontalGroup(
            jPanelTipoDeMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTipoDeMaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoDeMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTipoDeMaquinaLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelTipoDeMaquinaLayout.createSequentialGroup()
                        .addComponent(jLabelDescricao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTipoDeMaquinaLayout.setVerticalGroup(
            jPanelTipoDeMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoDeMaquinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoDeMaquinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescricao)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTipoDeMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanelTipoDeMaquina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextAreaDescricao.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        String nome = jTextFieldNome.getText();
        String descricao = jTextAreaDescricao.getText();
        
        try {
            switch (CENARIO) {
                case Cenario.CADASTRAR:         
                    validarCampos(nome, descricao);
                    cadastrarTipoMaquina(nome, descricao); 
                    break;
                    
                case Cenario.CONSULTAR:
                    this.dispose(); break;
                    
                case Cenario.ALTERAR: 
                    validarCampos(nome, descricao);
                    alterarTipoMaquina(nome, descricao);
                    break;
                    
                case Cenario.EXCLUIR:
                    excluirTipoMaquina();
                    break;
                    
                default: 
                    break;
            }
        } catch (Exception e) {
            ciInterface.getCiMensagem().exibirMensagemErro(this, e.getMessage());
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonConfirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonConfirmarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonConfirmarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonConfirmarKeyPressed

    private void jButtonLimparKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonLimparKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jButtonLimparActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonLimparKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void cadastrarTipoMaquina(String nome, String descricao) {
        ciInterface.getCiTipoMaquina().cadastrarTipoMaquina(nome, descricao);
        jButtonConfirmar.setEnabled(false);
        jButtonCancelar.setText("Sair");
        modoSomenteLeitura(true);
    }
    
    private void alterarTipoMaquina(String nome, String descricao) {
        ciInterface.getCiTipoMaquina().alterarTipoMaquina(tipoMaquinaAtual, nome, descricao);
        jButtonConfirmar.setEnabled(false);
        jButtonCancelar.setText("Sair");
        modoSomenteLeitura(true);
    }
    
    private void excluirTipoMaquina() {
        int confirmacao = ciInterface.getCiMensagem().exibirMensagemConfirmacao(this, "Confirmar Exclusão ?");
        if (confirmacao == 0) {
            ciInterface.getCiTipoMaquina().excluirTipoMaquina(tipoMaquinaAtual);
            this.dispose();
        }
    }
    
    private void identificarCenario() {
        switch ( CENARIO ) {
            
            case Cenario.CADASTRAR:
                break;
                
            case Cenario.ALTERAR:
                setTitle("Alterar Tipo de Máquina");
                setarCamposComInstancia(tipoMaquinaAtual);
                jButtonConfirmar.setText("Alterar");
                break;
                
            case Cenario.CONSULTAR:
                setTitle("Consultar Tipo de Máquina");
                modoSomenteLeitura(true);
                jButtonConfirmar.setEnabled(false);
                jButtonCancelar.setText("Sair");
                setarCamposComInstancia(tipoMaquinaAtual);
                break;
                
            default:
                setTitle("Excluir Tipo de Máquina");
                modoSomenteLeitura(true);
                jButtonConfirmar.setText("Excluir");
                setarCamposComInstancia(tipoMaquinaAtual);
                break;
        }
    }
    
    private void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNome.setEditable(condicao);
        jTextAreaDescricao.setEditable(condicao);
        jButtonLimpar.setEnabled(condicao);
    }
    
    private void validarCampos(String nome, String descricao) throws Exception {
        if (nome.equals("") || descricao.equals(""))
            throw new Exception("Verifique se todos os campos estão preenchidos!");
    }
    
    private void setarCamposComInstancia(TipoMaquina tipoMaquina) {
        jTextFieldNome.setText(tipoMaquina.getNome());
        jTextAreaDescricao.setText(tipoMaquina.getDescricao());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelTipoDeMaquina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
