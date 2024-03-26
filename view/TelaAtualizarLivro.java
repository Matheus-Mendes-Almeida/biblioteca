package view;

import javax.swing.JOptionPane;
import model.Livro;

public class TelaAtualizarLivro extends javax.swing.JFrame {

    public static TelaAtualizarLivro tela;
    public static Livro livro;
    
    public TelaAtualizarLivro() {
        initComponents();
    }

    public static TelaAtualizarLivro getTela(Livro livro) {
        if(tela == null)
            tela = new TelaAtualizarLivro();
        
        tela.livro = livro;
        tela.inserirInformacoes();
        
        return tela;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        ctTituloDoLivro = new javax.swing.JTextField();
        ctAutorDoLivro = new javax.swing.JTextField();
        ctPublicadoraDoLivro = new javax.swing.JTextField();
        txtTituloDoLivro = new javax.swing.JLabel();
        txtAutorDoLivro = new javax.swing.JLabel();
        txtPublicadoraDoLivro = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        txtAnoDoLivro = new javax.swing.JLabel();
        ctAnoDoLivro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Atualizar Livro");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtTitulo)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        txtTituloDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTituloDoLivro.setText("Título");

        txtAutorDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAutorDoLivro.setText("Autor");

        txtPublicadoraDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPublicadoraDoLivro.setText("Publicadora");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAtualizar.setText("Atualizar");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        txtAnoDoLivro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAnoDoLivro.setText("Ano de publicação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ctAnoDoLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ctTituloDoLivro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctAutorDoLivro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ctPublicadoraDoLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                            .addComponent(txtPublicadoraDoLivro)
                            .addComponent(txtTituloDoLivro)
                            .addComponent(txtAutorDoLivro)))
                    .addComponent(txtAnoDoLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
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
                        .addGap(18, 18, 18)
                        .addComponent(txtAnoDoLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btAtualizar)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctAnoDoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        
        boolean houveAtualizacao = false;
        
        if(!ctTituloDoLivro.getText().equals(livro.getTitulo())){
            livro.setTitulo(ctTituloDoLivro.getText());
            houveAtualizacao = true;
        }
        if(!ctAutorDoLivro.getText().equals(livro.getAutor())){
            livro.setAutor(ctAutorDoLivro.getText());
            houveAtualizacao = true;
        }
        if(!ctPublicadoraDoLivro.getText().equals(livro.getEditora())){
            livro.setEditora(ctPublicadoraDoLivro.getText());
            houveAtualizacao = true;
        }
        try {
            if(!ctAnoDoLivro.getText().equals(Integer.toString(livro.getAno())))
                livro.setAno(Integer.parseInt(ctAnoDoLivro.getText()));
            
            houveAtualizacao = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O ano deve ser um valor válido");
            ctAnoDoLivro.setText("");
        }
        
        if(houveAtualizacao){
            JOptionPane.showMessageDialog(null, "Atualização ocorreu com sucesso");
            
            this.dispose();
        }
        
        TelaDeGerenciamentoDeLivros.tela.gerarTabela();
    }//GEN-LAST:event_btAtualizarActionPerformed

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
        ctAnoDoLivro.setText("");
    }
    
    public void inserirInformacoes(){
        ctTituloDoLivro.setText(livro.getTitulo());
        ctAutorDoLivro.setText(livro.getAutor());
        ctPublicadoraDoLivro.setText(livro.getEditora());
        ctAnoDoLivro.setText(Integer.toString(livro.getAno()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField ctAnoDoLivro;
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
