# MessagesApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postMessagesCancelScheduled**](MessagesApi.md#postMessagesCancelScheduled) | **POST** /messages/cancel-scheduled | Cancel scheduled email |
| [**postMessagesContent**](MessagesApi.md#postMessagesContent) | **POST** /messages/content | Get message content |
| [**postMessagesInfo**](MessagesApi.md#postMessagesInfo) | **POST** /messages/info | Get message info |
| [**postMessagesListScheduled**](MessagesApi.md#postMessagesListScheduled) | **POST** /messages/list-scheduled | List scheduled emails |
| [**postMessagesParse**](MessagesApi.md#postMessagesParse) | **POST** /messages/parse | Parse mime document |
| [**postMessagesReschedule**](MessagesApi.md#postMessagesReschedule) | **POST** /messages/reschedule | Reschedule email |
| [**postMessagesSearch**](MessagesApi.md#postMessagesSearch) | **POST** /messages/search | Search messages by date |
| [**postMessagesSearchTimeSeries**](MessagesApi.md#postMessagesSearchTimeSeries) | **POST** /messages/search-time-series | Search messages by hour |
| [**postMessagesSend**](MessagesApi.md#postMessagesSend) | **POST** /messages/send | Send new message |
| [**postMessagesSendRaw**](MessagesApi.md#postMessagesSendRaw) | **POST** /messages/send-raw | Send mime document |
| [**postMessagesSendTemplate**](MessagesApi.md#postMessagesSendTemplate) | **POST** /messages/send-template | Send using message template |



## postMessagesCancelScheduled

> List&lt;PostMessagesListScheduled200ResponseInner&gt; postMessagesCancelScheduled(body)

Cancel scheduled email

Cancels a scheduled email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesCancelScheduledRequest body = new PostMessagesCancelScheduledRequest(); // PostMessagesCancelScheduledRequest | 
        try {
            List<PostMessagesListScheduled200ResponseInner> result = apiInstance.postMessagesCancelScheduled(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesCancelScheduled");
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
| **body** | [**PostMessagesCancelScheduledRequest**](PostMessagesCancelScheduledRequest.md)|  | |

### Return type

[**List&lt;PostMessagesListScheduled200ResponseInner&gt;**](PostMessagesListScheduled200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesContent

> PostMessagesContent200Response postMessagesContent(body)

Get message content

Get the full content of a recently sent message.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesInfoRequest body = new PostMessagesInfoRequest(); // PostMessagesInfoRequest | 
        try {
            PostMessagesContent200Response result = apiInstance.postMessagesContent(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesContent");
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
| **body** | [**PostMessagesInfoRequest**](PostMessagesInfoRequest.md)|  | |

### Return type

[**PostMessagesContent200Response**](PostMessagesContent200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesInfo

> PostMessagesInfo200Response postMessagesInfo(body)

Get message info

Get the information for a single recently sent message.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesInfoRequest body = new PostMessagesInfoRequest(); // PostMessagesInfoRequest | 
        try {
            PostMessagesInfo200Response result = apiInstance.postMessagesInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesInfo");
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
| **body** | [**PostMessagesInfoRequest**](PostMessagesInfoRequest.md)|  | |

### Return type

[**PostMessagesInfo200Response**](PostMessagesInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesListScheduled

> List&lt;PostMessagesListScheduled200ResponseInner&gt; postMessagesListScheduled(body)

List scheduled emails

Queries your scheduled emails.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesListScheduledRequest body = new PostMessagesListScheduledRequest(); // PostMessagesListScheduledRequest | 
        try {
            List<PostMessagesListScheduled200ResponseInner> result = apiInstance.postMessagesListScheduled(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesListScheduled");
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
| **body** | [**PostMessagesListScheduledRequest**](PostMessagesListScheduledRequest.md)|  | |

### Return type

[**List&lt;PostMessagesListScheduled200ResponseInner&gt;**](PostMessagesListScheduled200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesParse

> PostMessagesParse200Response postMessagesParse(body)

Parse mime document

Parse the full MIME document for an email message, returning the content of the message broken into its constituent pieces.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesParseRequest body = new PostMessagesParseRequest(); // PostMessagesParseRequest | 
        try {
            PostMessagesParse200Response result = apiInstance.postMessagesParse(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesParse");
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
| **body** | [**PostMessagesParseRequest**](PostMessagesParseRequest.md)|  | |

### Return type

[**PostMessagesParse200Response**](PostMessagesParse200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesReschedule

> List&lt;PostMessagesListScheduled200ResponseInner&gt; postMessagesReschedule(body)

Reschedule email

Reschedules a scheduled email.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesRescheduleRequest body = new PostMessagesRescheduleRequest(); // PostMessagesRescheduleRequest | 
        try {
            List<PostMessagesListScheduled200ResponseInner> result = apiInstance.postMessagesReschedule(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesReschedule");
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
| **body** | [**PostMessagesRescheduleRequest**](PostMessagesRescheduleRequest.md)|  | |

### Return type

[**List&lt;PostMessagesListScheduled200ResponseInner&gt;**](PostMessagesListScheduled200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesSearch

> List&lt;PostMessagesSearch200ResponseInner&gt; postMessagesSearch(body)

Search messages by date

Search recently sent messages and optionally narrow by date range, tags, senders, and API keys. If no date range is specified, results within the last 7 days are returned. This method may be called up to 20 times per minute. If you need the data more often, you can use /messages/info.json to get the information for a single message, or webhooks to push activity to your own application for querying.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesSearchRequest body = new PostMessagesSearchRequest(); // PostMessagesSearchRequest | 
        try {
            List<PostMessagesSearch200ResponseInner> result = apiInstance.postMessagesSearch(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesSearch");
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
| **body** | [**PostMessagesSearchRequest**](PostMessagesSearchRequest.md)|  | |

### Return type

[**List&lt;PostMessagesSearch200ResponseInner&gt;**](PostMessagesSearch200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesSearchTimeSeries

> List&lt;PostMessagesSearchTimeSeries200ResponseInner&gt; postMessagesSearchTimeSeries(body)

Search messages by hour

Search the content of recently sent messages and return the aggregated hourly stats for matching messages.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesSearchTimeSeriesRequest body = new PostMessagesSearchTimeSeriesRequest(); // PostMessagesSearchTimeSeriesRequest | 
        try {
            List<PostMessagesSearchTimeSeries200ResponseInner> result = apiInstance.postMessagesSearchTimeSeries(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesSearchTimeSeries");
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
| **body** | [**PostMessagesSearchTimeSeriesRequest**](PostMessagesSearchTimeSeriesRequest.md)|  | |

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


## postMessagesSend

> List&lt;PostMessagesSend200ResponseInner&gt; postMessagesSend(body)

Send new message

Send a new transactional message through the Transactional API.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesSendRequest body = new PostMessagesSendRequest(); // PostMessagesSendRequest | 
        try {
            List<PostMessagesSend200ResponseInner> result = apiInstance.postMessagesSend(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesSend");
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
| **body** | [**PostMessagesSendRequest**](PostMessagesSendRequest.md)|  | |

### Return type

[**List&lt;PostMessagesSend200ResponseInner&gt;**](PostMessagesSend200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesSendRaw

> Object postMessagesSendRaw(body)

Send mime document

Take a raw MIME document for a message, and send it exactly as if it were sent through the Transactional API&#39;s SMTP servers.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesSendRawRequest body = new PostMessagesSendRawRequest(); // PostMessagesSendRawRequest | 
        try {
            Object result = apiInstance.postMessagesSendRaw(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesSendRaw");
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
| **body** | [**PostMessagesSendRawRequest**](PostMessagesSendRawRequest.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postMessagesSendTemplate

> List&lt;PostMessagesSendTemplate200ResponseInner&gt; postMessagesSendTemplate(body)

Send using message template

Send a new transactional message through the Transactional API using a template.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.MessagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        MessagesApi apiInstance = new MessagesApi(defaultClient);
        PostMessagesSendTemplateRequest body = new PostMessagesSendTemplateRequest(); // PostMessagesSendTemplateRequest | 
        try {
            List<PostMessagesSendTemplate200ResponseInner> result = apiInstance.postMessagesSendTemplate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi#postMessagesSendTemplate");
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
| **body** | [**PostMessagesSendTemplateRequest**](PostMessagesSendTemplateRequest.md)|  | |

### Return type

[**List&lt;PostMessagesSendTemplate200ResponseInner&gt;**](PostMessagesSendTemplate200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

