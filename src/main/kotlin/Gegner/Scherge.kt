package Gegner


// wird aufgerufen von Klasse Drache und kann nur einmal pro Kampf aufgerufen werden
class Scherge: Gegner(name = "Snaag", hp = 50, alive = true, zugGemacht = true,vergifted = false) {

    //Generische Attacke
    fun attacke(): Int {
        return 20
    }
    //Krallen hieb
    fun krallen(): Int {
        return 10
    }
    //Feuerball wirkt auf ein Party Mitglied
    fun feuball(): Int {
        return 10
    }
    //Für ein Party Mitglied zwei Hunden lang fünf Schaden
    fun gift(): Boolean {
        return true
    }
}