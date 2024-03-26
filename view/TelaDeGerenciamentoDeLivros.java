package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Bibliotecario;
import model.Livro;

public class TelaDeGerenciamentoDeLivros extends javax.swing.JFrame {

    public static TelaDeGerenciamentoDeLivros tela;
    public static Bibliotecario bibliotecario;
    
    public TelaDeGerenciamentoDeLivros() {
        initComponents();
    }
    
    public static TelaDeGerenciamentoDeLivros getTela(Bibliotecario bibliotecario) {
        if(tela == null)
            tela = new TelaDeGerenciamentoDeLivros();
        
        tela.bibliotecario = bibliotecario;
        
        tela.gerarTabela();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaDeLivros = new javax.swing.JTable();
        btRemoverLivro = new javax.swing.JButton();
        btAtualizarLivro = new javax.swing.JButton();
        btAdicionarLivro = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Gerenciamento De Livros");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTitulo)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tblListaDeLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Editora", "Código", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListaDeLivros);
        if (tblListaDeLivros.getColumnModel().getColumnCount() > 0) {
            tblListaDeLivros.getColumnModel().getColumn(0).setResizable(false);
            tblListaDeLivros.getColumnModel().getColumn(1).setResizable(false);
            tblListaDeLivros.getColumnModel().getColumn(2).setResizable(false);
            tblListaDeLivros.getColumnModel().getColumn(3).setResizable(false);
            tblListaDeLivros.getColumnModel().getColumn(4).setResizable(false);
        }

        btRemoverLivro.setText("Remover livro");
        btRemoverLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverLivroActionPerformed(evt);
            }
        });

        btAtualizarLivro.setText("Atualizar livro");
        btAtualizarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarLivroActionPerformed(evt);
            }
        });

        btAdicionarLivro.setText("Adicionar livro");
        btAdicionarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarLivroActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btRemoverLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdicionarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(btAtualizarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionarLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizarLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btRemoverLivro)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverLivroActionPerformed
        
        int codigoInformado = -55;
        boolean livroRemovido = false;
        boolean livroEncontrado = false;
        
        try {
            codigoInformado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o códogo do livro", "Remover Livro", HEIGHT));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O código deve ser um valor numérico inteiro");
        }
        
        if(codigoInformado != -55){
            for(Livro l: Biblioteca.livros){
                
                if(l.getId() == codigoInformado)
                    livroEncontrado = true;
                
                if(l.getId() == codigoInformado && l.isDisponivel()){
                    Biblioteca.livros.remove(l);
                    
                    JOptionPane.showMessageDialog(null, "Livro Removido");
                    
                    livroRemovido = true;
                    
                    gerarTabela();
                    
                    break;
                }
            }
            
            if(!livroRemovido && !livroEncontrado)
                JOptionPane.showMessageDialog(null, "Código informado é incompatível");
            if(!livroRemovido && livroEncontrado)
                JOptionPane.showMessageDialog(null, "Livro reservados não pedem ser removidos");
                
        }
        
    }//GEN-LAST:event_btRemoverLivroActionPerformed

    private void btAdicionarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarLivroActionPerformed
        TelaAdicionarLivro.getTela().setVisible(true);
    }//GEN-LAST:event_btAdicionarLivroActionPerformed

    private void btAtualizarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarLivroActionPerformed
        
        int codigoInformado = -55;
        boolean livroAtualizado = false;
        boolean livroEncontrado = false;
        
        try {
            codigoInformado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o códogo do livro", "Atualizar Livro", HEIGHT));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O código deve ser um valor numérico inteiro");
        }
        
        if(codigoInformado != -55){
            for(Livro l: Biblioteca.livros){
                
                if(l.getId() == codigoInformado)
                    livroEncontrado = true;
                
                if(l.getId() == codigoInformado && l.isDisponivel()){
                    TelaAtualizarLivro.tela.getTela(l).setVisible(true);
                    
                    livroAtualizado = true;
                    
                    break;
                }
            }
            
            if(!livroAtualizado && !livroEncontrado)
                JOptionPane.showMessageDialog(null, "Código informado é incompatível");
            if(!livroAtualizado && livroEncontrado)
                JOptionPane.showMessageDialog(null, "Livro reservados não pedem ser atualizados");
        }
    }//GEN-LAST:event_btAtualizarLivroActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            this.dispose();
        
    }//GEN-LAST:event_btSairActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblListaDeLivros.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Livro l: Biblioteca.livros){
            modelo.insertRow(posicaoDaLinha, new Object []{l.getTitulo(), l.getAutor(), l.getEditora(), l.getId(), l.isDisponivel()});
            
            posicaoDaLinha ++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarLivro;
    private javax.swing.JButton btAtualizarLivro;
    private javax.swing.JButton btRemoverLivro;
    private javax.swing.JButton btSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaDeLivros;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
