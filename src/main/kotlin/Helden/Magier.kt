package Helden

class Magier: Held(name = "Faraji",
                    hp = 100,
                    alive = true,
                    zugGemacht = true,
                    vergifted = false) {

    // heilt alle aus Party mit 20?
    fun heilen(): Int {
        return 20
    }

    fun immun(): Boolean {
        //für held.vergifted.immun
        return true
    }

    fun feuerball(): Int {
        return 20
    }

    fun engel(): Boolean {
        //belebt einen mithelden mit 20 hp
        return true
    }
}