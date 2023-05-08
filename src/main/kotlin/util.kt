import Gegner.*
import Helden.*

fun main() {

 /*   // prüft, ob die Klasse da initialisiert worden ist als elf auch Datentypen wiedergeben kann
    var gnadla  = Helden.Elf()
    println(20 == gnadla.angriff()) // true*//*
    var drache = Drache()
    println(drache.hp)*/

    fun dasIstEinTest() {
        println("testtesttest")
    }
    println("Text")
    var ausWahlFuerHeld = readln().toInt()
    when (ausWahlFuerHeld) {
        1 -> dasIstEinTest()
        2 -> 20
        3 -> true
        4 -> 20
        else -> {
            println("Auswahl ungültig!")
        }
    }
}