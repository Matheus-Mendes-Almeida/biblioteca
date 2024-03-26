package view;

import javax.swing.JOptionPane;
import model.Cliente;

public class TelaDoCliente extends javax.swing.JFrame {

    public static TelaDoCliente tela;
    public static Cliente cliente;
    
    public TelaDoCliente() {
        initComponents();
    }
    
    public static TelaDoCliente getTela(Cliente cliente) {
        if(tela == null)
            tela = new TelaDoCliente();
        
        tela.cliente = cliente;
        tela.txtNomeDoCliente.setText(cliente.getNome());
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        Cabecalho = new javax.swing.JLabel();
        pnlOpcoes = new javax.swing.JPanel();
        btTodasReservas = new javax.swing.JButton();
        btTodosLivros = new javax.swing.JButton();
        txtBemVindo = new javax.swing.JLabel();
        txtNomeDoCliente = new javax.swing.JLabel();
        pnlLivro1 = new javax.swing.JPanel();
        imgCapaLPE = new javax.swing.JLabel();
        btReservarLPE = new javax.swing.JButton();
        txtTituloLPE = new javax.swing.JLabel();
        jScrollPaneLPE = new javax.swing.JScrollPane();
        txtblcResumoLPE = new javax.swing.JTextArea();
        pnlLivro3 = new javax.swing.JPanel();
        imgCleanCode = new javax.swing.JLabel();
        btReservarCleanCode = new javax.swing.JButton();
        txtTituloCleanCode = new javax.swing.JLabel();
        jScrollPaneCleanCode = new javax.swing.JScrollPane();
        jTextAreaCleanCode = new javax.swing.JTextArea();
        pnlLivro2 = new javax.swing.JPanel();
        imgCapa1984 = new javax.swing.JLabel();
        btReserva1984 = new javax.swing.JButton();
        txtTitulo1984 = new javax.swing.JLabel();
        jScrollPane1984 = new javax.swing.JScrollPane();
        txtblcResumo1984 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        Cabecalho.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        Cabecalho.setForeground(new java.awt.Color(255, 255, 255));
        Cabecalho.setText("Bibiliotec");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(Cabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Cabecalho)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlOpcoes.setBackground(new java.awt.Color(67, 104, 145));

        btTodasReservas.setText("Reservas");
        btTodasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodasReservasActionPerformed(evt);
            }
        });

        btTodosLivros.setText("Lista de livros");
        btTodosLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTodosLivrosActionPerformed(evt);
            }
        });

        txtBemVindo.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txtBemVindo.setText("Seja Bem-Vindo");

        txtNomeDoCliente.setText("\"nome\"");

        javax.swing.GroupLayout pnlOpcoesLayout = new javax.swing.GroupLayout(pnlOpcoes);
        pnlOpcoes.setLayout(pnlOpcoesLayout);
        pnlOpcoesLayout.setHorizontalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlOpcoesLayout.createSequentialGroup()
                        .addGap(0, 63, Short.MAX_VALUE)
                        .addComponent(txtNomeDoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBemVindo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlOpcoesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btTodasReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btTodosLivros, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlOpcoesLayout.setVerticalGroup(
            pnlOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeDoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btTodasReservas)
                .addGap(58, 58, 58)
                .addComponent(btTodosLivros)
                .addGap(109, 109, 109))
        );

        pnlLivro1.setBackground(new java.awt.Color(255, 255, 255));
        pnlLivro1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgCapaLPE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/livreParaEscolher.jpg"))); // NOI18N

        btReservarLPE.setText("Reservar");
        btReservarLPE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarLPEActionPerformed(evt);
            }
        });

        txtTituloLPE.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtTituloLPE.setText("Livre Para Escolher");

        txtblcResumoLPE.setEditable(false);
        txtblcResumoLPE.setBackground(new java.awt.Color(255, 255, 255));
        txtblcResumoLPE.setColumns(20);
        txtblcResumoLPE.setRows(5);
        txtblcResumoLPE.setText("Uma reflexão sobre a relação entre liberdade e economia. Em Livre para escolher,um clássico sobre\neconomia, liberdade e a relação entre esses dois conceitos,Milton e Rose Friedman explicam como\nnossa liberdade foi sendo corroída, e nossa riqueza, solapada por meio do surgimento crescente de\nleis, regulamentações e agências governamentais.");
        jScrollPaneLPE.setViewportView(txtblcResumoLPE);

        javax.swing.GroupLayout pnlLivro1Layout = new javax.swing.GroupLayout(pnlLivro1);
        pnlLivro1.setLayout(pnlLivro1Layout);
        pnlLivro1Layout.setHorizontalGroup(
            pnlLivro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgCapaLPE, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLivro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPaneLPE)
                        .addGap(18, 18, 18)
                        .addComponent(btReservarLPE)
                        .addContainerGap())
                    .addGroup(pnlLivro1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTituloLPE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlLivro1Layout.setVerticalGroup(
            pnlLivro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro1Layout.createSequentialGroup()
                .addGroup(pnlLivro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLivro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imgCapaLPE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLivro1Layout.createSequentialGroup()
                                .addComponent(txtTituloLPE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneLPE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivro1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btReservarLPE)))
                .addContainerGap())
        );

        pnlLivro3.setBackground(new java.awt.Color(255, 255, 255));
        pnlLivro3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgCleanCode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/CleanCode.jpg"))); // NOI18N

        btReservarCleanCode.setText("Reservar");
        btReservarCleanCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarCleanCodeActionPerformed(evt);
            }
        });

        txtTituloCleanCode.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtTituloCleanCode.setText("Clean Code");

        jTextAreaCleanCode.setEditable(false);
        jTextAreaCleanCode.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaCleanCode.setColumns(20);
        jTextAreaCleanCode.setRows(5);
        jTextAreaCleanCode.setText("Mesmo um código ruim pode funcionar. Mas se ele não for limpo, pode acabar com uma\nempresa de desenvolvimento. Perdem-se a cada ano horas incontáveis e recursos importantes\ndevido a um código mal escrito. Mas não precisa ser assim.O renomado especialista em\nsoftware, Robert C. Martin, apresenta um paradigma revolucionário com Código limpo:\nHabilidades Práticas do Agile Software.");
        jScrollPaneCleanCode.setViewportView(jTextAreaCleanCode);

        javax.swing.GroupLayout pnlLivro3Layout = new javax.swing.GroupLayout(pnlLivro3);
        pnlLivro3.setLayout(pnlLivro3Layout);
        pnlLivro3Layout.setHorizontalGroup(
            pnlLivro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgCleanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLivro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro3Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btReservarCleanCode)
                        .addContainerGap())
                    .addGroup(pnlLivro3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlLivro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlLivro3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPaneCleanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTituloCleanCode))
                        .addContainerGap(111, Short.MAX_VALUE))))
        );
        pnlLivro3Layout.setVerticalGroup(
            pnlLivro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro3Layout.createSequentialGroup()
                .addGroup(pnlLivro3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgCleanCode, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivro3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTituloCleanCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneCleanCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btReservarCleanCode)))
                .addContainerGap())
        );

        pnlLivro2.setBackground(new java.awt.Color(255, 255, 255));
        pnlLivro2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        imgCapa1984.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1984.jpg"))); // NOI18N

        btReserva1984.setText("Reservar");
        btReserva1984.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReserva1984ActionPerformed(evt);
            }
        });

        txtTitulo1984.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        txtTitulo1984.setText("1984");

        txtblcResumo1984.setEditable(false);
        txtblcResumo1984.setBackground(new java.awt.Color(255, 255, 255));
        txtblcResumo1984.setColumns(20);
        txtblcResumo1984.setRows(5);
        txtblcResumo1984.setText("Publicada originalmente em 1949, a distopia futurista 1984 é um dos romances mais influentes do\nséculo XX, um inquestionável clássico moderno. Lançada poucos meses antes da morte do autor,\né uma obra magistral que ainda se impõe como uma poderosa reflexão ficcional sobre a essência \nnefasta de qualquer forma de poder totalitário.");
        jScrollPane1984.setViewportView(txtblcResumo1984);

        javax.swing.GroupLayout pnlLivro2Layout = new javax.swing.GroupLayout(pnlLivro2);
        pnlLivro2.setLayout(pnlLivro2Layout);
        pnlLivro2Layout.setHorizontalGroup(
            pnlLivro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgCapa1984, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlLivro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro2Layout.createSequentialGroup()
                        .addComponent(txtTitulo1984)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlLivro2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1984)))
                .addGap(18, 18, 18)
                .addComponent(btReserva1984)
                .addContainerGap())
        );
        pnlLivro2Layout.setVerticalGroup(
            pnlLivro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivro2Layout.createSequentialGroup()
                .addGroup(pnlLivro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivro2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlLivro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(imgCapa1984, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlLivro2Layout.createSequentialGroup()
                                .addComponent(txtTitulo1984)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1984, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivro2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btReserva1984)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLivro1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLivro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlLivro2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLivro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlLivro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlLivro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReservarLPEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarLPEActionPerformed
        
        if(cliente.reservarLivro(Biblioteca.livros.get(0)))
            JOptionPane.showMessageDialog(null, "Livro reservado com sucesso");
        else
            JOptionPane.showMessageDialog(null, "O Livro já está reservado");
        
    }//GEN-LAST:event_btReservarLPEActionPerformed

    private void btReserva1984ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReserva1984ActionPerformed
        
        if(cliente.reservarLivro(Biblioteca.livros.get(4)))
            JOptionPane.showMessageDialog(null, "Livro reservado com sucesso");
        else
            JOptionPane.showMessageDialog(null, "O Livro já está reservado");
        
    }//GEN-LAST:event_btReserva1984ActionPerformed

    private void btReservarCleanCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarCleanCodeActionPerformed
        
        if(cliente.reservarLivro(Biblioteca.livros.get(5)))
            JOptionPane.showMessageDialog(null, "Livro reservado com sucesso");
        else
            JOptionPane.showMessageDialog(null, "O Livro já está reservado");
        
    }//GEN-LAST:event_btReservarCleanCodeActionPerformed

    private void btTodasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodasReservasActionPerformed
        TelaDosLivrosReservados.getTela(cliente).setVisible(true);
    }//GEN-LAST:event_btTodasReservasActionPerformed

    private void btTodosLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTodosLivrosActionPerformed
        TelaDaListaDeLivros.getTela(cliente).setVisible(true);
    }//GEN-LAST:event_btTodosLivrosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cabecalho;
    private javax.swing.JButton btReserva1984;
    private javax.swing.JButton btReservarCleanCode;
    private javax.swing.JButton btReservarLPE;
    private javax.swing.JButton btTodasReservas;
    private javax.swing.JButton btTodosLivros;
    private javax.swing.JLabel imgCapa1984;
    private javax.swing.JLabel imgCapaLPE;
    private javax.swing.JLabel imgCleanCode;
    private javax.swing.JScrollPane jScrollPane1984;
    private javax.swing.JScrollPane jScrollPaneCleanCode;
    private javax.swing.JScrollPane jScrollPaneLPE;
    private javax.swing.JTextArea jTextAreaCleanCode;
    private javax.swing.JPanel pnlLivro1;
    private javax.swing.JPanel pnlLivro2;
    private javax.swing.JPanel pnlLivro3;
    private javax.swing.JPanel pnlOpcoes;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JLabel txtBemVindo;
    private javax.swing.JLabel txtNomeDoCliente;
    private javax.swing.JLabel txtTitulo1984;
    private javax.swing.JLabel txtTituloCleanCode;
    private javax.swing.JLabel txtTituloLPE;
    private javax.swing.JTextArea txtblcResumo1984;
    private javax.swing.JTextArea txtblcResumoLPE;
    // End of variables declaration//GEN-END:variables
}
