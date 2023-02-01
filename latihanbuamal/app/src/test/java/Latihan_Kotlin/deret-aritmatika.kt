package Latihan_Kotlin
import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)




    print("Masukkan suku pertama= ")
    var sukuA = input.nextInt()
    print("Masukkan selisih= ")
    var selisih = input.nextInt()
    print("Masukkan banyak suku yang ingin ditammpilkan= ")
    var banyak = input.nextInt()

    var mulai=1

    while(mulai<=banyak){
        println("Suku ke $mulai adalah ==$sukuA")
        ++mulai
        sukuA+=selisih

    }

}