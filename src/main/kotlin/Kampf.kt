import Gegner.*
import Helden.*

fun main() {

    var elf = Elf()
    var krieger = Krieger()
    var magier = Magier()

    var drache = Drache()
    var schergen = Scherge()

    var helden = mutableListOf(magier,krieger,elf)
    var gegners = mutableListOf(drache,schergen)


    //Bedingungen die prüft, ob Helden noch am Leben sind
    if (elf.alive && krieger.alive && magier.alive) {
        for (held in helden) {
            println("Bitte Ihren Zug ausführen!")

            //Druckt die Aktionen aus, die die Klasse Krieger hat
            krieger.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerKrieger = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)

            //Druckt die Aktionen aus, die die Klasse Elf hat
            elf.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerElf = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            elf.returnAuswahl(anwenderwaehltAus = ausWahlFuerElf)

            //Druckt die Aktionen aus, die die Klasse magier hat
            magier.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerMagier = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            magier.returnAuswahl(anwenderwaehltAus = ausWahlFuerMagier)


        }
        for (gegner in gegners) {
            println("Gegner sind am Zug!")
            drache.returnRandomAuswahl()

        }

    } else println("Leider verloren!")


}


