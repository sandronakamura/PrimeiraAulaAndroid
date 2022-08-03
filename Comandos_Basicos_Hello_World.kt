fun main() {
	// O println exibe informação no console podendo
	// ser um texto ou variáveis
    println("Hello, world!!!")
    // O \"\" permite utilizar as aspas como string.
    // O \n quebra a linha
    println("Esse texto \"quebra\" \nduas linhas")
	// O \t funciona como um tab na hora da exibição
    println("Nota:\t 10")
    
	// Pair atribui os valores nas variáveis na 
	// ordem em que foi declarada
    val(endereco, numero) = Pair("Paulista", 1122)
    // Exibe o valor das variáveis
    println(endereco)
    println(numero)
}