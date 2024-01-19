# RejectsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postRejectsAdd**](RejectsApi.md#postRejectsAdd) | **POST** /rejects/add | Add email to denylist |
| [**postRejectsDelete**](RejectsApi.md#postRejectsDelete) | **POST** /rejects/delete | Delete email from denylist |
| [**postRejectsList**](RejectsApi.md#postRejectsList) | **POST** /rejects/list | List denylisted emails |



## postRejectsAdd

> PostRejectsAdd200Response postRejectsAdd(body)

Add email to denylist

Adds an email to your email rejection denylist. Addresses that you add manually will never expire and there is no reputation penalty for removing them from your denylist. Attempting to denylist an address that has been added to the allowlist will have no effect.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.RejectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        RejectsApi apiInstance = new RejectsApi(defaultClient);
        PostRejectsAddRequest body = new PostRejectsAddRequest(); // PostRejectsAddRequest | 
        try {
            PostRejectsAdd200Response result = apiInstance.postRejectsAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RejectsApi#postRejectsAdd");
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
| **body** | [**PostRejectsAddRequest**](PostRejectsAddRequest.md)|  | |

### Return type

[**PostRejectsAdd200Response**](PostRejectsAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postRejectsDelete

> PostRejectsDelete200Response postRejectsDelete(body)

Delete email from denylist

Deletes an email rejection. There is no limit to how many rejections you can remove from your denylist, but keep in mind that each deletion has an affect on your reputation.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.RejectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        RejectsApi apiInstance = new RejectsApi(defaultClient);
        PostRejectsDeleteRequest body = new PostRejectsDeleteRequest(); // PostRejectsDeleteRequest | 
        try {
            PostRejectsDelete200Response result = apiInstance.postRejectsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RejectsApi#postRejectsDelete");
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
| **body** | [**PostRejectsDeleteRequest**](PostRejectsDeleteRequest.md)|  | |

### Return type

[**PostRejectsDelete200Response**](PostRejectsDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postRejectsList

> List&lt;PostRejectsList200ResponseInner&gt; postRejectsList(body)

List denylisted emails

Retrieves your email rejection denylist. You can provide an email address to limit the results. Returns up to 1000 results. By default, entries that have expired are excluded from the results; set include_expired to true to include them.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.RejectsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        RejectsApi apiInstance = new RejectsApi(defaultClient);
        PostRejectsListRequest body = new PostRejectsListRequest(); // PostRejectsListRequest | 
        try {
            List<PostRejectsList200ResponseInner> result = apiInstance.postRejectsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RejectsApi#postRejectsList");
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
| **body** | [**PostRejectsListRequest**](PostRejectsListRequest.md)|  | |

### Return type

[**List&lt;PostRejectsList200ResponseInner&gt;**](PostRejectsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

