# NotificationApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notifyGetList**](NotificationApi.md#notifyGetList) | **GET** /notifications | List users&#39;s notification threads |
| [**notifyGetRepoList**](NotificationApi.md#notifyGetRepoList) | **GET** /repos/{owner}/{repo}/notifications | List users&#39;s notification threads on a specific repo |
| [**notifyGetThread**](NotificationApi.md#notifyGetThread) | **GET** /notifications/threads/{id} | Get notification thread by ID |
| [**notifyNewAvailable**](NotificationApi.md#notifyNewAvailable) | **GET** /notifications/new | Check if unread notifications exist |
| [**notifyReadList**](NotificationApi.md#notifyReadList) | **PUT** /notifications | Mark notification threads as read, pinned or unread |
| [**notifyReadRepoList**](NotificationApi.md#notifyReadRepoList) | **PUT** /repos/{owner}/{repo}/notifications | Mark notification threads as read, pinned or unread on a specific repo |
| [**notifyReadThread**](NotificationApi.md#notifyReadThread) | **PATCH** /notifications/threads/{id} | Mark notification thread as read by ID |


<a id="notifyGetList"></a>
# **notifyGetList**
> List&lt;NotificationThread&gt; notifyGetList(all, statusTypes, subjectType, since, before, page, limit)

List users&#39;s notification threads

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    Boolean all = true; // Boolean | If true, show notifications marked as read. Default value is false
    List<String> statusTypes = Arrays.asList(); // List<String> | Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread & pinned.
    List<String> subjectType = Arrays.asList(); // List<String> | filter notifications by subject type
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in RFC 3339 format
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated before the given time. This is a timestamp in RFC 3339 format
    Integer page = 56; // Integer | page number of results to return (1-based)
    Integer limit = 56; // Integer | page size of results
    try {
      List<NotificationThread> result = apiInstance.notifyGetList(all, statusTypes, subjectType, since, before, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyGetList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **all** | **Boolean**| If true, show notifications marked as read. Default value is false | [optional] |
| **statusTypes** | [**List&lt;String&gt;**](String.md)| Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned. | [optional] |
| **subjectType** | [**List&lt;String&gt;**](String.md)| filter notifications by subject type | [optional] [enum: issue, pull, commit, repository] |
| **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in RFC 3339 format | [optional] |
| **before** | **OffsetDateTime**| Only show notifications updated before the given time. This is a timestamp in RFC 3339 format | [optional] |
| **page** | **Integer**| page number of results to return (1-based) | [optional] |
| **limit** | **Integer**| page size of results | [optional] |

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | NotificationThreadList |  -  |

<a id="notifyGetRepoList"></a>
# **notifyGetRepoList**
> List&lt;NotificationThread&gt; notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit)

List users&#39;s notification threads on a specific repo

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    String owner = "owner_example"; // String | owner of the repo
    String repo = "repo_example"; // String | name of the repo
    Boolean all = true; // Boolean | If true, show notifications marked as read. Default value is false
    List<String> statusTypes = Arrays.asList(); // List<String> | Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread & pinned
    List<String> subjectType = Arrays.asList(); // List<String> | filter notifications by subject type
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated after the given time. This is a timestamp in RFC 3339 format
    OffsetDateTime before = OffsetDateTime.now(); // OffsetDateTime | Only show notifications updated before the given time. This is a timestamp in RFC 3339 format
    Integer page = 56; // Integer | page number of results to return (1-based)
    Integer limit = 56; // Integer | page size of results
    try {
      List<NotificationThread> result = apiInstance.notifyGetRepoList(owner, repo, all, statusTypes, subjectType, since, before, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyGetRepoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| owner of the repo | |
| **repo** | **String**| name of the repo | |
| **all** | **Boolean**| If true, show notifications marked as read. Default value is false | [optional] |
| **statusTypes** | [**List&lt;String&gt;**](String.md)| Show notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread &amp; pinned | [optional] |
| **subjectType** | [**List&lt;String&gt;**](String.md)| filter notifications by subject type | [optional] [enum: issue, pull, commit, repository] |
| **since** | **OffsetDateTime**| Only show notifications updated after the given time. This is a timestamp in RFC 3339 format | [optional] |
| **before** | **OffsetDateTime**| Only show notifications updated before the given time. This is a timestamp in RFC 3339 format | [optional] |
| **page** | **Integer**| page number of results to return (1-based) | [optional] |
| **limit** | **Integer**| page size of results | [optional] |

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | NotificationThreadList |  -  |

<a id="notifyGetThread"></a>
# **notifyGetThread**
> NotificationThread notifyGetThread(id)

Get notification thread by ID

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    String id = "id_example"; // String | id of notification thread
    try {
      NotificationThread result = apiInstance.notifyGetThread(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyGetThread");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id of notification thread | |

### Return type

[**NotificationThread**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | NotificationThread |  -  |
| **403** | APIForbiddenError is a forbidden error response |  * message -  <br>  * url -  <br>  |
| **404** | APINotFound is a not found empty response |  -  |

<a id="notifyNewAvailable"></a>
# **notifyNewAvailable**
> NotificationCount notifyNewAvailable()

Check if unread notifications exist

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    try {
      NotificationCount result = apiInstance.notifyNewAvailable();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyNewAvailable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NotificationCount**](NotificationCount.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/html

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Number of unread notifications |  -  |

<a id="notifyReadList"></a>
# **notifyReadList**
> List&lt;NotificationThread&gt; notifyReadList(lastReadAt, all, statusTypes, toStatus)

Mark notification threads as read, pinned or unread

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    OffsetDateTime lastReadAt = OffsetDateTime.now(); // OffsetDateTime | Describes the last point that notifications were checked. Anything updated since this time will not be updated.
    String all = "all_example"; // String | If true, mark all notifications on this repo. Default value is false
    List<String> statusTypes = Arrays.asList(); // List<String> | Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread.
    String toStatus = "toStatus_example"; // String | Status to mark notifications as, Defaults to read.
    try {
      List<NotificationThread> result = apiInstance.notifyReadList(lastReadAt, all, statusTypes, toStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyReadList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lastReadAt** | **OffsetDateTime**| Describes the last point that notifications were checked. Anything updated since this time will not be updated. | [optional] |
| **all** | **String**| If true, mark all notifications on this repo. Default value is false | [optional] |
| **statusTypes** | [**List&lt;String&gt;**](String.md)| Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. | [optional] |
| **toStatus** | **String**| Status to mark notifications as, Defaults to read. | [optional] |

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **205** | NotificationThreadList |  -  |

<a id="notifyReadRepoList"></a>
# **notifyReadRepoList**
> List&lt;NotificationThread&gt; notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt)

Mark notification threads as read, pinned or unread on a specific repo

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    String owner = "owner_example"; // String | owner of the repo
    String repo = "repo_example"; // String | name of the repo
    String all = "all_example"; // String | If true, mark all notifications on this repo. Default value is false
    List<String> statusTypes = Arrays.asList(); // List<String> | Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread.
    String toStatus = "toStatus_example"; // String | Status to mark notifications as. Defaults to read.
    OffsetDateTime lastReadAt = OffsetDateTime.now(); // OffsetDateTime | Describes the last point that notifications were checked. Anything updated since this time will not be updated.
    try {
      List<NotificationThread> result = apiInstance.notifyReadRepoList(owner, repo, all, statusTypes, toStatus, lastReadAt);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyReadRepoList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **owner** | **String**| owner of the repo | |
| **repo** | **String**| name of the repo | |
| **all** | **String**| If true, mark all notifications on this repo. Default value is false | [optional] |
| **statusTypes** | [**List&lt;String&gt;**](String.md)| Mark notifications with the provided status types. Options are: unread, read and/or pinned. Defaults to unread. | [optional] |
| **toStatus** | **String**| Status to mark notifications as. Defaults to read. | [optional] |
| **lastReadAt** | **OffsetDateTime**| Describes the last point that notifications were checked. Anything updated since this time will not be updated. | [optional] |

### Return type

[**List&lt;NotificationThread&gt;**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **205** | NotificationThreadList |  -  |

<a id="notifyReadThread"></a>
# **notifyReadThread**
> NotificationThread notifyReadThread(id, toStatus)

Mark notification thread as read by ID

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.NotificationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure API key authorization: TOTPHeader
    ApiKeyAuth TOTPHeader = (ApiKeyAuth) defaultClient.getAuthentication("TOTPHeader");
    TOTPHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //TOTPHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: AuthorizationHeaderToken
    ApiKeyAuth AuthorizationHeaderToken = (ApiKeyAuth) defaultClient.getAuthentication("AuthorizationHeaderToken");
    AuthorizationHeaderToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AuthorizationHeaderToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoHeader
    ApiKeyAuth SudoHeader = (ApiKeyAuth) defaultClient.getAuthentication("SudoHeader");
    SudoHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoHeader.setApiKeyPrefix("Token");

    // Configure HTTP basic authorization: BasicAuth
    HttpBasicAuth BasicAuth = (HttpBasicAuth) defaultClient.getAuthentication("BasicAuth");
    BasicAuth.setUsername("YOUR USERNAME");
    BasicAuth.setPassword("YOUR PASSWORD");

    // Configure API key authorization: AccessToken
    ApiKeyAuth AccessToken = (ApiKeyAuth) defaultClient.getAuthentication("AccessToken");
    AccessToken.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //AccessToken.setApiKeyPrefix("Token");

    // Configure API key authorization: SudoParam
    ApiKeyAuth SudoParam = (ApiKeyAuth) defaultClient.getAuthentication("SudoParam");
    SudoParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //SudoParam.setApiKeyPrefix("Token");

    // Configure API key authorization: Token
    ApiKeyAuth Token = (ApiKeyAuth) defaultClient.getAuthentication("Token");
    Token.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Token.setApiKeyPrefix("Token");

    NotificationApi apiInstance = new NotificationApi(defaultClient);
    String id = "id_example"; // String | id of notification thread
    String toStatus = "read"; // String | Status to mark notifications as
    try {
      NotificationThread result = apiInstance.notifyReadThread(id, toStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#notifyReadThread");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id of notification thread | |
| **toStatus** | **String**| Status to mark notifications as | [optional] [default to read] |

### Return type

[**NotificationThread**](NotificationThread.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **205** | NotificationThread |  -  |
| **403** | APIForbiddenError is a forbidden error response |  * message -  <br>  * url -  <br>  |
| **404** | APINotFound is a not found empty response |  -  |

