fun main() {
	// Atribui uma string a variável
    val minhaString = "KOTLIN"
    // Exibe o primeiro caracter da string
    println(minhaString[0])
    // Exibe o ultimo caracter da string
    println(minhaString[5])
    // Verifica se a variável está vazia ou não, retornando
    // o true ou false.
    println(minhaString.isEmpty())
    // Exibe os caracteres nas posições informadas na substring
    println(minhaString.substring(2, 4))
    // O $ permite a exibição do valor da variável dentro da mensagem
    println("Minha string é: $minhaString")
}