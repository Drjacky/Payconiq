package ir.hosseinabbasi.payconiq.data.db.model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

import io.realm.RealmObject

@Generated("com.robohorse.robopojogenerator")
open class License : RealmObject() {

    @SerializedName("name")
    var name: String? = null

    @SerializedName("spdx_id")
    var spdxId: String? = null

    @SerializedName("key")
    var key: String? = null

    @SerializedName("url")
    var url: String? = null

    override fun toString(): String {
        return "License{" +
                "name = '" + name + '\''.toString() +
                ",spdx_id = '" + spdxId + '\''.toString() +
                ",key = '" + key + '\''.toString() +
                ",url = '" + url + '\''.toString() +
                "}"
    }
}