package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

public class FrameImc {
	
	public String titulo;
	public int largura;
	public int altura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		// Obter instância do container da janela
		Container painel = tela.getContentPane();
		painel.setBackground(corDeFundoDaTela); // mudar cor do fundo da tela
		
		// Componentes do container
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setBounds(30, 10, 100, 30);
		labelImc.setFont(new Font("Courier new", Font.BOLD, 32)); // mudar formato da fonte
		labelImc.setForeground(new Color(57, 91, 230)); // mudar cor da fonte
		
		JLabel labelNome = new JLabel();
		labelNome.setText("NOME:");
		labelNome.setBounds(30, 50, 100, 30);
		//labelNome.setFont(fonteDosLabels);
		
		JTextField textNome = new JTextField();
		textNome.setBounds(30, 80, 200, 30);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("PESO:");
		labelPeso.setBounds(30, 120, 100, 30);
		//labelPeso.setFont(fonteDosLabels);
	
		JTextField textPeso = new JTextField();
		textPeso.setBounds(30, 150, 100, 30);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("ALTURA:");
		labelAltura.setBounds(30, 190, 100, 30);
		//labelAltura.setFont(fonteDosLabels);
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(30, 220, 100, 30);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("Data Nascimento:");
		labelDataNascimento.setBounds(30, 260, 120, 30);
		
		JTextField textDataNascimento = new JTextField();
		textDataNascimento.setBounds(30, 290, 110, 30);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC é xxxx");
		labelResultadoImc.setBounds(30, 330, 230, 30);
		//labelResultadoImc.setForeground(new Color(30, 117, 69));
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Você está xxxx");
		labelStatusImc.setBounds(30, 370, 230, 30);
		//labelStatusImc.setForeground(new Color(30, 117, 69));
		
		// Criar um botão
		JButton buttonCalcularImc = new JButton();
		buttonCalcularImc.setText("Calcular");
		buttonCalcularImc.setBounds(160, 290, 110, 30);
		buttonCalcularImc.setForeground(new Color(0, 0, 202));
		buttonCalcularImc.setBackground(new Color(153, 173, 253));

		
		//Eventos
		buttonCalcularImc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textNome.getText(); //pegar o texto e guardar no nome
				cliente.peso = Integer.parseInt(textPeso.getText());
				cliente.altura = Double.parseDouble(textAltura.getText());
				
				labelResultadoImc.setText(cliente.nome + ", seu IMC é: " + cliente.getImc());
				labelStatusImc.setText("Status IMC: " + cliente.getStatus());
				
				
				
			}
		});

		textNome.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				
			}
		});
		
		
		
		textNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null,"Não vai digitar nada!!");
				
			}
		});
		
		
		// Adicionar o botão, componentes ao painel
		painel.add(buttonCalcularImc);
		painel.add(labelImc);
		painel.add(labelNome);
		painel.add(textNome);
		painel.add(labelPeso);
		painel.add(textPeso);
		painel.add(labelAltura);
		painel.add(textAltura);
		painel.add(labelDataNascimento);
		painel.add(textDataNascimento);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);
		painel.add(buttonCalcularImc);
		
		
		tela.setVisible(true);
		
		
	}
}
