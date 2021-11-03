package br.senai.sp.jandira.tela;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.senai.sp.jandira.calculo.Multiplicar;

public class TelaTabuada {
	
	public void telaCriar() {
		
		//FONTES DA TELINHA
		Font fontTitulo = new Font("Cooper Black",Font.BOLD, 28);
		Font fontTexto = new Font("Arial",Font.PLAIN, 14);
		Font fontSubtitulo = new Font("Arial",Font.BOLD,18);
		Font fontResultado = new Font("Arial",Font.BOLD,14);
		Font fontCalcular = new Font("Arial Rounded MT Bold",Font.BOLD , 25);
		
		//CORES DAS LETRAS
		Color titulo = new Color(05,146, 250);
		Color resultado = new Color(200, 19, 139);
		Color caixa = new Color(255, 255, 255);
		Color calcular = new Color(156, 200, 26);
		Color limpar = new Color(226, 50, 30);
		
		//TAMANHO E FORMATO DA MINHA TELA
		JFrame telaTabuada = new JFrame();
		telaTabuada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaTabuada.setSize(600, 700);
		telaTabuada.setTitle("Tabuada");
		telaTabuada.setLayout(null);
		
		//CRIANDO UMA CAIXA COM PANEL (HEADER)
		JPanel panelHeader = new JPanel();
		panelHeader.setBounds(0, 0, 600, 80);
		panelHeader.setForeground(caixa);
		panelHeader.setLayout(null);
		panelHeader.setBackground(caixa);;
		
		//CRIAR UM LABEL
		//TITULO
		JLabel lblTitulo = new JLabel("Tabuada");
		lblTitulo.setBounds(20, 20, 150, 20);
		lblTitulo.setBackground(titulo);
		lblTitulo.setForeground(titulo);
		lblTitulo.setFont(fontTitulo);
		
		panelHeader.add(lblTitulo);
		
		JPanel panelFormulario = new JPanel();
		panelFormulario.setBounds(0,40,300,350);
		panelFormulario.setLayout(null);
		
		//TEXTO DO NUMERADOR
		JLabel lblNumerador = new JLabel("Numerador: ");
		lblNumerador.setFont(fontSubtitulo);
		lblNumerador.setBounds(40, 90, 180, 30);
		lblNumerador.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblNumerador);
		
		//TEXTO DO MAXIMO MULTIPLICADOR
		JLabel lblMultiplicadorMaximo = new JLabel("Máximo Multiplicador: ");
		lblMultiplicadorMaximo.setBounds(20, 150, 200, 30);
		lblMultiplicadorMaximo.setFont(fontSubtitulo);
		lblMultiplicadorMaximo.setHorizontalAlignment(SwingConstants.RIGHT);
		panelFormulario.add(lblMultiplicadorMaximo);
		
		//INSERIR NUMERADOR
		JTextField txtNumerador = new JTextField ("");
		txtNumerador.setBounds(220, 90, 50, 30);
		txtNumerador.setFont(fontResultado);
		panelFormulario.add(txtNumerador);
		
		//INSERIR MULTIPLICADOR
		JTextField txtMultiplicadorMaximo = new JTextField ("");
		txtMultiplicadorMaximo.setBounds(220, 150, 50, 30);
		txtMultiplicadorMaximo.setFont(fontResultado);
		panelFormulario.add(txtMultiplicadorMaximo);
		
		//INSERIR BOTÃO CALCULAR
		JButton btnCalcular = new JButton("Calcular ");
		btnCalcular.setFont(fontCalcular);
		btnCalcular.setBounds(20,205,250,55);
		btnCalcular.setBackground(calcular);
		panelFormulario.add(btnCalcular);
		
		//INSERIR BOTÃO LIMPAR
		JButton btnLimpar = new JButton("Limpar ");
		btnLimpar.setFont(fontCalcular);
		btnLimpar.setBounds(20, 285, 250, 55);
		btnLimpar.setBackground(limpar);
		panelFormulario.add(btnLimpar);
		
		//JLIST
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setBounds(350, 120, 80, 30);
		
		JScrollPane scrooll = new JScrollPane();
		scrooll.setBounds(380,160,200,300);
		
		JList listTabuada = new JList();
		scrooll.getViewport().add(listTabuada);
		
		DefaultListModel tabuadaModel = new DefaultListModel();
		listTabuada.setModel(tabuadaModel);
		
		//TELA
		telaTabuada.getContentPane().add(lblResultado);
		telaTabuada.getContentPane().add(panelHeader);
		telaTabuada.getContentPane().add(panelFormulario);
		telaTabuada.getContentPane().add(listTabuada);
		telaTabuada.getContentPane().add(scrooll);
		
		
		telaTabuada.setVisible(true);
		
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Multiplicar tabuada = new Multiplicar();
				
				int numerador = Integer.parseInt(txtNumerador.getText());
				int multiplicadorMaximo = Integer.parseInt(txtMultiplicadorMaximo.getText());
				
				tabuada.setNumerador(numerador);
				tabuada.setMultiplicador(multiplicadorMaximo);
				
				String[] resultado = tabuada.calcular();
				
				for (int index = 0; index < resultado.length ; index++) {
					tabuadaModel.addElement(resultado[index]);
				}
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txtNumerador.setText("");
				txtMultiplicadorMaximo.setText("");
				txtNumerador.requestFocus();
				
			}
		});
		
		
	}

}
