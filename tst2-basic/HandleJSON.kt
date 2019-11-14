import khttp.get

class HandleJSON{
    var jsonURL:String? = null

    constructor(url:String) {
        this.jsonURL = url
    }

    fun sendRequest(){
        kh
    }
}

fun main() {
    var apiCall = HandleJSON("https://en.wikipedia.org/w/api.php?action=query&format=json&list=search&srsearch=Trump")
    apiCall.sendRequest()
}