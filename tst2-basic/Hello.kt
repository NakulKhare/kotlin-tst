import com.google.gson.Gson
import jsonresponce.Response
import myres.MyRes
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.simple.JSONObject
import org.json.simple.JSONValue

class Hello{
    private var client = OkHttpClient()
    var gson = Gson()

    // sending the request
    fun sendRequest(url: String): Unit {
        val request = Request.Builder()
            .url(url)
            .build()

        return try {
            val response = client.newCall(request).execute()
            val jsonData = response.body.toString()
//            var data = gson.fromJson(jsonData, Array<MyRes>::class.java)
//            for (x in 0 until data.size){
//                println(data[x])
//            }

            var obj = JSONValue.parse(jsonData)
            var jsonObj= obj as JSONObject

            println(jsonObj)

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}

fun main(ad: Array<String>){
    val callAPI = Hello()
    callAPI.sendRequest("https://en.wikipedia.org/w/api.php?action=query&format=json&list=search&srsearch=Trump")
}