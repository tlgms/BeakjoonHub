import java.io.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.math.pow


fun main() {
//    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

//    val st = StringTokenizer(br.readLine())

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    val now = LocalDateTime.now().format(formatter)

    val st = StringTokenizer(now, "-")
    
    bw.write(
        st.nextToken() + "\n"
                + st.nextToken() + "\n"
                + st.nextToken()
    )

    bw.flush()
    bw.close()
}