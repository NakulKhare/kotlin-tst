import org.json.simple.JSONObject
import org.json.simple.JSONValue

object JsonDecodeExample1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val s = "{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}"
        val obj = JSONValue.parse(s)
        val jsonObject = obj as JSONObject

//        val name = jsonObject["name"] as String
//        val salary = jsonObject["salary"] as Double
//        val age = jsonObject["age"] as Long
//        println("$name $salary $age")

        println(jsonObject)
    }
}