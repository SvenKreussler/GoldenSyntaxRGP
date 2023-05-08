package Gegner


// wird aufgerufen von Klasse Drache und kann nur einmal pro Kampf aufgerufen werden
class Scherge(): Gegner(name = "Snaag",
                    hp = 50,
                    alive = true,
                    zugGemacht = true,
                    vergifted = false
                    ) {

    var gespawnt = false


    fun returnRandomAuswahl(){
    var randomAuswahl = listOf(attacke(), krallen(), feuball(),gift())
        when (randomAuswahl.random()){
            attacke() -> attacke()
            krallen() -> krallen()
            feuball() -> feuball()
            gift() -> gift()
        }

    }
    //Generische Attacke
    fun attacke(): Int {
        //Attacke mit 20 Schaden
        println("Attacke auf ein Party Mitglied 20 Schaden")
        return 20
    }
    fun krallen(): Int {
    //Krallen hieb mit 10 Schaden
        println("Attacke auf ein Party Mitglied zehn Schaden")
        return 10
    }
    fun feuball(): Int {
    //Feuerball wirkt auf ein Party Mitglied
        println("Attacke auf ein Party Mitglied zehn Schaden")
        return 10
    }
    fun gift(): Boolean {
    //Für ein Party Mitglied zwei Runden lang fünf Schaden
        println("Attacke auf ein Party Mitglied, zwei Runden lang fünf Schaden")
        return true
    }
}