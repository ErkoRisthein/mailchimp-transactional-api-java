# IpsApi

All URIs are relative to *https://mandrillapp.com/api/1.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postIpsCancelWarmup**](IpsApi.md#postIpsCancelWarmup) | **POST** /ips/cancel-warmup | Cancel ip warmup |
| [**postIpsCheckCustomDns**](IpsApi.md#postIpsCheckCustomDns) | **POST** /ips/check-custom-dns | Test custom dns |
| [**postIpsCreatePool**](IpsApi.md#postIpsCreatePool) | **POST** /ips/create-pool | Add ip pool |
| [**postIpsDelete**](IpsApi.md#postIpsDelete) | **POST** /ips/delete | Delete ip address |
| [**postIpsDeletePool**](IpsApi.md#postIpsDeletePool) | **POST** /ips/delete-pool | Delete ip pool |
| [**postIpsInfo**](IpsApi.md#postIpsInfo) | **POST** /ips/info | Get ip info |
| [**postIpsList**](IpsApi.md#postIpsList) | **POST** /ips/list | List ip addresses |
| [**postIpsListPools**](IpsApi.md#postIpsListPools) | **POST** /ips/list-pools | List ip pools |
| [**postIpsPoolInfo**](IpsApi.md#postIpsPoolInfo) | **POST** /ips/pool-info | Get ip pool info |
| [**postIpsProvision**](IpsApi.md#postIpsProvision) | **POST** /ips/provision | Request additional ip |
| [**postIpsSetCustomDns**](IpsApi.md#postIpsSetCustomDns) | **POST** /ips/set-custom-dns | Set custom dns |
| [**postIpsSetPool**](IpsApi.md#postIpsSetPool) | **POST** /ips/set-pool | Move ip to different pool |
| [**postIpsStartWarmup**](IpsApi.md#postIpsStartWarmup) | **POST** /ips/start-warmup | Start ip warmup |



## postIpsCancelWarmup

> PostIpsStartWarmup200Response postIpsCancelWarmup(body)

Cancel ip warmup

Cancels the warmup process for a dedicated IP.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsStartWarmupRequest body = new PostIpsStartWarmupRequest(); // PostIpsStartWarmupRequest | 
        try {
            PostIpsStartWarmup200Response result = apiInstance.postIpsCancelWarmup(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsCancelWarmup");
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
| **body** | [**PostIpsStartWarmupRequest**](PostIpsStartWarmupRequest.md)|  | |

### Return type

[**PostIpsStartWarmup200Response**](PostIpsStartWarmup200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsCheckCustomDns

> PostIpsCheckCustomDns200Response postIpsCheckCustomDns(body)

Test custom dns

Tests whether a domain name is valid for use as the custom reverse DNS for a dedicated IP.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsCheckCustomDnsRequest body = new PostIpsCheckCustomDnsRequest(); // PostIpsCheckCustomDnsRequest | 
        try {
            PostIpsCheckCustomDns200Response result = apiInstance.postIpsCheckCustomDns(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsCheckCustomDns");
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
| **body** | [**PostIpsCheckCustomDnsRequest**](PostIpsCheckCustomDnsRequest.md)|  | |

### Return type

[**PostIpsCheckCustomDns200Response**](PostIpsCheckCustomDns200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsCreatePool

> PostIpsPoolInfo200Response postIpsCreatePool(body)

Add ip pool

Creates a pool and returns it. If a pool already exists with this name, no action will be performed.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsCreatePoolRequest body = new PostIpsCreatePoolRequest(); // PostIpsCreatePoolRequest | 
        try {
            PostIpsPoolInfo200Response result = apiInstance.postIpsCreatePool(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsCreatePool");
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
| **body** | [**PostIpsCreatePoolRequest**](PostIpsCreatePoolRequest.md)|  | |

### Return type

[**PostIpsPoolInfo200Response**](PostIpsPoolInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsDelete

> PostIpsDelete200Response postIpsDelete(body)

Delete ip address

Deletes a dedicated IP. This is permanent and cannot be undone.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsDeleteRequest body = new PostIpsDeleteRequest(); // PostIpsDeleteRequest | 
        try {
            PostIpsDelete200Response result = apiInstance.postIpsDelete(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsDelete");
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
| **body** | [**PostIpsDeleteRequest**](PostIpsDeleteRequest.md)|  | |

### Return type

[**PostIpsDelete200Response**](PostIpsDelete200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsDeletePool

> PostIpsDeletePool200Response postIpsDeletePool(body)

Delete ip pool

Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsDeletePoolRequest body = new PostIpsDeletePoolRequest(); // PostIpsDeletePoolRequest | 
        try {
            PostIpsDeletePool200Response result = apiInstance.postIpsDeletePool(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsDeletePool");
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
| **body** | [**PostIpsDeletePoolRequest**](PostIpsDeletePoolRequest.md)|  | |

### Return type

[**PostIpsDeletePool200Response**](PostIpsDeletePool200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsInfo

> PostIpsInfo200Response postIpsInfo(body)

Get ip info

Retrieves information about a single dedicated IP.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsInfoRequest body = new PostIpsInfoRequest(); // PostIpsInfoRequest | 
        try {
            PostIpsInfo200Response result = apiInstance.postIpsInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsInfo");
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
| **body** | [**PostIpsInfoRequest**](PostIpsInfoRequest.md)|  | |

### Return type

[**PostIpsInfo200Response**](PostIpsInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsList

> List&lt;PostIpsList200ResponseInner&gt; postIpsList(body)

List ip addresses

Lists your dedicated IPs.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostIpsList200ResponseInner> result = apiInstance.postIpsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsList");
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

[**List&lt;PostIpsList200ResponseInner&gt;**](PostIpsList200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsListPools

> List&lt;PostIpsListPools200ResponseInner&gt; postIpsListPools(body)

List ip pools

Lists your dedicated IP pools.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostExportsListRequest body = new PostExportsListRequest(); // PostExportsListRequest | 
        try {
            List<PostIpsListPools200ResponseInner> result = apiInstance.postIpsListPools(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsListPools");
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

[**List&lt;PostIpsListPools200ResponseInner&gt;**](PostIpsListPools200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsPoolInfo

> PostIpsPoolInfo200Response postIpsPoolInfo(body)

Get ip pool info

Describes a single dedicated IP pool.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsPoolInfoRequest body = new PostIpsPoolInfoRequest(); // PostIpsPoolInfoRequest | 
        try {
            PostIpsPoolInfo200Response result = apiInstance.postIpsPoolInfo(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsPoolInfo");
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
| **body** | [**PostIpsPoolInfoRequest**](PostIpsPoolInfoRequest.md)|  | |

### Return type

[**PostIpsPoolInfo200Response**](PostIpsPoolInfo200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsProvision

> PostIpsProvision200Response postIpsProvision(body)

Request additional ip

Requests an additional dedicated IP for your account. Accounts may have one outstanding request at any time, and provisioning requests are processed within 24 hours.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsProvisionRequest body = new PostIpsProvisionRequest(); // PostIpsProvisionRequest | 
        try {
            PostIpsProvision200Response result = apiInstance.postIpsProvision(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsProvision");
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
| **body** | [**PostIpsProvisionRequest**](PostIpsProvisionRequest.md)|  | |

### Return type

[**PostIpsProvision200Response**](PostIpsProvision200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsSetCustomDns

> PostIpsSetCustomDns200Response postIpsSetCustomDns(body)

Set custom dns

Configures the custom DNS name for a dedicated IP.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsSetCustomDnsRequest body = new PostIpsSetCustomDnsRequest(); // PostIpsSetCustomDnsRequest | 
        try {
            PostIpsSetCustomDns200Response result = apiInstance.postIpsSetCustomDns(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsSetCustomDns");
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
| **body** | [**PostIpsSetCustomDnsRequest**](PostIpsSetCustomDnsRequest.md)|  | |

### Return type

[**PostIpsSetCustomDns200Response**](PostIpsSetCustomDns200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsSetPool

> PostIpsSetPool200Response postIpsSetPool(body)

Move ip to different pool

Moves a dedicated IP to a different pool.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsSetPoolRequest body = new PostIpsSetPoolRequest(); // PostIpsSetPoolRequest | 
        try {
            PostIpsSetPool200Response result = apiInstance.postIpsSetPool(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsSetPool");
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
| **body** | [**PostIpsSetPoolRequest**](PostIpsSetPoolRequest.md)|  | |

### Return type

[**PostIpsSetPool200Response**](PostIpsSetPool200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## postIpsStartWarmup

> PostIpsStartWarmup200Response postIpsStartWarmup(body)

Start ip warmup

Begins the warmup process for a dedicated IP. During the warmup process, the Transactional API will gradually increase the percentage of your mail that is sent over the warming-up IP, over a period of roughly 30 days. The rest of your mail will be sent over shared IPs or other dedicated IPs in the same pool.

### Example

```java
// Import classes:
import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.ApiException;
import io.github.erkoristhein.mailchimp.Configuration;
import io.github.erkoristhein.mailchimp.models.*;
import io.github.erkoristhein.mailchimp.api.IpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://mandrillapp.com/api/1.0");

        IpsApi apiInstance = new IpsApi(defaultClient);
        PostIpsStartWarmupRequest body = new PostIpsStartWarmupRequest(); // PostIpsStartWarmupRequest | 
        try {
            PostIpsStartWarmup200Response result = apiInstance.postIpsStartWarmup(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IpsApi#postIpsStartWarmup");
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
| **body** | [**PostIpsStartWarmupRequest**](PostIpsStartWarmupRequest.md)|  | |

### Return type

[**PostIpsStartWarmup200Response**](PostIpsStartWarmup200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/x-php, application/x-yaml; charset=utf-8


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

