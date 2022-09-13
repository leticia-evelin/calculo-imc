package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;

import br.senai.sp.jandira.gui.FrameImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
	
		FrameImc tela = new FrameImc();
		tela.titulo = "Calculadora de IMC";
		tela.largura = 300;
		tela.altura = 470;
		tela.corDeFundoDaTela = new Color(187, 119, 255);
		tela.fonteDosLabels = new Font("Gabriola", Font.PLAIN, 24);
		tela.corDoTextoDoBotao = new Color(226, 11, 204);
		tela.criarTela();
		
		//FrameImc tela2 = new FrameImc();
		//tela2.titulo = "Calculadora de IMC";
		//tela2.largura = 300;
		//tela2.altura = 470;
		//tela2.criarTela();
		//tela2.corDeFundoDaTela = new Color(31, 165, 162);
		//tela2.fonteDosLabels = new Font("Gabriola", Font.PLAIN, 54);
		//tela2.corDoTextoDoBotao = new Color(255, 10, 0);
		//tela2.criarTela();
		
		
		
		Cliente ana = new Cliente();
		Cliente pedro = new Cliente();
		
		 System.out.println(ana); // ana é uma variável de referência
		 System.out.println(pedro);
		 
		 ana.nome = "Ana Maria Braga";
		 ana.dataDeNascimento = LocalDate.of(1950, 06, 21);
		 ana.peso = 58;
		 ana.altura = 1.67;
		 
		 pedro.nome = "Pedro Dias";
		 pedro.dataDeNascimento = LocalDate.of(2002, 02, 28);
		 pedro.peso = 73;
		 pedro.altura = 1.75;
		 
		 System.out.println(ana.getImc());
		 System.out.println(ana.getStatus());
		 System.out.println(pedro.getImc());
		 System.out.println(pedro.getStatus());
	}

}
