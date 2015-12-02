package com.curso.maven.basico.service;

public abstract class CalculadoraServiceFactory {
	public static CalculadoraService createCalculadoraService() {
		return new CalculadoraServiceImpl();
	}
}
