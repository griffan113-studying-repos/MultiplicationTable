import functions.calculateTable
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    var loop: Boolean = true;

    do {
        print("- Type a number to see the multiple table: ")
        val number: Int = try {
            readLine()!!.toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException(
                "That's not a number!"
            );
        };

        when {
            number <= 0 -> {
                print("- The number can't be null or negative!");
            }
            else -> {
                calculateTable(number);
                println("- Reload? [Yes] [No]");

                val arg = readLine();
                val lower = arg!!.lowercase();

                loop = lower == "yes";
            }
        }
    } while (loop)
}