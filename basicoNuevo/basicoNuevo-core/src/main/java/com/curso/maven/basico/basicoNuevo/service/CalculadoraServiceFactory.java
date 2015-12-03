package com.curso.maven.basico.basicoNuevo.service;

public abstract class CalculadoraServiceFactory {
	public static CalculadoraService createCalculadoraService() {
		return new CalculadoraServiceImpl();
	}
}
