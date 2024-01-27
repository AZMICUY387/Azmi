//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Gamis" -> 150000
        "Kaos" -> 50000
        "Kemeja" -> 700000
        "Celana" -> 120000
        "Kaos Dalam" -> 20000
        
        else -> 0
    } 
}
//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Gamis" -> 150000
        "Kaos" -> 50000
        "Kemeja" -> 700000
        "Celana" -> 120000
        "Kaos Dalam" -> 20000
        
        else -> 0
    } 
}

fun diskon(harga: Int):Double{
    
    if(harga >= 100000){
        val diskon = harga * 0.01
    	val total = harga - diskon
        return total
	}
    else if(harga >= 80000){
        val diskon = harga * 0.10
    	val total = harga - diskon
        return total
	}
    else {
    return harga
    }

}

fun main() {
    val namabrgg = "Celana"
    val harga = barang(namabrgg)
    
    val total = diskon(harga)
    println("Terima Kasih Telah Berbelanja Di BAyu SHOPPP\nNama Barang\t:\t$namabrgg\nTOTAL \t\t:\t $total")
}
