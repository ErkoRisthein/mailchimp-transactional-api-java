# TemplatesApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postTemplatesAdd**](TemplatesApi.md#postTemplatesAdd) | **POST** /templates/add | Add template |
| [**postTemplatesDelete**](TemplatesApi.md#postTemplatesDelete) | **POST** /templates/delete | Delete template |
| [**postTemplatesInfo**](TemplatesApi.md#postTemplatesInfo) | **POST** /templates/info | Get template info |
| [**postTemplatesList**](TemplatesApi.md#postTemplatesList) | **POST** /templates/list | List templates |
| [**postTemplatesPublish**](TemplatesApi.md#postTemplatesPublish) | **POST** /templates/publish | Publish template content |
| [**postTemplatesRender**](TemplatesApi.md#postTemplatesRender) | **POST** /templates/render | Render html template |
| [**postTemplatesTimeSeries**](TemplatesApi.md#postTemplatesTimeSeries) | **POST** /templates/time-series | Get template history |
| [**postTemplatesUpdate**](TemplatesApi.md#postTemplatesUpdate) | **POST** /templates/update | Update template |



## postTemplatesAdd

> PostTemplatesAdd200Response postTemplatesAdd(body)

Add template

Add a new template.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesAddRequest body = new PostTemplatesAddRequest(); // PostTemplatesAddRequest | 
        try {
            PostTemplatesAdd200Response result = apiInstance.postTemplatesAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesAdd");
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
| **body** | [**PostTemplatesAddRequest**](PostTemplatesAddRequest.md)|  | |

### Return type

[**PostTemplatesAdd200Response**](PostTemplatesAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesDelete

> PostTemplatesDelete200Response postTemplatesDelete(body)

Delete template

Delete a template.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesInfoRequest body = new PostTemplatesInfoRequest(); // PostTemplatesInfoRequest | 
        try {
            PostTemplatesDelete200Response result = apiInstance.postTemplatesDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesDelete");
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
| **body** | [**PostTemplatesInfoRequest**](PostTemplatesInfoRequest.md)|  | |

### Return type

[**PostTemplatesDelete200Response**](PostTemplatesDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesInfo

> PostTemplatesInfo200Response postTemplatesInfo(body)

Get template info

Get the information for an existing template.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesInfoRequest body = new PostTemplatesInfoRequest(); // PostTemplatesInfoRequest | 
        try {
            PostTemplatesInfo200Response result = apiInstance.postTemplatesInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesInfo");
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
| **body** | [**PostTemplatesInfoRequest**](PostTemplatesInfoRequest.md)|  | |

### Return type

[**PostTemplatesInfo200Response**](PostTemplatesInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesList

> List&lt;PostTemplatesList200ResponseInner&gt; postTemplatesList(body)

List templates

Return a list of all the templates available to this user.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesListRequest body = new PostTemplatesListRequest(); // PostTemplatesListRequest | 
        try {
            List<PostTemplatesList200ResponseInner> result = apiInstance.postTemplatesList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesList");
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
| **body** | [**PostTemplatesListRequest**](PostTemplatesListRequest.md)|  | |

### Return type

[**List&lt;PostTemplatesList200ResponseInner&gt;**](PostTemplatesList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesPublish

> PostTemplatesPublish200Response postTemplatesPublish(body)

Publish template content

Publish the content for the template. Any new messages sent using this template will start using the content that was previously in draft.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesInfoRequest body = new PostTemplatesInfoRequest(); // PostTemplatesInfoRequest | 
        try {
            PostTemplatesPublish200Response result = apiInstance.postTemplatesPublish(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesPublish");
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
| **body** | [**PostTemplatesInfoRequest**](PostTemplatesInfoRequest.md)|  | |

### Return type

[**PostTemplatesPublish200Response**](PostTemplatesPublish200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesRender

> PostTemplatesRender200Response postTemplatesRender(body)

Render html template

Inject content and optionally merge fields into a template, returning the HTML that results.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesRenderRequest body = new PostTemplatesRenderRequest(); // PostTemplatesRenderRequest | 
        try {
            PostTemplatesRender200Response result = apiInstance.postTemplatesRender(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesRender");
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
| **body** | [**PostTemplatesRenderRequest**](PostTemplatesRenderRequest.md)|  | |

### Return type

[**PostTemplatesRender200Response**](PostTemplatesRender200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postTemplatesTimeSeries

> List&lt;PostSendersTimeSeries200ResponseInner&gt; postTemplatesTimeSeries(body)

Get template history

Return the recent history (hourly stats for the last 30 days) for a template.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesTimeSeriesRequest body = new PostTemplatesTimeSeriesRequest(); // PostTemplatesTimeSeriesRequest | 
        try {
            List<PostSendersTimeSeries200ResponseInner> result = apiInstance.postTemplatesTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesTimeSeries");
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
| **body** | [**PostTemplatesTimeSeriesRequest**](PostTemplatesTimeSeriesRequest.md)|  | |

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


## postTemplatesUpdate

> PostTemplatesUpdate200Response postTemplatesUpdate(body)

Update template

Update the code for an existing template. If null is provided for any fields, the values will remain unchanged.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.TemplatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        TemplatesApi apiInstance = new TemplatesApi(defaultClient);
        PostTemplatesUpdateRequest body = new PostTemplatesUpdateRequest(); // PostTemplatesUpdateRequest | 
        try {
            PostTemplatesUpdate200Response result = apiInstance.postTemplatesUpdate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesApi#postTemplatesUpdate");
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
| **body** | [**PostTemplatesUpdateRequest**](PostTemplatesUpdateRequest.md)|  | |

### Return type

[**PostTemplatesUpdate200Response**](PostTemplatesUpdate200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

