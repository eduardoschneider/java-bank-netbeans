/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas;

import java.awt.Color;
import banco.RoundedBorder;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author eduardo.schneider
 */
public class exibirClientes extends javax.swing.JFrame {

    /** Creates new form exibirClientes */
    public exibirClientes() throws ParseException {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
        this.setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null); //abre a tela no centro
        this.getContentPane().setBackground(Color.white);
        txtAdress.setForeground(Color.gray);
        txtAgencia.setForeground(Color.gray);
        txtBairro.setForeground(Color.gray);
        txtBanco.setForeground(Color.gray);
        txtBorn.setForeground(Color.gray);
        txtCidade.setForeground(Color.gray);
        txtConta.setForeground(Color.gray);
        txtCpf.setForeground(Color.gray);
        txtEmail.setForeground(Color.gray);
        txtEstado.setForeground(Color.gray);
        txtNome.setForeground(Color.gray);
        txtRef.setForeground(Color.gray);
        txtTelefone.setForeground(Color.gray);
        btnPesquisar.setBorder(new RoundedBorder(15));
        btnPesquisar.setForeground(Color.blue);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtBorn = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtRef = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtAdress = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisa de Clientes");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("CPF:");

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 2, true));
        btnPesquisar.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(79, 29));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setText("Nome");
        txtNome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtNome.setCaretColor(new java.awt.Color(0, 153, 153));
        txtNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNome.setFocusable(false);
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtBorn.setEditable(false);
        txtBorn.setBackground(new java.awt.Color(255, 255, 255));
        txtBorn.setText("Data de Nascimento");
        txtBorn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtBorn.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBorn.setFocusable(false);
        txtBorn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBornFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBornFocusLost(evt);
            }
        });

        txtCidade.setEditable(false);
        txtCidade.setBackground(new java.awt.Color(255, 255, 255));
        txtCidade.setText("Cidade");
        txtCidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCidade.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCidade.setFocusable(false);
        txtCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCidadeFocusLost(evt);
            }
        });

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("E-mail");
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setFocusable(false);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtConta.setEditable(false);
        txtConta.setBackground(new java.awt.Color(255, 255, 255));
        txtConta.setText("Conta");
        txtConta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtConta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConta.setFocusable(false);
        txtConta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContaFocusLost(evt);
            }
        });

        txtAgencia.setEditable(false);
        txtAgencia.setBackground(new java.awt.Color(255, 255, 255));
        txtAgencia.setText("Agência");
        txtAgencia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAgencia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAgencia.setFocusable(false);
        txtAgencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAgenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAgenciaFocusLost(evt);
            }
        });

        txtBanco.setEditable(false);
        txtBanco.setBackground(new java.awt.Color(255, 255, 255));
        txtBanco.setText("Banco");
        txtBanco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtBanco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBanco.setFocusable(false);
        txtBanco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBancoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBancoFocusLost(evt);
            }
        });

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setText("Telefone");
        txtTelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTelefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefone.setFocusable(false);
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefoneFocusLost(evt);
            }
        });

        txtRef.setEditable(false);
        txtRef.setBackground(new java.awt.Color(255, 255, 255));
        txtRef.setText("Referência");
        txtRef.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtRef.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtRef.setFocusable(false);
        txtRef.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRefFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRefFocusLost(evt);
            }
        });

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setText("Estado");
        txtEstado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtEstado.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEstado.setFocusable(false);
        txtEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEstadoFocusLost(evt);
            }
        });

        txtAdress.setEditable(false);
        txtAdress.setBackground(new java.awt.Color(255, 255, 255));
        txtAdress.setText("Endereço/Nº");
        txtAdress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtAdress.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAdress.setFocusable(false);
        txtAdress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAdressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdressFocusLost(evt);
            }
        });

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(255, 255, 255));
        txtBairro.setText("Bairro");
        txtBairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtBairro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBairro.setFocusable(false);
        txtBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBairroFocusLost(evt);
            }
        });

        txtCpf.setEditable(false);
        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setText("CPF");
        txtCpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCpf.setFocusable(false);
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setToolTipText("CPF");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtConta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if (txtNome.getText().equals("Nome"))
        txtNome.setText("");
        txtNome.setForeground(Color.black);
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if (txtNome.getText().equals("")){
            txtNome.setText("Nome");
            txtNome.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtBornFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBornFocusGained
        if (txtBorn.getText().equals("Data de Nascimento"))
        txtBorn.setText("");
        txtBorn.setForeground(Color.black);
    }//GEN-LAST:event_txtBornFocusGained

    private void txtBornFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBornFocusLost
        if (txtBorn.getText().equals("")){
            txtBorn.setForeground(Color.gray);
            txtBorn.setText("Data de Nascimento");
        }
    }//GEN-LAST:event_txtBornFocusLost

    private void txtCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusGained
        if (txtCidade.getText().equals("Cidade"))
        txtCidade.setText("");
        txtCidade.setForeground(Color.black);
    }//GEN-LAST:event_txtCidadeFocusGained

    private void txtCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCidadeFocusLost
        if (txtCidade.getText().equals("")){
            txtCidade.setForeground(Color.gray);
            txtCidade.setText("Cidade");
        }
    }//GEN-LAST:event_txtCidadeFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        if (txtEmail.getText().equals("E-mail"))
        txtEmail.setText("");
        txtEmail.setForeground(Color.black);
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        if (txtEmail.getText().equals("")){
            txtEmail.setForeground(Color.gray);
            txtEmail.setText("E-mail");
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtContaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContaFocusGained
        if (txtConta.getText().equals("Conta"))
        txtConta.setText("");
        txtConta.setForeground(Color.black);
    }//GEN-LAST:event_txtContaFocusGained

    private void txtContaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContaFocusLost
        if (txtConta.getText().equals("")){
            txtConta.setForeground(Color.gray);
            txtConta.setText("Conta");
        }
    }//GEN-LAST:event_txtContaFocusLost

    private void txtAgenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgenciaFocusGained
        if (txtAgencia.getText().equals("Agência"))
        txtAgencia.setText("");
        txtAgencia.setForeground(Color.black);
    }//GEN-LAST:event_txtAgenciaFocusGained

    private void txtAgenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgenciaFocusLost
        if (txtAgencia.getText().equals("")){
            txtAgencia.setForeground(Color.gray);
            txtAgencia.setText("Agência");
        }
    }//GEN-LAST:event_txtAgenciaFocusLost

    private void txtBancoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBancoFocusGained
        if (txtBanco.getText().equals("Banco"))
        txtBanco.setText("");
        txtBanco.setForeground(Color.black);
    }//GEN-LAST:event_txtBancoFocusGained

    private void txtBancoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBancoFocusLost
        if (txtBanco.getText().equals("")){
            txtBanco.setForeground(Color.gray);
            txtBanco.setText("Banco");
        }
    }//GEN-LAST:event_txtBancoFocusLost

    private void txtTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusGained
        if (txtTelefone.getText().equals("Telefone"))
        txtTelefone.setText("");
        txtTelefone.setForeground(Color.black);
    }//GEN-LAST:event_txtTelefoneFocusGained

    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefoneFocusLost
        if (txtTelefone.getText().equals("")){
            txtTelefone.setForeground(Color.gray);
            txtTelefone.setText("Telefone");
        }
    }//GEN-LAST:event_txtTelefoneFocusLost

    private void txtRefFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefFocusGained
        if (txtRef.getText().equals("Referência"))
        txtRef.setText("");
        txtRef.setForeground(Color.black);
    }//GEN-LAST:event_txtRefFocusGained

    private void txtRefFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRefFocusLost
        if (txtRef.getText().equals("")){
            txtRef.setForeground(Color.gray);
            txtRef.setText("Referência");
        }
    }//GEN-LAST:event_txtRefFocusLost

    private void txtEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusGained
        if (txtEstado.getText().equals("Estado"))
        txtEstado.setText("");
        txtEstado.setForeground(Color.black);
    }//GEN-LAST:event_txtEstadoFocusGained

    private void txtEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstadoFocusLost
        if (txtEstado.getText().equals("")){
            txtEstado.setForeground(Color.gray);
            txtEstado.setText("Estado");
        }
    }//GEN-LAST:event_txtEstadoFocusLost

    private void txtAdressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdressFocusGained
        if (txtAdress.getText().equals("Endereço/Nº"))
        txtAdress.setText("");
        txtAdress.setForeground(Color.black);
    }//GEN-LAST:event_txtAdressFocusGained

    private void txtAdressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdressFocusLost
        if (txtAdress.getText().equals("")){
            txtAdress.setForeground(Color.gray);
            txtAdress.setText("Endereço/Nº");
        }
    }//GEN-LAST:event_txtAdressFocusLost

    private void txtBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusGained
        if (txtBairro.getText().equals("Bairro"))
        txtBairro.setText("");
        txtBairro.setForeground(Color.black);
    }//GEN-LAST:event_txtBairroFocusGained

    private void txtBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBairroFocusLost
        if (txtBairro.getText().equals("")){
            txtBairro.setForeground(Color.gray);
            txtBairro.setText("Bairro");
        }
    }//GEN-LAST:event_txtBairroFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if (txtCpf.getText().equals("CPF"))
        txtCpf.setText("");
        txtCpf.setForeground(Color.black);
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if (txtCpf.getText().equals("")){
            txtCpf.setForeground(Color.gray);
            txtCpf.setText("CPF");
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        btnPesquisar.setBackground(Color.blue);
        btnPesquisar.setForeground(Color.white);
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        btnPesquisar.setBackground(Color.white);
        btnPesquisar.setForeground(Color.blue);
    }//GEN-LAST:event_btnPesquisarMouseExited

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
            java.util.logging.Logger.getLogger(exibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exibirClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new exibirClientes().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(exibirClientes.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAdress;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtBorn;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
