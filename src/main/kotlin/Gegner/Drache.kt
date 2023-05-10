package Gegner

class Drache:Gegner("""
  ____               _         _   _   _         
 / ___|   ___     __| |  ____ (_) | | | |   __ _ 
| |  _   / _ \   / _` | |_  / | | | | | |  / _` |
| |_| | | (_) | | (_| |  / /  | | | | | | | (_| |
 \____|  \___/   \__,_| /___| |_| |_| |_|  \__,_|
 |___/ """,
                    name = "Godzilla",
                    200,
                    alive = true,
                    zugGemacht = true,
                    vergifted = false) {

    open fun feueratem(): Int{
        // feuerangriff fügt 20 Schaden für Party zu

        return 20
    }

    fun schwanzflosse(): Int {
        /*println("$cyan $nameBig\n Schwanzflosse: 20 Schaden für einen Helden!$reset")*/
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
