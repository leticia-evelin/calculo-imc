package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Cliente {

	public String nome;
	public LocalDate dataDeNascimento;
	public String genero[] = {"Feminino", "Masculino", "Outros"};
	public int peso;
	public double altura;
	

	
	public double getImc(){
		return peso / Math.pow(altura, 2);
	}
	
	public String getStatus() {
		
		if(getImc() <=18.5) {
			return "Você está baixo do peso!";
		} else if (getImc() > 18.5 && getImc() < 25.0) {
			return "Você está no peso ideal!!!";
		} else if (getImc() >= 25.0 && getImc() < 30.0) {
			return "Levemente acima do peso!!";
		} else if (getImc() > 30.0 && getImc() < 35.0) {
			return "Obesidade grau I!!";
		} else if (getImc() >= 35.0 && getImc() < 40.0) {
			return "Obesidade grau II!!";
		} else {
			return "Procure ajuda profissional você está com obesidade grau III!!";
		}
		
		
	}
	
}
