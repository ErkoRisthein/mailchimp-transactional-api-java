# InboundApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postInboundAddDomain**](InboundApi.md#postInboundAddDomain) | **POST** /inbound/add-domain | Add inbound domain |
| [**postInboundAddRoute**](InboundApi.md#postInboundAddRoute) | **POST** /inbound/add-route | Add mailbox route |
| [**postInboundCheckDomain**](InboundApi.md#postInboundCheckDomain) | **POST** /inbound/check-domain | Check domain settings |
| [**postInboundDeleteDomain**](InboundApi.md#postInboundDeleteDomain) | **POST** /inbound/delete-domain | Delete inbound domain |
| [**postInboundDeleteRoute**](InboundApi.md#postInboundDeleteRoute) | **POST** /inbound/delete-route | Delete mailbox route |
| [**postInboundDomains**](InboundApi.md#postInboundDomains) | **POST** /inbound/domains | List inbound domains |
| [**postInboundRoutes**](InboundApi.md#postInboundRoutes) | **POST** /inbound/routes | List mailbox routes |
| [**postInboundSendRaw**](InboundApi.md#postInboundSendRaw) | **POST** /inbound/send-raw | Send mime document |
| [**postInboundUpdateRoute**](InboundApi.md#postInboundUpdateRoute) | **POST** /inbound/update-route | Update mailbox route |



## postInboundAddDomain

> PostInboundAddDomain200Response postInboundAddDomain(body)

Add inbound domain

Add an inbound domain to your account.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundAddDomainRequest body = new PostInboundAddDomainRequest(); // PostInboundAddDomainRequest | 
        try {
            PostInboundAddDomain200Response result = apiInstance.postInboundAddDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundAddDomain");
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
| **body** | [**PostInboundAddDomainRequest**](PostInboundAddDomainRequest.md)|  | |

### Return type

[**PostInboundAddDomain200Response**](PostInboundAddDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundAddRoute

> PostInboundAddRoute200Response postInboundAddRoute(body)

Add mailbox route

Add a new mailbox route to an inbound domain.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundAddRouteRequest body = new PostInboundAddRouteRequest(); // PostInboundAddRouteRequest | 
        try {
            PostInboundAddRoute200Response result = apiInstance.postInboundAddRoute(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundAddRoute");
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
| **body** | [**PostInboundAddRouteRequest**](PostInboundAddRouteRequest.md)|  | |

### Return type

[**PostInboundAddRoute200Response**](PostInboundAddRoute200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundCheckDomain

> PostInboundCheckDomain200Response postInboundCheckDomain(body)

Check domain settings

Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundCheckDomainRequest body = new PostInboundCheckDomainRequest(); // PostInboundCheckDomainRequest | 
        try {
            PostInboundCheckDomain200Response result = apiInstance.postInboundCheckDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundCheckDomain");
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
| **body** | [**PostInboundCheckDomainRequest**](PostInboundCheckDomainRequest.md)|  | |

### Return type

[**PostInboundCheckDomain200Response**](PostInboundCheckDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundDeleteDomain

> PostInboundDeleteDomain200Response postInboundDeleteDomain(body)

Delete inbound domain

Delete an inbound domain from the account. All mail will stop routing for this domain immediately.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundCheckDomainRequest body = new PostInboundCheckDomainRequest(); // PostInboundCheckDomainRequest | 
        try {
            PostInboundDeleteDomain200Response result = apiInstance.postInboundDeleteDomain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundDeleteDomain");
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
| **body** | [**PostInboundCheckDomainRequest**](PostInboundCheckDomainRequest.md)|  | |

### Return type

[**PostInboundDeleteDomain200Response**](PostInboundDeleteDomain200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundDeleteRoute

> PostInboundDeleteRoute200Response postInboundDeleteRoute(body)

Delete mailbox route

Delete an existing inbound mailbox route.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundDeleteRouteRequest body = new PostInboundDeleteRouteRequest(); // PostInboundDeleteRouteRequest | 
        try {
            PostInboundDeleteRoute200Response result = apiInstance.postInboundDeleteRoute(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundDeleteRoute");
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
| **body** | [**PostInboundDeleteRouteRequest**](PostInboundDeleteRouteRequest.md)|  | |

### Return type

[**PostInboundDeleteRoute200Response**](PostInboundDeleteRoute200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundDomains

> List&lt;PostInboundDomains200ResponseInner&gt; postInboundDomains(body)

List inbound domains

List the domains that have been configured for inbound delivery.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostInboundDomains200ResponseInner> result = apiInstance.postInboundDomains(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundDomains");
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

[**List&lt;PostInboundDomains200ResponseInner&gt;**](PostInboundDomains200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundRoutes

> List&lt;PostInboundRoutes200ResponseInner&gt; postInboundRoutes(body)

List mailbox routes

List the mailbox routes defined for an inbound domain.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundRoutesRequest body = new PostInboundRoutesRequest(); // PostInboundRoutesRequest | 
        try {
            List<PostInboundRoutes200ResponseInner> result = apiInstance.postInboundRoutes(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundRoutes");
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
| **body** | [**PostInboundRoutesRequest**](PostInboundRoutesRequest.md)|  | |

### Return type

[**List&lt;PostInboundRoutes200ResponseInner&gt;**](PostInboundRoutes200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundSendRaw

> List&lt;PostInboundSendRaw200ResponseInner&gt; postInboundSendRaw(body)

Send mime document

Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundSendRawRequest body = new PostInboundSendRawRequest(); // PostInboundSendRawRequest | 
        try {
            List<PostInboundSendRaw200ResponseInner> result = apiInstance.postInboundSendRaw(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundSendRaw");
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
| **body** | [**PostInboundSendRawRequest**](PostInboundSendRawRequest.md)|  | |

### Return type

[**List&lt;PostInboundSendRaw200ResponseInner&gt;**](PostInboundSendRaw200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postInboundUpdateRoute

> PostInboundUpdateRoute200Response postInboundUpdateRoute(body)

Update mailbox route

Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.InboundApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        InboundApi apiInstance = new InboundApi(defaultClient);
        PostInboundUpdateRouteRequest body = new PostInboundUpdateRouteRequest(); // PostInboundUpdateRouteRequest | 
        try {
            PostInboundUpdateRoute200Response result = apiInstance.postInboundUpdateRoute(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InboundApi#postInboundUpdateRoute");
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
| **body** | [**PostInboundUpdateRouteRequest**](PostInboundUpdateRouteRequest.md)|  | |

### Return type

[**PostInboundUpdateRoute200Response**](PostInboundUpdateRoute200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

