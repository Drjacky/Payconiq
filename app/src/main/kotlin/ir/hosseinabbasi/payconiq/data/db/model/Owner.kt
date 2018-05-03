package ir.hosseinabbasi.payconiq.data.db.model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

import io.realm.RealmObject

@Generated("com.robohorse.robopojogenerator")
open class Owner : RealmObject() {

    @SerializedName("gists_url")
    var gistsUrl: String? = null

    @SerializedName("repos_url")
    var reposUrl: String? = null

    @SerializedName("following_url")
    var followingUrl: String? = null

    @SerializedName("starred_url")
    var starredUrl: String? = null

    @SerializedName("login")
    var login: String? = null

    @SerializedName("followers_url")
    var followersUrl: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("url")
    var url: String? = null

    @SerializedName("subscriptions_url")
    var subscriptionsUrl: String? = null

    @SerializedName("received_events_url")
    var receivedEventsUrl: String? = null

    @SerializedName("avatar_url")
    var avatarUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("site_admin")
    var isSiteAdmin: Boolean = false

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("gravatar_id")
    var gravatarId: String? = null

    @SerializedName("organizations_url")
    var organizationsUrl: String? = null

    override fun toString(): String {
        return "Owner{" +
                "gists_url = '" + gistsUrl + '\''.toString() +
                ",repos_url = '" + reposUrl + '\''.toString() +
                ",following_url = '" + followingUrl + '\''.toString() +
                ",starred_url = '" + starredUrl + '\''.toString() +
                ",login = '" + login + '\''.toString() +
                ",followers_url = '" + followersUrl + '\''.toString() +
                ",type = '" + type + '\''.toString() +
                ",url = '" + url + '\''.toString() +
                ",subscriptions_url = '" + subscriptionsUrl + '\''.toString() +
                ",received_events_url = '" + receivedEventsUrl + '\''.toString() +
                ",avatar_url = '" + avatarUrl + '\''.toString() +
                ",events_url = '" + eventsUrl + '\''.toString() +
                ",html_url = '" + htmlUrl + '\''.toString() +
                ",site_admin = '" + isSiteAdmin + '\''.toString() +
                ",id = '" + id + '\''.toString() +
                ",gravatar_id = '" + gravatarId + '\''.toString() +
                ",organizations_url = '" + organizationsUrl + '\''.toString() +
                "}"
    }
}