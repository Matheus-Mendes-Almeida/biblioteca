package view;

import javax.swing.JOptionPane;
import model.Cliente;


public class TelaAdicionarCliente extends javax.swing.JFrame {

    public static TelaAdicionarCliente tela;
    
    public TelaAdicionarCliente() {
        initComponents();
    }
    
    public static TelaAdicionarCliente getTela() {
        if(tela == null)
            tela = new TelaAdicionarCliente();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JLabel();
        ctLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        ctSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Cadastrar Cliente");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtTitulo)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNome.setText("Nome");

        txtLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtLogin.setText("Login");

        txtSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSenha.setText("Senha");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctNome)
                    .addComponent(txtSenha)
                    .addComponent(txtLogin)
                    .addComponent(txtNome)
                    .addComponent(ctLogin)
                    .addComponent(ctSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(1, 1, 1)))
                .addComponent(txtSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        boolean loginNaoUtilizado = true;
        
        for(Cliente c: Biblioteca.clientes){
            if(c.getLogin().equals(ctLogin.getText())){
                loginNaoUtilizado = false;
                break;
            }
        }
        
        if(loginNaoUtilizado && !ctNome.getText().equals("") && !new String(ctSenha.getPassword()).trim().equals("")){
            Biblioteca.clientes.add(new Cliente(ctNome.getText(), ctLogin.getText(), new String(ctSenha.getPassword()).trim()));
            TelaDeGerenciamentoDeClientes.getTela().gerarTabela();
            
            reiniciar();
            
            this.dispose();
        }else if(!loginNaoUtilizado){
            JOptionPane.showMessageDialog(null, "Cliente já existente");
        }else{
            JOptionPane.showMessageDialog(null, "Os campos não estão completos");
        }

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            
            this.dispose();
        }
        
    }//GEN-LAST:event_btCancelarActionPerformed

    public void reiniciar(){
        ctNome.setText("");
        ctLogin.setText("");
        ctSenha.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctLogin;
    private javax.swing.JTextField ctNome;
    private javax.swing.JPasswordField ctSenha;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
