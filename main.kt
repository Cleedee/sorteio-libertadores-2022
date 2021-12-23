

class Time(val nome: String, val pais: String) {
    override fun toString() = nome
}

class Sorteador(var pote1: MutableList<Time>, var pote2: MutableList<Time>,
    var pote3: MutableList<Time>, var pote4: MutableList<Time>) {

    var grupoA = mutableListOf<Time>()
    var grupoB = mutableListOf<Time>()
    var grupoC = mutableListOf<Time>()
    var grupoD = mutableListOf<Time>()
    var grupoE = mutableListOf<Time>()
    var grupoF = mutableListOf<Time>()
    var grupoG = mutableListOf<Time>()
    var grupoH = mutableListOf<Time>()

    fun sortear() {
        pote1.shuffle()
        grupoA.add(pote1[0])
        grupoB.add(pote1[1])
        grupoC.add(pote1[2])
        grupoD.add(pote1[3])
        grupoE.add(pote1[4])
        grupoF.add(pote1[5])
        grupoG.add(pote1[6])
        grupoH.add(pote1[7])

        pote2.shuffle()
        println(grupoA[0])
        println(grupoB[0])
    }

}

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

var pote2 = mutableListOf(
    Time("Cerro Porteño", "PAR"),
    Time("Libertad", "PAR"),
    Time("Ind. Del Valle", "EQU"),
    Time("Univ. Católica", "CHI"),
    Time("Emelec", "EQU"),
    Time("Corinthians", "BRA"),
    Time("Colo-Colo", "CHI"),
    Time("Velez Sarsfield", "ARG")
)

var pote3 = mutableListOf(
    Time("Sporting Cristal", "PER"),
    Time("RB Bragantino", "BRA"),
    Time("Tachira", "VEN"),
    Time("Alianza Lima", "PER"),
    Time("Tolima", "COL"),
    Time("Colon", "ARG"),
    Time("Caracas", "VEN"),
    Time("Dep. Cali", "COL")
)

var pote4 = mutableListOf(
    Time("Always Ready", "BOL"),
    Time("Talleres", "ARG"),
    Time("Ind. Petrolero", "BOL"),
    Time("Fortaleza", "BRA"),
    Time("Vencedor do G1", "XXX"),
    Time("Vencedor do G2", "XXX"),
    Time("Vencedor do G3", "XXX"),
    Time("Vencedor do G4", "XXX")
)


fun main() {
    var sorteador = Sorteador(pote1, pote2, pote3, pote4)
// sortear nos grupos
    println(pote1)

    sorteador.sortear()

}