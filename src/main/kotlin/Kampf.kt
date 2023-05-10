import Gegner.*
import Helden.*

fun main() {

    //https://en.wikipedia.org/wiki/ANSI_escape_code#Colors
    val red = "\u001b[31m"
    val reset = "\u001b[0m"
    val cyan = "\u001b[96m"
    val green = "\u001b[92m"

    var elf = Elf()
    var krieger = Krieger()
    var magier = Magier()

    var drache = Drache()
    var scherge = Scherge()

/*    var helden = mutableListOf(magier, krieger, elf)
    var gegners = mutableListOf(drache, scherge)*/

     var heldenHPMap = mutableMapOf<String,Int>(
         magier.nameBig to magier.hp,
         krieger.nameBig to krieger.hp,
         elf.nameBig to elf.hp
     )
    //TODO: statii implementieren(dh auch Runden einpflegen)!
    while(drache.hp > 0) {
        //Counterintuitiv, welchseln
        krieger.zugGemacht = true
        elf.zugGemacht = true
        magier.zugGemacht = true
        while(krieger.zugGemacht && elf.zugGemacht && magier.zugGemacht) {
            //Druckt die Aktionen aus, die die Klasse Krieger hat
            krieger.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerKrieger = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            if (drache.hp < 0)
                break
            println("$cyan ${drache.nameBig} \n hat noch $red ${drache.hp} HP! $reset\n")
            krieger.zugGemacht = false

            //Druckt die Aktionen aus, die die Klasse Elf hat
            elf.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerElf = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            if (drache.hp < 0)
                break
            println("$cyan ${drache.nameBig} \n hat noch $red ${drache.hp} HP! $reset\n")
            elf.zugGemacht = false

            //Druckt die Aktionen aus, die die Klasse magier hat
            magier.druckeAktionenAus()
            //Lies die Auswahl vom Anwender
            var ausWahlFuerMagier = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerKrieger)
            if (drache.hp < 0)
                break
            println("$cyan ${drache.nameBig} \n hat noch $red ${drache.hp} HP! $reset\n")
            magier.zugGemacht = false
        }
        if (drache.hp > 0) {
            drache.zugGemacht = true
            while (drache.zugGemacht) {
                var target = heldenHPMap
                /*var directatk = listOf(drache.feueratem(),drache.feueratem())*/
/*                drache.feueratem(target.keys)

                var targethp = target.hp - dmg
                println("${target.name}\n hat noch $red $targethp HP! $reset")
                drache.zugGemacht = false*/

            }
        }


    }
    println("gewonnen!")

}




