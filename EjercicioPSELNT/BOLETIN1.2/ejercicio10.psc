Algoritmo ejercicio10
	Escribir "�Cu�l es tu animal favorito?"
	Leer animal
	Escribir "�Cu�l es tu color favorito?"
	Leer color
	Escribir "�Cu�l es tu asignatura favorita?"
	Leer asignatura
	Si color == "azul" Entonces
		Si animal == "sapo" Entonces
			Si asignatura == "pociones" Entonces
				Escribir "Tu casa es ravenclaw"
			FinSi
		FinSi
	SiNo
		Si color == "verde" Entonces
			Si animal == "gato" Entonces
				Si asignatura == "herbolog�a" Entonces
					Escribir "Tu casa es Slytherim" 
				FinSi
			FinSi
		SiNo
			Si color == "rojo" Entonces
				Si animal == "lechuza" Entonces
					Si asignatura == "pociones" Entonces
					
					FinSi
				FinSi
			SiNo
				Escribir "NO hay ninguna casa para t�"
			FinSi
		FinSi
	FinSi
FinAlgoritmo
