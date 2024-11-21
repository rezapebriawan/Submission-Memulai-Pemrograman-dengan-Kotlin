package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val length = string.length
    return if (length % 2 == 0) {
        // Jika panjang string genap, ambil dua karakter tengah
        string.substring(length / 2 - 1, length / 2 + 1)
    } else {
        // Jika panjang string ganjil, ambil satu karakter tengah
        string.substring(length / 2, length / 2 + 1)
    }
}
