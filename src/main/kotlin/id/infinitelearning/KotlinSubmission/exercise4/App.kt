package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    try {
        val result = validateAccount("Laila" , "12344556677")
        println(result)
    } catch (error: Exception) {
        println(error)
    } finally {
        println("Finish")
    }



}



fun validateAccount(name: String, password: String): String {
    if (name.count() < 3 ) {
        throw Exception("nama harus panjang lebih dari 3 huruf")
    }

    if (password.count() <7)
        throw Exception("passwor harus lebih dari 7 huruf ")

    return "Selamat account anda telah berhasil diaktifkan !"
}