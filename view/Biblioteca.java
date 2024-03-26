package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Bibliotecario;
import model.Cliente;
import model.Livro;
import model.Reserva;

public class Biblioteca extends javax.swing.JFrame {

    public static ArrayList<Livro> livros = new ArrayList<>();
    public static ArrayList<Cliente> clientes = new ArrayList<>();
    public static ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
    public static ArrayList<Reserva> reservas = new ArrayList<>();
    
    public static Cliente clienteLogado = null;
    public static Bibliotecario bibliotecarioLogado = null;
    
    public Biblioteca() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDoLogin = new javax.swing.JPanel();
        txtCabecalho = new javax.swing.JLabel();
        txtLogin = new javax.swing.JLabel();
        ctLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JLabel();
        ctSenha = new javax.swing.JPasswordField();
        btConfirmarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlDoLogin.setBackground(new java.awt.Color(240, 240, 240));

        txtCabecalho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtCabecalho.setText("Faça o Login");

        txtLogin.setText("Login");

        ctLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctLoginActionPerformed(evt);
            }
        });

        txtSenha.setText("Senha");

        btConfirmarLogin.setBackground(new java.awt.Color(153, 153, 153));
        btConfirmarLogin.setText("Login");
        btConfirmarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDoLoginLayout = new javax.swing.GroupLayout(pnlDoLogin);
        pnlDoLogin.setLayout(pnlDoLoginLayout);
        pnlDoLoginLayout.setHorizontalGroup(
            pnlDoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCabecalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDoLoginLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(pnlDoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSenha)
                    .addComponent(txtLogin)
                    .addComponent(ctLogin)
                    .addComponent(ctSenha)
                    .addComponent(btConfirmarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        pnlDoLoginLayout.setVerticalGroup(
            pnlDoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoLoginLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtCabecalho)
                .addGap(59, 59, 59)
                .addComponent(txtLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btConfirmarLogin)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctLoginActionPerformed
        
    }//GEN-LAST:event_ctLoginActionPerformed

    private void btConfirmarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarLoginActionPerformed
       
        boolean check = true;
        
        if(ctLogin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Insira o login");
            check = false;
        }
        
        if(new String(ctSenha.getPassword()).trim().equals("")){
            JOptionPane.showMessageDialog(null, "Insira a senha");
            check = false;
        }
        if(check){
            if(userExiste()){
                if(clienteLogado != null){
                    setVisible(false);
                    TelaDoCliente.getTela(clienteLogado).setVisible(true);
                }
                if(bibliotecarioLogado != null){
                    setVisible(false);
                    TelaDoBibliotecario.getTela(bibliotecarioLogado).setVisible(true);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidas");
            }
        }
    }//GEN-LAST:event_btConfirmarLoginActionPerformed

    public static void main(String args[]) {
        
        clientes.add(new Cliente("Lucicleide Von Schopenhauer", "a2351851", "aset55"));
        clientes.add(new Cliente("Janierison Quitina", "a3501572", "bghty24"));
        clientes.add(new Cliente("Carlos Silva", "a1974169", "zzabt72"));
        
        bibliotecarios.add(new Bibliotecario("Adam Smith", "ademsmt", "senha", 25749573));
        bibliotecarios.add(new Bibliotecario("Ludwig von Mises", "ludinho", "impostoehroubo", 36439289));
        
        livros.add(new Livro("Livre Para Escolher", "Milton Friedman", "Abril",2015 , 1, true));
        livros.add(new Livro("Capitalismo e Liberdade", "Milton Friedman", "Arqueiro",2013 , 2, true));
        livros.add(new Livro("Casa-Grande e Senzala", "Milton Santos", "Abril",2020 , 3, true));
        livros.add(new Livro("Fazenda dos Animais", "George Orwell", "Moderna",2019 , 4, true));
        livros.add(new Livro("1984", "George Orwell", "Escola",2021 , 5, true));
        livros.add(new Livro("Clean Code", " Robert C. Martin", "Prentice Hall PTR",2010 , 6, true));
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }
    
    public boolean userExiste(){
        
        for(Cliente cli: clientes){
            if(cli.getLogin().equals(ctLogin.getText()) && cli.getSenha().equals(new String(ctSenha.getPassword()).trim())){
                clienteLogado = cli;
                
                return true;
            }
        }
        
        for(Bibliotecario bibli: bibliotecarios){
            if(bibli.getLogin().equals(ctLogin.getText()) && bibli.getSenha().equals(new String(ctSenha.getPassword()).trim())){
                bibliotecarioLogado = bibli;
                
                return true;
            }
        }
        
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConfirmarLogin;
    private javax.swing.JTextField ctLogin;
    private javax.swing.JPasswordField ctSenha;
    private javax.swing.JPanel pnlDoLogin;
    private javax.swing.JLabel txtCabecalho;
    private javax.swing.JLabel txtLogin;
    private javax.swing.JLabel txtSenha;
    // End of variables declaration//GEN-END:variables
}
