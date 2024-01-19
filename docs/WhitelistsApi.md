# WhitelistsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postWhitelistsAdd**](WhitelistsApi.md#postWhitelistsAdd) | **POST** /whitelists/add | Add email to allowlist |
| [**postWhitelistsDelete**](WhitelistsApi.md#postWhitelistsDelete) | **POST** /whitelists/delete | Remove email from allowlist |
| [**postWhitelistsList**](WhitelistsApi.md#postWhitelistsList) | **POST** /whitelists/list | List allowlisted emails |



## postWhitelistsAdd

> PostAllowlistsAdd200Response postWhitelistsAdd(body)

Add email to allowlist

Adds an email to your email rejection allowlist. If the address is currently on your denylist, that denylist entry will be removed automatically.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WhitelistsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WhitelistsApi apiInstance = new WhitelistsApi(defaultClient);
        PostAllowlistsAddRequest body = new PostAllowlistsAddRequest(); // PostAllowlistsAddRequest | 
        try {
            PostAllowlistsAdd200Response result = apiInstance.postWhitelistsAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhitelistsApi#postWhitelistsAdd");
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
| **body** | [**PostAllowlistsAddRequest**](PostAllowlistsAddRequest.md)|  | |

### Return type

[**PostAllowlistsAdd200Response**](PostAllowlistsAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWhitelistsDelete

> PostAllowlistsDelete200Response postWhitelistsDelete(body)

Remove email from allowlist

Removes an email address from the allowlist.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WhitelistsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WhitelistsApi apiInstance = new WhitelistsApi(defaultClient);
        PostAllowlistsDeleteRequest body = new PostAllowlistsDeleteRequest(); // PostAllowlistsDeleteRequest | 
        try {
            PostAllowlistsDelete200Response result = apiInstance.postWhitelistsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhitelistsApi#postWhitelistsDelete");
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
| **body** | [**PostAllowlistsDeleteRequest**](PostAllowlistsDeleteRequest.md)|  | |

### Return type

[**PostAllowlistsDelete200Response**](PostAllowlistsDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWhitelistsList

> List&lt;PostAllowlistsList200ResponseInner&gt; postWhitelistsList(body)

List allowlisted emails

Retrieves your email rejection allowlist. You can provide an email address or search prefix to limit the results. Returns up to 1000 results.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WhitelistsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WhitelistsApi apiInstance = new WhitelistsApi(defaultClient);
        PostAllowlistsListRequest body = new PostAllowlistsListRequest(); // PostAllowlistsListRequest | 
        try {
            List<PostAllowlistsList200ResponseInner> result = apiInstance.postWhitelistsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WhitelistsApi#postWhitelistsList");
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
| **body** | [**PostAllowlistsListRequest**](PostAllowlistsListRequest.md)|  | |

### Return type

[**List&lt;PostAllowlistsList200ResponseInner&gt;**](PostAllowlistsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

