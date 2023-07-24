package com.example.miguelquiroga

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var opcionPrincipal: Int

    do {
        mostrarMenuPrincipal()
        opcionPrincipal = scanner.nextInt()

        when (opcionPrincipal) {
            1 -> {

                var opcionOperadores: Int
                do {
                    mostrarMenuOperadores()
                    opcionOperadores = scanner.nextInt()

                    when (opcionOperadores) {
                        1 -> opcion1()
                        2 -> opcion2()
                        3 -> opcion3()
                        4 -> opcion4()
                        5 -> opcion5()
                        6 -> opcion6()
                        7 -> opcion7()
                        8 -> opcion8()
                        99 -> println("Volviendo al menú principal.")
                        else -> println("Opción inválida. Por favor, selecciona una opción válida.")
                    }
                } while (opcionOperadores != 99)
            }
            2 -> {

                var opcionCondicionales: Int
                do {
                    mostrarMenuCondicionales()
                    opcionCondicionales = scanner.nextInt()

                    when (opcionCondicionales) {
                        1 -> numeroPositivoNegativo()
                        2 -> encontrarMayorYMenor()
                        3 -> calcularMayorMenorTresNumeros()
                        4 -> sumarOrestarNumeros()
                        5 -> encontrarCociente()
                        6 -> sumarOMultiplicarNumeros()
                        7 -> verificarAnioBisiesto()
                        99 -> println("¡Hasta luego!")
                        else -> println("Opción inválida. Por favor, selecciona una opción válida.")
                    }
                } while (opcionCondicionales != 99)
            }
            3 -> {
                var opcionCiclos:Int
                do{
                    mostrarMenuCiclos()
                    opcionCiclos=scanner.nextInt()

                    when(opcionCiclos){
                        1 -> imprimirMultiplosDeTres()
                        2 -> imprimirNumerosImpares()
                        3 -> imprimirNumerosPares()
                        4 -> imprimirCuadradosDelUnoAlTreinta()
                        5 -> sumarCuadradosPrimerosCienNumeros()
                        6 -> generarYMostrarNumerosAscendentes()
                        7 -> sumarNumerosHastaCero()
                        99 -> println("¡Hasta luego!")
                        else -> println("Opción inválida. Por favor, selecciona una opción válida.")
                    }
                }while (opcionCiclos !=99)
            }
        }
    } while (opcionPrincipal != 99)
}

fun mostrarMenuPrincipal() {
    println("**** MENÚ PRINCIPAL ****")
    println("1. Operadores")
    println("2. Condicionales")
    println("3. Ciclos")
    println("\n")
    print("Ingresa la opción deseada: ")
}

fun mostrarMenuOperadores() {
    println("**** MENÚ OPERADORES ****")
    println("1. Calcular area Triangulo.")
    println("2. Sumar 2 numeros.")
    println("3. Ingresar un número y visualizar el número elevado al cuadrado..")
    println("4. Escribir un algoritmo que convierta de euros a dólares.")
    println("5.Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y delperímetro")
    println("6.Escribir un algoritmo que determine el área y el volúmen de un cilindro.")
    println("7.Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma yel área (pi*r)^2 del círculo inscrito")
    println("8.Calcular el promedio de tres (3) números ingresados por teclado")
    println("\n")
    print("Ingresa la opción deseada: ")
}

fun mostrarMenuCondicionales() {
    println("**** MENÚ ****")
    println("1. Determinar si un número es positivo o negativo.")
    println("2. Encontrar el mayor y menor entre dos números.")
    println("3. Encontrar el mayor y menor entre tres números.")
    println("4. Sumar o restar dos números según su relación.")
    println("5. Encontrar el cociente entre dos números.")
    println("6. Sumar o multiplicar dos números según su signo.")
    println("7. Verificar si un año es bisiesto.")
    println("99. Salir")
    println("\n")
    print("Ingresa la opción deseada: ")
}
fun mostrarMenuCiclos() {
    println("**** MENÚ ****")
    println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100.")
    println("2. Imprimir los números impares entre 0 y 100.")
    println("3. Imprimir los números pares del 1 al 100.")
    println("4. Imprimir los cuadrados de los números del 1 al 30.")
    println("5. Sumar los cuadrados de los cien primeros números naturales.")
    println("6. Generar y mostrar números entre dos números naturales en secuencia ascendente.")
    println("7. Sumar números hasta que se ingrese un cero.")
    println("99. Salir")
    println("\n")
    print("Ingresa la opción deseada: ")
}


fun opcion1(){
    val scanner = Scanner(System.`in`)
    println("Ingresa la base del triángulo:")
    val base = scanner.nextDouble()
    println("Ingresa la altura del triángulo:")
    val altura = scanner.nextDouble()
    val area = 0.5 * base * altura
    println("El área del triángulo es: $area")
}
fun opcion2(){
    val scanner = Scanner(System.`in`)
    println("Ingresa el primer número:")
    val numero1 = scanner.nextDouble()
    println("Ingresa el segundo número:")
    val numero2 = scanner.nextDouble()
    val resultado = numero1 + numero2
    println("La suma de los dos números es: $resultado")
}
fun opcion3(){
    val scanner = Scanner(System.`in`)
    println("Ingresa un número:")
    val numero = scanner.nextDouble()
    val cuadrado = numero * numero
    println("El número $numero elevado al cuadrado es: $cuadrado")
}
fun opcion4(){
    val scanner = Scanner(System.`in`)
    println("Ingresa la cantidad en euros:")
    val euros = scanner.nextDouble()

    val tasaCambio = 1.15 // Tasa de cambio (1 euro = 1.15 dólares)
    val dolares = euros * tasaCambio
    println("$euros euros equivale a $dolares dólares")
}

fun opcion5(){
    val scanner = Scanner(System.`in`)
    println("Ingresa el lado del cuadrado:")
    val lado = scanner.nextDouble()

    val area = lado * lado
    val perimetro = 4 * lado

    println("El área del cuadrado es: $area")
    println("El perímetro del cuadrado es: $perimetro")
}
fun opcion6(){
    val scanner = Scanner(System.`in`)
    println("Ingresa el radio del cilindro:")
    val radio = scanner.nextDouble()
    println("Ingresa la altura del cilindro:")
    val altura = scanner.nextDouble()

    val areaBase = Math.PI * radio * radio
    val volumen = areaBase * altura

    println("El área de la base del cilindro es: $areaBase")
    println("El volumen del cilindro es: $volumen")
}
fun opcion7(){

    val scanner = Scanner(System.`in`)
    println("Ingresa el radio de la circunferencia:")
    val radio = scanner.nextDouble()

    val longitud = 2 * Math.PI * radio
    val area = Math.PI * radio * radio

    println("La longitud de la circunferencia es: $longitud")
    println("El área del círculo inscrito es: $area")
}
fun opcion8(){
    val scanner = Scanner(System.`in`)
    println("Ingresa el primer número:")
    val numero1 = scanner.nextDouble()
    println("Ingresa el segundo número:")
    val numero2 = scanner.nextDouble()
    println("Ingresa el tercer número:")
    val numero3 = scanner.nextDouble()

    val promedio = (numero1 + numero2 + numero3) / 3
    println("El promedio de los tres números es: $promedio")
}

fun numeroPositivoNegativo() {
    val scanner = Scanner(System.`in`)
    print("Ingresa un número: ")
    val numero = scanner.nextDouble()

    if (numero > 0) {
        println("El número es positivo.")
    } else if (numero < 0) {
        println("El número es negativo.")
    } else {
        println("El número es cero.")
    }
}

fun encontrarMayorYMenor() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer número: ")
    val numero1 = scanner.nextDouble()
    print("Ingresa el segundo número: ")
    val numero2 = scanner.nextDouble()

    if (numero1 > numero2) {
        println("El mayor es: $numero1")
        println("El menor es: $numero2")
    } else if (numero1 < numero2) {
        println("El mayor es: $numero2")
        println("El menor es: $numero1")
    } else {
        println("Ambos números son iguales.")
    }
}

fun calcularMayorMenorTresNumeros() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer número: ")
    val numero1 = scanner.nextInt()
    print("Ingresa el segundo número: ")
    val numero2 = scanner.nextInt()
    print("Ingresa el tercer número: ")
    val numero3 = scanner.nextInt()

    val mayor = maxOf(numero1, numero2, numero3)
    val menor = minOf(numero1, numero2, numero3)

    println("El mayor es: $mayor")
    println("El menor es: $menor")
}

fun sumarOrestarNumeros() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer número: ")
    val numero1 = scanner.nextDouble()
    print("Ingresa el segundo número: ")
    val numero2 = scanner.nextDouble()

    val resultado = if (numero1 < numero2) {
        numero1 + numero2
    } else {
        numero1 - numero2
    }

    println("El resultado es: $resultado")
}

fun encontrarCociente() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el dividendo (A): ")
    val dividendo = scanner.nextDouble()
    print("Ingresa el divisor (B): ")
    val divisor = scanner.nextDouble()

    if (divisor != 0.0) {
        val cociente = dividendo / divisor
        println("El cociente entre A y B es: $cociente")
    } else {
        println("La división por cero no está definida.")
    }
}

fun sumarOMultiplicarNumeros() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer número: ")
    val numero1 = scanner.nextDouble()
    print("Ingresa el segundo número: ")
    val numero2 = scanner.nextDouble()

    val resultado = if (numero1 < 0 || numero2 < 0) {
        numero1 + numero2
    } else {
        numero1 * numero2
    }

    println("El resultado es: $resultado")
}

fun verificarAnioBisiesto() {
    val scanner = Scanner(System.`in`)
    print("Ingresa un año: ")
    val anio = scanner.nextInt()

    val esBisiesto = anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)

    if (esBisiesto) {
        println("El año $anio es bisiesto.")
    } else {
        println("El año $anio no es bisiesto.")
    }
}
//Opcion3
fun imprimirMultiplosDeTres() {
    println("Los múltiplos de 3 entre 1 y 100 son:")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
    println() // Salto de línea
}

fun imprimirNumerosImpares() {
    println("Los números impares entre 0 y 100 son:")
    for (i in 1..100 step 2) {
        print("$i ")
    }
    println() // Salto de línea
}

fun imprimirNumerosPares() {
    println("Los números pares entre 1 y 100 son:")
    for (i in 2..100 step 2) {
        print("$i ")
    }
    println() // Salto de línea
}

fun imprimirCuadradosDelUnoAlTreinta() {
    println("Los cuadrados de los números del 1 al 30 son:")
    for (i in 1..30) {
        val cuadrado = i * i
        print("$cuadrado ")
    }
    println() // Salto de línea
}

fun sumarCuadradosPrimerosCienNumeros() {
    var suma = 0
    for (i in 1..100) {
        suma += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $suma")
}

fun generarYMostrarNumerosAscendentes() {
    val scanner = Scanner(System.`in`)
    print("Ingresa el primer número: ")
    val numero1 = scanner.nextInt()
    print("Ingresa el segundo número (mayor que el primero): ")
    val numero2 = scanner.nextInt()

    println("Los números entre $numero1 y $numero2 en secuencia ascendente son:")
    for (i in numero1..numero2) {
        print("$i ")
    }
    println() // Salto de línea
}

fun sumarNumerosHastaCero() {
    val scanner = Scanner(System.`in`)
    var suma = 0
    var numero: Int

    do {
        print("Ingresa un número (cero para terminar): ")
        numero = scanner.nextInt()
        suma += numero
    } while (numero != 0)

    println("La suma de los números ingresados es: $suma")
}