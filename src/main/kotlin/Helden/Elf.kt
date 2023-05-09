package Helden

class Elf: Held(name = """
 ____                          _       
|  _ \    __ _    ___   _ __  (_)  ___ 
| |_) |  / _` |  / _ \ | '__| | | / __|
|  __/  | (_| | |  __/ | |    | | \__ \
|_|      \__,_|  \___| |_|    |_| |___/
                                       
""",
                hp = 100,
                alive = true,
                vergifted = false,
                zugGemacht = true,
                anwenderwaehltAus = 0) {

    fun returnAuswahl(anwenderwaehltAus:Int) {
        when (anwenderwaehltAus) {
            1 -> angriff()
/*            2 -> feuermauer()
            3 -> giftpfeil()
            4 -> mut()*/
            else -> {
                println("Auswahl ungültig!")
            }
        }
    }

    fun druckeAktionenAus() {
        println(name)
        println("1) Pfeilangriff(Normaler Angriff mit 20 Schaden)")
/*        println("2) Feuermauer(heldenklasse bekommt -10 Schaden für eine Runde)")
        println("3) Giftpfeil(Zustandsveränderung für Gegner: -5 % Schaden Ausgabe für 4 Runden)")
        println("4) Mut(Zustandsveraenderung, für 2 Runden je Party Mitglied +5% atk)")*/
    }

    //pfeilangriff
    fun angriff(): Int {
        //Physikalische Angriff, 20 Schaden
        return 20
    }

    fun feuermauer(): Int {
    // heldenklasse bekommt -10 Schaden für eine Runde
        return 90
    }

    fun giftpfeil(): Int {
    //Zustandsveränderung für Gegner: -5 % Schaden ausgabe für 4 Runden.
        return 5
    }

    fun mut(): Int {
    //Zustandsveraenderung, für 2 Runden je Party Mitglied +5% atk
        return 5
    }
}



