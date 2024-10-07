package com.example.holaclase

fun main(){
    var persona1 = Persona("Antonio", 23, "A Antonio le gusta el Furbo")
    var persona2 = Persona("David", 10, "Me llaman Panecillo")
    persona1.escribirInfo(persona1)
    persona2.escribirInfo(persona2)
}


class Persona(val nombre : String, val edad : Int , val descripcion : String){

    fun escribirInfo(persona : Persona) {
        println("" + nombre + " \n Edad: " + edad + " \n descripcion: " + descripcion)
    }
}