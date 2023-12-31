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

import com.clientapi.forgejo.invoker.ApiCallback;
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.ApiResponse;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.Pair;
import com.clientapi.forgejo.invoker.ProgressRequestBody;
import com.clientapi.forgejo.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.clientapi.forgejo.model.GeneralAPISettings;
import com.clientapi.forgejo.model.GeneralAttachmentSettings;
import com.clientapi.forgejo.model.GeneralRepoSettings;
import com.clientapi.forgejo.model.GeneralUISettings;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettingsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SettingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettingsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getGeneralAPISettings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAPISettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralAPISettingsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/api";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TOTPHeader", "AuthorizationHeaderToken", "SudoHeader", "BasicAuth", "AccessToken", "SudoParam", "Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGeneralAPISettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getGeneralAPISettingsCall(_callback);

    }

    /**
     * Get instance&#39;s global settings for api
     * 
     * @return GeneralAPISettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAPISettings </td><td>  -  </td></tr>
     </table>
     */
    public GeneralAPISettings getGeneralAPISettings() throws ApiException {
        ApiResponse<GeneralAPISettings> localVarResp = getGeneralAPISettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get instance&#39;s global settings for api
     * 
     * @return ApiResponse&lt;GeneralAPISettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAPISettings </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeneralAPISettings> getGeneralAPISettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getGeneralAPISettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GeneralAPISettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for api (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAPISettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralAPISettingsAsync(final ApiCallback<GeneralAPISettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGeneralAPISettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GeneralAPISettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGeneralAttachmentSettings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAttachmentSettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralAttachmentSettingsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/attachment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TOTPHeader", "AuthorizationHeaderToken", "SudoHeader", "BasicAuth", "AccessToken", "SudoParam", "Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGeneralAttachmentSettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getGeneralAttachmentSettingsCall(_callback);

    }

    /**
     * Get instance&#39;s global settings for Attachment
     * 
     * @return GeneralAttachmentSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAttachmentSettings </td><td>  -  </td></tr>
     </table>
     */
    public GeneralAttachmentSettings getGeneralAttachmentSettings() throws ApiException {
        ApiResponse<GeneralAttachmentSettings> localVarResp = getGeneralAttachmentSettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get instance&#39;s global settings for Attachment
     * 
     * @return ApiResponse&lt;GeneralAttachmentSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAttachmentSettings </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeneralAttachmentSettings> getGeneralAttachmentSettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getGeneralAttachmentSettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GeneralAttachmentSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for Attachment (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralAttachmentSettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralAttachmentSettingsAsync(final ApiCallback<GeneralAttachmentSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGeneralAttachmentSettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GeneralAttachmentSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGeneralRepositorySettings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralRepoSettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralRepositorySettingsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/repository";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TOTPHeader", "AuthorizationHeaderToken", "SudoHeader", "BasicAuth", "AccessToken", "SudoParam", "Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGeneralRepositorySettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getGeneralRepositorySettingsCall(_callback);

    }

    /**
     * Get instance&#39;s global settings for repositories
     * 
     * @return GeneralRepoSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralRepoSettings </td><td>  -  </td></tr>
     </table>
     */
    public GeneralRepoSettings getGeneralRepositorySettings() throws ApiException {
        ApiResponse<GeneralRepoSettings> localVarResp = getGeneralRepositorySettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get instance&#39;s global settings for repositories
     * 
     * @return ApiResponse&lt;GeneralRepoSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralRepoSettings </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeneralRepoSettings> getGeneralRepositorySettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getGeneralRepositorySettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GeneralRepoSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for repositories (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralRepoSettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralRepositorySettingsAsync(final ApiCallback<GeneralRepoSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGeneralRepositorySettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GeneralRepoSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getGeneralUISettings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralUISettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralUISettingsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settings/ui";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "TOTPHeader", "AuthorizationHeaderToken", "SudoHeader", "BasicAuth", "AccessToken", "SudoParam", "Token" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getGeneralUISettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getGeneralUISettingsCall(_callback);

    }

    /**
     * Get instance&#39;s global settings for ui
     * 
     * @return GeneralUISettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralUISettings </td><td>  -  </td></tr>
     </table>
     */
    public GeneralUISettings getGeneralUISettings() throws ApiException {
        ApiResponse<GeneralUISettings> localVarResp = getGeneralUISettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get instance&#39;s global settings for ui
     * 
     * @return ApiResponse&lt;GeneralUISettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralUISettings </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GeneralUISettings> getGeneralUISettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getGeneralUISettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GeneralUISettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get instance&#39;s global settings for ui (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> GeneralUISettings </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getGeneralUISettingsAsync(final ApiCallback<GeneralUISettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = getGeneralUISettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GeneralUISettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
