package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    // Mengurutkan angka secara menurun dan mengambil 3 angka terbesar
    return numbers.sortedDescending().take(3).sum()
}
