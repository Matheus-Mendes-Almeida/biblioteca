package view;

import model.Bibliotecario;

public class TelaDoBibliotecario extends javax.swing.JFrame {

    public static TelaDoBibliotecario tela;
    public static Bibliotecario bibliotecario;
    
    public TelaDoBibliotecario() {
        initComponents();
    }

    public static TelaDoBibliotecario getTela(Bibliotecario bibliotecario) {
        if(tela == null)
            tela = new TelaDoBibliotecario();
        
        tela.bibliotecario = bibliotecario;
        tela.txtNomeDoBibliotecario.setText(bibliotecario.getNome());
        
        return tela;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        pnlOpcoes = new javax.swing.JPanel();
        txtBemVindo = new javax.swing.JLabel();
        txtNomeDoBibliotecario = new javax.swing.JLabel();
        btGerenciamentoDeLivros = new javax.swing.JButton();
        btGerenciarClientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Bibliotec");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTitulo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pnlOpcoes.setBackground(new java.awt.Color(67, 104, 145));

        txtBemVindo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtBemVindo.setText("Seja Bem-Vindo");

        txtNomeDoBibliotecario.setText("\"nome\"");

        btGerenciamentoDeLivros.setText("Gerenciamento de livros");
        btGerenciamentoDeLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciamentoDeLivrosActionPerformed(evt);
            }
        });

        btGerenciarClientes.setText("Gerenciar clientes");
        btGerenciarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerenciarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtBemVindo))
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txtNomeDoBibliotecario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btGerenciamentoDeLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGerenciarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoBibliotecario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btGerenciamentoDeLivros)
                .addGap(50, 50, 50)
                .addComponent(btGerenciarClientes)
                .addGap(85, 85, 85))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/utfprV2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGerenciamentoDeLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciamentoDeLivrosActionPerformed
        TelaDeGerenciamentoDeLivros.getTela(bibliotecario).setVisible(true);    
    }//GEN-LAST:event_btGerenciamentoDeLivrosActionPerformed

    private void btGerenciarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerenciarClientesActionPerformed
        TelaDeGerenciamentoDeClientes.getTela().setVisible(true);       
    }//GEN-LAST:event_btGerenciarClientesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerenciamentoDeLivros;
    private javax.swing.JButton btGerenciarClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtNomeDoBibliotecario;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
