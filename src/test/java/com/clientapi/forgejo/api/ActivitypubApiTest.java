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
import com.clientapi.forgejo.model.ActivityPub;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActivitypubApi
 */
@Disabled
public class ActivitypubApiTest {

    private final ActivitypubApi api = new ActivitypubApi();

    /**
     * Returns the Person actor for a user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activitypubPersonTest() throws ApiException {
        Integer userId = null;
        ActivityPub response = api.activitypubPerson(userId);
        // TODO: test validations
    }

    /**
     * Send to the inbox
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void activitypubPersonInboxTest() throws ApiException {
        Integer userId = null;
        api.activitypubPersonInbox(userId);
        // TODO: test validations
    }

}
