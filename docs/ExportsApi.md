# ExportsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postExportsActivity**](ExportsApi.md#postExportsActivity) | **POST** /exports/activity | Export activity history |
| [**postExportsAllowlist**](ExportsApi.md#postExportsAllowlist) | **POST** /exports/allowlist | Export Allowlist |
| [**postExportsInfo**](ExportsApi.md#postExportsInfo) | **POST** /exports/info | View export info |
| [**postExportsList**](ExportsApi.md#postExportsList) | **POST** /exports/list | List exports |
| [**postExportsRejects**](ExportsApi.md#postExportsRejects) | **POST** /exports/rejects | Export denylist |
| [**postExportsWhitelist**](ExportsApi.md#postExportsWhitelist) | **POST** /exports/whitelist | Export Allowlist |



## postExportsActivity

> PostExportsActivity200Response postExportsActivity(body)

Export activity history

Begins an export of your activity history. The activity will be exported to a zip archive containing a single file named activity.csv in the same format as you would be able to export from your account&#39;s activity view. It includes the following fields: Date, Email Address, Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any custom metadata fields, they will be included in the exported data.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsActivityRequest body = new PostExportsActivityRequest(); // PostExportsActivityRequest | 
        try {
            PostExportsActivity200Response result = apiInstance.postExportsActivity(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsActivity");
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
| **body** | [**PostExportsActivityRequest**](PostExportsActivityRequest.md)|  | |

### Return type

[**PostExportsActivity200Response**](PostExportsActivity200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postExportsAllowlist

> PostExportsWhitelist200Response postExportsAllowlist(body)

Export Allowlist

Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsRejectsRequest body = new PostExportsRejectsRequest(); // PostExportsRejectsRequest | 
        try {
            PostExportsWhitelist200Response result = apiInstance.postExportsAllowlist(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsAllowlist");
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
| **body** | [**PostExportsRejectsRequest**](PostExportsRejectsRequest.md)|  | |

### Return type

[**PostExportsWhitelist200Response**](PostExportsWhitelist200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postExportsInfo

> PostExportsInfo200Response postExportsInfo(body)

View export info

Returns information about an export job. If the export job&#39;s state is &#39;complete&#39;, the returned data will include a URL you can use to fetch the results. Every export job produces a zip archive, but the format of the archive is distinct for each job type. The api calls that initiate exports include more details about the output format for that job type.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsInfoRequest body = new PostExportsInfoRequest(); // PostExportsInfoRequest | 
        try {
            PostExportsInfo200Response result = apiInstance.postExportsInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsInfo");
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
| **body** | [**PostExportsInfoRequest**](PostExportsInfoRequest.md)|  | |

### Return type

[**PostExportsInfo200Response**](PostExportsInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postExportsList

> List&lt;PostExportsList200ResponseInner&gt; postExportsList(body)

List exports

Returns a list of your exports.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostExportsList200ResponseInner> result = apiInstance.postExportsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsList");
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

[**List&lt;PostExportsList200ResponseInner&gt;**](PostExportsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postExportsRejects

> PostExportsRejects200Response postExportsRejects(body)

Export denylist

Begins an export of your rejection denylist. The denylist will be exported to a zip archive containing a single file named rejects.csv that includes the following fields: email, reason, detail, created_at, expires_at, last_event_at, expires_at.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsRejectsRequest body = new PostExportsRejectsRequest(); // PostExportsRejectsRequest | 
        try {
            PostExportsRejects200Response result = apiInstance.postExportsRejects(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsRejects");
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
| **body** | [**PostExportsRejectsRequest**](PostExportsRejectsRequest.md)|  | |

### Return type

[**PostExportsRejects200Response**](PostExportsRejects200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postExportsWhitelist

> PostExportsWhitelist200Response postExportsWhitelist(body)

Export Allowlist

Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.ExportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        ExportsApi apiInstance = new ExportsApi(defaultClient);
        PostExportsRejectsRequest body = new PostExportsRejectsRequest(); // PostExportsRejectsRequest | 
        try {
            PostExportsWhitelist200Response result = apiInstance.postExportsWhitelist(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportsApi#postExportsWhitelist");
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
| **body** | [**PostExportsRejectsRequest**](PostExportsRejectsRequest.md)|  | |

### Return type

[**PostExportsWhitelist200Response**](PostExportsWhitelist200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

