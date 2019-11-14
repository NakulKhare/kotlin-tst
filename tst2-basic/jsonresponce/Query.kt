package jsonresponce

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Query(

	@field:SerializedName("search")
	val search: List<SearchItem?>? = null,

	@field:SerializedName("searchinfo")
	val searchinfo: Searchinfo? = null
)