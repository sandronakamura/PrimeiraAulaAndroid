fun main() {
    // Cria uma lista de strings recebendo os valores 
    // informados no listOf
    val nomes = listOf("Daniel", "Domingos", "Akira")
    // Exibe a lista de valores
    println(nomes)
    // Exibe o segundo valor da lista
    println(nomes[2])
    // Cria uma lista mutável de strings recebendo os valores 
    // informados no mutableListOf
    val sobrenomes = mutableListOf("Silva", "Lima", "Pereira")
    // Exibe a lista de valores
    println(sobrenomes)
    // Adiciona um valor no final da lista
    sobrenomes.add("Fagundes")
    // Exibe a lista de valores 
    println(sobrenomes)
}