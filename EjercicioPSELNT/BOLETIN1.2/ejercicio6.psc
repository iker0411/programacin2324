Algoritmo sin_titulo
	Escribir "Introduce el tipo de vehiculo"
	Leer vehiculo
	Si vehiculo == "coche" Entonces
		Escribir "La velocidad es 120km/m"
	SiNo
		Si vehiculo == "moto" Entonces
			Escribir "La velocidad e 90km/h"
		SiNo
			Si vehiculo == "camion" Entonces
				Escribir "La velocidad es 80km/h"
			SiNo
				Escribir "No es ese vehiculo"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
