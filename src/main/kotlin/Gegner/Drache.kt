package Gegner

class Drache:Gegner("Godzilla",
                    200,
                    alive = true,
                    zugGemacht = false,
                    vergifted = false) {

/*    fun returnRandomAuswahl(){
        var randomAuswahl = listOf(1,2,3,4).random()
        when (randomAuswahl){
            1 -> feueratem()
            2 -> schwanzflosse()
            3 -> verfluchen()
            4 -> beschwoeren()
            else -> println("ungültige Auswahl")
        }

    }*/
/*    fun feueratem(helden:MutableList<String>){
        println("Feuerangriff: 20 Schaden für Party!")
        for (i in 1..3) {
            helden[i].hp - 20
            i++
        }
        // feuerangriff fügt 20 Schaden für Party zu

    }*/

    fun schwanzflosse(): Int {
        println("Schwanzflosse: 20 Schaden für einen Helden!")
        //Fügt 20 Schaden für ein Helden hinzu
        return 20
    }

/*    fun verfluchen(): Boolean {
        println("Verflucht: Ein Held bekommt 5 Schaden für 4 Runden!")
        //Verflucht ein Party Mitglied Helden für vier Runden bei fünf schaden
        return true
    }*/

/*    fun beschwoeren() {
        //Beschwört den Schergen
        println("Ein unterboss wird gerufen!")
        var scherge = Scherge()
        scherge.gespawnt = true

    }*/
}