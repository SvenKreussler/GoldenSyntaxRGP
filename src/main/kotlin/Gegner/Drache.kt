package Gegner

class Drache:Gegner("Godzilla",
                    200,
                    alive = true,
                    zugGemacht = false,
                    vergifted = false) {

    var randomAuswahl = listOf(feueratem(),schwanzflosse(), verfluchen(),beschwoeren())


    fun returnRandomAuswahl(){
        when (randomAuswahl.random()){
            feueratem() -> feueratem()
            schwanzflosse() -> schwanzflosse()
            verfluchen() -> verfluchen()
            beschwoeren() -> beschwoeren()
        }

    }
    fun feueratem(): Int {
        println("Feuerangriff: 20 Schaden für Party!")
        // feuerangriff fügt 20 Schaden für Party zu
        return 20
    }

    fun schwanzflosse(): Int {
        println("Schwanzflosse: 20 Schaden für einen Helden!")
        //Fügt 20 Schaden für ein Helden hinzu
        return 20
    }

    fun verfluchen(): Boolean {
        println("Verflucht: Ein Held bekommt 5 Schaden für 4 Runden!")
        //Verflucht ein Party Mitglied Helden für vier Runden bei fünf schaden
        return true
    }

    fun beschwoeren() {
        //Beschwört den Schergen
        println("Ein unterboss wird gerufen!")
        var scherge = Scherge()
        scherge.gespawnt = true
        return
    }
}