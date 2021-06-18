package com.mycompany.view;

import com.mycompany.conexao.GenericDAO;
import com.mycompany.model.Cliente;
import com.mycompany.model.Telefone;
import com.mycompany.model.Endereço;
import com.mycompany.model.Carro;
import com.mycompany.model.Alugar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tela1 extends javax.swing.JFrame {
      private final GenericDAO<Cliente> clienteDAO; 
      private final GenericDAO<Telefone> telefoneDAO; 
      private final GenericDAO<Endereço> enderecoDAO; 
      private final GenericDAO<Carro> carroDAO; 
      private final GenericDAO<Alugar> alugarDAO;
      DefaultTableModel model = new DefaultTableModel();
      Cliente cliente; 
      
    public Tela1() {
        initComponents();
        clienteDAO = new GenericDAO<>(); 
        telefoneDAO = new GenericDAO<>();
        enderecoDAO = new GenericDAO<>(); 
        carroDAO = new GenericDAO<>(); 
        alugarDAO = new GenericDAO<>(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        NomeCliente = new javax.swing.JLabel();
        btSalvarCliente = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        btEditarCliente = new javax.swing.JButton();
        txtEditarCliente = new javax.swing.JTextField();
        btExcluirCliente = new javax.swing.JButton();
        txtExcluirCliente = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btSalvarTelefone = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        btSalvarEndereco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Carro = new javax.swing.JLabel();
        txtCarro = new javax.swing.JTextField();
        btSalvarCarro = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        Date = new javax.swing.JLabel();
        btSalvarAlugacao = new javax.swing.JButton();
        Prazo = new javax.swing.JLabel();
        txtPrazo = new javax.swing.JTextField();
        Valor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel8.setText("|");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NomeCliente.setText("Nome:");

        btSalvarCliente.setText("Salvar");
        btSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteActionPerformed(evt);
            }
        });

        txtNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeClienteActionPerformed(evt);
            }
        });

        btEditarCliente.setText("Editar Nome");
        btEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteActionPerformed(evt);
            }
        });

        btExcluirCliente.setText("Excluir Nome");
        btExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteActionPerformed(evt);
            }
        });

        txtExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExcluirClienteActionPerformed(evt);
            }
        });

        Telefone.setText("Telefone:");

        btSalvarTelefone.setText("Salvar");
        btSalvarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarTelefoneActionPerformed(evt);
            }
        });

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        Endereco.setText("Endereço:");

        btSalvarEndereco.setText("Salvar");
        btSalvarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Locadora Jvs");

        jLabel2.setText("ID:");

        jLabel3.setText("ID:");

        Carro.setText("Veículo Desejado:");

        btSalvarCarro.setText("Salvar");
        btSalvarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCarroActionPerformed(evt);
            }
        });

        Date.setText("Data da locação :");

        btSalvarAlugacao.setText("Salvar");
        btSalvarAlugacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarAlugacaoActionPerformed(evt);
            }
        });

        Prazo.setText("Prazo de entrega :");

        Valor.setText("Valor Total:");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Renato\\Pictures\\locadora.png")); // NOI18N

        jLabel5.setText("_____________________________________________________________________");

        jLabel11.setText("_____________________________________________________________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(NomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btExcluirCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarCliente)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Prazo)
                    .addComponent(Valor)
                    .addComponent(Date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Carro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Endereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalvarTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btSalvarEndereco)
                            .addComponent(btSalvarCarro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btSalvarAlugacao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NomeCliente)
                    .addComponent(btSalvarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtExcluirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEditarCliente))
                    .addComponent(btExcluirCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarTelefone))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarEndereco)
                    .addComponent(Endereco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carro)
                    .addComponent(txtCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarCarro))
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prazo)
                    .addComponent(txtPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvarAlugacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(144, 144, 144))
        );

        pack();
    }// </editor-fold>                        

    private void btSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        cliente = new Cliente();
        cliente.setNomeCliente(txtNomeCliente.getText());
        if(clienteDAO.saveOrUpdate(cliente))
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado");
        else JOptionPane.showMessageDialog(null,"Erro no Cadastro do CLiente!","Atenção", JOptionPane.WARNING_MESSAGE);// TODO add your handling code here:
    }                                               

    private void txtNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    private void btEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                
        Cliente cliente = new Cliente();
        cliente=clienteDAO.findById(Cliente.class,Integer.parseInt(txtEditarCliente.getText()));
        cliente.setNomeCliente(txtNomeCliente.getText());
        if(clienteDAO.saveOrUpdate(cliente))
            JOptionPane.showMessageDialog(null, "Edição Realizada");
        else JOptionPane.showMessageDialog(null,"Ediçao não Realizada!","Atenção", JOptionPane.WARNING_MESSAGE); 
    }                                               

    private void txtExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void btExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if(clienteDAO.remove(Cliente.class, Integer.parseInt(txtExcluirCliente.getText())))
            JOptionPane.showMessageDialog(null, "Exclusão Realizada");
        else JOptionPane.showMessageDialog(null,"Exclusão não Realizada!","Atenção", JOptionPane.WARNING_MESSAGE);     
        
      
    }                                                

    private void btSalvarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Telefone telefone = new Telefone();
        telefone.setNumero(txtTelefone.getText());
        telefone.setIdCliente(cliente);
        if(telefoneDAO.saveOrUpdate(telefone))
            JOptionPane.showMessageDialog(null, "Telefone Cadastrado");
        else JOptionPane.showMessageDialog(null,"Telefone Não Cadastrado!","Atenção", JOptionPane.WARNING_MESSAGE); 
                // TODO add your handling code here:
    }                                                

    private void btSalvarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Endereço endereco = new Endereço();
        endereco.setRua(txtEndereco.getText());
        endereco.setIdCliente(cliente);
        if(enderecoDAO.saveOrUpdate(endereco))
            JOptionPane.showMessageDialog(null, "Endereco Cadastrado");
        else JOptionPane.showMessageDialog(null,"Endereco Não Cadastrado!","Atenção", JOptionPane.WARNING_MESSAGE);
        
    }                                                

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btSalvarCarroActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Carro carro = new Carro();
        carro.setNomeCarro(txtCarro.getText());
        carro.setIdCliente(cliente);
        if(carroDAO.saveOrUpdate(carro))
            JOptionPane.showMessageDialog(null, "Carro Cadastrado");
        else JOptionPane.showMessageDialog(null,"Carro Não Cadastrado!","Atenção", JOptionPane.WARNING_MESSAGE);
    }                                             

    private void btSalvarAlugacaoActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        Alugar alugar = new Alugar();
        alugar.setData(txtDate.getText());
        alugar.setIdCliente(cliente);
        alugar.setPrazoEntrega(txtPrazo.getText());
        alugar.setIdCliente(cliente);
        alugar.setValor(txtValor.getText());
        alugar.setIdCliente(cliente);
        if(alugarDAO.saveOrUpdate(alugar))
            JOptionPane.showMessageDialog(null, "Dados Da Locação Cadastrada");
        else JOptionPane.showMessageDialog(null,"Dados Da Locação Não Cadastrada!","Atenção", JOptionPane.WARNING_MESSAGE);
    }                                                

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Carro;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel NomeCliente;
    private javax.swing.JLabel Prazo;
    private javax.swing.JLabel Telefone;
    private javax.swing.JLabel Valor;
    private javax.swing.JButton btEditarCliente;
    private javax.swing.JButton btExcluirCliente;
    private javax.swing.JButton btSalvarAlugacao;
    private javax.swing.JButton btSalvarCarro;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JButton btSalvarEndereco;
    private javax.swing.JButton btSalvarTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCarro;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEditarCliente;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtExcluirCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPrazo;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValor;
    // End of variables declaration                   
}
