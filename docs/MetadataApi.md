# MetadataApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postMetadataAdd**](MetadataApi.md#postMetadataAdd) | **POST** /metadata/add | Add metadata field |
| [**postMetadataDelete**](MetadataApi.md#postMetadataDelete) | **POST** /metadata/delete | Delete metadata field |
| [**postMetadataList**](MetadataApi.md#postMetadataList) | **POST** /metadata/list | List metadata fields |
| [**postMetadataUpdate**](MetadataApi.md#postMetadataUpdate) | **POST** /metadata/update | Update metadata field |



## postMetadataAdd

> PostMetadataAdd200Response postMetadataAdd(body)

Add metadata field

Add a new custom metadata field to be indexed for the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        PostMetadataAddRequest body = new PostMetadataAddRequest(); // PostMetadataAddRequest | 
        try {
            PostMetadataAdd200Response result = apiInstance.postMetadataAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#postMetadataAdd");
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
| **body** | [**PostMetadataAddRequest**](PostMetadataAddRequest.md)|  | |

### Return type

[**PostMetadataAdd200Response**](PostMetadataAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMetadataDelete

> PostMetadataDelete200Response postMetadataDelete(body)

Delete metadata field

Delete an existing custom metadata field. Deletion isn&#39;t instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        PostMetadataDeleteRequest body = new PostMetadataDeleteRequest(); // PostMetadataDeleteRequest | 
        try {
            PostMetadataDelete200Response result = apiInstance.postMetadataDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#postMetadataDelete");
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
| **body** | [**PostMetadataDeleteRequest**](PostMetadataDeleteRequest.md)|  | |

### Return type

[**PostMetadataDelete200Response**](PostMetadataDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMetadataList

> List&lt;PostMetadataList200ResponseInner&gt; postMetadataList(body)

List metadata fields

Get the list of custom metadata fields indexed for the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostMetadataList200ResponseInner> result = apiInstance.postMetadataList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#postMetadataList");
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

[**List&lt;PostMetadataList200ResponseInner&gt;**](PostMetadataList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMetadataUpdate

> PostMetadataUpdate200Response postMetadataUpdate(body)

Update metadata field

Update an existing custom metadata field.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MetadataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        PostMetadataUpdateRequest body = new PostMetadataUpdateRequest(); // PostMetadataUpdateRequest | 
        try {
            PostMetadataUpdate200Response result = apiInstance.postMetadataUpdate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#postMetadataUpdate");
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
| **body** | [**PostMetadataUpdateRequest**](PostMetadataUpdateRequest.md)|  | |

### Return type

[**PostMetadataUpdate200Response**](PostMetadataUpdate200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

