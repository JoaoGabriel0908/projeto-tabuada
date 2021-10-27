package br.senai.sp.jandira.tela;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void telaCriar() {
		
		//FONTES DA TELINHA
		Font fontTitulo = new Font("Cooper Black",Font.BOLD, 22);
		Font fontTexto = new Font("Arial",Font.PLAIN, 14);
		Font fontSubtitulo = new Font("Arial",Font.BOLD,15);
		Font fontResultado = new Font("Arial",Font.BOLD,14);
		Font fontCalcular = new Font("Arial Rounded MT Bold",Font.BOLD , 25);
		
		//CORES DAS LETRAS
		Color titulo = new Color(05,146, 250);
		Color resultado = new Color(200, 19, 139);
		Color caixa = new Color(255, 255, 255);
		
		//TAMANHO E FORMATO DA MINHA TELA
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 800);
		telaTabuada.setTitle("Tabuada");
		telaTabuada.setLayout(null);
		
		//CRIANDO UMA CAIXA COM PANEL
		JPanel panelCaixa = new JPanel();
		panelCaixa.setBounds(0, 0, 600, 80);
		panelCaixa.setForeground(caixa);
		panelCaixa.setBackground(caixa);
		
		//CRIAR UM LABEL
		//TITULO
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 20, 300, 40);
		lblTitulo.setBackground(titulo);
		lblTitulo.setForeground(titulo);
		lblTitulo.setFont(fontTitulo);
		
		JLabel lblMultiplicadorMaximo = new JLabel("Máximo Multiplicador: ");
		lblMultiplicadorMaximo.setBounds(20, 150, 300, 30);
		lblMultiplicadorMaximo.setFont(fontSubtitulo);
		
		JLabel lblNumerador = new JLabel("Numerador: ");
		lblNumerador.setFont(fontSubtitulo);
		lblNumerador.setBounds(90, 90, 180, 30);
		
		//INSERIR NUMERADOR
		JTextField txtNumerador = new JTextField ("");
		txtNumerador.setBounds(180, 90, 50, 30);
		
		//INSERIR MULTIPLICADOR
		JTextField txtMultiplicadorMaximo = new JTextField ("");
		txtMultiplicadorMaximo.setBounds(180, 150, 50, 30);
		
		//INSERIR BOTÃO CALCULAR
		JButton btnCalcular = new JButton("Calcular ");
		btnCalcular.setFont(fontCalcular);
		btnCalcular.setBounds(20,200,210,60);
		
		//INSERIR BOTÃO LIMPAR
		JButton btnLimpar = new JButton("Limpar: ");
		btnLimpar.setFont(fontCalcular);
		btnLimpar.setBounds(20, 280, 210, 60);
		
		
		
		telaTabuada.getContentPane().add(lblTitulo);
		telaTabuada.getContentPane().add(lblMultiplicadorMaximo);
		telaTabuada.getContentPane().add(txtMultiplicadorMaximo);
		telaTabuada.getContentPane().add(lblNumerador);
		telaTabuada.getContentPane().add(txtNumerador);
		telaTabuada.getContentPane().add(panelCaixa);
		telaTabuada.getContentPane().add(btnCalcular);
		telaTabuada.getContentPane().add(btnLimpar);
		
		telaTabuada.setVisible(true);
	}

}
