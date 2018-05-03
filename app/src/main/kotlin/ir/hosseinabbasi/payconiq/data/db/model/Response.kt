package ir.hosseinabbasi.payconiq.data.db.model

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

@Generated("com.robohorse.robopojogenerator")
class Response : RealmObject() {

    @SerializedName("stargazers_count")
    var stargazersCount: Int = 0

    @SerializedName("pushed_at")
    var pushedAt: String? = null

    @SerializedName("subscription_url")
    var subscriptionUrl: String? = null

    @SerializedName("language")
    var language: String? = null

    @SerializedName("branches_url")
    var branchesUrl: String? = null

    @SerializedName("issue_comment_url")
    var issueCommentUrl: String? = null

    @SerializedName("labels_url")
    var labelsUrl: String? = null

    @SerializedName("subscribers_url")
    var subscribersUrl: String? = null

    @SerializedName("releases_url")
    var releasesUrl: String? = null

    @SerializedName("svn_url")
    var svnUrl: String? = null

    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0

    @SerializedName("forks")
    var forks: Int = 0

    @SerializedName("archive_url")
    var archiveUrl: String? = null

    @SerializedName("git_refs_url")
    var gitRefsUrl: String? = null

    @SerializedName("forks_url")
    var forksUrl: String? = null

    @SerializedName("statuses_url")
    var statusesUrl: String? = null

    @SerializedName("ssh_url")
    var sshUrl: String? = null

    @SerializedName("license")
    var license: License? = null

    @SerializedName("full_name")
    var fullName: String? = null

    @SerializedName("size")
    var size: Int = 0

    @SerializedName("languages_url")
    var languagesUrl: String? = null

    @SerializedName("html_url")
    var htmlUrl: String? = null

    @SerializedName("collaborators_url")
    var collaboratorsUrl: String? = null

    @SerializedName("clone_url")
    var cloneUrl: String? = null

    @SerializedName("name")
    var name: String? = null

    @SerializedName("pulls_url")
    var pullsUrl: String? = null

    @SerializedName("default_branch")
    var defaultBranch: String? = null

    @SerializedName("hooks_url")
    var hooksUrl: String? = null

    @SerializedName("trees_url")
    var treesUrl: String? = null

    @SerializedName("tags_url")
    var tagsUrl: String? = null

    @SerializedName("private")
    var isJsonMemberPrivate: Boolean = false

    @SerializedName("contributors_url")
    var contributorsUrl: String? = null

    @SerializedName("has_downloads")
    var isHasDownloads: Boolean = false

    @SerializedName("notifications_url")
    var notificationsUrl: String? = null

    @SerializedName("open_issues_count")
    var openIssuesCount: Int = 0

    @SerializedName("description")
    var description: String? = null

    @SerializedName("created_at")
    var createdAt: String? = null

    @SerializedName("watchers")
    var watchers: Int = 0

    @SerializedName("keys_url")
    var keysUrl: String? = null

    @SerializedName("deployments_url")
    var deploymentsUrl: String? = null

    @SerializedName("has_projects")
    var isHasProjects: Boolean = false

    @SerializedName("archived")
    var isArchived: Boolean = false

    @SerializedName("has_wiki")
    var isHasWiki: Boolean = false

    @SerializedName("updated_at")
    var updatedAt: String? = null

    @SerializedName("comments_url")
    var commentsUrl: String? = null

    @SerializedName("stargazers_url")
    var stargazersUrl: String? = null

    @SerializedName("git_url")
    var gitUrl: String? = null

    @SerializedName("has_pages")
    var isHasPages: Boolean = false

    @SerializedName("owner")
    var owner: Owner? = null

    @SerializedName("commits_url")
    var commitsUrl: String? = null

    @SerializedName("compare_url")
    var compareUrl: String? = null

    @SerializedName("git_commits_url")
    var gitCommitsUrl: String? = null

    @SerializedName("blobs_url")
    var blobsUrl: String? = null

    @SerializedName("git_tags_url")
    var gitTagsUrl: String? = null

    @SerializedName("merges_url")
    var mergesUrl: String? = null

    @SerializedName("downloads_url")
    var downloadsUrl: String? = null

    @SerializedName("has_issues")
    var isHasIssues: Boolean = false

    @SerializedName("url")
    var url: String? = null

    @SerializedName("contents_url")
    var contentsUrl: String? = null

    @SerializedName("mirror_url")
    var mirrorUrl: String? = null

    @SerializedName("milestones_url")
    var milestonesUrl: String? = null

    @SerializedName("teams_url")
    var teamsUrl: String? = null

    @SerializedName("fork")
    var isFork: Boolean = false

    @SerializedName("issues_url")
    var issuesUrl: String? = null

    @SerializedName("events_url")
    var eventsUrl: String? = null

    @SerializedName("issue_events_url")
    var issueEventsUrl: String? = null

    @SerializedName("assignees_url")
    var assigneesUrl: String? = null

    @SerializedName("open_issues")
    var openIssues: Int = 0

    @SerializedName("watchers_count")
    var watchersCount: Int = 0

    @SerializedName("homepage")
    var homepage: String? = null

    @SerializedName("forks_count")
    var forksCount: Int = 0

    override fun toString(): String {
        return "Response{" +
                "stargazers_count = '" + stargazersCount + '\''.toString() +
                ",pushed_at = '" + pushedAt + '\''.toString() +
                ",subscription_url = '" + subscriptionUrl + '\''.toString() +
                ",language = '" + language + '\''.toString() +
                ",branches_url = '" + branchesUrl + '\''.toString() +
                ",issue_comment_url = '" + issueCommentUrl + '\''.toString() +
                ",labels_url = '" + labelsUrl + '\''.toString() +
                ",subscribers_url = '" + subscribersUrl + '\''.toString() +
                ",releases_url = '" + releasesUrl + '\''.toString() +
                ",svn_url = '" + svnUrl + '\''.toString() +
                ",id = '" + id + '\''.toString() +
                ",forks = '" + forks + '\''.toString() +
                ",archive_url = '" + archiveUrl + '\''.toString() +
                ",git_refs_url = '" + gitRefsUrl + '\''.toString() +
                ",forks_url = '" + forksUrl + '\''.toString() +
                ",statuses_url = '" + statusesUrl + '\''.toString() +
                ",ssh_url = '" + sshUrl + '\''.toString() +
                ",license = '" + license + '\''.toString() +
                ",full_name = '" + fullName + '\''.toString() +
                ",size = '" + size + '\''.toString() +
                ",languages_url = '" + languagesUrl + '\''.toString() +
                ",html_url = '" + htmlUrl + '\''.toString() +
                ",collaborators_url = '" + collaboratorsUrl + '\''.toString() +
                ",clone_url = '" + cloneUrl + '\''.toString() +
                ",name = '" + name + '\''.toString() +
                ",pulls_url = '" + pullsUrl + '\''.toString() +
                ",default_branch = '" + defaultBranch + '\''.toString() +
                ",hooks_url = '" + hooksUrl + '\''.toString() +
                ",trees_url = '" + treesUrl + '\''.toString() +
                ",tags_url = '" + tagsUrl + '\''.toString() +
                ",private = '" + isJsonMemberPrivate + '\''.toString() +
                ",contributors_url = '" + contributorsUrl + '\''.toString() +
                ",has_downloads = '" + isHasDownloads + '\''.toString() +
                ",notifications_url = '" + notificationsUrl + '\''.toString() +
                ",open_issues_count = '" + openIssuesCount + '\''.toString() +
                ",description = '" + description + '\''.toString() +
                ",created_at = '" + createdAt + '\''.toString() +
                ",watchers = '" + watchers + '\''.toString() +
                ",keys_url = '" + keysUrl + '\''.toString() +
                ",deployments_url = '" + deploymentsUrl + '\''.toString() +
                ",has_projects = '" + isHasProjects + '\''.toString() +
                ",archived = '" + isArchived + '\''.toString() +
                ",has_wiki = '" + isHasWiki + '\''.toString() +
                ",updated_at = '" + updatedAt + '\''.toString() +
                ",comments_url = '" + commentsUrl + '\''.toString() +
                ",stargazers_url = '" + stargazersUrl + '\''.toString() +
                ",git_url = '" + gitUrl + '\''.toString() +
                ",has_pages = '" + isHasPages + '\''.toString() +
                ",owner = '" + owner + '\''.toString() +
                ",commits_url = '" + commitsUrl + '\''.toString() +
                ",compare_url = '" + compareUrl + '\''.toString() +
                ",git_commits_url = '" + gitCommitsUrl + '\''.toString() +
                ",blobs_url = '" + blobsUrl + '\''.toString() +
                ",git_tags_url = '" + gitTagsUrl + '\''.toString() +
                ",merges_url = '" + mergesUrl + '\''.toString() +
                ",downloads_url = '" + downloadsUrl + '\''.toString() +
                ",has_issues = '" + isHasIssues + '\''.toString() +
                ",url = '" + url + '\''.toString() +
                ",contents_url = '" + contentsUrl + '\''.toString() +
                ",mirror_url = '" + mirrorUrl + '\''.toString() +
                ",milestones_url = '" + milestonesUrl + '\''.toString() +
                ",teams_url = '" + teamsUrl + '\''.toString() +
                ",fork = '" + isFork + '\''.toString() +
                ",issues_url = '" + issuesUrl + '\''.toString() +
                ",events_url = '" + eventsUrl + '\''.toString() +
                ",issue_events_url = '" + issueEventsUrl + '\''.toString() +
                ",assignees_url = '" + assigneesUrl + '\''.toString() +
                ",open_issues = '" + openIssues + '\''.toString() +
                ",watchers_count = '" + watchersCount + '\''.toString() +
                ",homepage = '" + homepage + '\''.toString() +
                ",forks_count = '" + forksCount + '\''.toString() +
                "}"
    }
}