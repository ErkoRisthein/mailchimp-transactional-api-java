# WebhooksApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postWebhooksAdd**](WebhooksApi.md#postWebhooksAdd) | **POST** /webhooks/add | Add webhook |
| [**postWebhooksDelete**](WebhooksApi.md#postWebhooksDelete) | **POST** /webhooks/delete | Delete webhook |
| [**postWebhooksInfo**](WebhooksApi.md#postWebhooksInfo) | **POST** /webhooks/info | Get webhook info |
| [**postWebhooksList**](WebhooksApi.md#postWebhooksList) | **POST** /webhooks/list | List webhooks |
| [**postWebhooksUpdate**](WebhooksApi.md#postWebhooksUpdate) | **POST** /webhooks/update | Update webhook |



## postWebhooksAdd

> PostWebhooksAdd200Response postWebhooksAdd(body)

Add webhook

Add a new webhook.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        PostWebhooksAddRequest body = new PostWebhooksAddRequest(); // PostWebhooksAddRequest | 
        try {
            PostWebhooksAdd200Response result = apiInstance.postWebhooksAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksAdd");
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
| **body** | [**PostWebhooksAddRequest**](PostWebhooksAddRequest.md)|  | |

### Return type

[**PostWebhooksAdd200Response**](PostWebhooksAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWebhooksDelete

> PostWebhooksDelete200Response postWebhooksDelete(body)

Delete webhook

Delete an existing webhook.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        PostWebhooksInfoRequest body = new PostWebhooksInfoRequest(); // PostWebhooksInfoRequest | 
        try {
            PostWebhooksDelete200Response result = apiInstance.postWebhooksDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksDelete");
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
| **body** | [**PostWebhooksInfoRequest**](PostWebhooksInfoRequest.md)|  | |

### Return type

[**PostWebhooksDelete200Response**](PostWebhooksDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWebhooksInfo

> PostWebhooksInfo200Response postWebhooksInfo(body)

Get webhook info

Given the ID of an existing webhook, return the data about it.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        PostWebhooksInfoRequest body = new PostWebhooksInfoRequest(); // PostWebhooksInfoRequest | 
        try {
            PostWebhooksInfo200Response result = apiInstance.postWebhooksInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksInfo");
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
| **body** | [**PostWebhooksInfoRequest**](PostWebhooksInfoRequest.md)|  | |

### Return type

[**PostWebhooksInfo200Response**](PostWebhooksInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWebhooksList

> List&lt;PostWebhooksList200ResponseInner&gt; postWebhooksList(body)

List webhooks

Get the list of all webhooks defined on the account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostWebhooksList200ResponseInner> result = apiInstance.postWebhooksList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksList");
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

[**List&lt;PostWebhooksList200ResponseInner&gt;**](PostWebhooksList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postWebhooksUpdate

> PostWebhooksUpdate200Response postWebhooksUpdate(body)

Update webhook

Update an existing webhook.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        PostWebhooksUpdateRequest body = new PostWebhooksUpdateRequest(); // PostWebhooksUpdateRequest | 
        try {
            PostWebhooksUpdate200Response result = apiInstance.postWebhooksUpdate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#postWebhooksUpdate");
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
| **body** | [**PostWebhooksUpdateRequest**](PostWebhooksUpdateRequest.md)|  | |

### Return type

[**PostWebhooksUpdate200Response**](PostWebhooksUpdate200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

