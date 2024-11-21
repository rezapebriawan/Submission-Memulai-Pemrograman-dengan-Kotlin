package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    // Mencari angka dalam string menggunakan regex
    val numberInString = str.filter { it.isDigit() }

    // Jika string mengandung angka, kalikan angka yang ditemukan dengan angka input
    return if (numberInString.isNotEmpty()) {
        // Mengambil angka yang ditemukan dalam string dan mengalikan dengan input integer
        val number = numberInString.toInt()
        val result = number * int
        // Menggabungkan teks sebelumnya dengan hasil kali angka
        str.replace(numberInString, result.toString())
    } else {
        // Jika tidak mengandung angka, langsung gabungkan string dengan angka input
        str + int
    }
}
