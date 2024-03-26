package view;

import javax.swing.JOptionPane;
import model.Livro;

public class TelaAdicionarLivro extends javax.swing.JFrame {

    public static TelaAdicionarLivro tela;
    
    public TelaAdicionarLivro() {
        initComponents();
    }
    
    public static TelaAdicionarLivro getTela() {
        if(tela == null)
            tela = new TelaAdicionarLivro();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtTituloDoLivro = new javax.swing.JLabel();
        ctTituloDoLivro = new javax.swing.JTextField();
        txtAutorDoLivro = new javax.swing.JLabel();
        ctAutorDoLivro = new javax.swing.JTextField();
        txtPublicadoraDoLivro = new javax.swing.JLabel();
        ctPublicadoraDoLivro = new javax.swing.JTextField();
        txtAnoDoLivro = new javax.swing.JLabel();
        ctAnoDePublicacao = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Adicionar Livro");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtTituloDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTituloDoLivro.setText("Título");

        txtAutorDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAutorDoLivro.setText("Autor");

        txtPublicadoraDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPublicadoraDoLivro.setText("Publicadora");

        txtAnoDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAnoDoLivro.setText("Ano de publicação");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAnoDoLivro)
                            .addComponent(txtPublicadoraDoLivro)
                            .addComponent(txtAutorDoLivro)
                            .addComponent(txtTituloDoLivro)
                            .addComponent(ctTituloDoLivro)
                            .addComponent(ctAutorDoLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ctAnoDePublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(ctPublicadoraDoLivro))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(txtTituloDoLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctTituloDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAutorDoLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctAutorDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPublicadoraDoLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctPublicadoraDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAdicionar)
                        .addGap(2, 2, 2)))
                .addComponent(txtAnoDoLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctAnoDePublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        
        Livro livro = new Livro();
        boolean dadosNecessariosInformados = true;
        
        if(!ctTituloDoLivro.getText().equals("")){
            livro.setTitulo(ctTituloDoLivro.getText());
        }else{
            dadosNecessariosInformados = false;
        }
        if(!ctAutorDoLivro.getText().equals("")){
            livro.setAutor(ctAutorDoLivro.getText());
        }else{
            dadosNecessariosInformados = false;
        }
        if(!ctPublicadoraDoLivro.getText().equals("")){
            livro.setEditora(ctPublicadoraDoLivro.getText());
        }else{
            dadosNecessariosInformados = false;
        }
        try {
            if(!ctAnoDePublicacao.getText().equals("")){
                livro.setAno(Integer.parseInt(ctAnoDePublicacao.getText()));
            }else{
                dadosNecessariosInformados = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O ano deve ser um valor válido");
            ctAnoDePublicacao.setText("");
        }
        
        if(dadosNecessariosInformados){
            livro.setDisponivel(true);
            livro.setId(Biblioteca.livros.size() + 1);
            
            Biblioteca.livros.add(livro);
            
            JOptionPane.showMessageDialog(null, "Atualização ocorreu com sucesso");
            
            reiniciar();
            
            this.dispose();
        }
        
        TelaDeGerenciamentoDeLivros.tela.gerarTabela();
        
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar a ação?", "Cancelar", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0){
            reiniciar();
            
            this.dispose();
        }
        
    }//GEN-LAST:event_btCancelarActionPerformed

 
    public void reiniciar(){
        ctTituloDoLivro.setText("");
        ctAutorDoLivro.setText("");
        ctPublicadoraDoLivro.setText("");
        ctAnoDePublicacao.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctAnoDePublicacao;
    private javax.swing.JTextField ctAutorDoLivro;
    private javax.swing.JTextField ctPublicadoraDoLivro;
    private javax.swing.JTextField ctTituloDoLivro;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtAnoDoLivro;
    private javax.swing.JLabel txtAutorDoLivro;
    private javax.swing.JLabel txtPublicadoraDoLivro;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTituloDoLivro;
    // End of variables declaration//GEN-END:variables
}
