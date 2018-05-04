package ir.hosseinabbasi.payconiq;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import ir.hosseinabbasi.payconiq.data.db.model.Response;
import ir.hosseinabbasi.payconiq.data.network.IApiService;
import ir.hosseinabbasi.payconiq.ui.main.IMainActivityView;

import static org.mockito.Mockito.*;

/**
 * Created by Dr.jacky on 2018/05/04.
 */
public class ApiServiceUnitTest3 {
    Map<String, String> params;

    @Mock
    private IApiService iApiService;

    @Mock
    private IMainActivityView iMainActivityView;

    @Before
    public void setUp() {
        params = new HashMap<>();
        params.put("page", "1");
        params.put("per_page", "1");

        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fetchData() {
        Response responseModel = Response.Companion.fromJson("  {\n" +
                "    \"id\": 3070104,\n" +
                "    \"name\": \"abs.io\",\n" +
                "    \"full_name\": \"JakeWharton/abs.io\",\n" +
                "    \"owner\": {\n" +
                "      \"login\": \"JakeWharton\",\n" +
                "      \"id\": 66577,\n" +
                "      \"avatar_url\": \"https://avatars0.githubusercontent.com/u/66577?v=4\",\n" +
                "      \"gravatar_id\": \"\",\n" +
                "      \"url\": \"https://api.github.com/users/JakeWharton\",\n" +
                "      \"html_url\": \"https://github.com/JakeWharton\",\n" +
                "      \"followers_url\": \"https://api.github.com/users/JakeWharton/followers\",\n" +
                "      \"following_url\": \"https://api.github.com/users/JakeWharton/following{/other_user}\",\n" +
                "      \"gists_url\": \"https://api.github.com/users/JakeWharton/gists{/gist_id}\",\n" +
                "      \"starred_url\": \"https://api.github.com/users/JakeWharton/starred{/owner}{/repo}\",\n" +
                "      \"subscriptions_url\": \"https://api.github.com/users/JakeWharton/subscriptions\",\n" +
                "      \"organizations_url\": \"https://api.github.com/users/JakeWharton/orgs\",\n" +
                "      \"repos_url\": \"https://api.github.com/users/JakeWharton/repos\",\n" +
                "      \"events_url\": \"https://api.github.com/users/JakeWharton/events{/privacy}\",\n" +
                "      \"received_events_url\": \"https://api.github.com/users/JakeWharton/received_events\",\n" +
                "      \"type\": \"User\",\n" +
                "      \"site_admin\": false\n" +
                "    },\n" +
                "    \"private\": false,\n" +
                "    \"html_url\": \"https://github.com/JakeWharton/abs.io\",\n" +
                "    \"description\": \"Simple URL shortener for ActionBarSherlock using node.js and express.\",\n" +
                "    \"fork\": false,\n" +
                "    \"url\": \"https://api.github.com/repos/JakeWharton/abs.io\",\n" +
                "    \"forks_url\": \"https://api.github.com/repos/JakeWharton/abs.io/forks\",\n" +
                "    \"keys_url\": \"https://api.github.com/repos/JakeWharton/abs.io/keys{/key_id}\",\n" +
                "    \"collaborators_url\": \"https://api.github.com/repos/JakeWharton/abs.io/collaborators{/collaborator}\",\n" +
                "    \"teams_url\": \"https://api.github.com/repos/JakeWharton/abs.io/teams\",\n" +
                "    \"hooks_url\": \"https://api.github.com/repos/JakeWharton/abs.io/hooks\",\n" +
                "    \"issue_events_url\": \"https://api.github.com/repos/JakeWharton/abs.io/issues/events{/number}\",\n" +
                "    \"events_url\": \"https://api.github.com/repos/JakeWharton/abs.io/events\",\n" +
                "    \"assignees_url\": \"https://api.github.com/repos/JakeWharton/abs.io/assignees{/user}\",\n" +
                "    \"branches_url\": \"https://api.github.com/repos/JakeWharton/abs.io/branches{/branch}\",\n" +
                "    \"tags_url\": \"https://api.github.com/repos/JakeWharton/abs.io/tags\",\n" +
                "    \"blobs_url\": \"https://api.github.com/repos/JakeWharton/abs.io/git/blobs{/sha}\",\n" +
                "    \"git_tags_url\": \"https://api.github.com/repos/JakeWharton/abs.io/git/tags{/sha}\",\n" +
                "    \"git_refs_url\": \"https://api.github.com/repos/JakeWharton/abs.io/git/refs{/sha}\",\n" +
                "    \"trees_url\": \"https://api.github.com/repos/JakeWharton/abs.io/git/trees{/sha}\",\n" +
                "    \"statuses_url\": \"https://api.github.com/repos/JakeWharton/abs.io/statuses/{sha}\",\n" +
                "    \"languages_url\": \"https://api.github.com/repos/JakeWharton/abs.io/languages\",\n" +
                "    \"stargazers_url\": \"https://api.github.com/repos/JakeWharton/abs.io/stargazers\",\n" +
                "    \"contributors_url\": \"https://api.github.com/repos/JakeWharton/abs.io/contributors\",\n" +
                "    \"subscribers_url\": \"https://api.github.com/repos/JakeWharton/abs.io/subscribers\",\n" +
                "    \"subscription_url\": \"https://api.github.com/repos/JakeWharton/abs.io/subscription\",\n" +
                "    \"commits_url\": \"https://api.github.com/repos/JakeWharton/abs.io/commits{/sha}\",\n" +
                "    \"git_commits_url\": \"https://api.github.com/repos/JakeWharton/abs.io/git/commits{/sha}\",\n" +
                "    \"comments_url\": \"https://api.github.com/repos/JakeWharton/abs.io/comments{/number}\",\n" +
                "    \"issue_comment_url\": \"https://api.github.com/repos/JakeWharton/abs.io/issues/comments{/number}\",\n" +
                "    \"contents_url\": \"https://api.github.com/repos/JakeWharton/abs.io/contents/{+path}\",\n" +
                "    \"compare_url\": \"https://api.github.com/repos/JakeWharton/abs.io/compare/{base}...{head}\",\n" +
                "    \"merges_url\": \"https://api.github.com/repos/JakeWharton/abs.io/merges\",\n" +
                "    \"archive_url\": \"https://api.github.com/repos/JakeWharton/abs.io/{archive_format}{/ref}\",\n" +
                "    \"downloads_url\": \"https://api.github.com/repos/JakeWharton/abs.io/downloads\",\n" +
                "    \"issues_url\": \"https://api.github.com/repos/JakeWharton/abs.io/issues{/number}\",\n" +
                "    \"pulls_url\": \"https://api.github.com/repos/JakeWharton/abs.io/pulls{/number}\",\n" +
                "    \"milestones_url\": \"https://api.github.com/repos/JakeWharton/abs.io/milestones{/number}\",\n" +
                "    \"notifications_url\": \"https://api.github.com/repos/JakeWharton/abs.io/notifications{?since,all,participating}\",\n" +
                "    \"labels_url\": \"https://api.github.com/repos/JakeWharton/abs.io/labels{/name}\",\n" +
                "    \"releases_url\": \"https://api.github.com/repos/JakeWharton/abs.io/releases{/id}\",\n" +
                "    \"deployments_url\": \"https://api.github.com/repos/JakeWharton/abs.io/deployments\",\n" +
                "    \"created_at\": \"2011-12-29T18:02:34Z\",\n" +
                "    \"updated_at\": \"2018-04-19T15:12:39Z\",\n" +
                "    \"pushed_at\": \"2011-12-29T18:02:44Z\",\n" +
                "    \"git_url\": \"git://github.com/JakeWharton/abs.io.git\",\n" +
                "    \"ssh_url\": \"git@github.com:JakeWharton/abs.io.git\",\n" +
                "    \"clone_url\": \"https://github.com/JakeWharton/abs.io.git\",\n" +
                "    \"svn_url\": \"https://github.com/JakeWharton/abs.io\",\n" +
                "    \"homepage\": \"http://abs.io\",\n" +
                "    \"size\": 108,\n" +
                "    \"stargazers_count\": 7,\n" +
                "    \"watchers_count\": 7,\n" +
                "    \"language\": \"JavaScript\",\n" +
                "    \"has_issues\": true,\n" +
                "    \"has_projects\": true,\n" +
                "    \"has_downloads\": true,\n" +
                "    \"has_wiki\": false,\n" +
                "    \"has_pages\": false,\n" +
                "    \"forks_count\": 1,\n" +
                "    \"mirror_url\": null,\n" +
                "    \"archived\": true,\n" +
                "    \"open_issues_count\": 0,\n" +
                "    \"license\": null,\n" +
                "    \"forks\": 1,\n" +
                "    \"open_issues\": 0,\n" +
                "    \"watchers\": 7,\n" +
                "    \"default_branch\": \"master\"\n" +
                "  }");

        Mockito.doReturn(Observable.just(responseModel)).when(iApiService).getResponse(params);
    }
}
