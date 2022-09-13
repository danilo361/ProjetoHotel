/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelrodrigues;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;

/**
 *
 * @author danil
 */
public class Principal extends javax.swing.JFrame {

    File arquivo1 = new File("Quarto1.txt");
    File arquivo2 = new File("Quarto2.txt");
    File arquivo3 = new File("Quarto3.txt");
    File arquivo4 = new File("Quarto4.txt");
    File arquivo5 = new File("Quarto5.txt");
    File arquivo6 = new File("Quarto6.txt");
    File arquivo7 = new File("Quarto7.txt");
    File arquivo8 = new File("Quarto8.txt");
    File arquivo = new File("nulo");

    void cor_cancelar() {

        if (TBQuarto1.getText().equals("Cancelar")) {
            TBQuarto1.setBackground(Color.red);
            TBQuarto1.setText("Ocupado");
        }

        if (TBQuarto2.getText().equals("Cancelar")) {
            TBQuarto2.setBackground(Color.red);
            TBQuarto2.setText("Ocupado");
        }
        if (TBQuarto3.getText().equals("Cancelar")) {
            TBQuarto3.setBackground(Color.red);
            TBQuarto3.setText("Ocupado");
        }
        if (TBQuarto4.getText().equals("Cancelar")) {
            TBQuarto4.setBackground(Color.red);
            TBQuarto4.setText("Ocupado");
        }
        if (TBQuarto5.getText().equals("Cancelar")) {
            TBQuarto5.setBackground(Color.red);
            TBQuarto5.setText("Ocupado");
        }
        if (TBQuarto6.getText().equals("Cancelar")) {
            TBQuarto6.setBackground(Color.red);
            TBQuarto6.setText("Ocupado");
        }
        if (TBQuarto7.getText().equals("Cancelar")) {
            TBQuarto7.setBackground(Color.red);
            TBQuarto7.setText("Ocupado");
        }
        if (TBQuarto8.getText().equals("Cancelar")) {
            TBQuarto8.setBackground(Color.red);
            TBQuarto8.setText("Ocupado");
        }
    }

    void alternar() {
        if (TBQuarto1.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto1.setBackground(color);
            TBQuarto1.setText("Livre");

        }
        if (TBQuarto2.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto2.setBackground(color);
            TBQuarto2.setText("Livre");
        }
        if (TBQuarto3.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto3.setBackground(color);
            TBQuarto3.setText("Livre");
        }
        if (TBQuarto4.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto4.setBackground(color);
            TBQuarto4.setText("Livre");
        }
        if (TBQuarto5.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto5.setBackground(color);
            TBQuarto5.setText("Livre");
        }
        if (TBQuarto6.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto6.setBackground(color);
            TBQuarto6.setText("Livre");
        }
        if (TBQuarto7.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto7.setBackground(color);
            TBQuarto7.setText("Livre");
        }
        if (TBQuarto8.getText().equals("Reservando")) {
            Color color = new Color(51, 204, 0);
            TBQuarto8.setBackground(color);
            TBQuarto8.setText("Livre");
        }
    }

    void vazio() {
        if (tfNome.getText().isEmpty() || tfEmail.getText().isEmpty() || tfFone.getText().isEmpty() || tfIdade.getText().isEmpty()
                || tfRua.getText().isEmpty() || tfNumero.getText().isEmpty() || tfBairro.getText().isEmpty() || tfCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deixou algum campo em branco" + "\n" + "Verifique e preencha para prosseguir!");
            return;
        }
    }

    public Principal() {
        initComponents();
        ((JTextField) jdCheckin.getDateEditor()).setEditable(false);
        ((JTextField) jdCheckout.getDateEditor()).setEditable(false);
        setLocationRelativeTo(null);

        if (arquivo1.exists()) {

            try {
                FileReader leitor = new FileReader(arquivo1);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto1.setBackground(Color.red);
                            TBQuarto1.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto1" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }

        if (arquivo2.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo2);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto2.setBackground(Color.red);
                            TBQuarto2.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto2" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo3.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo3);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto3.setBackground(Color.red);
                            TBQuarto3.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto3" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo4.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo4);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto4.setBackground(Color.red);
                            TBQuarto4.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto4" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo5.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo5);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto5.setBackground(Color.red);
                            TBQuarto5.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto5" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo6.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo6);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto6.setBackground(Color.red);
                            TBQuarto6.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto6" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo7.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo7);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto7.setBackground(Color.red);
                            TBQuarto7.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto7" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }
        if (arquivo8.exists()) {
            try {
                FileReader leitor = new FileReader(arquivo8);
                BufferedReader memleitura = new BufferedReader(leitor);
                int cont = 0;
                while (memleitura.ready()) {
                    String linha = memleitura.readLine();
                    cont++;
                    if (cont == 1) {
                        String verifica = linha;
                        if (verifica.equals("Dados do Cliente:")) {
                            TBQuarto8.setBackground(Color.red);
                            TBQuarto8.setText("Ocupado");
                        }
                    }
                    if (cont == 2) {

                        txListaHosp.append("Quarto8" + "\n" + linha + "\n" + "\n");
                    }
                }

            } catch (IOException erro) {
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GroupRES_CAN = new javax.swing.ButtonGroup();
        Group_Sexo = new javax.swing.ButtonGroup();
        GroupQuartos = new javax.swing.ButtonGroup();
        lblCabecalho = new javax.swing.JLabel();
        tfMensagem = new javax.swing.JTextField();
        btReservas = new javax.swing.JButton();
        lblIdade = new javax.swing.JLabel();
        lblnome = new javax.swing.JLabel();
        lbltelefone = new javax.swing.JLabel();
        lblE_mail = new javax.swing.JLabel();
        lblquarto = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblrua = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblsexo = new javax.swing.JLabel();
        rbFem = new javax.swing.JRadioButton();
        rbMasc = new javax.swing.JRadioButton();
        rbReservar = new javax.swing.JRadioButton();
        rbCancelar = new javax.swing.JRadioButton();
        Estado = new javax.swing.JLabel();
        lblcudade = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        btReservar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        tfNumero = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        tfRua = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfFone = new javax.swing.JTextField();
        tfIdade = new javax.swing.JTextField();
        cbUF = new javax.swing.JComboBox<>();
        TBQuarto1 = new javax.swing.JToggleButton();
        lblQuarto1 = new javax.swing.JLabel();
        TBQuarto2 = new javax.swing.JToggleButton();
        lblQuarto3 = new javax.swing.JLabel();
        lblQuarto2 = new javax.swing.JLabel();
        TBQuarto4 = new javax.swing.JToggleButton();
        lblQuarto4 = new javax.swing.JLabel();
        TBQuarto3 = new javax.swing.JToggleButton();
        TBQuarto5 = new javax.swing.JToggleButton();
        lblQuarto5 = new javax.swing.JLabel();
        TBQuarto6 = new javax.swing.JToggleButton();
        lblQuarto6 = new javax.swing.JLabel();
        lblQuarto7 = new javax.swing.JLabel();
        TBQuarto7 = new javax.swing.JToggleButton();
        lblQuarto8 = new javax.swing.JLabel();
        TBQuarto8 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txListaHosp = new javax.swing.JTextArea();
        lblChecout = new javax.swing.JLabel();
        lblCheckin = new javax.swing.JLabel();
        cbPessoas = new javax.swing.JComboBox<>();
        lblNumero_Pessoas = new javax.swing.JLabel();
        lblHospedados = new javax.swing.JLabel();
        BTCancelar = new javax.swing.JButton();
        jdCheckin = new com.toedter.calendar.JDateChooser();
        jdCheckout = new com.toedter.calendar.JDateChooser();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel Rodrigues");
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        lblCabecalho.setFont(new java.awt.Font("Schadow BT", 0, 18)); // NOI18N
        lblCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lblCabecalho.setText("Reservar/Cancelar hospedagem");
        getContentPane().add(lblCabecalho);
        lblCabecalho.setBounds(280, 130, 260, 40);

        tfMensagem.setEditable(false);
        tfMensagem.setBackground(new java.awt.Color(0, 0, 0));
        tfMensagem.setForeground(new java.awt.Color(255, 255, 255));
        tfMensagem.setBorder(null);
        tfMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMensagemActionPerformed(evt);
            }
        });
        getContentPane().add(tfMensagem);
        tfMensagem.setBounds(40, 160, 560, 20);

        btReservas.setBackground(new java.awt.Color(165, 107, 7));
        btReservas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btReservas.setForeground(new java.awt.Color(255, 255, 255));
        btReservas.setText("VER RESERVAS");
        btReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservasActionPerformed(evt);
            }
        });
        getContentPane().add(btReservas);
        btReservas.setBounds(640, 570, 170, 60);

        lblIdade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblIdade.setForeground(new java.awt.Color(255, 255, 255));
        lblIdade.setText("Idade:");
        getContentPane().add(lblIdade);
        lblIdade.setBounds(40, 270, 50, 40);

        lblnome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblnome.setForeground(new java.awt.Color(255, 255, 255));
        lblnome.setText("Nome:");
        getContentPane().add(lblnome);
        lblnome.setBounds(40, 180, 50, 40);

        lbltelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltelefone.setForeground(new java.awt.Color(255, 255, 255));
        lbltelefone.setText("Telefone:");
        getContentPane().add(lbltelefone);
        lbltelefone.setBounds(40, 240, 80, 40);

        lblE_mail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblE_mail.setForeground(new java.awt.Color(255, 255, 255));
        lblE_mail.setText("Email:");
        getContentPane().add(lblE_mail);
        lblE_mail.setBounds(40, 210, 50, 40);

        lblquarto.setFont(new java.awt.Font("Schadow BT", 0, 18)); // NOI18N
        lblquarto.setForeground(new java.awt.Color(255, 255, 255));
        lblquarto.setText("Quarto");
        getContentPane().add(lblquarto);
        lblquarto.setBounds(270, 430, 100, 30);

        lblEndereco.setFont(new java.awt.Font("Schadow BT", 0, 16)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(360, 310, 110, 40);

        lblrua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblrua.setForeground(new java.awt.Color(255, 255, 255));
        lblrua.setText("Rua:");
        getContentPane().add(lblrua);
        lblrua.setBounds(50, 350, 40, 20);

        lblBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro:");
        getContentPane().add(lblBairro);
        lblBairro.setBounds(40, 390, 50, 20);

        lblsexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsexo.setForeground(new java.awt.Color(255, 255, 255));
        lblsexo.setText("Sexo:");
        getContentPane().add(lblsexo);
        lblsexo.setBounds(480, 180, 60, 30);

        rbFem.setBackground(new java.awt.Color(255, 51, 0));
        Group_Sexo.add(rbFem);
        rbFem.setForeground(new java.awt.Color(255, 255, 255));
        rbFem.setText("Feminino");
        rbFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemActionPerformed(evt);
            }
        });
        getContentPane().add(rbFem);
        rbFem.setBounds(510, 210, 80, 23);

        rbMasc.setBackground(new java.awt.Color(255, 51, 0));
        Group_Sexo.add(rbMasc);
        rbMasc.setForeground(new java.awt.Color(255, 255, 255));
        rbMasc.setSelected(true);
        rbMasc.setText("Masculino");
        rbMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMascActionPerformed(evt);
            }
        });
        getContentPane().add(rbMasc);
        rbMasc.setBounds(420, 210, 80, 23);

        rbReservar.setBackground(new java.awt.Color(255, 51, 0));
        GroupRES_CAN.add(rbReservar);
        rbReservar.setForeground(new java.awt.Color(255, 255, 255));
        rbReservar.setSelected(true);
        rbReservar.setText("Reservar");
        rbReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReservarActionPerformed(evt);
            }
        });
        getContentPane().add(rbReservar);
        rbReservar.setBounds(40, 140, 80, 23);

        rbCancelar.setBackground(new java.awt.Color(255, 51, 0));
        GroupRES_CAN.add(rbCancelar);
        rbCancelar.setForeground(new java.awt.Color(255, 255, 255));
        rbCancelar.setText("Cancelar");
        rbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(rbCancelar);
        rbCancelar.setBounds(130, 140, 80, 23);

        Estado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Estado.setForeground(new java.awt.Color(255, 255, 255));
        Estado.setText("UF:");
        getContentPane().add(Estado);
        Estado.setBounds(570, 340, 30, 40);

        lblcudade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblcudade.setForeground(new java.awt.Color(255, 255, 255));
        lblcudade.setText("Cidade:");
        getContentPane().add(lblcudade);
        lblcudade.setBounds(320, 390, 50, 30);

        lblNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número:");
        getContentPane().add(lblNumero);
        lblNumero.setBounds(400, 350, 70, 20);

        btReservar.setBackground(new java.awt.Color(51, 204, 0));
        btReservar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btReservar.setForeground(new java.awt.Color(255, 255, 255));
        btReservar.setText("RESERVAR");
        btReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservarActionPerformed(evt);
            }
        });
        getContentPane().add(btReservar);
        btReservar.setBounds(640, 430, 170, 60);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(830, 130, 30, 540);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 420, 830, 10);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 312, 830, 10);

        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(tfNumero);
        tfNumero.setBounds(450, 350, 100, 26);

        tfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCidadeKeyTyped(evt);
            }
        });
        getContentPane().add(tfCidade);
        tfCidade.setBounds(370, 390, 180, 26);

        tfBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBairroKeyTyped(evt);
            }
        });
        getContentPane().add(tfBairro);
        tfBairro.setBounds(80, 390, 190, 26);

        tfRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRuaKeyTyped(evt);
            }
        });
        getContentPane().add(tfRua);
        tfRua.setBounds(80, 350, 290, 26);

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });
        getContentPane().add(tfNome);
        tfNome.setBounds(100, 190, 290, 26);

        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEmailKeyTyped(evt);
            }
        });
        getContentPane().add(tfEmail);
        tfEmail.setBounds(100, 220, 290, 26);

        tfFone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFoneKeyTyped(evt);
            }
        });
        getContentPane().add(tfFone);
        tfFone.setBounds(100, 250, 170, 26);

        tfIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdadeActionPerformed(evt);
            }
        });
        tfIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfIdadeKeyTyped(evt);
            }
        });
        getContentPane().add(tfIdade);
        tfIdade.setBounds(100, 280, 40, 26);

        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        getContentPane().add(cbUF);
        cbUF.setBounds(600, 350, 80, 30);

        TBQuarto1.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto1);
        TBQuarto1.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto1.setText("Livre");
        TBQuarto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto1ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto1);
        TBQuarto1.setBounds(40, 500, 120, 50);

        lblQuarto1.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto1.setText("Quarto 1");
        getContentPane().add(lblQuarto1);
        lblQuarto1.setBounds(80, 480, 50, 14);

        TBQuarto2.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto2);
        TBQuarto2.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto2.setText("Livre");
        TBQuarto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto2ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto2);
        TBQuarto2.setBounds(170, 500, 120, 50);

        lblQuarto3.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto3.setText("Quarto 3");
        getContentPane().add(lblQuarto3);
        lblQuarto3.setBounds(340, 480, 50, 14);

        lblQuarto2.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto2.setText("Quarto 2");
        getContentPane().add(lblQuarto2);
        lblQuarto2.setBounds(210, 480, 50, 14);

        TBQuarto4.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto4);
        TBQuarto4.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto4.setText("Livre");
        TBQuarto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto4ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto4);
        TBQuarto4.setBounds(430, 500, 120, 50);

        lblQuarto4.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto4.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto4.setText("Quarto 4");
        getContentPane().add(lblQuarto4);
        lblQuarto4.setBounds(470, 480, 50, 14);

        TBQuarto3.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto3);
        TBQuarto3.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto3.setText("Livre");
        TBQuarto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto3ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto3);
        TBQuarto3.setBounds(300, 500, 120, 50);

        TBQuarto5.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto5);
        TBQuarto5.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto5.setText("Livre");
        TBQuarto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto5ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto5);
        TBQuarto5.setBounds(40, 580, 120, 50);

        lblQuarto5.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto5.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto5.setText("Quarto 5");
        getContentPane().add(lblQuarto5);
        lblQuarto5.setBounds(80, 560, 50, 14);

        TBQuarto6.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto6);
        TBQuarto6.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto6.setText("Livre");
        TBQuarto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto6ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto6);
        TBQuarto6.setBounds(170, 580, 120, 50);

        lblQuarto6.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto6.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto6.setText("Quarto 6");
        getContentPane().add(lblQuarto6);
        lblQuarto6.setBounds(210, 560, 50, 14);

        lblQuarto7.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto7.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto7.setText("Quarto 7");
        getContentPane().add(lblQuarto7);
        lblQuarto7.setBounds(340, 560, 50, 14);

        TBQuarto7.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto7);
        TBQuarto7.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto7.setText("Livre");
        TBQuarto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto7ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto7);
        TBQuarto7.setBounds(300, 580, 120, 50);

        lblQuarto8.setBackground(new java.awt.Color(0, 0, 0));
        lblQuarto8.setForeground(new java.awt.Color(255, 255, 255));
        lblQuarto8.setText("Quarto 8");
        getContentPane().add(lblQuarto8);
        lblQuarto8.setBounds(470, 560, 50, 14);

        TBQuarto8.setBackground(new java.awt.Color(51, 204, 0));
        GroupQuartos.add(TBQuarto8);
        TBQuarto8.setForeground(new java.awt.Color(255, 255, 255));
        TBQuarto8.setText("Livre");
        TBQuarto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBQuarto8ActionPerformed(evt);
            }
        });
        getContentPane().add(TBQuarto8);
        TBQuarto8.setBounds(430, 580, 120, 50);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(100, 240));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(100, 240));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(100, 240));

        txListaHosp.setEditable(false);
        txListaHosp.setColumns(20);
        txListaHosp.setRows(5);
        txListaHosp.setAutoscrolls(false);
        txListaHosp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 2));
        txListaHosp.setMaximumSize(new java.awt.Dimension(100, 240));
        txListaHosp.setMinimumSize(new java.awt.Dimension(100, 240));
        txListaHosp.setPreferredSize(new java.awt.Dimension(100, 240));
        jScrollPane1.setViewportView(txListaHosp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(900, 140, 240, 460);

        lblChecout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblChecout.setForeground(new java.awt.Color(255, 255, 255));
        lblChecout.setText("Check-out");
        getContentPane().add(lblChecout);
        lblChecout.setBounds(700, 250, 80, 17);

        lblCheckin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCheckin.setForeground(new java.awt.Color(255, 255, 255));
        lblCheckin.setText("Check-in");
        getContentPane().add(lblCheckin);
        lblCheckin.setBounds(700, 190, 60, 17);

        cbPessoas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Pessoa", "2 Pessoas", "3 Pessoas", "4 Pessoas", "5 Pessoas" }));
        getContentPane().add(cbPessoas);
        cbPessoas.setBounds(420, 280, 130, 25);

        lblNumero_Pessoas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNumero_Pessoas.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero_Pessoas.setText("Número de Pessoas:");
        getContentPane().add(lblNumero_Pessoas);
        lblNumero_Pessoas.setBounds(420, 260, 130, 20);

        lblHospedados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHospedados.setForeground(new java.awt.Color(255, 255, 255));
        lblHospedados.setText("Hospedados");
        getContentPane().add(lblHospedados);
        lblHospedados.setBounds(950, 110, 130, 17);

        BTCancelar.setBackground(new java.awt.Color(239, 0, 0));
        BTCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTCancelar.setForeground(new java.awt.Color(255, 255, 255));
        BTCancelar.setText("CANCELAR RESERVA");
        BTCancelar.setEnabled(false);
        BTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BTCancelar);
        BTCancelar.setBounds(640, 500, 170, 60);

        jdCheckin.setDateFormatString("d/MM/y");
        getContentPane().add(jdCheckin);
        jdCheckin.setBounds(660, 210, 140, 30);

        jdCheckout.setDateFormatString("d/MM/y");
        getContentPane().add(jdCheckout);
        jdCheckout.setBounds(660, 270, 140, 30);

        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelrodrigues/BackgroundHotel.png"))); // NOI18N
        lblBackground.setAlignmentY(0.0F);
        lblBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblBackground.setMaximumSize(new java.awt.Dimension(800, 600));
        lblBackground.setMinimumSize(new java.awt.Dimension(800, 600));
        lblBackground.setPreferredSize(new java.awt.Dimension(800, 600));
        lblBackground.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblBackgroundKeyTyped(evt);
            }
        });
        getContentPane().add(lblBackground);
        lblBackground.setBounds(0, -20, 1200, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void rbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCancelarActionPerformed
        alternar();
        if (rbCancelar.isSelected()) {
            Color color = new Color(255, 51, 0);
            tfMensagem.setBackground(color);
            tfMensagem.setText("  ATENÇÃO: Selecione o quarto para efetuar o cancelamento e clique em próximo!");
            cbPessoas.setEnabled(false);
            BTCancelar.setEnabled(true);
            btReservar.setEnabled(false);
            jdCheckin.setEnabled(false);
            jdCheckout.setEnabled(false);
            tfNome.setEditable(false);
            tfNome.setText("");
            tfNome.setBackground(color);
            rbFem.setEnabled(false);
            rbMasc.setEnabled(false);
            cbUF.setEnabled(false);
            cbUF.setSelectedIndex(0);
            tfEmail.setEditable(false);
            tfEmail.setText("");
            tfEmail.setBackground(color);
            tfBairro.setEditable(false);
            tfBairro.setText("");
            tfBairro.setBackground(color);
            tfIdade.setEditable(false);
            tfIdade.setText("");
            tfIdade.setBackground(color);
            tfNumero.setEditable(false);
            tfNumero.setText("");
            tfNumero.setBackground(color);
            tfRua.setEditable(false);
            tfRua.setText("");
            tfRua.setBackground(color);
            tfFone.setEditable(false);
            tfFone.setText("");
            tfFone.setBackground(color);
            tfCidade.setEditable(false);
            tfCidade.setText("");
            tfCidade.setBackground(color);
            rbMasc.setSelected(true);
            if (TBQuarto1.getText().equals("Livre") || TBQuarto1.getText().equals("Reservando")) {
                TBQuarto1.setEnabled(false);
            }
            if (TBQuarto2.getText().equals("Livre") || TBQuarto2.getText().equals("Reservando")) {
                TBQuarto2.setEnabled(false);
            }
            if (TBQuarto3.getText().equals("Livre") || TBQuarto3.getText().equals("Reservando")) {
                TBQuarto3.setEnabled(false);
            }
            if (TBQuarto4.getText().equals("Livre") || TBQuarto4.getText().equals("Reservando")) {
                TBQuarto4.setEnabled(false);
            }
            if (TBQuarto5.getText().equals("Livre") || TBQuarto5.getText().equals("Reservando")) {
                TBQuarto5.setEnabled(false);
            }
            if (TBQuarto6.getText().equals("Livre") || TBQuarto6.getText().equals("Reservando")) {
                TBQuarto6.setEnabled(false);
            }
            if (TBQuarto7.getText().equals("Livre") || TBQuarto7.getText().equals("Reservando")) {
                TBQuarto7.setEnabled(false);
            }
            if (TBQuarto8.getText().equals("Livre") || TBQuarto1.getText().equals("Reservando")) {
                TBQuarto8.setEnabled(false);
            }
            if (!TBQuarto1.getBackground().equals(color.red) && !TBQuarto2.getBackground().equals(color.red) && !TBQuarto3.getBackground().equals(color.red)
                    && !TBQuarto4.getBackground().equals(color.red) && !TBQuarto5.getBackground().equals(color.red) && !TBQuarto6.getBackground().equals(color.red)
                    && !TBQuarto7.getBackground().equals(color.red) && !TBQuarto8.getBackground().equals(color.red)) {
                JOptionPane.showMessageDialog(this, "Não há Hospedes no momento!");
            }

        }
    }//GEN-LAST:event_rbCancelarActionPerformed

    private void rbMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMascActionPerformed
        rbMasc.setEnabled(rbReservar.isSelected());

    }//GEN-LAST:event_rbMascActionPerformed

    private void rbReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReservarActionPerformed
        cor_cancelar();

        if (rbReservar.isSelected()) {
            cbPessoas.setEnabled(true);
            btReservar.setEnabled(true);
            BTCancelar.setEnabled(false);
            jdCheckin.setEnabled(true);
            jdCheckout.setEnabled(true);
            tfNome.setEditable(true);
            tfNome.setBackground(Color.WHITE);
            rbFem.setEnabled(true);
            rbMasc.setEnabled(true);
            tfEmail.setEditable(true);
            tfEmail.setBackground(Color.WHITE);
            tfBairro.setEditable(true);
            tfBairro.setBackground(Color.WHITE);
            tfIdade.setEditable(true);
            tfIdade.setBackground(Color.WHITE);
            tfNumero.setEditable(true);
            tfNumero.setBackground(Color.WHITE);
            tfRua.setEditable(true);
            tfRua.setBackground(Color.WHITE);
            tfFone.setEditable(true);
            tfFone.setBackground(Color.WHITE);
            tfCidade.setEditable(true);
            tfCidade.setBackground(Color.WHITE);
            tfMensagem.setText("");
            tfMensagem.setBackground(Color.black);
            cbUF.setEnabled(true);
            TBQuarto1.setEnabled(true);
            TBQuarto2.setEnabled(true);
            TBQuarto3.setEnabled(true);
            TBQuarto4.setEnabled(true);
            TBQuarto5.setEnabled(true);
            TBQuarto6.setEnabled(true);
            TBQuarto7.setEnabled(true);
            TBQuarto8.setEnabled(true);

        }
    }//GEN-LAST:event_rbReservarActionPerformed

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed


    }//GEN-LAST:event_tfNomeActionPerformed

    private void rbFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemActionPerformed


    }//GEN-LAST:event_rbFemActionPerformed

    private void tfMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMensagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMensagemActionPerformed

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyTyped
        String caracteres = "*!/-+-=><?#$%¨&*()";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
}    }//GEN-LAST:event_tfEmailKeyTyped

    private void tfFoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFoneKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvxyzwABCDEFGHIJKLMNOPQRSTUVXYZW+*/-!@#$%¨&*(*)_;.,/|="
                + "";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfFoneKeyTyped

    private void tfRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRuaKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfRuaKeyTyped

    private void tfBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBairroKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfBairroKeyTyped

    private void lblBackgroundKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblBackgroundKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_lblBackgroundKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvxyzwABCDEFGHIJKLMNOPQRSTUVXYZW+*/-!@#$%¨&*(*)_;.,/|="
                + "";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdadeActionPerformed

    private void tfIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdadeKeyTyped
        String caracteres = "abcdefghijklmnopqrstuvxyzwABCDEFGHIJKLMNOPQRSTUVXYZW+*/-!@#$%¨&*(*)_;.,/|="
                + "";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfIdadeKeyTyped

    private void tfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyTyped
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCidadeKeyTyped

    private void TBQuarto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto2ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto2.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto2.setText("Cancelar");
            TBQuarto2.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto2.getBackground().equals(Color.black)) {
            TBQuarto2.setText("Cancelar");
            TBQuarto2.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto2.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto2.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto2.setBackground(color);
                TBQuarto2.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto2ActionPerformed

    private void TBQuarto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto3ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto3.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto3.setText("Cancelar");
            TBQuarto3.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto3.getBackground().equals(Color.black)) {
            TBQuarto3.setText("Cancelar");
            TBQuarto3.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto3.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto3.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto3.setBackground(color);
                TBQuarto3.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto3ActionPerformed

    private void TBQuarto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto4ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto4.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto4.setText("Cancelar");
            TBQuarto4.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto4.getBackground().equals(Color.black)) {
            TBQuarto4.setText("Cancelar");
            TBQuarto4.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto4.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto4.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto4.setBackground(color);
                TBQuarto4.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto4ActionPerformed

    private void TBQuarto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto5ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto5.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto5.setText("Cancelar");
            TBQuarto5.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto5.getBackground().equals(Color.black)) {
            TBQuarto5.setText("Cancelar");
            TBQuarto5.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto5.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto5.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto5.setBackground(color);
                TBQuarto5.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto5ActionPerformed

    private void TBQuarto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto6ActionPerformed
        if (rbCancelar.isSelected() == true && TBQuarto6.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto6.setText("Cancelar");
            TBQuarto6.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto6.getBackground().equals(Color.black)) {
            TBQuarto6.setText("Cancelar");
            TBQuarto6.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto6.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto6.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto6.setBackground(color);
                TBQuarto6.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto6ActionPerformed

    private void TBQuarto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto7ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto7.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto7.setText("Cancelar");
            TBQuarto7.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto7.getBackground().equals(Color.black)) {
            TBQuarto7.setText("Cancelar");
            TBQuarto7.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto7.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto7.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto7.setBackground(color);
                TBQuarto7.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto7ActionPerformed

    private void TBQuarto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto8ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto8.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto8.setText("Cancelar");
            TBQuarto8.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto8.getBackground().equals(Color.black)) {
            TBQuarto8.setText("Cancelar");
            TBQuarto8.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto8.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto8.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto8.setBackground(color);
                TBQuarto8.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto8ActionPerformed

    private void TBQuarto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBQuarto1ActionPerformed

        if (rbCancelar.isSelected() == true && TBQuarto1.getBackground().equals(Color.red)) {
            cor_cancelar();
            TBQuarto1.setText("Cancelar");
            TBQuarto1.setBackground(Color.black);
        } else if (rbCancelar.isSelected() == true && TBQuarto1.getBackground().equals(Color.black)) {
            TBQuarto1.setText("Cancelar");
            TBQuarto1.setBackground(Color.black);
        } else {
            alternar();
            if (TBQuarto1.getText().equals("Ocupado")) {
                JOptionPane.showMessageDialog(this, "Este Quarto está ocupado" + "\n" + "Selecione outro quarto!");
                return;
            }
            if (TBQuarto1.isSelected() && rbReservar.isSelected()) {
                Color color = new Color(255, 51, 0);
                TBQuarto1.setBackground(color);
                TBQuarto1.setText("Reservando");
            } else {
                return;
            }
        }
    }//GEN-LAST:event_TBQuarto1ActionPerformed

    private void btReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservarActionPerformed

        if (tfNome.getText().isEmpty() || tfEmail.getText().isEmpty() || tfFone.getText().isEmpty() || tfIdade.getText().isEmpty()
                || tfRua.getText().isEmpty() || tfNumero.getText().isEmpty() || tfBairro.getText().isEmpty() || tfCidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deixou algum campo em branco" + "\n" + "Verifique e preencha para prosseguir!");
            return;
        } else if (((JTextField) jdCheckin.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você não selecionou a data de Check-in!");
            return;
        } else if (((JTextField) jdCheckout.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você não selecionou a data de Check-out!");
            return;
        } else if (TBQuarto1.getText().equals("Reservando") || TBQuarto2.getText().equals("Reservando") || TBQuarto3.getText().equals("Reservando") || TBQuarto4.getText().equals("Reservando")
                || TBQuarto5.getText().equals("Reservando") || TBQuarto6.getText().equals("Reservando") || TBQuarto7.getText().equals("Reservando") || TBQuarto8.getText().equals("Reservando")) {

            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja confirmar a reserva ?", "Hotel Rodrigues", dialogButton);
            if (dialogResult == 0) {
                if (TBQuarto1.getText().equals("Reservando") && TBQuarto1.isSelected()) {

                    //Escrita
                    try {
                        FileWriter escritor = new FileWriter(arquivo1);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");

                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();

                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");

                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();

                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto2.getText().equals("Reservando") && TBQuarto2.isSelected()) {
                    try {

                        FileWriter escritor = new FileWriter(arquivo2);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");

                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto3.getText().equals("Reservando") && TBQuarto3.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo3);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");

                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto4.getText().equals("Reservando") && TBQuarto4.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo4);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto5.getText().equals("Reservando") && TBQuarto5.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo5);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();

                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto6.getText().equals("Reservando") && TBQuarto6.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo6);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");
                        memescritor.newLine();

                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto7.getText().equals("Reservando") && TBQuarto7.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo7);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }
                        memescritor.newLine();

                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();

                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                } else if (TBQuarto8.getText().equals("Reservando") && TBQuarto8.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo8);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("Dados do Cliente:");
                        memescritor.newLine();
                        memescritor.write("Nome: " + tfNome.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Idade: " + tfIdade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Email: " + tfEmail.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Telefone: " + tfFone.getText().trim());
                        memescritor.newLine();
                        if (rbMasc.isSelected()) {
                            memescritor.write("Sexo: Mascullino");
                        } else {
                            memescritor.write("Sexo: Feminino");
                        }

                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Endereco:-----");
                        memescritor.newLine();
                        memescritor.write("Rua: " + tfRua.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Numero: " + tfNumero.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Bairro: " + tfBairro.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Cidade: " + tfCidade.getText().trim());
                        memescritor.newLine();
                        memescritor.write("Estado: " + cbUF.getSelectedItem());
                        memescritor.newLine();
                        memescritor.write("========================================================");
                        memescritor.newLine();
                        memescritor.write("------Reserva:-----");
                        memescritor.newLine();
                        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
                        memescritor.write("Check-in: " + data.format(jdCheckin.getDate()));
                        memescritor.newLine();
                        memescritor.write("Check-out: " + data.format(jdCheckout.getDate()));
                        memescritor.newLine();
                        memescritor.write("Numero de pessoas: " + cbPessoas.getSelectedItem());

                        memescritor.close();
                        escritor.close();
                    } catch (IOException Erro) {

                    }

                    Pagina2 form2 = new Pagina2();
                    form2.setVisible(true);

                    dispose();
                }

            } else {
                alternar();
                return;
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione um quarto!");
        }


    }//GEN-LAST:event_btReservarActionPerformed

    private void BTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTCancelarActionPerformed
        if (!TBQuarto1.isSelected() && !TBQuarto2.isSelected() && !TBQuarto3.isSelected() && !TBQuarto4.isSelected()
                && !TBQuarto5.isSelected() && !TBQuarto6.isSelected() && !TBQuarto7.isSelected() && !TBQuarto8.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione um Quarto para cancelar a reserva");
        } else {
            int dialogButton = JOptionPane.OK_CANCEL_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Deseja encerrar a reserva ?", "Title on Box", dialogButton);
            if (dialogResult == 0) {
                if (TBQuarto1.isSelected() && TBQuarto1.getText().equals("Cancelar")) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo1);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto1.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }

                if (TBQuarto2.getText().equals("Cancelar") && rbCancelar.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo2);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto2.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }
                if (TBQuarto3.getText().equals("Cancelar") && rbCancelar.isSelected()) {
                    try {
                        FileWriter escritor = new FileWriter(arquivo3);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto3.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }
                if (TBQuarto4.getText().equals("Cancelar") && rbCancelar.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo4);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto4.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }
                if (TBQuarto5.getText().equals("Cancelar") && rbCancelar.isSelected()) {

                    try {
                        FileWriter escritor = new FileWriter(arquivo5);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto5.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }

                if (TBQuarto6.getText().equals("Cancelar") && rbCancelar.isSelected()) {
                    try {
                        FileWriter escritor = new FileWriter(arquivo6);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto6.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        Principal form2 = new Principal();
                        form2.setVisible(false);
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }

                } else if (TBQuarto7.getText().equals("Cancelar") && rbCancelar.isSelected()) {
                    try {
                        FileWriter escritor = new FileWriter(arquivo7);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto7.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                } else if (TBQuarto8.getText().equals("Cancelar") && rbCancelar.isSelected()) {
                    try {
                        FileWriter escritor = new FileWriter(arquivo8);
                        BufferedWriter memescritor = new BufferedWriter(escritor);
                        memescritor.write("");
                        TBQuarto8.setBackground(Color.green);
                        Pagina3 form = new Pagina3();
                        dispose();
                        form.setVisible(true);
                    } catch (IOException erro) {

                    }
                }

            } else {
                cor_cancelar();
                return;
            }
        }

    }//GEN-LAST:event_BTCancelarActionPerformed

    private void btReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservasActionPerformed
        try {
            Clientes form2 = new Clientes();
            form2.setVisible(true);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btReservasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTCancelar;
    private javax.swing.JLabel Estado;
    private javax.swing.ButtonGroup GroupQuartos;
    private javax.swing.ButtonGroup GroupRES_CAN;
    private javax.swing.ButtonGroup Group_Sexo;
    private javax.swing.JToggleButton TBQuarto1;
    private javax.swing.JToggleButton TBQuarto2;
    private javax.swing.JToggleButton TBQuarto3;
    private javax.swing.JToggleButton TBQuarto4;
    private javax.swing.JToggleButton TBQuarto5;
    private javax.swing.JToggleButton TBQuarto6;
    private javax.swing.JToggleButton TBQuarto7;
    private javax.swing.JToggleButton TBQuarto8;
    private javax.swing.JButton btReservar;
    private javax.swing.JButton btReservas;
    private javax.swing.JComboBox<String> cbPessoas;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdCheckin;
    private com.toedter.calendar.JDateChooser jdCheckout;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCabecalho;
    private javax.swing.JLabel lblCheckin;
    private javax.swing.JLabel lblChecout;
    private javax.swing.JLabel lblE_mail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblHospedados;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero_Pessoas;
    private javax.swing.JLabel lblQuarto1;
    private javax.swing.JLabel lblQuarto2;
    private javax.swing.JLabel lblQuarto3;
    private javax.swing.JLabel lblQuarto4;
    private javax.swing.JLabel lblQuarto5;
    private javax.swing.JLabel lblQuarto6;
    private javax.swing.JLabel lblQuarto7;
    private javax.swing.JLabel lblQuarto8;
    private javax.swing.JLabel lblcudade;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblquarto;
    private javax.swing.JLabel lblrua;
    private javax.swing.JLabel lblsexo;
    private javax.swing.JLabel lbltelefone;
    private javax.swing.JRadioButton rbCancelar;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JRadioButton rbReservar;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFone;
    private javax.swing.JTextField tfIdade;
    private javax.swing.JTextField tfMensagem;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    private javax.swing.JTextArea txListaHosp;
    // End of variables declaration//GEN-END:variables

    private int getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public javax.swing.JLabel getEstado() {
        return Estado;
    }

    public void setEstado(javax.swing.JLabel Estado) {
        this.Estado = Estado;
    }

    public javax.swing.ButtonGroup getGroupRES_CAN() {
        return GroupRES_CAN;
    }

    public void setGroupRES_CAN(javax.swing.ButtonGroup GroupRES_CAN) {
        this.GroupRES_CAN = GroupRES_CAN;
    }

    public javax.swing.ButtonGroup getGroup_Sexo() {
        return Group_Sexo;
    }

    public void setGroup_Sexo(javax.swing.ButtonGroup Group_Sexo) {
        this.Group_Sexo = Group_Sexo;
    }

    public javax.swing.JComboBox<String> getCbUF() {
        return cbUF;
    }

    public void setCbUF(javax.swing.JComboBox<String> cbUF) {
        this.cbUF = cbUF;
    }

    public javax.swing.JButton getjButton1() {
        return btReservar;
    }

    public void setjButton1(javax.swing.JButton jButton1) {
        this.btReservar = jButton1;
    }

    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public javax.swing.JLabel getLblBackground() {
        return lblBackground;
    }

    public void setLblBackground(javax.swing.JLabel lblBackground) {
        this.lblBackground = lblBackground;
    }

    public javax.swing.JLabel getLblBairro() {
        return lblBairro;
    }

    public void setLblBairro(javax.swing.JLabel lblBairro) {
        this.lblBairro = lblBairro;
    }

    public javax.swing.JLabel getLblCabecalho() {
        return lblCabecalho;
    }

    public void setLblCabecalho(javax.swing.JLabel lblCabecalho) {
        this.lblCabecalho = lblCabecalho;
    }

    public javax.swing.JLabel getLblE_mail() {
        return lblE_mail;
    }

    public void setLblE_mail(javax.swing.JLabel lblE_mail) {
        this.lblE_mail = lblE_mail;
    }

    public javax.swing.JLabel getLblEndereco() {
        return lblEndereco;
    }

    public void setLblEndereco(javax.swing.JLabel lblEndereco) {
        this.lblEndereco = lblEndereco;
    }

    public javax.swing.JLabel getLblIdade() {
        return lblIdade;
    }

    public void setLblIdade(javax.swing.JLabel lblIdade) {
        this.lblIdade = lblIdade;
    }

    public javax.swing.JLabel getLblNumero() {
        return lblNumero;
    }

    public void setLblNumero(javax.swing.JLabel lblNumero) {
        this.lblNumero = lblNumero;
    }

    public javax.swing.JLabel getLblcudade() {
        return lblcudade;
    }

    public void setLblcudade(javax.swing.JLabel lblcudade) {
        this.lblcudade = lblcudade;
    }

    public javax.swing.JLabel getLblnome() {
        return lblnome;
    }

    public void setLblnome(javax.swing.JLabel lblnome) {
        this.lblnome = lblnome;
    }

    public javax.swing.JLabel getLblrua() {
        return lblrua;
    }

    public void setLblrua(javax.swing.JLabel lblrua) {
        this.lblrua = lblrua;
    }

    public javax.swing.JLabel getLblsexo() {
        return lblsexo;
    }

    public void setLblsexo(javax.swing.JLabel lblsexo) {
        this.lblsexo = lblsexo;
    }

    public javax.swing.JLabel getLbltelefone() {
        return lbltelefone;
    }

    public void setLbltelefone(javax.swing.JLabel lbltelefone) {
        this.lbltelefone = lbltelefone;
    }

    public javax.swing.JRadioButton getRbCancelar() {
        return rbCancelar;
    }

    public void setRbCancelar(javax.swing.JRadioButton rbCancelar) {
        this.rbCancelar = rbCancelar;
    }

    public javax.swing.JRadioButton getRbFem() {
        return rbFem;
    }

    public void setRbFem(javax.swing.JRadioButton rbFem) {
        this.rbFem = rbFem;
    }

    public javax.swing.JRadioButton getRbMasc() {
        return rbMasc;
    }

    public void setRbMasc(javax.swing.JRadioButton rbMasc) {
        this.rbMasc = rbMasc;
    }

    public javax.swing.JRadioButton getRbReservar() {
        return rbReservar;
    }

    public void setRbReservar(javax.swing.JRadioButton rbReservar) {
        this.rbReservar = rbReservar;
    }

    public javax.swing.JTextField getTfBairro() {
        return tfBairro;
    }

    public void setTfBairro(javax.swing.JTextField tfBairro) {
        this.tfBairro = tfBairro;
    }

    public javax.swing.JTextField getTfCidade() {
        return tfCidade;
    }

    public void setTfCidade(javax.swing.JTextField tfCidade) {
        this.tfCidade = tfCidade;
    }

    public javax.swing.JTextField getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(javax.swing.JTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    public javax.swing.JTextField getTfFone() {
        return tfFone;
    }

    public void setTfFone(javax.swing.JTextField tfFone) {
        this.tfFone = tfFone;
    }

    public javax.swing.JTextField getTfIdade() {
        return tfIdade;
    }

    public void setTfIdade(javax.swing.JTextField tfIdade) {
        this.tfIdade = tfIdade;
    }

    public javax.swing.JTextField getTfMensagem() {
        return tfMensagem;
    }

    public void setTfMensagem(javax.swing.JTextField tfMensagem) {
        this.tfMensagem = tfMensagem;
    }

    public javax.swing.JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(javax.swing.JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public javax.swing.JTextField getTfNumero() {
        return tfNumero;
    }

    public void setTfNumero(javax.swing.JTextField tfNumero) {
        this.tfNumero = tfNumero;
    }

    public javax.swing.JTextField getTfRua() {
        return tfRua;
    }

    public void setTfRua(javax.swing.JTextField tfRua) {
        this.tfRua = tfRua;
    }
}
