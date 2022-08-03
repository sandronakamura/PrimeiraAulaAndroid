fun main() {
    // Cria uma lista com os valores informados no listOf
    val nomes = listOf("Daniel", "Domingos", "Akira")
    // Loop que exibe valor por valor baseado no tamanho da lista
    for (nome in nomes){
        println(nome)
    }
    // Loop que exibe os valores de 1 a 5
    for (i in 1..5){
        println(i)
    }
    // Loop que exibe os valores enquanto for menor que
    // o ultimo valor informado
    for (i in 1 until 5){
        print(i)
    }
}