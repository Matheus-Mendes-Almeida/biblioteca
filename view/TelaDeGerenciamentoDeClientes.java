package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

public class TelaDeGerenciamentoDeClientes extends javax.swing.JFrame {

    public static TelaDeGerenciamentoDeClientes tela;
    
    public TelaDeGerenciamentoDeClientes() {
        initComponents();
    }

    public static TelaDeGerenciamentoDeClientes getTela() {
        if(tela == null)
            tela = new TelaDeGerenciamentoDeClientes();
        
        tela.gerarTabela();
        
        return tela;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTopo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btExcluirCliente = new javax.swing.JButton();
        btAdicionarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlTopo.setBackground(new java.awt.Color(12, 75, 96));

        txtTitulo.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setText("Gerenciamento dos Clientes");

        javax.swing.GroupLayout pnlTopoLayout = new javax.swing.GroupLayout(pnlTopo);
        pnlTopo.setLayout(pnlTopoLayout);
        pnlTopoLayout.setHorizontalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTopoLayout.setVerticalGroup(
            pnlTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtTitulo)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Login"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setResizable(false);
            tblCliente.getColumnModel().getColumn(1).setResizable(false);
        }

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btExcluirCliente.setText("Excluir cliente");
        btExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteActionPerformed(evt);
            }
        });

        btAdicionarCliente.setText("Adicionar Cliente");
        btAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluirCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAdicionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAdicionarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btSair)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        
        int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
        
        if(resp == 0)
            this.dispose();
        
    }//GEN-LAST:event_btSairActionPerformed

    private void btExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteActionPerformed
        
        String loginInformado = JOptionPane.showInputDialog(null, "Insira o login do cliente", "Excluir cliente", HEIGHT);
        boolean clienteExcluido = false;
        
        for(Cliente c: Biblioteca.clientes){
            if(c.getLogin().equals(loginInformado)){
                Biblioteca.clientes.remove(c);
                
                clienteExcluido = true;
                
                gerarTabela();
                
                JOptionPane.showMessageDialog(null, "Cliente removido com sucesso");
                
                break;
            }
        }
        
        if(!clienteExcluido){
            JOptionPane.showMessageDialog(null, "Cliente não foi encontrado");
        }
        
    }//GEN-LAST:event_btExcluirClienteActionPerformed

    private void btAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarClienteActionPerformed
        TelaAdicionarCliente.getTela().setVisible(true);
    }//GEN-LAST:event_btAdicionarClienteActionPerformed

    public void gerarTabela(){
        int posicaoDaLinha = 0;
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        
        modelo.setRowCount(posicaoDaLinha);
        
        for(Cliente c: Biblioteca.clientes){
            modelo.insertRow(posicaoDaLinha, new Object []{c.getNome(), c.getLogin()});
            
            posicaoDaLinha ++;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionarCliente;
    private javax.swing.JButton btExcluirCliente;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlTopo;
    private javax.swing.JTable tblCliente;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
