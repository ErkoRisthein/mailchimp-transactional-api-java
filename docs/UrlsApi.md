# UrlsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postUrlsAddTrackingDomain**](UrlsApi.md#postUrlsAddTrackingDomain) | **POST** /urls/add-tracking-domain | Add tracking domains |
| [**postUrlsCheckTrackingDomain**](UrlsApi.md#postUrlsCheckTrackingDomain) | **POST** /urls/check-tracking-domain | Check cname settings |
| [**postUrlsList**](UrlsApi.md#postUrlsList) | **POST** /urls/list | List most clicked urls |
| [**postUrlsSearchDeprecated**](UrlsApi.md#postUrlsSearchDeprecated) | **POST** /urls/search | Search most clicked urls |
| [**postUrlsTimeSeries**](UrlsApi.md#postUrlsTimeSeries) | **POST** /urls/time-series | Get url history |
| [**postUrlsTrackingDomains**](UrlsApi.md#postUrlsTrackingDomains) | **POST** /urls/tracking-domains | List tracking domains |



## postUrlsAddTrackingDomain

> PostUrlsAddTrackingDomain200Response postUrlsAddTrackingDomain(body)

Add tracking domains

Add a tracking domain to your account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostSendersAddDomainRequest body = new PostSendersAddDomainRequest(); // PostSendersAddDomainRequest | 
        try {
            PostUrlsAddTrackingDomain200Response result = apiInstance.postUrlsAddTrackingDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsAddTrackingDomain");
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

[**PostUrlsAddTrackingDomain200Response**](PostUrlsAddTrackingDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUrlsCheckTrackingDomain

> PostUrlsAddTrackingDomain200Response postUrlsCheckTrackingDomain(body)

Check cname settings

Checks the CNAME settings for a tracking domain. The domain must have been added already with the add-tracking-domain call.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostUrlsCheckTrackingDomainRequest body = new PostUrlsCheckTrackingDomainRequest(); // PostUrlsCheckTrackingDomainRequest | 
        try {
            PostUrlsAddTrackingDomain200Response result = apiInstance.postUrlsCheckTrackingDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsCheckTrackingDomain");
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
| **body** | [**PostUrlsCheckTrackingDomainRequest**](PostUrlsCheckTrackingDomainRequest.md)|  | |

### Return type

[**PostUrlsAddTrackingDomain200Response**](PostUrlsAddTrackingDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUrlsList

> List&lt;PostUrlsList200ResponseInner&gt; postUrlsList(body)

List most clicked urls

Get the 100 most clicked URLs.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostUrlsList200ResponseInner> result = apiInstance.postUrlsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsList");
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

[**List&lt;PostUrlsList200ResponseInner&gt;**](PostUrlsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUrlsSearchDeprecated

> List&lt;PostUrlsSearchDeprecated200ResponseInner&gt; postUrlsSearchDeprecated(body)

Search most clicked urls

Return the 100 most clicked URLs that match the search query given.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostUrlsSearchDeprecatedRequest body = new PostUrlsSearchDeprecatedRequest(); // PostUrlsSearchDeprecatedRequest | 
        try {
            List<PostUrlsSearchDeprecated200ResponseInner> result = apiInstance.postUrlsSearchDeprecated(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsSearchDeprecated");
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
| **body** | [**PostUrlsSearchDeprecatedRequest**](PostUrlsSearchDeprecatedRequest.md)|  | |

### Return type

[**List&lt;PostUrlsSearchDeprecated200ResponseInner&gt;**](PostUrlsSearchDeprecated200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUrlsTimeSeries

> List&lt;PostUrlsTimeSeries200ResponseInner&gt; postUrlsTimeSeries(body)

Get url history

Return the recent history (hourly stats for the last 30 days) for a URL

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostUrlsTimeSeriesRequest body = new PostUrlsTimeSeriesRequest(); // PostUrlsTimeSeriesRequest | 
        try {
            List<PostUrlsTimeSeries200ResponseInner> result = apiInstance.postUrlsTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsTimeSeries");
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
| **body** | [**PostUrlsTimeSeriesRequest**](PostUrlsTimeSeriesRequest.md)|  | |

### Return type

[**List&lt;PostUrlsTimeSeries200ResponseInner&gt;**](PostUrlsTimeSeries200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postUrlsTrackingDomains

> List&lt;PostUrlsTrackingDomains200ResponseInner&gt; postUrlsTrackingDomains(body)

List tracking domains

Get the list of tracking domains set up for this account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.UrlsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        UrlsApi apiInstance = new UrlsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostUrlsTrackingDomains200ResponseInner> result = apiInstance.postUrlsTrackingDomains(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UrlsApi#postUrlsTrackingDomains");
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

[**List&lt;PostUrlsTrackingDomains200ResponseInner&gt;**](PostUrlsTrackingDomains200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

