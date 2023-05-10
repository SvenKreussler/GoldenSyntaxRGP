package Gegner

// Name und hp für generische Klasse Gegner
open class Gegner(var nameBig: String,
                  var name: String,
                  var hp: Int,
                  var alive:Boolean,
                  var zugGemacht:Boolean,
                  var vergifted:Boolean) {
                  val red = "\u001b[31m"
                  val reset = "\u001b[0m"
                  val cyan = "\u001b[96m"

}