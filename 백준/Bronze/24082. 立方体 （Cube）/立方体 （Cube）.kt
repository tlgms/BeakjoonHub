import java.io.*
import java.util.*
import kotlin.math.pow


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

//    val st = StringTokenizer(br.readLine())

    bw.write(
        br.readLine().toDouble().pow(3.0)
            .toInt().toString()
    )

    bw.flush()
    bw.close()
}