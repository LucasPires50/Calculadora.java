/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

import Operacoes.OperaçoesAvançadas;
import Operacoes.OperaçoesBasicas;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Lucas Albuquerque Pires
 */
public class InterFaceCalculadora extends javax.swing.JFrame {

    String display;
    OperaçoesBasicas op = new OperaçoesBasicas();
    OperaçoesAvançadas opA = new OperaçoesAvançadas();
    
    /**
     * Creates new form InterFaceCalculadora
     */
    public InterFaceCalculadora() {
        initComponents();
        //para colocar a borda no painel
        textCalculo.setBorder(new EtchedBorder());
        this.display = "";
        
    }
    //variáveis globais
    double valor1, valor2, resultado = 0;
    char operacao;
    String copia = "";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnlMutiplicar = new javax.swing.JButton();
        btnlDividir = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();
        listHistoricoDeCalculos = new java.awt.List();
        btnResultado = new javax.swing.JButton();
        textCalculo = new javax.swing.JTextField();
        bntDeletar = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        bntPotencia = new javax.swing.JButton();
        bntPorcentagem = new javax.swing.JButton();
        labelCalculo = new javax.swing.JLabel();
        bntMaisOuMenos = new javax.swing.JButton();
        bntSeno = new javax.swing.JButton();
        bntCosseno = new javax.swing.JButton();
        bntTangente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCalculadoraSair = new javax.swing.JMenu();
        menuSairDaCalculadora = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuItemCopiar = new javax.swing.JMenuItem();
        menuItemColar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora JAVA");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setForeground(new java.awt.Color(51, 255, 51));
        btn1.setText("1");
        btn1.setToolTipText("Um");
        btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn1KeyPressed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setForeground(new java.awt.Color(51, 255, 51));
        btn3.setText("3");
        btn3.setToolTipText("Três");
        btn3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn3KeyPressed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setForeground(new java.awt.Color(51, 255, 51));
        btn2.setText("2");
        btn2.setToolTipText("Dois");
        btn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn2KeyPressed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setForeground(new java.awt.Color(51, 255, 51));
        btn5.setText("5");
        btn5.setToolTipText("Cinco");
        btn5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn5KeyPressed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setForeground(new java.awt.Color(51, 255, 51));
        btn4.setText("4");
        btn4.setToolTipText("Quatro");
        btn4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn4KeyPressed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setForeground(new java.awt.Color(51, 255, 51));
        btn7.setText("7");
        btn7.setToolTipText("Sete");
        btn7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn7KeyPressed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setForeground(new java.awt.Color(51, 255, 51));
        btn6.setText("6");
        btn6.setToolTipText("Seis");
        btn6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn6KeyPressed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setForeground(new java.awt.Color(51, 255, 51));
        btn9.setText("9");
        btn9.setToolTipText("Nove");
        btn9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn9KeyPressed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setForeground(new java.awt.Color(51, 255, 51));
        btn8.setText("8");
        btn8.setToolTipText("Oito");
        btn8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn8KeyPressed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setForeground(new java.awt.Color(51, 255, 51));
        btn0.setText("0");
        btn0.setToolTipText("Zero");
        btn0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btn0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btn0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn0KeyPressed(evt);
            }
        });

        btnlMutiplicar.setBackground(new java.awt.Color(0, 0, 0));
        btnlMutiplicar.setForeground(new java.awt.Color(51, 255, 51));
        btnlMutiplicar.setText("*");
        btnlMutiplicar.setToolTipText("Multiplicação");
        btnlMutiplicar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnlMutiplicar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnlMutiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlMutiplicarActionPerformed(evt);
            }
        });

        btnlDividir.setBackground(new java.awt.Color(0, 0, 0));
        btnlDividir.setForeground(new java.awt.Color(51, 255, 51));
        btnlDividir.setText("/");
        btnlDividir.setToolTipText("Divisão");
        btnlDividir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnlDividir.setPreferredSize(new java.awt.Dimension(50, 50));
        btnlDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlDividirActionPerformed(evt);
            }
        });

        btnSubtrair.setBackground(new java.awt.Color(0, 0, 0));
        btnSubtrair.setForeground(new java.awt.Color(51, 255, 51));
        btnSubtrair.setText("-");
        btnSubtrair.setToolTipText("Subtração");
        btnSubtrair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSubtrair.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        btnSoma.setBackground(new java.awt.Color(0, 0, 0));
        btnSoma.setForeground(new java.awt.Color(51, 255, 51));
        btnSoma.setText("+");
        btnSoma.setToolTipText("Somar");
        btnSoma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnSoma.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSoma.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSoma.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        btnSoma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSomaKeyPressed(evt);
            }
        });

        btnPonto.setBackground(new java.awt.Color(0, 0, 0));
        btnPonto.setForeground(new java.awt.Color(51, 255, 51));
        btnPonto.setText(".");
        btnPonto.setToolTipText("Ponto");
        btnPonto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnPonto.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnLimparTela.setBackground(new java.awt.Color(0, 0, 0));
        btnLimparTela.setForeground(new java.awt.Color(51, 255, 51));
        btnLimparTela.setText("CE");
        btnLimparTela.setToolTipText("Apaga tudo que está no display da calculadora.");
        btnLimparTela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnLimparTela.setMaximumSize(new java.awt.Dimension(40, 40));
        btnLimparTela.setMinimumSize(new java.awt.Dimension(40, 40));
        btnLimparTela.setPreferredSize(new java.awt.Dimension(50, 50));
        btnLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaActionPerformed(evt);
            }
        });

        listHistoricoDeCalculos.setBackground(new java.awt.Color(51, 255, 51));
        listHistoricoDeCalculos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        listHistoricoDeCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listHistoricoDeCalculosActionPerformed(evt);
            }
        });

        btnResultado.setBackground(new java.awt.Color(0, 0, 0));
        btnResultado.setForeground(new java.awt.Color(51, 255, 51));
        btnResultado.setText("=");
        btnResultado.setToolTipText("Igual");
        btnResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnResultado.setPreferredSize(new java.awt.Dimension(50, 50));
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        textCalculo.setBackground(new java.awt.Color(51, 255, 51));
        textCalculo.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        textCalculo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textCalculo.setToolTipText("Display da Calculadora ");
        textCalculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCalculoActionPerformed(evt);
            }
        });
        textCalculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textCalculoKeyPressed(evt);
            }
        });

        bntDeletar.setBackground(new java.awt.Color(0, 0, 0));
        bntDeletar.setForeground(new java.awt.Color(51, 255, 51));
        bntDeletar.setText("Del");
        bntDeletar.setToolTipText("Apaga o ultimo caractere digitado.");
        bntDeletar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntDeletar.setPreferredSize(new java.awt.Dimension(50, 50));
        bntDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeletarActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setBackground(new java.awt.Color(0, 0, 0));
        btnRaizQuadrada.setForeground(new java.awt.Color(51, 255, 51));
        btnRaizQuadrada.setText("√");
        btnRaizQuadrada.setToolTipText("Raiz quadrada ");
        btnRaizQuadrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnRaizQuadrada.setPreferredSize(new java.awt.Dimension(50, 50));
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        bntPotencia.setBackground(new java.awt.Color(0, 0, 0));
        bntPotencia.setForeground(new java.awt.Color(51, 255, 51));
        bntPotencia.setText("^");
        bntPotencia.setToolTipText("Potência ");
        bntPotencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntPotencia.setPreferredSize(new java.awt.Dimension(50, 50));
        bntPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPotenciaActionPerformed(evt);
            }
        });

        bntPorcentagem.setBackground(new java.awt.Color(0, 0, 0));
        bntPorcentagem.setForeground(new java.awt.Color(51, 255, 51));
        bntPorcentagem.setText("%");
        bntPorcentagem.setToolTipText("Cosseno");
        bntPorcentagem.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntPorcentagem.setPreferredSize(new java.awt.Dimension(50, 50));
        bntPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPorcentagemActionPerformed(evt);
            }
        });

        labelCalculo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCalculo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelCalculo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        bntMaisOuMenos.setBackground(new java.awt.Color(0, 0, 0));
        bntMaisOuMenos.setForeground(new java.awt.Color(51, 255, 51));
        bntMaisOuMenos.setText("+/-");
        bntMaisOuMenos.setToolTipText("Muda os sinais para mais ou menos.");
        bntMaisOuMenos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntMaisOuMenos.setPreferredSize(new java.awt.Dimension(50, 50));
        bntMaisOuMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMaisOuMenosActionPerformed(evt);
            }
        });

        bntSeno.setBackground(new java.awt.Color(0, 0, 0));
        bntSeno.setForeground(new java.awt.Color(51, 255, 51));
        bntSeno.setText("sen");
        bntSeno.setToolTipText("Seno");
        bntSeno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntSeno.setPreferredSize(new java.awt.Dimension(50, 50));
        bntSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSenoActionPerformed(evt);
            }
        });

        bntCosseno.setBackground(new java.awt.Color(0, 0, 0));
        bntCosseno.setForeground(new java.awt.Color(51, 255, 51));
        bntCosseno.setText("cos");
        bntCosseno.setToolTipText("Porcentagem");
        bntCosseno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntCosseno.setPreferredSize(new java.awt.Dimension(50, 50));
        bntCosseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCossenoActionPerformed(evt);
            }
        });

        bntTangente.setBackground(new java.awt.Color(0, 0, 0));
        bntTangente.setForeground(new java.awt.Color(51, 255, 51));
        bntTangente.setText("tan");
        bntTangente.setToolTipText("Tangente");
        bntTangente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bntTangente.setPreferredSize(new java.awt.Dimension(50, 50));
        bntTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTangenteActionPerformed(evt);
            }
        });

        menuCalculadoraSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icon.png"))); // NOI18N
        menuCalculadoraSair.setMnemonic('c');
        menuCalculadoraSair.setText("Caculadora");

        menuSairDaCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSairDaCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/delete-button.png"))); // NOI18N
        menuSairDaCalculadora.setMnemonic('s');
        menuSairDaCalculadora.setText("Sair");
        menuSairDaCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairDaCalculadoraActionPerformed(evt);
            }
        });
        menuCalculadoraSair.add(menuSairDaCalculadora);

        jMenuBar1.add(menuCalculadoraSair);

        menuEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/edit-document.png"))); // NOI18N
        menuEditar.setMnemonic('e');
        menuEditar.setText("Editar");

        menuItemCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/copy-content.png"))); // NOI18N
        menuItemCopiar.setMnemonic('c');
        menuItemCopiar.setText("Copiar");
        menuItemCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCopiarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemCopiar);

        menuItemColar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        menuItemColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/copy-paste-document-with-circular-interface-button.png"))); // NOI18N
        menuItemColar.setMnemonic('v');
        menuItemColar.setText("Colar");
        menuItemColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemColarActionPerformed(evt);
            }
        });
        menuEditar.add(menuItemColar);

        jMenuBar1.add(menuEditar);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/focusing-target-to-take-a-photo.png"))); // NOI18N
        jMenu3.setText("Sobre");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/close-button.png"))); // NOI18N
        menuSair.setMnemonic('a');
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCalculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnlMutiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnlDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bntDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bntSeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bntCosseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(bntTangente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntPorcentagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntPotencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listHistoricoDeCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntMaisOuMenos, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntMaisOuMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimparTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlMutiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlDividir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bntPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bntPotencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bntSeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntTangente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bntCosseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(listHistoricoDeCalculos, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        this.pegarValor1();
        operacao = '+';
        this.display = "";
        setarValoresTemporarios();

    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        this.atualizarDisplay('.');

    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        this.pegarValor1();
        operacao = '-';
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void textCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCalculoActionPerformed

    }//GEN-LAST:event_textCalculoActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        this.atualizarDisplay('1');

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        this.atualizarDisplay('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        this.atualizarDisplay('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        this.atualizarDisplay('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        this.atualizarDisplay('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        this.atualizarDisplay('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        this.atualizarDisplay('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        this.atualizarDisplay('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        this.atualizarDisplay('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        this.atualizarDisplay('0');


    }//GEN-LAST:event_btn0ActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        this.pegarValor2();
        this.calcular(operacao);
        this.display = "";
        labelCalculo.setText(labelCalculo.getText()+" "+valor2);

    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnlMutiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlMutiplicarActionPerformed
        this.pegarValor1();
        operacao = '*';
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_btnlMutiplicarActionPerformed

    private void btnlDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlDividirActionPerformed
        this.pegarValor1();
        operacao = '/';
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_btnlDividirActionPerformed

    private void btnLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaActionPerformed
        //apagar tudo que aparece no painel
        textCalculo.setText("");
        this.display = "";
    }//GEN-LAST:event_btnLimparTelaActionPerformed

    private void bntDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeletarActionPerformed
        this.apagarUmPorVez();
    }//GEN-LAST:event_bntDeletarActionPerformed

    private void listHistoricoDeCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listHistoricoDeCalculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listHistoricoDeCalculosActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed
        this.pegarValor1();
        resultado = opA.raizQuadrada(valor1);
        listHistoricoDeCalculos.add(String.valueOf(valor1 + " √ " + " = " + resultado));
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

    private void bntPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPotenciaActionPerformed
        this.pegarValor1();
        operacao = '^';
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_bntPotenciaActionPerformed

    private void bntPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPorcentagemActionPerformed
        this.pegarValor1();
        operacao = '%';
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_bntPorcentagemActionPerformed

    private void textCalculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCalculoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCalculoKeyPressed

    private void btn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1KeyPressed
        if(evt.getKeyChar() == '1'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn1KeyPressed

    private void btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn2KeyPressed
        if(evt.getKeyChar() == '2'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn2KeyPressed

    private void btn3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn3KeyPressed
        if(evt.getKeyChar() == '3'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn3KeyPressed

    private void btn4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn4KeyPressed
        if(evt.getKeyChar() == '4'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn4KeyPressed

    private void btn5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn5KeyPressed
        if(evt.getKeyChar() == '5'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn5KeyPressed

    private void btn6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn6KeyPressed
        if(evt.getKeyChar() == '6'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn6KeyPressed

    private void btn7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn7KeyPressed
        if(evt.getKeyChar() == '7'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn7KeyPressed

    private void btn8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn8KeyPressed
        if(evt.getKeyChar() == '8'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn8KeyPressed

    private void btn9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn9KeyPressed
        if(evt.getKeyChar() == '9'){  
        }
        atualizarDisplay(evt.getKeyChar());
    }//GEN-LAST:event_btn9KeyPressed

    private void btn0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn0KeyPressed
        if(evt.getKeyChar() == '0'){  
        }
        atualizarDisplay(evt.getKeyChar());
        System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_btn0KeyPressed

    private void btnSomaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSomaKeyPressed
      
        if(evt.getKeyChar()== '+'){
          pegarValor1();
          operacao = evt.getKeyChar();
          setarValoresTemporarios();
        
      }
        System.out.println("code: "+evt.getKeyChar());
        
       
       
    }//GEN-LAST:event_btnSomaKeyPressed

    private void bntMaisOuMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMaisOuMenosActionPerformed
        if(display.startsWith("-")){
          display = display.replace("-", "+");
        }else if(display.startsWith("+")){
          display = display.replace("+", "-");
        }else{ 
            display = "-"+display;
        }
        textCalculo.setText(display);
    }//GEN-LAST:event_bntMaisOuMenosActionPerformed

    private void menuSairDaCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairDaCalculadoraActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairDaCalculadoraActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuItemCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCopiarActionPerformed
        copia = this.display;
    }//GEN-LAST:event_menuItemCopiarActionPerformed

    private void menuItemColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemColarActionPerformed
        textCalculo.setText(copia);
    }//GEN-LAST:event_menuItemColarActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        new JFSobre().show();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void bntSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSenoActionPerformed
        this.pegarValor1();
        resultado = opA.seno(valor1);
        listHistoricoDeCalculos.add(String.valueOf(valor1 + " sen " + " = " + resultado));
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_bntSenoActionPerformed

    private void bntCossenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCossenoActionPerformed
        this.pegarValor1();
        resultado = opA.coseno(valor1);
        listHistoricoDeCalculos.add(String.valueOf(valor1 + " cos " + " = " + resultado));
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_bntCossenoActionPerformed

    private void bntTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntTangenteActionPerformed
       this.pegarValor1();
        resultado = opA.tangente(valor1);
        listHistoricoDeCalculos.add(String.valueOf(valor1 + " tan " + " = " + resultado));
        this.display = "";
        setarValoresTemporarios();
    }//GEN-LAST:event_bntTangenteActionPerformed
    /**
     * método captar os elementos dos botões e atualizar o display, para que os
     * elementos apareçam na compo textCalulo
     *
     * @return display
     */
    private void atualizarDisplay(char digito) {

        this.display = this.display + digito;
        textCalculo.setText(this.display);
        

    }

    /**
     * Esse método apaga um número de cada vez.
     *
     * @return apagarUmPorVez
     */
    private void apagarUmPorVez() {
        String valorDoTextCalculo = this.display;
       
        if (valorDoTextCalculo.length() > 0) {
            valorDoTextCalculo = valorDoTextCalculo.substring(0, valorDoTextCalculo.length() - 1);
            textCalculo.setText(valorDoTextCalculo);
            display = valorDoTextCalculo;
        }
        System.out.println(valorDoTextCalculo);

    }

    /**
     * método para armazenar o primeiro valor
     *
     * @return valor 1
     */
    private void pegarValor1() { 
        valor1 = Double.parseDouble(textCalculo.getText());  
        textCalculo.setText("");
        System.out.println("valor1:" + valor1);
    }

    /**
     * método para armazenar o segundo valor
     *
     * @return valor 2
     */
    private void pegarValor2() {
        valor2 = Double.parseDouble(textCalculo.getText());
        textCalculo.setText("");
        System.out.println("valor2:" + valor2);
        if (valor2 == 0 && operacao == '/') {

            JOptionPane.showMessageDialog(null, "Operação inválida!");

        }

    }
    /**
     * Esate método vai mostra os números da operação no momento do 
     * calculo
     */
    public void setarValoresTemporarios(){
        
        labelCalculo.setText(String.valueOf(valor1)+" "+operacao);
     
    }

    /**
     * método para selicionar qual operação vai realizada e mostros o historico
     * de operações
     *
     * @return resultado
     */
    private void calcular(char operacao) {
        
       
        switch (operacao) {
            case '+':
                resultado = op.somar(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " + " + valor2 + " = " + resultado));               
                break;
            case '-':
                resultado = op.subtrair(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " - " + valor2 + " = " + resultado));
                break;
            case '*':
                resultado = op.multiplicar(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " x " + valor2 + " = " + resultado));
                break;
            case '/':
                resultado = op.dividir(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " / " + valor2 + " = " + resultado));
                break;
            case '^':
                resultado = opA.potencia(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " ^ " + valor2 + " = " + resultado));
                break;
            case '%':
                resultado = opA.porcentagem(valor1, valor2);
                listHistoricoDeCalculos.add(String.valueOf(valor1 + " x " + valor2 + " % " + " = " + resultado));
                break;
                
        }
        
        textCalculo.setText(String.valueOf(resultado));
        System.out.println("resultado:" + resultado);

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
            java.util.logging.Logger.getLogger(InterFaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterFaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterFaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterFaceCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterFaceCalculadora().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCosseno;
    private javax.swing.JButton bntDeletar;
    private javax.swing.JButton bntMaisOuMenos;
    private javax.swing.JButton bntPorcentagem;
    private javax.swing.JButton bntPotencia;
    private javax.swing.JButton bntSeno;
    private javax.swing.JButton bntTangente;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton btnlDividir;
    private javax.swing.JButton btnlMutiplicar;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCalculo;
    private java.awt.List listHistoricoDeCalculos;
    private javax.swing.JMenu menuCalculadoraSair;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuItemColar;
    private javax.swing.JMenuItem menuItemCopiar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSairDaCalculadora;
    private javax.swing.JTextField textCalculo;
    // End of variables declaration//GEN-END:variables

}
