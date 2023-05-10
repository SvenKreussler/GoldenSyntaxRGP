package Helden

// generische Klasse für Helden
open class Held(var nameBig:String,
                var name: String,
                var hp:Int,
                var alive: Boolean,
                var zugGemacht: Boolean,
                var vergifted: Boolean,
                var anwenderwaehltAus:Int):Beutel(heiltrank = 3, phoenixfeder = 1){

                val red = "\u001b[31m"
                val reset = "\u001b[0m"
}

