import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val a = st.nextToken().toLong()
    val b = st.nextToken().toLong()

    bw.write(((a + b) * (a - b)).toString())
    bw.flush()
}