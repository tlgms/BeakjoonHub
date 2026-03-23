import java.io.*
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
//    var st = StringTokenizer(br.readLine(), " ")

    val n = br.readLine().toInt()
    if (n % 5 == 0) {
        println(n / 5)
    } else {
        bw.write((n / 5 + 1).toString())
    }

    bw.flush()
    bw.close()
}