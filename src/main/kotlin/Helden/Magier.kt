package Helden

class Magier: Held(name = "Faraji",
                    hp = 100,
                    alive = true,
                    zugGemacht = true,
                    vergifted = false,
                    anwenderwaehltAus = 0) {

    fun returnAuswahl(anwenderwaehltAus:Int) {
        when (anwenderwaehltAus) {
            1 -> feuerball()
            2 -> heilen()
            3 -> immun()
            4 -> engel()
            else -> {
                println("Auswahl ungültig!")
            }
        }
    }
    fun feuerball(): Int {
        //Ein Feuerball wird gewirkt 20 Schaden
        return 20
    }

    fun druckeAktionenAus() {
        println("1) Heilen(Heilt alle aus Party mit 20)")
        println("2) Immun(Ein Party-Mitglied ist für eine Runde immun")
        println("3) Feuerball(Ein Feuerball wird gewirkt 20 Schaden)")
        println("4) Engel(Belebt einen mithelden mit 20 hp)")
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