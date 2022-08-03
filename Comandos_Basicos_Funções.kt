// Função que exibe uma mensagem na tela
fun novaFuncao(){
    println("Oi, tudo bem?")
}

// Função privada que exibe uma mensagem utilizando
// a string que está sendo passada por parâmetro
private fun novaFuncao2(nome: String){
    println("Oi, $nome")
}


fun main() {
    // Acionando a função
    novaFuncao()
	// Acionando a função e passando um valor por parâmetro
    novaFuncao2("Daniel")
}