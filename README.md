# Homes Sales Commission Calculator

Este programa le premite al lider de recursos humanos calcular la comisión de ventas para un equipo de vendedores de casas. Permite ingresar la cantidad de vendedores, sus datos (ID, nombre) y el número de ventas realizadas. Luego, solicita ingresar el precio de cada inmueble vendido y calcula la comisión total para el equipo.

## Problema Resuelto

El problema resuelto por este programa es el cálculo de la comisión de ventas para un equipo de vendedores de casas. Al ingresar los datos de los vendedores y los precios de los inmuebles vendidos, el programa calcula la comisión total para el equipo basada en un porcentaje fijo (3%).

## Historia de usuario 
<img width="683" alt="image" src="https://github.com/jhoanjv/proyectoPoo/assets/75825013/728c4198-fbe8-4684-8237-f2b94531dc89">


## Caso de uso
<img width="268" alt="image" src="https://github.com/jhoanjv/proyectoPoo/assets/75825013/0d59a87e-5cb0-411c-adc4-34be1b2c266a">




## DFD

<img width="300" alt="image" src="https://github.com/jhoanjv/proyectoPoo/assets/75825013/ed776eb0-b186-4aa2-943e-db60007104b8">


## Pseudocódigo

A continuación se muestra el pseudocódigo del programa:

	Algoritmo calcular_comision
	definir ids,names Como Caracter 
	definir numSolds,sold,sumNumSolds ,sumSolds,numEmpleados,i,j, comision Como Real
	
	sumSolds=0
	
	Imprimir "Digite la cantidad de empleados: "
	Leer numEmpleados
	
	Dimension ids[numEmpleados],names[numEmpleados],numSolds[numEmpleados] 
	
	Para i=1 Hasta numEmpleados Con Paso 1
		Imprimir "Digite el id del vendedor ",i," :"
		Leer ids[i]
		Imprimir "Digite el nombre del vendedor:"
		leer names[i]
		Imprimir "Digite el numero de ventas del vendedor:"
		leer numSolds[i]
		sumNumSolds = sumNumSolds + numSolds[i]
		
	FinPara
	
	Para j=1 Hasta sumNumSolds Con Paso 1
		imprimir "Digite el precio del inmueble ",j," :"
		leer sold
		sumSolds= sumSolds + sold
	FinPara
	
	comision = sumSolds*0.03
	
	Imprimir "La comision para el equipo es de: ",comision
	
	FinAlgoritmo

