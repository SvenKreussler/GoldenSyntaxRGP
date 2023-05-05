import Gegner.*
import Helden.*
import helper.*

fun main() {

    var elf = Elf()
    var krieger = Krieger()
    var magier = Magier()

    var drache = Drache()
    var schergen = Scherge()

    var helden = mutableListOf(magier,krieger,elf)
    var gegner = mutableListOf(drache,schergen)

    if (elf.alive && krieger.alive && magier.alive) {
        while elf.zugGemacht == false && krieger.alive &&
    } else println("Leider verloren!")


}


