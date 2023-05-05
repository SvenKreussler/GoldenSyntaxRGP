package Gegner

class Drache:Gegner("Godzilla",
                    200,
                    alive = true,
                    zugGemacht = false,
                    vergifted = false) {

    fun feueratem(): Int {
        // feuerangriff fügt 20 Schaden für Party zu
        return 20
    }

    fun schwanzflosse(): Int {
        //Fügt 20 Schaden für ein Helden hinzu
        return 20
    }

    fun verfluchen(): Boolean {
        //Verflucht ein Party Mitglied Helden für vier Runden bei fünf schaden
        return true
    }

    fun beben(): Int {
        //Lässt den Boden Beben 20 Schaden für Party
        return 20
    }
}