package com.example.holaclase

import java.util.Scanner



fun main() {
    var scanner = Scanner(System.`in`)
    var salir = true;

    while (salir) {
        // Mensaje de bienvenida
        println("Bienvenido a la calculadora básica")


        // Solicitar números al usuario
        print("Ingrese el primer número: ")
        var num1 = scanner.nextDouble()

        print("Ingrese el segundo número: ")
        var num2 = scanner.nextDouble()

        // Mostrar las operaciones disponibles
        println("Seleccione la operación:")
        println("1. Sumar")
        println("2. Restar")
        println("3. Multiplicar")
        println("4. Dividir")
        println("5. Salir")

        print("Ingrese su opción (1-4): ")
        var opcion = scanner.nextInt()

        var resultado = 0.0
        var operacionValida = true

        when (opcion) {
            1 -> {
                resultado = num1 + num2
                println("Resultado: $num1 + $num2 = $resultado")
            }

            2 -> {
                resultado = num1 - num2
                println("Resultado: $num1 - $num2 = $resultado")
            }

            3 -> {
                resultado = num1 * num2
                println("Resultado: $num1 * $num2 = $resultado")
            }

            4 ->                 // Comprobar si se está dividiendo por cero
                if (num2 != 0.0) {
                    resultado = num1 / num2
                    println("Resultado: $num1 / $num2 = $resultado")
                } else {
                    println("Error: No se puede dividir por cero.")
                    operacionValida = false
                }
            5 -> {
                salir = false
                println("Gracias por utilizar la calculadora. Adiós.")
            }
            else -> {
                println("Opción inválida. Por favor seleccione una opción del 1 al 4.")
                operacionValida = false
            }
        }

        // Mensaje final
        if (operacionValida) {
            println("Operación completada.")
        }

    }
    fun celsiusFahrenheit(n1 : Double) : Double {
        return 9/5 * n1 + 32
    }
    fun fahrenheitKelvin(n1 : Double) : Double {
        return 5/9 * (n1 - 32) + 273.15
    }
    fun kelvinCelsius(n1 : Double) : Double {
        return n1 - 273.15
    }
    fun celsiusKelvin(n1 : Double) :Double{
        return celsiusFahrenheit(fahrenheitKelvin(n1))
    }
    fun fahrenheitCelsius(n1 : Double) : Double {
        return kelvinCelsius(fahrenheitKelvin(n1))
    }
    fun kelvinFahrenheit(n1 : Double) : Double {
        return celsiusFahrenheit(kelvinCelsius(n1))
    }

    scanner.close()
}

