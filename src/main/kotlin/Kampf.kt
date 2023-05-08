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


    //Bedingungen die prüft, ob Helden noch am Leben sind
    if (elf.alive && krieger.alive && magier.alive) {
        //TODO: HP ausdrucken

        //Wenn Drache gleich true und/oder Scherge. Scherge kann .alive == false sein
        if (drache.alive || scherge.alive) {
            //kampf
            if (elf.zugGemacht && krieger.zugGemacht && magier.zugGemacht) {
                //Wenn alle Helden zugGemacht == true
                drache.returnRandomAuswahl()
                //Helden zugGemacht wieder auf Standard gesetzt
                elf.zugGemacht = false
                krieger.zugGemacht = false
                magier.zugGemacht = false
            } else println("Bitte Ihren Zug ausführen!")

            //Druckt die Aktionen aus, die die Klasse Krieger hat
            /*krieger.druckeAktionenAus()*/
            //Lies die Auswahl vom Anwender
            var ausWahlFuerKrieger = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            println(drache.hp)
            krieger.zugGemacht = true

            //Druckt die Aktionen aus, die die Klasse Elf hat
            /*elf.druckeAktionenAus()*/
            //Lies die Auswahl vom Anwender
            var ausWahlFuerElf = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            elf.returnAuswahl(anwenderwaehltAus = ausWahlFuerElf)
            elf.zugGemacht = true

            //Druckt die Aktionen aus, die die Klasse magier hat
            /*magier.druckeAktionenAus()*/
            //Lies die Auswahl vom Anwender
            var ausWahlFuerMagier = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            magier.returnAuswahl(anwenderwaehltAus = ausWahlFuerMagier)
            magier.zugGemacht = true


        } else println("SIEG!!11")


    } else println("Leider verloren!")


}


