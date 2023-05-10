import Gegner.*
import Helden.*

fun main() {

 /*   // prüft, ob die Klasse da initialisiert worden ist als elf auch Datentypen wiedergeben kann
    var gnadla  = Helden.Elf()
    println(20 == gnadla.angriff()) // true*//*
    var drache = Drache()
    println(drache.hp)*/

/*    fun dasIstEinTest() {
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
    }*/



    var elf = Elf()
    var krieger = Krieger()
    var magier = Magier()

    var drache = Drache()

/*    var heldenHPMap = mapOf<String,Int>(
        magier.name to magier.hp,
        krieger.name to krieger.hp,
        elf.name to elf.hp
    )
    println(heldenHPMap.values.random())*/

    var heldenHPMap = mapOf<String,Int>(
        magier.name to magier.hp,
        krieger.name to krieger.hp,
        elf.name to elf.hp
    )

    fun feuerAtmenDrache() {
        heldenHPMap = heldenHPMap.mapValues { it.value - drache.feueratem() }
    }

    fun schwanzflosse(): Int {
        return heldenHPMap.values.random() - drache.schwanzflosse()

    }

    var directatk = listOf(feuerAtmenDrache(),schwanzflosse())
}
    /*for (held in heldenHPMap)
    {
}*/
/*    heldenHPMap = heldenHPMap.mapValues { it.value - drache.feueratem() }  *//*drache.feueratem()*//*
    println(heldenHPMap.values)
}*/




/*
for (i in helden) {
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
*/


/*
for (gegner in gegners) {
    println("Gegner sind am Zug!")
    drache.returnRandomAuswahl()

}*/


//Bedingungen die prüft, ob Helden noch am Leben sind
/*
if (elf.alive && krieger.alive && magier.alive) {
    //TODO: HP ausdrucken

    //Wenn Drache gleich true und/oder Scherge. Scherge kann .alive == false sein
    if (drache.hp > 0 || scherge.hp > 0) {
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
        */
/*krieger.druckeAktionenAus()*//*

        //Lies die Auswahl vom Anwender
        var ausWahlFuerKrieger = readln().toInt()
        //Gibt Schadenswert beziehungsweise Boolean wieder
        krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
        drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
        println(drache.hp)
        krieger.zugGemacht = true

        //Druckt die Aktionen aus, die die Klasse Elf hat
        */
/*elf.druckeAktionenAus()*//*

        //Lies die Auswahl vom Anwender
        var ausWahlFuerElf = readln().toInt()
        //Gibt Schadenswert beziehungsweise Boolean wieder
        elf.returnAuswahl(anwenderwaehltAus = ausWahlFuerElf)
        elf.zugGemacht = true

        //Druckt die Aktionen aus, die die Klasse magier hat
        */
/*magier.druckeAktionenAus()*//*

        //Lies die Auswahl vom Anwender
        var ausWahlFuerMagier = readln().toInt()
        //Gibt Schadenswert beziehungsweise Boolean wieder
        magier.returnAuswahl(anwenderwaehltAus = ausWahlFuerMagier)
        magier.zugGemacht = true


    } else println("SIEG!!11")


} else println("Leider verloren!")

*/
