package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Reserva;

public class TelaDosLivrosReservados extends javax.swing.JFrame {

    public static TelaDosLivrosReservados tela;
    public static Cliente cliente;
    
    public TelaDosLivrosReservados() {
        initComponents();
    }
        
    public static TelaDosLivrosReservados getTela(Cliente cliente) {
        if(tela == null)
            tela = new TelaDosLivrosReservados();
        
        tela.cliente = cliente;
        
        tela.gerarTabela();
        
        return tela;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivrosReservados = new javax.swing.JTable();
        btCancelarReserva = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Livros Reservados");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtTitulo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tblLivrosReservados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Título", "Data da reserva", "Código do livro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLivrosReservados);
        if (tblLivrosReservados.getColumnModel().getColumnCount() > 0) {
            tblLivrosReservados.getColumnModel().getColumn(0).setResizable(false);
            tblLivrosReservados.getColumnModel().getColumn(1).setResizable(false);
            tblLivrosReservados.getColumnModel().getColumn(2).setResizable(false);
        }

        btCancelarReserva.setText("Cancelar reserva");
        btCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarReservaActionPerformed(evt);
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
            .addComponent(pnlTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCancelarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(btCancelarReserva)
                        .addGap(18, 18, 18)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            this.dispose();
        
    }//GEN-LAST:event_btSairActionPerformed

    private void btCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarReservaActionPerformed
        
        int codigoInformado = -55;
        boolean reservaCancelada = false;
        
        try {
            codigoInformado = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o códogo do livro", "Cancelar Reserva", HEIGHT));
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O código deve ser um valor numérico inteiro");
        }
        
        if(codigoInformado != -55){
            for(Reserva r: cliente.getLivrosReservados()){
                if(r.getLivro().getId() == codigoInformado){
                    r.getLivro().setDisponivel(true);
                    cliente.getLivrosReservados().remove(r);
                    
                    JOptionPane.showMessageDialog(null, "Reserva cancelada");
                    
                    reservaCancelada = true;
                    
                    gerarTabela();
                    
                    break;
                }
            }
            
            if(!reservaCancelada)
                JOptionPane.showMessageDialog(null, "Código informado é incompatível");
            
        }
        
    }//GEN-LAST:event_btCancelarReservaActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblLivrosReservados.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Reserva r: cliente.getLivrosReservados()){
            modelo.insertRow(posicaoDaLinha, new Object []{r.getLivro().getTitulo(), r.getDataDoEmprestimo(), r.getLivro().getId()});
            
            posicaoDaLinha ++;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarReserva;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTable tblLivrosReservados;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
