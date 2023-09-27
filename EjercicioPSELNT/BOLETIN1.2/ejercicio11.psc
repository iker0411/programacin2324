Algoritmo ejercicio11
	Escribir '¿Cuántos años tienes?'
	Leer ANOS
	Escribir 'Introduce un planeta(tierra, marte, jupiter)'
	Leer planeta
	Si planeta=='marte' Entonces
		Escribir 'Tús años en son ', ANOS/1.88, ' años terrestres'
	SiNo
		Si planeta=='tierra' Entonces
			Escribir 'Tus años son ', ANOS
		SiNo
			Si planeta=='jupiter' Entonces
				Escribir 'Tus años son ', ANO/11.86 ' años terrestres'
			SiNo
				Escribir 'No esta en el Sistema Solar'
			FinSi
		FinSi
	FinSi
FinAlgoritmo
