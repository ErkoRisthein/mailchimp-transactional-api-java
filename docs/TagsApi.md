# TagsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postTagsAllTimeSeries**](TagsApi.md#postTagsAllTimeSeries) | **POST** /tags/all-time-series | View all tags history |
| [**postTagsDelete**](TagsApi.md#postTagsDelete) | **POST** /tags/delete | Delete tag |
| [**postTagsInfo**](TagsApi.md#postTagsInfo) | **POST** /tags/info | Get tag info |
| [**postTagsList**](TagsApi.md#postTagsList) | **POST** /tags/list | List tags |
| [**postTagsTimeSeries**](TagsApi.md#postTagsTimeSeries) | **POST** /tags/time-series | View tag history |



## postTagsAllTimeSeries

> List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt; postTagsAllTimeSeries(body)

View all tags history

Return the recent history (hourly stats for the last 30 days) for all tags.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TagsApi apiInstance = new TagsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostMessagesSearchTimeSeries200ResponseInner> result = apiInstance.postTagsAllTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#postTagsAllTimeSeries");
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
| **body** | [**PostExportsListRequest**](PostExportsListRequest.md)|  | |

### Return type

[**List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt;**](PostMessagesSearchTimeSeries200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTagsDelete

> PostTagsDelete200Response postTagsDelete(body)

Delete tag

Deletes a tag permanently. Deleting a tag removes the tag from any messages that have been sent, and also deletes the tag&#39;s stats. There is no way to undo this operation, so use it carefully.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TagsApi apiInstance = new TagsApi(defaultClient);
        PostTagsDeleteRequest body = new PostTagsDeleteRequest(); // PostTagsDeleteRequest | 
        try {
            PostTagsDelete200Response result = apiInstance.postTagsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#postTagsDelete");
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
| **body** | [**PostTagsDeleteRequest**](PostTagsDeleteRequest.md)|  | |

### Return type

[**PostTagsDelete200Response**](PostTagsDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTagsInfo

> PostTagsInfo200Response postTagsInfo(body)

Get tag info

Return more detailed information about a single tag, including aggregates of recent stats.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TagsApi apiInstance = new TagsApi(defaultClient);
        PostTagsInfoRequest body = new PostTagsInfoRequest(); // PostTagsInfoRequest | 
        try {
            PostTagsInfo200Response result = apiInstance.postTagsInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#postTagsInfo");
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
| **body** | [**PostTagsInfoRequest**](PostTagsInfoRequest.md)|  | |

### Return type

[**PostTagsInfo200Response**](PostTagsInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTagsList

> List&lt;PostTagsList200ResponseInner&gt; postTagsList(body)

List tags

Return all of the user-defined tag information.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TagsApi apiInstance = new TagsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostTagsList200ResponseInner> result = apiInstance.postTagsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#postTagsList");
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
| **body** | [**PostExportsListRequest**](PostExportsListRequest.md)|  | |

### Return type

[**List&lt;PostTagsList200ResponseInner&gt;**](PostTagsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTagsTimeSeries

> List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt; postTagsTimeSeries(body)

View tag history

Return the recent history (hourly stats for the last 30 days) for a tag.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TagsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TagsApi apiInstance = new TagsApi(defaultClient);
        PostTagsInfoRequest body = new PostTagsInfoRequest(); // PostTagsInfoRequest | 
        try {
            List<PostMessagesSearchTimeSeries200ResponseInner> result = apiInstance.postTagsTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TagsApi#postTagsTimeSeries");
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
| **body** | [**PostTagsInfoRequest**](PostTagsInfoRequest.md)|  | |

### Return type

[**List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt;**](PostMessagesSearchTimeSeries200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

