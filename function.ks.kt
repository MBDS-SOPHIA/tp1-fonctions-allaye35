fun afficherNombresPairsOuImpairs(x: Int, pair: Boolean) {
    var count = 0
    var number = 0
    while (count < x) {
        if ((pair && number % 2 == 0) || (!pair && number % 2 != 0)) {
            println(number)
            count++
        }
        number++
    }
}



fun afficherFibonacci(x: Int) {
    var n1 = 0
    var n2 = 1
    var temp: Int

    println("Les $x premiers nombres de la suite Fibonacci :")
    for (i in 1..x) {
        println(n1)
        temp = n1 + n2
        n1 = n2
        n2 = temp
    }
}




fun calculerFactoriel(x: Int = 10): Long {
    var result: Long = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}




fun estNombrePremier(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2..n / 2) {
        if (n % i == 0) return false
    }
    return true
}

fun afficherNombresPremiers(x: Int) {
    var count = 0
    var number = 2

    println("Les $x premiers nombres premiers :")
    while (count < x) {
        if (estNombrePremier(number)) {
            println(number)
            count++
        }
        number++
    }
}

fun main() {
    println("Les 5 premiers nombres pairs :")

    afficherNombresPairsOuImpairs(5, true)

    println("Les 5 premiers nombres impairs :")
    afficherNombresPairsOuImpairs(5, false)
    afficherFibonacci(10)
    println("Factoriel de 10 (par défaut) : ${calculerFactoriel()}")
    println("Factoriel de 5 : ${calculerFactoriel(5)}")
    afficherNombresPremiers(10)
}
