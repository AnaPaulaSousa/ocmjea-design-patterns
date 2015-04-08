package com.oracle.ocmjea.gof.behavioral.strategy;

public class OperacaoSoma implements OperacaoStrategy {

	@Override
	public int fazOperacao(int num1, int num2) {
		return num1 + num2;
	}
}
