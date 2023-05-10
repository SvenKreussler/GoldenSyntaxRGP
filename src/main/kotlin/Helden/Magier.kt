package Helden

class Magier: Held(nameBig = """
 _____                            _   _ 
|  ___|   __ _   _ __    __ _    (_) (_)
| |_     / _` | | '__|  / _` |   | | | |
|  _|   | (_| | | |    | (_| |   | | | |
|_|      \__,_| |_|     \__,_|  _/ | |_|
                               |__/     """,
                    name = "Faraji",
                    hp = 100,
                    alive = true,
                    zugGemacht = true,
                    vergifted = false,
                    anwenderwaehltAus = 0) {

    fun returnAuswahl(anwenderwaehltAus:Int) {
        when (anwenderwaehltAus) {
            1 -> feuerball()
/*          2 -> heilen()
            3 -> immun()
            4 -> engel()*/
            else -> {
                println("Auswahl ungültig!")
            }
        }
    }

    fun druckeAktionenAus() {
        println(nameBig)
        println("1) Heilen(Heilt alle aus Party mit 20)")
/*        println("2) Immun(Ein Party-Mitglied ist für eine Runde immun")
        println("3) Feuerball(Ein Feuerball wird gewirkt 20 Schaden)")
        println("4) Engel(Belebt einen mithelden mit 20 hp)")*/
    }
    fun feuerball(): Int {
        //Ein Feuerball wird gewirkt 20 Schaden
        return 20
    }

    // heilt alle aus Party mit 20.
    fun heilen(): Int {
        return 20
    }

    fun immun(): Boolean {
        //für held.vergifted.immun
        return true
    }


    fun engel(): Boolean {
        //belebt einen mithelden mit 20 hp
        return true
    }
}