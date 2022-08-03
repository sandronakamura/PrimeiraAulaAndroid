fun main() {
    
	// O Código não irá compilar pois o Kotlin não permite a
	// a atribuição direta de um null a uma variável
 	var driverLicense:String = null
    var driverLicense:String = "6789877"
    driverLicense = null
	
	// Com o uso do sufixo ? irá permitir a atribuição
	// de null a uma variável
	var driverLicense:String? = null
    println(driverLicense)
    driverLicense = "6789877"
    println(driverLicense)
    driverLicense = null
    println(driverLicense)
}