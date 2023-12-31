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
import com.clientapi.forgejo.model.GeneralAPISettings;
import com.clientapi.forgejo.model.GeneralAttachmentSettings;
import com.clientapi.forgejo.model.GeneralRepoSettings;
import com.clientapi.forgejo.model.GeneralUISettings;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Disabled
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    /**
     * Get instance&#39;s global settings for api
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeneralAPISettingsTest() throws ApiException {
        GeneralAPISettings response = api.getGeneralAPISettings();
        // TODO: test validations
    }

    /**
     * Get instance&#39;s global settings for Attachment
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeneralAttachmentSettingsTest() throws ApiException {
        GeneralAttachmentSettings response = api.getGeneralAttachmentSettings();
        // TODO: test validations
    }

    /**
     * Get instance&#39;s global settings for repositories
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeneralRepositorySettingsTest() throws ApiException {
        GeneralRepoSettings response = api.getGeneralRepositorySettings();
        // TODO: test validations
    }

    /**
     * Get instance&#39;s global settings for ui
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGeneralUISettingsTest() throws ApiException {
        GeneralUISettings response = api.getGeneralUISettings();
        // TODO: test validations
    }

}
