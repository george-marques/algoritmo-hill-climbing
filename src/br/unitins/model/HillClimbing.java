package br.unitins.model;

import java.util.Random;

public class HillClimbing {
	// Define a função a ser maximizada
	public static double funcao(double x) {
		return -1 * Math.pow(x, 2) + 2 * x + 5;
	}

	// Gera um ponto aleatório para começar a busca
	public static double geraPontoAleatorio(double min, double max) {
		Random r = new Random();
		return min + (max - min) * r.nextDouble();
	}

	// Encontra o ponto com o maior valor da função
	public static double escalada(double min, double max, double etapa) {
		double atual = geraPontoAleatorio(min, max);
		double valorAtual = funcao(atual);

		while (true) {
			double esquerdo = atual - etapa;
			double valorEsquerdo = funcao(esquerdo);

			if (valorEsquerdo > valorAtual) {
				atual = esquerdo;
				valorAtual = valorEsquerdo;
			}

			double direito = atual + etapa;
			double valorDireito = funcao(direito);

			if (valorDireito > valorAtual) {
				atual = direito;
				valorAtual = valorDireito;
			}

			if (valorEsquerdo <= valorAtual && valorDireito <= valorAtual) {
				return atual;
			}
		}
	}
}
