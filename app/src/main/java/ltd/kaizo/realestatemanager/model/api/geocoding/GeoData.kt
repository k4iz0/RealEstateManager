package ltd.kaizo.realestatemanager.model.api.geocoding

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GeoData {

    @SerializedName("results")
    @Expose
    var results: List<Result>? = null
    @SerializedName("status")
    @Expose
    var status: String? = null

}
