import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine(), " ")

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val trees = IntArray(N)

    var max = 0
    var min = 0


    st = StringTokenizer(br.readLine(), " ")
    for(i in 0 until N) {
        trees[i] = st.nextToken().toInt()

        if(max < trees[i]) {
            max = trees[i]
        }
    }

    while (min < max) {

        val mid = (min + max) / 2
        var sum: Long = 0

        trees.forEach { tree ->
            if (tree - mid > 0) {
                sum += (tree - mid)
            }
        }

        if(sum < M) {
            max = mid
        } else {
            min = mid + 1
        }
    }

    bw.write((min - 1).toString())

    bw.flush()
    bw.close()
}