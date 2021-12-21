

class Time(val nome: String, val pais: String)

// declarando os potes
var pote1 = mutableListOf(
    Time("Palmeiras", "BRA"),
    Time("River Plate", "ARG"),
    Time("Boca Jrs", "ARG"),
    Time("Flamengo", "BRA"),
    Time("Nacional", "URU"),
    Time("Peñarol", "URU"),
    Time("Athlético", "BRA"),
    Time("Atlético-MG", "BRA")
)

fun main() {
    println(pote1)
}