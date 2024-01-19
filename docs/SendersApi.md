# SendersApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postSendersAddDomain**](SendersApi.md#postSendersAddDomain) | **POST** /senders/add-domain | Add sender domain |
| [**postSendersCheckDomain**](SendersApi.md#postSendersCheckDomain) | **POST** /senders/check-domain | Check domain settings |
| [**postSendersDomains**](SendersApi.md#postSendersDomains) | **POST** /senders/domains | List sender domains |
| [**postSendersInfo**](SendersApi.md#postSendersInfo) | **POST** /senders/info | Get sender info |
| [**postSendersList**](SendersApi.md#postSendersList) | **POST** /senders/list | List account senders |
| [**postSendersTimeSeries**](SendersApi.md#postSendersTimeSeries) | **POST** /senders/time-series | View sender history |
| [**postSendersVerifyDomain**](SendersApi.md#postSendersVerifyDomain) | **POST** /senders/verify-domain | Verify domain |



## postSendersAddDomain

> PostSendersAddDomain200Response postSendersAddDomain(body)

Add sender domain

Adds a sender domain to your account. Sender domains are added automatically as you send, but you can use this call to add them ahead of time.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostSendersAddDomainRequest body = new PostSendersAddDomainRequest(); // PostSendersAddDomainRequest | 
        try {
            PostSendersAddDomain200Response result = apiInstance.postSendersAddDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersAddDomain");
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
| **body** | [**PostSendersAddDomainRequest**](PostSendersAddDomainRequest.md)|  | |

### Return type

[**PostSendersAddDomain200Response**](PostSendersAddDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSendersCheckDomain

> PostSendersCheckDomain200Response postSendersCheckDomain(body)

Check domain settings

Checks the SPF and DKIM settings for a domain, as well the domain verification. If you haven&#39;t already added this domain to your account, it will be added automatically.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostSendersAddDomainRequest body = new PostSendersAddDomainRequest(); // PostSendersAddDomainRequest | 
        try {
            PostSendersCheckDomain200Response result = apiInstance.postSendersCheckDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersCheckDomain");
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
| **body** | [**PostSendersAddDomainRequest**](PostSendersAddDomainRequest.md)|  | |

### Return type

[**PostSendersCheckDomain200Response**](PostSendersCheckDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSendersDomains

> List&lt;PostSendersDomains200ResponseInner&gt; postSendersDomains(body)

List sender domains

Returns the sender domains that have been added to this account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostSendersDomains200ResponseInner> result = apiInstance.postSendersDomains(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersDomains");
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

[**List&lt;PostSendersDomains200ResponseInner&gt;**](PostSendersDomains200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSendersInfo

> PostSendersInfo200Response postSendersInfo(body)

Get sender info

Return more detailed information about a single sender, including aggregates of recent stats.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostSendersInfoRequest body = new PostSendersInfoRequest(); // PostSendersInfoRequest | 
        try {
            PostSendersInfo200Response result = apiInstance.postSendersInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersInfo");
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
| **body** | [**PostSendersInfoRequest**](PostSendersInfoRequest.md)|  | |

### Return type

[**PostSendersInfo200Response**](PostSendersInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSendersList

> List&lt;PostSendersList200ResponseInner&gt; postSendersList(body)

List account senders

Return the senders that have tried to use this account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostSendersList200ResponseInner> result = apiInstance.postSendersList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersList");
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


## postSendersTimeSeries

> List&lt;PostSendersTimeSeries200ResponseInner&gt; postSendersTimeSeries(body)

View sender history

Return the recent history (hourly stats for the last 30 days) for a sender.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostSendersInfoRequest body = new PostSendersInfoRequest(); // PostSendersInfoRequest | 
        try {
            List<PostSendersTimeSeries200ResponseInner> result = apiInstance.postSendersTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersTimeSeries");
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
| **body** | [**PostSendersInfoRequest**](PostSendersInfoRequest.md)|  | |

### Return type

[**List&lt;PostSendersTimeSeries200ResponseInner&gt;**](PostSendersTimeSeries200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSendersVerifyDomain

> PostSendersVerifyDomain200Response postSendersVerifyDomain(body)

Verify domain

Sends a verification email in order to verify ownership of a domain. Domain verification is a required step to confirm ownership of a domain. Once a domain has been verified in a Transactional API account, other accounts may not have their messages signed by that domain unless they also verify the domain. This prevents other Transactional API accounts from sending mail signed by your domain.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SendersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SendersApi apiInstance = new SendersApi(defaultClient);
        PostSendersVerifyDomainRequest body = new PostSendersVerifyDomainRequest(); // PostSendersVerifyDomainRequest | 
        try {
            PostSendersVerifyDomain200Response result = apiInstance.postSendersVerifyDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendersApi#postSendersVerifyDomain");
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
| **body** | [**PostSendersVerifyDomainRequest**](PostSendersVerifyDomainRequest.md)|  | |

### Return type

[**PostSendersVerifyDomain200Response**](PostSendersVerifyDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

