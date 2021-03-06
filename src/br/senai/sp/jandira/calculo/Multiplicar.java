package br.senai.sp.jandira.calculo;

public class Multiplicar {
	
	private int numerador;
	private int multiplicadorMaximo;
	
	public void setNumerador (int numerador) {
		this.numerador = numerador;
	}
	public double getNumerador() {
		return numerador;
	}
	public void setMultiplicador(int numerador) {
		this.numerador = numerador;
	}
	public double getMultiplicador() {
		return multiplicadorMaximo;
	}
	
	//CRIANDO VETOR PARA RECEBER OS VALORES
	public String[] calcular() {
		
		//[] MATRIZ/ARRAY QUE GUARDA OS VALORES E O LOOPING QUE FOR GERADO
		String tabuada[] = new String [multiplicadorMaximo + 1];
		
		for (int index = 0; index <= multiplicadorMaximo; index++) {
			int resultado = numerador * index;
			tabuada[index] = numerador + "X" + index + "=" + resultado;	
		}
		
		return tabuada;
	}
}

