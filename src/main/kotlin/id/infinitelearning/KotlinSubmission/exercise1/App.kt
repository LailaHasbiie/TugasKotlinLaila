package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val hasil = setUser("Laila", "Hasbi", 21, "wanita")

    val x: Boolean = false
    val y: Boolean = true

    println(hasil)
    println("status kamu adalah = " + (x && y)) // mengendalikan nilai true jika kedua operan benar
    println("status kamu adalah = " + (x || y)) // mengendalikan nilai true jika salah satu operan benar
    println("status kamu adalah = " + (!y)) // membalikan hasilnya,mengambalikan false jika operannya true


}
fun setUser(name: String, namelast: String, age: Int, sex: String): String {
    return "nama kamu adalah $name,nama belakang kamu $namelast, umur kamu $age tahun, kamu adalah seorang$sex"

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember , session)
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun myName(): String {
    val team: String = "Laila Hasbi, Tuti utami , Ilham prasetyo putra utama , Seno Hasandi N"
    println("my team is : $team")
    return "Laila Hasbi"
}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Ardy", "Reza")
    val countOfGroup = 5
    return mentor.count()  + countOfGroup;

}

fun main() {

    myProfile()

    val myName = myName()
    println("My Name is: $myName")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Group 2", listOf("Member 4", "Infinite Learning", "Medical & Health care"), "Afternoon")

}