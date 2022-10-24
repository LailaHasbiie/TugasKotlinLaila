
package id.infinitelearning.KotlinSubmission.exercise2

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val numbers = mutableListOf<Int>()
    for (i in 1..100) {
        if (i % 2 == 0) {
            numbers.add(i);
        }
    }
    println(numbers)




    /** Latihan 2 Map
    Buatlah variabel bertipe Map dengan kriteria:
    Daftar nama bulan dalam setahun,
    - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
    - key "Jan", value January
    - key "Feb", value February
    - dst...
    Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
    - Jan -> January
    - Feb -> February
    - Dst...

    Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
    - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val months = mapOf<String, String>(
        "Jan" to "January",
        "Feb" to "February",
        "Mar" to "Martch",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jul" to "July",
        "Jun" to "Juni",
        "Ags" to "Augustus",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November," ,
        "Dec" to "December",

    )
    months.forEach { value ->
        println("Months is -> $value")
    }

    val monthNow = months["Oct"]
    val birthMonth = months["Apr"]
    println("it's {$monthNow} now, I was born in {$birthMonth")

}