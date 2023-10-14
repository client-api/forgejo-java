# PackageApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deletePackage**](PackageApi.md#deletePackage) | **DELETE** /packages/{owner}/{type}/{name}/{version} | Delete a package |
| [**getPackage**](PackageApi.md#getPackage) | **GET** /packages/{owner}/{type}/{name}/{version} | Gets a package |
| [**listPackageFiles**](PackageApi.md#listPackageFiles) | **GET** /packages/{owner}/{type}/{name}/{version}/files | Gets all files of a package |
| [**listPackages**](PackageApi.md#listPackages) | **GET** /packages/{owner} | Gets all packages of an owner |


<a id="deletePackage"></a>
# **deletePackage**
> deletePackage(owner, type, name, version)

Delete a package

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.PackageApi;

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

    PackageApi apiInstance = new PackageApi(defaultClient);
    String owner = "owner_example"; // String | owner of the package
    String type = "type_example"; // String | type of the package
    String name = "name_example"; // String | name of the package
    String version = "version_example"; // String | version of the package
    try {
      apiInstance.deletePackage(owner, type, name, version);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#deletePackage");
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
| **owner** | **String**| owner of the package | |
| **type** | **String**| type of the package | |
| **name** | **String**| name of the package | |
| **version** | **String**| version of the package | |

### Return type

null (empty response body)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | APIEmpty is an empty response |  -  |
| **404** | APINotFound is a not found empty response |  -  |

<a id="getPackage"></a>
# **getPackage**
> ModelPackage getPackage(owner, type, name, version)

Gets a package

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.PackageApi;

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

    PackageApi apiInstance = new PackageApi(defaultClient);
    String owner = "owner_example"; // String | owner of the package
    String type = "type_example"; // String | type of the package
    String name = "name_example"; // String | name of the package
    String version = "version_example"; // String | version of the package
    try {
      ModelPackage result = apiInstance.getPackage(owner, type, name, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#getPackage");
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
| **owner** | **String**| owner of the package | |
| **type** | **String**| type of the package | |
| **name** | **String**| name of the package | |
| **version** | **String**| version of the package | |

### Return type

[**ModelPackage**](ModelPackage.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Package |  -  |
| **404** | APINotFound is a not found empty response |  -  |

<a id="listPackageFiles"></a>
# **listPackageFiles**
> List&lt;PackageFile&gt; listPackageFiles(owner, type, name, version)

Gets all files of a package

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.PackageApi;

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

    PackageApi apiInstance = new PackageApi(defaultClient);
    String owner = "owner_example"; // String | owner of the package
    String type = "type_example"; // String | type of the package
    String name = "name_example"; // String | name of the package
    String version = "version_example"; // String | version of the package
    try {
      List<PackageFile> result = apiInstance.listPackageFiles(owner, type, name, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#listPackageFiles");
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
| **owner** | **String**| owner of the package | |
| **type** | **String**| type of the package | |
| **name** | **String**| name of the package | |
| **version** | **String**| version of the package | |

### Return type

[**List&lt;PackageFile&gt;**](PackageFile.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PackageFileList |  -  |
| **404** | APINotFound is a not found empty response |  -  |

<a id="listPackages"></a>
# **listPackages**
> List&lt;ModelPackage&gt; listPackages(owner, page, limit, type, q)

Gets all packages of an owner

### Example
```java
// Import classes:
import com.clientapi.forgejo.invoker.ApiClient;
import com.clientapi.forgejo.invoker.ApiException;
import com.clientapi.forgejo.invoker.Configuration;
import com.clientapi.forgejo.invoker.auth.*;
import com.clientapi.forgejo.invoker.models.*;
import com.clientapi.forgejo.api.PackageApi;

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

    PackageApi apiInstance = new PackageApi(defaultClient);
    String owner = "owner_example"; // String | owner of the packages
    Integer page = 56; // Integer | page number of results to return (1-based)
    Integer limit = 56; // Integer | page size of results
    String type = "alpine"; // String | package type filter
    String q = "q_example"; // String | name filter
    try {
      List<ModelPackage> result = apiInstance.listPackages(owner, page, limit, type, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PackageApi#listPackages");
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
| **owner** | **String**| owner of the packages | |
| **page** | **Integer**| page number of results to return (1-based) | [optional] |
| **limit** | **Integer**| page size of results | [optional] |
| **type** | **String**| package type filter | [optional] [enum: alpine, cargo, chef, composer, conan, conda, container, cran, debian, generic, go, helm, maven, npm, nuget, pub, pypi, rpm, rubygems, swift, vagrant] |
| **q** | **String**| name filter | [optional] |

### Return type

[**List&lt;ModelPackage&gt;**](ModelPackage.md)

### Authorization

[TOTPHeader](../README.md#TOTPHeader), [AuthorizationHeaderToken](../README.md#AuthorizationHeaderToken), [SudoHeader](../README.md#SudoHeader), [BasicAuth](../README.md#BasicAuth), [AccessToken](../README.md#AccessToken), [SudoParam](../README.md#SudoParam), [Token](../README.md#Token)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | PackageList |  -  |

