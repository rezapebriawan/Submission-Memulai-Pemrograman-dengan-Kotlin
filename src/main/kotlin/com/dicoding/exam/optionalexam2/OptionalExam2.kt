package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    // Mengonversi angka menjadi string agar bisa memisahkan digit
    val digits = number.toString().map { it.toString().toInt() }
    // Mencari digit terkecil dan terbesar
    val minDigit = digits.minOrNull() ?: 0
    val maxDigit = digits.maxOrNull() ?: 0
    // Mengembalikan hasil penjumlahan digit terkecil dan terbesar
    return minDigit + maxDigit
}
