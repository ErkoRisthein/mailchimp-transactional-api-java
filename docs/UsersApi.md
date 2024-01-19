# UsersApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postUsersInfo**](UsersApi.md#postUsersInfo) | **POST** /users/info | Get user info |
| [**postUsersPing**](UsersApi.md#postUsersPing) | **POST** /users/ping | Ping |
| [**postUsersPing2**](UsersApi.md#postUsersPing2) | **POST** /users/ping2 | Ping 2 |
| [**postUsersSenders**](UsersApi.md#postUsersSenders) | **POST** /users/senders | List account senders |



## postUsersInfo

> PostUsersInfo200Response postUsersInfo(body)

Get user info

Return the information about the API-connected user.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            PostUsersInfo200Response result = apiInstance.postUsersInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postUsersInfo");
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

[**PostUsersInfo200Response**](PostUsersInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUsersPing

> String postUsersPing(body)

Ping

Validate an API key and respond to a ping.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            String result = apiInstance.postUsersPing(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postUsersPing");
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

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUsersPing2

> PostUsersPing2200Response postUsersPing2(body)

Ping 2

Validate an API key and respond to a ping (JSON parser version).

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            PostUsersPing2200Response result = apiInstance.postUsersPing2(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postUsersPing2");
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

[**PostUsersPing2200Response**](PostUsersPing2200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUsersSenders

> List&lt;PostSendersList200ResponseInner&gt; postUsersSenders(body)

List account senders

Return the senders that have tried to use this account, both verified and unverified.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostSendersList200ResponseInner> result = apiInstance.postUsersSenders(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postUsersSenders");
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

[**List&lt;PostSendersList200ResponseInner&gt;**](PostSendersList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

