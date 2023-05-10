import Gegner.*
import Helden.*

/*
//TODO:
   1) Prüfen, warum es noch eine Ausgabe gibt, wenn Drache null HP hat.
   2) Prüfen, wie man die Drachenfunktion zufällig aktivieren kann. Auch rausfinden, wie es möglich ist eine Funktion in einer while Schleife
   einer Liste einzufügen und die dann randomisiert aufzurufen, ohne die Funktion selbst aufzurufen.
   3) Ein Daten Modell definieren, was eine Runde darstellt und darin dann Eigenschaften auf Helden und Gegner abbildet wie zum Beispiel vergiftet oder geheilt
   4) Die Möglichkeit, den Beutel zu benutzen, einfügen
   5) Möglichkeit, den Schergen vom Boss aufzurufen aktivieren

*/


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

    var heldenHPMap = mapOf<String, Int>(
        magier.name to magier.hp,
        krieger.name to krieger.hp,
        elf.name to elf.hp
    )
    while (drache.hp > 0) {
        //Counterintuitiv, welchseln
        krieger.zugGemacht = true
        elf.zugGemacht = true
        magier.zugGemacht = true
        while (krieger.zugGemacht && elf.zugGemacht && magier.zugGemacht) {
            //Druckt die Aktionen aus, die die Klasse Krieger hat
            krieger.druckeAktionenAus()
            println("HP: $red ${heldenHPMap.get("Hroarr")} $reset")
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
            println("HP: $red ${heldenHPMap.get("Paeris")} $reset")
            //Lies die Auswahl vom Anwender
            var ausWahlFuerElf = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerElf)
            if (drache.hp < 0)
                break
            println("$cyan ${drache.nameBig} \n hat noch $red ${drache.hp} HP! $reset\n")
            elf.zugGemacht = false

            //Druckt die Aktionen aus, die die Klasse magier hat
            magier.druckeAktionenAus()
            println("HP: $red ${heldenHPMap.get("Hroarr")} $reset")
            //Lies die Auswahl vom Anwender
            var ausWahlFuerMagier = readln().toInt()
            //Gibt Schadenswert beziehungsweise Boolean wieder
            drache.hp -= krieger.returnAuswahl(anwenderwaehltAus = ausWahlFuerMagier)
            if (drache.hp < 0)
                break
            println("$cyan ${drache.nameBig} \n hat noch $red ${drache.hp} HP! $reset\n")
            magier.zugGemacht = false
        }
        if (drache.hp > 0) {
            drache.zugGemacht = true
            while (drache.zugGemacht) {
                fun feuerAtmenDrache() {
                    heldenHPMap = heldenHPMap.mapValues { it.value - drache.feueratem() }
                    println("$cyan ${drache.nameBig}\n Feueratem: 20 Schaden alle Helden!$reset")
                }

                fun schwanzflosse(): Int {
                    return heldenHPMap.values.random() - drache.schwanzflosse()
                }

                drache.zugGemacht = false

            }
        }


        println(
            """ $red
  ____      _      __  __   _____    ___   __     __  _____   ____    _ 
 / ___|    / \    |  \/  | | ____|  / _ \  \ \   / / | ____| |  _ \  | |
| |  _    / _ \   | |\/| | |  _|   | | | |  \ \ / /  |  _|   | |_) | | |
| |_| |  / ___ \  | |  | | | |___  | |_| |   \ V /   | |___  |  _ <  |_|
 \____| /_/   \_\ |_|  |_| |_____|  \___/     \_/    |_____| |_| \_\ (_)
                                                                        
$reset
"""
        )

    }
}




