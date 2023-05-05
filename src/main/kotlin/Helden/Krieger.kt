package Helden

class Krieger: Held(name = "Hroarr",
                    hp = 100,
                    alive = true,
                    zugGemacht = true,
                    vergifted = true) {

    fun angriff(): Int {
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
        return 10
    }
}