package functions;

fun calculateTable(number: Int) {
    var index: Int = 0;
    println("- Multiple Table of number: $number:")
    for (i in 0..number * 10 step number) {
        println("$number X ${index++} = $i");
    }
}