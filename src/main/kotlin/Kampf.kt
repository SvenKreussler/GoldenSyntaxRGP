import Gegner.*
import Helden.*

fun main() {

    var elf = Elf()
    var krieger = Krieger()
    var magier = Magier()

    var drache = Drache()
    var scherge = Scherge()

    var helden = mutableListOf(magier, krieger, elf)
    var gegners = mutableListOf(drache, scherge)

    while(drache.hp > 0) {
        var target = listOf(elf,krieger,magier).random()
        while(krieger.zugGemacht && elf.zugGemacht && magier.zugGemacht) {
            //Druckt die Aktionen aus, die die Klasse Krieger hat
            krieger.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerKrieger = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            println("Volltreffer! ${drache.name} hat noch ${drache.hp} HP!\n")
            krieger.zugGemacht = false

            //Druckt die Aktionen aus, die die Klasse Elf hat
            elf.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerElf = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            println("Volltreffer! ${drache.name} hat noch ${drache.hp} HP!\n")
            elf.zugGemacht = false

            //Druckt die Aktionen aus, die die Klasse magier hat
            magier.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerMagier = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            println("Volltreffer! ${drache.name} hat noch ${drache.hp} HP!\n")
            magier.zugGemacht = false
        }



    }
}


