package Helden

class Elf: Held(name = "Paeris",
                hp = 100,
                alive = true,
                vergifted = false,
                zugGemacht = false) {

    //pfeilangriff
    fun angriff(): Int {
        return 20
    }

    // heldenklasse bekommt -10 Schaden für eine Runde
    fun feuermauer(): Int {
        return 90
    }
    //Zustandsveränderung für Gegner: -5 % Schaden ausgabe für 4 Runden.

    fun giftpfeil(): Int {
        return 5
    }

    //Zustandsveraenderung, für 2 Runden je Party Mitglied +5% atk
    fun mut(): Int {
        return 5
    }
}



