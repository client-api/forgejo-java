/*
 * Forgejo API.
 * This documentation describes the Forgejo API.
 *
 * The version of the OpenAPI document: 1.20.5+0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.clientapi.forgejo.api;

import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.model.AccessToken;
import com.clientapi.forgejo.model.Activity;
import com.clientapi.forgejo.model.BlockedUser;
import com.clientapi.forgejo.model.CreateAccessTokenOption;
import com.clientapi.forgejo.model.CreateEmailOption;
import com.clientapi.forgejo.model.CreateGPGKeyOption;
import com.clientapi.forgejo.model.CreateHookOption;
import com.clientapi.forgejo.model.CreateKeyOption;
import com.clientapi.forgejo.model.CreateOAuth2ApplicationOptions;
import com.clientapi.forgejo.model.CreateRepoOption;
import com.clientapi.forgejo.model.DeleteEmailOption;
import com.clientapi.forgejo.model.EditHookOption;
import com.clientapi.forgejo.model.Email;
import com.clientapi.forgejo.model.GPGKey;
import com.clientapi.forgejo.model.Hook;
import java.time.LocalDate;
import com.clientapi.forgejo.model.OAuth2Application;
import java.time.OffsetDateTime;
import com.clientapi.forgejo.model.PublicKey;
import com.clientapi.forgejo.model.Repository;
import com.clientapi.forgejo.model.StopWatch;
import com.clientapi.forgejo.model.Team;
import com.clientapi.forgejo.model.TrackedTime;
import com.clientapi.forgejo.model.User;
import com.clientapi.forgejo.model.UserHeatmapData;
import com.clientapi.forgejo.model.UserSearch200Response;
import com.clientapi.forgejo.model.UserSettings;
import com.clientapi.forgejo.model.UserSettingsOptions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Create a repository
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createCurrentUserRepoTest() throws ApiException {
        CreateRepoOption body = null;
        Repository response = api.createCurrentUserRepo(body);
        // TODO: test validations
    }

    /**
     * Get user settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserSettingsTest() throws ApiException {
        List<UserSettings> response = api.getUserSettings();
        // TODO: test validations
    }

    /**
     * Get a Token to verify
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVerificationTokenTest() throws ApiException {
        String response = api.getVerificationToken();
        // TODO: test validations
    }

    /**
     * Update user settings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserSettingsTest() throws ApiException {
        UserSettingsOptions body = null;
        List<UserSettings> response = api.updateUserSettings(body);
        // TODO: test validations
    }

    /**
     * Add email addresses
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userAddEmailTest() throws ApiException {
        CreateEmailOption body = null;
        List<Email> response = api.userAddEmail(body);
        // TODO: test validations
    }

    /**
     * Blocks a user from the doer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userBlockUserTest() throws ApiException {
        String username = null;
        api.userBlockUser(username);
        // TODO: test validations
    }

    /**
     * Check if one user is following another user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCheckFollowingTest() throws ApiException {
        String username = null;
        String target = null;
        api.userCheckFollowing(username, target);
        // TODO: test validations
    }

    /**
     * Create a hook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCreateHookTest() throws ApiException {
        CreateHookOption body = null;
        Hook response = api.userCreateHook(body);
        // TODO: test validations
    }

    /**
     * creates a new OAuth2 application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCreateOAuth2ApplicationTest() throws ApiException {
        CreateOAuth2ApplicationOptions body = null;
        OAuth2Application response = api.userCreateOAuth2Application(body);
        // TODO: test validations
    }

    /**
     * Create an access token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCreateTokenTest() throws ApiException {
        String username = null;
        CreateAccessTokenOption body = null;
        AccessToken response = api.userCreateToken(username, body);
        // TODO: test validations
    }

    /**
     * Check whether a user is followed by the authenticated user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentCheckFollowingTest() throws ApiException {
        String username = null;
        api.userCurrentCheckFollowing(username);
        // TODO: test validations
    }

    /**
     * Whether the authenticated is starring the repo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentCheckStarringTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentCheckStarring(owner, repo);
        // TODO: test validations
    }

    /**
     * Unfollow a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentDeleteFollowTest() throws ApiException {
        String username = null;
        api.userCurrentDeleteFollow(username);
        // TODO: test validations
    }

    /**
     * Remove a GPG key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentDeleteGPGKeyTest() throws ApiException {
        Long id = null;
        api.userCurrentDeleteGPGKey(id);
        // TODO: test validations
    }

    /**
     * Delete a public key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentDeleteKeyTest() throws ApiException {
        Long id = null;
        api.userCurrentDeleteKey(id);
        // TODO: test validations
    }

    /**
     * Unstar the given repo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentDeleteStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentDeleteStar(owner, repo);
        // TODO: test validations
    }

    /**
     * Get a GPG key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentGetGPGKeyTest() throws ApiException {
        Long id = null;
        GPGKey response = api.userCurrentGetGPGKey(id);
        // TODO: test validations
    }

    /**
     * Get a public key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentGetKeyTest() throws ApiException {
        Long id = null;
        PublicKey response = api.userCurrentGetKey(id);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s followers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListFollowersTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<User> response = api.userCurrentListFollowers(page, limit);
        // TODO: test validations
    }

    /**
     * List the users that the authenticated user is following
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListFollowingTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<User> response = api.userCurrentListFollowing(page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s GPG keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListGPGKeysTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<GPGKey> response = api.userCurrentListGPGKeys(page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s public keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListKeysTest() throws ApiException {
        String fingerprint = null;
        Integer page = null;
        Integer limit = null;
        List<PublicKey> response = api.userCurrentListKeys(fingerprint, page, limit);
        // TODO: test validations
    }

    /**
     * List the repos that the authenticated user owns
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListReposTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userCurrentListRepos(page, limit);
        // TODO: test validations
    }

    /**
     * The repos that the authenticated user has starred
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListStarredTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userCurrentListStarred(page, limit);
        // TODO: test validations
    }

    /**
     * List repositories watched by the authenticated user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentListSubscriptionsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userCurrentListSubscriptions(page, limit);
        // TODO: test validations
    }

    /**
     * Create a GPG key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentPostGPGKeyTest() throws ApiException {
        CreateGPGKeyOption form = null;
        GPGKey response = api.userCurrentPostGPGKey(form);
        // TODO: test validations
    }

    /**
     * Create a public key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentPostKeyTest() throws ApiException {
        CreateKeyOption body = null;
        PublicKey response = api.userCurrentPostKey(body);
        // TODO: test validations
    }

    /**
     * Follow a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentPutFollowTest() throws ApiException {
        String username = null;
        api.userCurrentPutFollow(username);
        // TODO: test validations
    }

    /**
     * Star the given repo
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentPutStarTest() throws ApiException {
        String owner = null;
        String repo = null;
        api.userCurrentPutStar(owner, repo);
        // TODO: test validations
    }

    /**
     * List the current user&#39;s tracked times
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userCurrentTrackedTimesTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        List<TrackedTime> response = api.userCurrentTrackedTimes(page, limit, since, before);
        // TODO: test validations
    }

    /**
     * delete an access token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userDeleteAccessTokenTest() throws ApiException {
        String username = null;
        String token = null;
        api.userDeleteAccessToken(username, token);
        // TODO: test validations
    }

    /**
     * Delete email addresses
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userDeleteEmailTest() throws ApiException {
        DeleteEmailOption body = null;
        api.userDeleteEmail(body);
        // TODO: test validations
    }

    /**
     * Delete a hook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userDeleteHookTest() throws ApiException {
        Long id = null;
        api.userDeleteHook(id);
        // TODO: test validations
    }

    /**
     * delete an OAuth2 Application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userDeleteOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        api.userDeleteOAuth2Application(id);
        // TODO: test validations
    }

    /**
     * Update a hook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userEditHookTest() throws ApiException {
        Long id = null;
        EditHookOption body = null;
        Hook response = api.userEditHook(id, body);
        // TODO: test validations
    }

    /**
     * Get a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetTest() throws ApiException {
        String username = null;
        User response = api.userGet(username);
        // TODO: test validations
    }

    /**
     * Get the authenticated user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetCurrentTest() throws ApiException {
        User response = api.userGetCurrent();
        // TODO: test validations
    }

    /**
     * Get a user&#39;s heatmap
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetHeatmapDataTest() throws ApiException {
        String username = null;
        List<UserHeatmapData> response = api.userGetHeatmapData(username);
        // TODO: test validations
    }

    /**
     * Get a hook
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetHookTest() throws ApiException {
        Long id = null;
        Hook response = api.userGetHook(id);
        // TODO: test validations
    }

    /**
     * get an OAuth2 Application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        OAuth2Application response = api.userGetOAuth2Application(id);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s oauth2 applications
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetOauth2ApplicationTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<OAuth2Application> response = api.userGetOauth2Application(page, limit);
        // TODO: test validations
    }

    /**
     * Get list of all existing stopwatches
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetStopWatchesTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<StopWatch> response = api.userGetStopWatches(page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s access tokens
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userGetTokensTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<AccessToken> response = api.userGetTokens(username, page, limit);
        // TODO: test validations
    }

    /**
     * List a user&#39;s activity feeds
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListActivityFeedsTest() throws ApiException {
        String username = null;
        Boolean onlyPerformedBy = null;
        LocalDate date = null;
        Integer page = null;
        Integer limit = null;
        List<Activity> response = api.userListActivityFeeds(username, onlyPerformedBy, date, page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s blocked users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListBlockedUsersTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<BlockedUser> response = api.userListBlockedUsers(page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s email addresses
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListEmailsTest() throws ApiException {
        List<Email> response = api.userListEmails();
        // TODO: test validations
    }

    /**
     * List the given user&#39;s followers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListFollowersTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.userListFollowers(username, page, limit);
        // TODO: test validations
    }

    /**
     * List the users that the given user is following
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListFollowingTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<User> response = api.userListFollowing(username, page, limit);
        // TODO: test validations
    }

    /**
     * List the given user&#39;s GPG keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListGPGKeysTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<GPGKey> response = api.userListGPGKeys(username, page, limit);
        // TODO: test validations
    }

    /**
     * List the authenticated user&#39;s webhooks
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListHooksTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Hook> response = api.userListHooks(page, limit);
        // TODO: test validations
    }

    /**
     * List the given user&#39;s public keys
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListKeysTest() throws ApiException {
        String username = null;
        String fingerprint = null;
        Integer page = null;
        Integer limit = null;
        List<PublicKey> response = api.userListKeys(username, fingerprint, page, limit);
        // TODO: test validations
    }

    /**
     * List the repos owned by the given user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListReposTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userListRepos(username, page, limit);
        // TODO: test validations
    }

    /**
     * The repos that the given user has starred
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListStarredTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userListStarred(username, page, limit);
        // TODO: test validations
    }

    /**
     * List the repositories watched by a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListSubscriptionsTest() throws ApiException {
        String username = null;
        Integer page = null;
        Integer limit = null;
        List<Repository> response = api.userListSubscriptions(username, page, limit);
        // TODO: test validations
    }

    /**
     * List all the teams a user belongs to
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userListTeamsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        List<Team> response = api.userListTeams(page, limit);
        // TODO: test validations
    }

    /**
     * Search for users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userSearchTest() throws ApiException {
        String q = null;
        Long uid = null;
        Integer page = null;
        Integer limit = null;
        UserSearch200Response response = api.userSearch(q, uid, page, limit);
        // TODO: test validations
    }

    /**
     * Unblocks a user from the doer.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userUnblockUserTest() throws ApiException {
        String username = null;
        api.userUnblockUser(username);
        // TODO: test validations
    }

    /**
     * update an OAuth2 Application, this includes regenerating the client secret
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userUpdateOAuth2ApplicationTest() throws ApiException {
        Long id = null;
        CreateOAuth2ApplicationOptions body = null;
        OAuth2Application response = api.userUpdateOAuth2Application(id, body);
        // TODO: test validations
    }

    /**
     * Verify a GPG key
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userVerifyGPGKeyTest() throws ApiException {
        GPGKey response = api.userVerifyGPGKey();
        // TODO: test validations
    }

}
