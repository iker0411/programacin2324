Algoritmo ejercicio11
	Escribir '�Cu�ntos a�os tienes?'
	Leer ANOS
	Escribir 'Introduce un planeta(tierra, marte, jupiter)'
	Leer planeta
	Si planeta=='marte' Entonces
		Escribir 'T�s a�os en son ', ANOS/1.88, ' a�os terrestres'
	SiNo
		Si planeta=='tierra' Entonces
			Escribir 'Tus a�os son ', ANOS
		SiNo
			Si planeta=='jupiter' Entonces
				Escribir 'Tus a�os son ', ANO/11.86 ' a�os terrestres'
			SiNo
				Escribir 'No esta en el Sistema Solar'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
