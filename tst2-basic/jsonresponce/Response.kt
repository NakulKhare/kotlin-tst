package jsonresponce

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Response(

	@field:SerializedName("batchcomplete")
	val batchcomplete: String? = null,

	@field:SerializedName("continue")
	val jsonMemberContinue: JsonMemberContinue? = null,

	@field:SerializedName("query")
	val query: Query? = null
)