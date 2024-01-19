# SubaccountsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postSubaccountsAdd**](SubaccountsApi.md#postSubaccountsAdd) | **POST** /subaccounts/add | Add subaccount |
| [**postSubaccountsDelete**](SubaccountsApi.md#postSubaccountsDelete) | **POST** /subaccounts/delete | Delete subaccount |
| [**postSubaccountsInfo**](SubaccountsApi.md#postSubaccountsInfo) | **POST** /subaccounts/info | Get subaccount info |
| [**postSubaccountsList**](SubaccountsApi.md#postSubaccountsList) | **POST** /subaccounts/list | List subaccounts |
| [**postSubaccountsPause**](SubaccountsApi.md#postSubaccountsPause) | **POST** /subaccounts/pause | Pause subaccount |
| [**postSubaccountsResume**](SubaccountsApi.md#postSubaccountsResume) | **POST** /subaccounts/resume | Resume subaccount |
| [**postSubaccountsUpdate**](SubaccountsApi.md#postSubaccountsUpdate) | **POST** /subaccounts/update | Update subaccount |



## postSubaccountsAdd

> PostSubaccountsAdd200Response postSubaccountsAdd(body)

Add subaccount

Add a new subaccount.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsAddRequest body = new PostSubaccountsAddRequest(); // PostSubaccountsAddRequest | 
        try {
            PostSubaccountsAdd200Response result = apiInstance.postSubaccountsAdd(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsAdd");
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
| **body** | [**PostSubaccountsAddRequest**](PostSubaccountsAddRequest.md)|  | |

### Return type

[**PostSubaccountsAdd200Response**](PostSubaccountsAdd200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsDelete

> PostSubaccountsDelete200Response postSubaccountsDelete(body)

Delete subaccount

Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsDeleteRequest body = new PostSubaccountsDeleteRequest(); // PostSubaccountsDeleteRequest | 
        try {
            PostSubaccountsDelete200Response result = apiInstance.postSubaccountsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsDelete");
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
| **body** | [**PostSubaccountsDeleteRequest**](PostSubaccountsDeleteRequest.md)|  | |

### Return type

[**PostSubaccountsDelete200Response**](PostSubaccountsDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsInfo

> PostSubaccountsInfo200Response postSubaccountsInfo(body)

Get subaccount info

Given the ID of an existing subaccount, return the data about it.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsInfoRequest body = new PostSubaccountsInfoRequest(); // PostSubaccountsInfoRequest | 
        try {
            PostSubaccountsInfo200Response result = apiInstance.postSubaccountsInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsInfo");
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
| **body** | [**PostSubaccountsInfoRequest**](PostSubaccountsInfoRequest.md)|  | |

### Return type

[**PostSubaccountsInfo200Response**](PostSubaccountsInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsList

> List&lt;PostSubaccountsList200ResponseInner&gt; postSubaccountsList(body)

List subaccounts

Get the list of subaccounts defined for the account, optionally filtered by a prefix.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsListRequest body = new PostSubaccountsListRequest(); // PostSubaccountsListRequest | 
        try {
            List<PostSubaccountsList200ResponseInner> result = apiInstance.postSubaccountsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsList");
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
| **body** | [**PostSubaccountsListRequest**](PostSubaccountsListRequest.md)|  | |

### Return type

[**List&lt;PostSubaccountsList200ResponseInner&gt;**](PostSubaccountsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsPause

> PostSubaccountsPause200Response postSubaccountsPause(body)

Pause subaccount

Pause a subaccount&#39;s sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsPauseRequest body = new PostSubaccountsPauseRequest(); // PostSubaccountsPauseRequest | 
        try {
            PostSubaccountsPause200Response result = apiInstance.postSubaccountsPause(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsPause");
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
| **body** | [**PostSubaccountsPauseRequest**](PostSubaccountsPauseRequest.md)|  | |

### Return type

[**PostSubaccountsPause200Response**](PostSubaccountsPause200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsResume

> PostSubaccountsResume200Response postSubaccountsResume(body)

Resume subaccount

Resume a paused subaccount&#39;s sending.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsResumeRequest body = new PostSubaccountsResumeRequest(); // PostSubaccountsResumeRequest | 
        try {
            PostSubaccountsResume200Response result = apiInstance.postSubaccountsResume(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsResume");
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
| **body** | [**PostSubaccountsResumeRequest**](PostSubaccountsResumeRequest.md)|  | |

### Return type

[**PostSubaccountsResume200Response**](PostSubaccountsResume200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postSubaccountsUpdate

> PostSubaccountsUpdate200Response postSubaccountsUpdate(body)

Update subaccount

Update an existing subaccount.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.SubaccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        SubaccountsApi apiInstance = new SubaccountsApi(defaultClient);
        PostSubaccountsUpdateRequest body = new PostSubaccountsUpdateRequest(); // PostSubaccountsUpdateRequest | 
        try {
            PostSubaccountsUpdate200Response result = apiInstance.postSubaccountsUpdate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubaccountsApi#postSubaccountsUpdate");
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
| **body** | [**PostSubaccountsUpdateRequest**](PostSubaccountsUpdateRequest.md)|  | |

### Return type

[**PostSubaccountsUpdate200Response**](PostSubaccountsUpdate200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

