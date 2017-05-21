package cih.tipoServico;

import javax.swing.ImageIcon;
import cci.CIInterface;
import cci.util.Cenario;
import cdp.TipoMaquina;
import cdp.TipoServico;
import javax.swing.JOptionPane;

public class JDCadastroTipoServico extends javax.swing.JDialog {
    
    private CIInterface ciInterface;
    private int CENARIO;
    private TipoServico tipoServicoAtual;
    
    public JDCadastroTipoServico(java.awt.Frame FramePai, boolean modal, CIInterface ciInterface, int CENARIO, TipoServico tipoServicoInformado) {
        super(FramePai, modal);
        this.ciInterface = ciInterface;
        this.CENARIO = CENARIO;
        this.tipoServicoAtual = tipoServicoInformado;
        initComponents();
        this.setLocationRelativeTo(FramePai);
        ImageIcon icone = ciInterface.setarIconesJanela();
        setIconImage(icone.getImage());
        identificarCenario();
    }
    
    public void identificarCenario() {
        switch ( CENARIO ) {
            case Cenario.CADASTRAR:
                break;
            case Cenario.ALTERAR:
                break;
            case Cenario.CONSULTAR:
                setTitle("Consulta de Tipo de Serviço");
                modoSomenteLeitura(true);
                setarCamposComInstancia(tipoServicoAtual);
                jButtonConfirmar.setEnabled(false);
                break;
            case Cenario.EXCLUIR:
                setTitle("Exclusão de Tipo de Serviço");
                modoSomenteLeitura(true);
                setarCamposComInstancia(tipoServicoAtual);
                break;
            default: //CENARIO DESCONHECIDO
                break;
        }
    }
    
    public void modoSomenteLeitura(boolean condicao) {
        condicao = !condicao;
        jTextFieldNome.setEditable(condicao);
        jTextFieldValorHora.setEditable(condicao);
        jTextAreaDescricao.setEditable(condicao);
        jButtonLimpar.setEnabled(condicao);
    }
    
    public void setarCamposComInstancia(TipoServico tipoServico) {
        jTextFieldNome.setText(tipoServico.getNome());
        jTextFieldValorHora.setText( String.valueOf(tipoServico.getValor_hr()) );
        jTextAreaDescricao.setText(tipoServico.getDescricao());
        if (tipoServico.getTipoMaquina() != null)
            jTextFieldTipoMaquina.setText( tipoServico.getTipoMaquina().getNome() );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTipoServico = new javax.swing.JPanel();
        jLabelResponsavel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNomePropriedade = new javax.swing.JLabel();
        jLabelValorHora = new javax.swing.JLabel();
        jTextFieldValorHora = new javax.swing.JTextField();
        jLabelTipoMaquina = new javax.swing.JLabel();
        jTextFieldTipoMaquina = new javax.swing.JTextField();
        jButtonSelecionarTipoMaquina = new javax.swing.JButton();
        jPanelRodape = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Tipo de Serviço");
        setResizable(false);

        jPanelTipoServico.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jLabelResponsavel.setText("Nome:");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabelNomePropriedade.setText("Descrição:");

        jLabelValorHora.setText("Valor Hora:");

        jLabelTipoMaquina.setText("Tipo de máquina:");

        jTextFieldTipoMaquina.setEditable(false);

        jButtonSelecionarTipoMaquina.setText("...");
        jButtonSelecionarTipoMaquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarTipoMaquinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoServicoLayout = new javax.swing.GroupLayout(jPanelTipoServico);
        jPanelTipoServico.setLayout(jPanelTipoServicoLayout);
        jPanelTipoServicoLayout.setHorizontalGroup(
            jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                        .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                                .addComponent(jLabelTipoMaquina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSelecionarTipoMaquina))
                            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelResponsavel)
                                    .addComponent(jLabelValorHora)
                                    .addComponent(jLabelNomePropriedade))
                                .addGap(38, 38, 38)
                                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTipoServicoLayout.setVerticalGroup(
            jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoServicoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResponsavel)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorHora)
                    .addComponent(jTextFieldValorHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTipoServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipoMaquina)
                    .addComponent(jTextFieldTipoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarTipoMaquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabelNomePropriedade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelRodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setPreferredSize(new java.awt.Dimension(57, 23));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConfirmar.setText("Confirmar");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setPreferredSize(new java.awt.Dimension(57, 23));

        javax.swing.GroupLayout jPanelRodapeLayout = new javax.swing.GroupLayout(jPanelRodape);
        jPanelRodape.setLayout(jPanelRodapeLayout);
        jPanelRodapeLayout.setHorizontalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRodapeLayout.setVerticalGroup(
            jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConfirmar)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTipoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        
        String nome = jTextFieldNome.getText();
        String valor = jTextFieldValorHora.getText();
        String descricao = jTextAreaDescricao.getText();
        boolean respostaOperacao;
        try {
            switch (CENARIO) {
                case Cenario.CADASTRAR:
                    validarCampos(nome, valor, descricao);
                    respostaOperacao = ciInterface.getCiTipoServico().cadastrarTipoServico(nome, valor, descricao);
                    if (respostaOperacao) {
                        jButtonConfirmar.setEnabled(false);
                        jButtonCancelar.setText("Sair");
                    }
                    break;
                case Cenario.EXCLUIR:
                    int confirmacao = JOptionPane.showConfirmDialog(this, "Confirmar Exclusão ?", "Excluir", JOptionPane.YES_NO_OPTION);
                    if ( confirmacao == 0 ) {
                        respostaOperacao = ciInterface.getCiTipoServico().excluirTipoServico(tipoServicoAtual);
                        if(respostaOperacao)
                            this.dispose();
                    }
                    break;
                
                default:
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

    }//GEN-LAST:event_jButtonConfirmarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSelecionarTipoMaquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarTipoMaquinaActionPerformed
        JOptionPane.showMessageDialog(this, "Crystian vai implementar essa lógica no CADASTRAR.");
    }//GEN-LAST:event_jButtonSelecionarTipoMaquinaActionPerformed

    public void validarCampos(String nome, String valor, String descricao) throws Exception {
        
        if(nome.equals("") || (valor.equals("")) || (descricao.equals(""))){
            throw new Exception("Verifique se todos os campos estão preenchidos!");
        }    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSelecionarTipoMaquina;
    private javax.swing.JLabel jLabelNomePropriedade;
    private javax.swing.JLabel jLabelResponsavel;
    private javax.swing.JLabel jLabelTipoMaquina;
    private javax.swing.JLabel jLabelValorHora;
    private javax.swing.JPanel jPanelRodape;
    private javax.swing.JPanel jPanelTipoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTipoMaquina;
    private javax.swing.JTextField jTextFieldValorHora;
    // End of variables declaration//GEN-END:variables
}
