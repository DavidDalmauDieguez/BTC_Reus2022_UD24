package com.crud.h2.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum sueldoEnum {

	BAILARIN ("Bailarin"),
	GOLFISTA ("Golfista"),
	CANTANTE ("Cantante"),
	FUTBOLISTA ("Futbolista");

	private final String nuevoTrabajo;	

	public int nuevoSueldo(String trabajo) {

		int sueldo = 0;

		switch(trabajo) {
		case "Bailarin":
			sueldo = 2200;
			break;
		case "Golfista":
			sueldo = 100000;
			break;

		case "Cantante":
			sueldo = 50000;
			break;

		case "Futbolista":
			sueldo = 1000000;
			break;
		}

		return sueldo;
	}


	// Creacion constructor
	sueldoEnum(String nuevoTrabajo) {
		this.nuevoTrabajo = nuevoTrabajo;
	}

	//Getter and Setters
	public String getNuevoTrabajo() {
		return nuevoTrabajo;
	}

	// Creacion toString
	@Override
	public String toString() {
		return nuevoTrabajo;
	}







}