package Helden

class Krieger: Held(name = """ 
 _   _                                      
| | | |  _ __    ___     __ _   _ __   _ __ 
| |_| | | '__|  / _ \   / _` | | '__| | '__|
|  _  | | |    | (_) | | (_| | | |    | |   
|_| |_| |_|     \___/   \__,_| |_|    |_|   
""",
                    hp = 100,
                    alive = true,
                    zugGemacht = true,
                    vergifted = true,
                    anwenderwaehltAus = 0) {

    fun returnAuswahl(anwenderwaehltAus:Int):Int {
    return when (anwenderwaehltAus) {
        1 -> angriff()
        2 -> raserei()
        3 -> schrei()
        /*4 -> schuetzen()*/
        else -> 0
    }
    }


    fun druckeAktionenAus() {

        println("1) Angriff(Normaler Angriff mit 20 Schaden)")
        println("2) Raserei(Attacke mit 40 Schaden an Gegner und 20% Schaden an sich selbst)")
        println("3) Schuetzen(Schützt ein Party Mitglied für eine Runde und selbst nimmt zehn Schaden)")
/*        println("4) Schrei(Schrei der zehn Schaden macht)")*/
    }

    fun angriff(): Int {
        //Normaler Angriff mit 20 Schaden
        return 20
    }

    fun raserei(): Int {
        //atk mit 40 Schaden an Gegner und 20% Schaden an sich selbst
        return 40
    }

    fun schuetzen(): Boolean {
        //Schützt ein Party Mitglied für eine Runde und selbst nimmt zehn Schaden
        return true
    }

    fun schrei(): Int {
        //Schreie der zehn Schaden macht
        return 10
    }
}