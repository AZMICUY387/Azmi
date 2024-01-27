
//fungsi dengan return
fun barang(item : String):Double{
    return when (item){
    	"Gamis" -> 150000.0
        "Kaos" -> 50000.0
        "Kemeja" -> 700000.0
        "Celana" -> 120000.0
        "Kaos Dalam" -> 20000.0
        
        else -> 0.0
    } 
}

fun diskon(harga: Double):Double{
    
    if(harga >= 100000){
        val diskon = harga * 0.1
    	val total = harga - diskon
        return total
	}
    else if(harga >= 80000){
        val diskon = harga * 0.05
    	val total = harga - diskon
        return total
	}
    else {
        val total = harga
    	return total
    }

}

fun main() {
    val namabrgg = "Kaos"
    val harga = barang(namabrgg)
    
    val total = diskon(harga)
    println("Terima Kasih Telah Berbelanja Di BAyu SHOPPP\nNama Barang\t\t:\t$namabrgg\nHarga\t\t\t:\t$harga\nTOTAL YG DIBAYAR \t:\t$total")
}
