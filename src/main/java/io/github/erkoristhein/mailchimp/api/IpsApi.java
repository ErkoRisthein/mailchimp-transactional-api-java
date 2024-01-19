package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsCheckCustomDns200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsCheckCustomDnsRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsCreatePoolRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsDeletePool200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsDeletePoolRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostIpsListPools200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostIpsPoolInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsPoolInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsProvision200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsProvisionRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsSetCustomDns200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsSetCustomDnsRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsSetPool200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsSetPoolRequest;
import io.github.erkoristhein.mailchimp.model.PostIpsStartWarmup200Response;
import io.github.erkoristhein.mailchimp.model.PostIpsStartWarmupRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-19T14:58:48.420021+02:00[Europe/Tallinn]")
public class IpsApi {
    private ApiClient apiClient;

    public IpsApi() {
        this(new ApiClient());
    }

    public IpsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel ip warmup
     * Cancels the warmup process for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsStartWarmup200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsStartWarmup200Response postIpsCancelWarmup(PostIpsStartWarmupRequest body) throws RestClientException {
        return postIpsCancelWarmupWithHttpInfo(body).getBody();
    }

    /**
     * Cancel ip warmup
     * Cancels the warmup process for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsStartWarmup200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsStartWarmup200Response> postIpsCancelWarmupWithHttpInfo(PostIpsStartWarmupRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsCancelWarmup");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsStartWarmup200Response> localReturnType = new ParameterizedTypeReference<PostIpsStartWarmup200Response>() {};
        return apiClient.invokeAPI("/ips/cancel-warmup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Test custom dns
     * Tests whether a domain name is valid for use as the custom reverse DNS for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsCheckCustomDns200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsCheckCustomDns200Response postIpsCheckCustomDns(PostIpsCheckCustomDnsRequest body) throws RestClientException {
        return postIpsCheckCustomDnsWithHttpInfo(body).getBody();
    }

    /**
     * Test custom dns
     * Tests whether a domain name is valid for use as the custom reverse DNS for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsCheckCustomDns200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsCheckCustomDns200Response> postIpsCheckCustomDnsWithHttpInfo(PostIpsCheckCustomDnsRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsCheckCustomDns");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsCheckCustomDns200Response> localReturnType = new ParameterizedTypeReference<PostIpsCheckCustomDns200Response>() {};
        return apiClient.invokeAPI("/ips/check-custom-dns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add ip pool
     * Creates a pool and returns it. If a pool already exists with this name, no action will be performed.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsPoolInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsPoolInfo200Response postIpsCreatePool(PostIpsCreatePoolRequest body) throws RestClientException {
        return postIpsCreatePoolWithHttpInfo(body).getBody();
    }

    /**
     * Add ip pool
     * Creates a pool and returns it. If a pool already exists with this name, no action will be performed.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsPoolInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsPoolInfo200Response> postIpsCreatePoolWithHttpInfo(PostIpsCreatePoolRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsCreatePool");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsPoolInfo200Response> localReturnType = new ParameterizedTypeReference<PostIpsPoolInfo200Response>() {};
        return apiClient.invokeAPI("/ips/create-pool", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete ip address
     * Deletes a dedicated IP. This is permanent and cannot be undone.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsDelete200Response postIpsDelete(PostIpsDeleteRequest body) throws RestClientException {
        return postIpsDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete ip address
     * Deletes a dedicated IP. This is permanent and cannot be undone.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsDelete200Response> postIpsDeleteWithHttpInfo(PostIpsDeleteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsDelete");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsDelete200Response> localReturnType = new ParameterizedTypeReference<PostIpsDelete200Response>() {};
        return apiClient.invokeAPI("/ips/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete ip pool
     * Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsDeletePool200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsDeletePool200Response postIpsDeletePool(PostIpsDeletePoolRequest body) throws RestClientException {
        return postIpsDeletePoolWithHttpInfo(body).getBody();
    }

    /**
     * Delete ip pool
     * Deletes a pool. A pool must be empty before you can delete it, and you cannot delete your default pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsDeletePool200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsDeletePool200Response> postIpsDeletePoolWithHttpInfo(PostIpsDeletePoolRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsDeletePool");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsDeletePool200Response> localReturnType = new ParameterizedTypeReference<PostIpsDeletePool200Response>() {};
        return apiClient.invokeAPI("/ips/delete-pool", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ip info
     * Retrieves information about a single dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsInfo200Response postIpsInfo(PostIpsInfoRequest body) throws RestClientException {
        return postIpsInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get ip info
     * Retrieves information about a single dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsInfo200Response> postIpsInfoWithHttpInfo(PostIpsInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsInfo");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsInfo200Response> localReturnType = new ParameterizedTypeReference<PostIpsInfo200Response>() {};
        return apiClient.invokeAPI("/ips/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List ip addresses
     * Lists your dedicated IPs.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostIpsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostIpsList200ResponseInner> postIpsList(PostExportsListRequest body) throws RestClientException {
        return postIpsListWithHttpInfo(body).getBody();
    }

    /**
     * List ip addresses
     * Lists your dedicated IPs.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostIpsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostIpsList200ResponseInner>> postIpsListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsList");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostIpsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostIpsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/ips/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List ip pools
     * Lists your dedicated IP pools.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostIpsListPools200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostIpsListPools200ResponseInner> postIpsListPools(PostExportsListRequest body) throws RestClientException {
        return postIpsListPoolsWithHttpInfo(body).getBody();
    }

    /**
     * List ip pools
     * Lists your dedicated IP pools.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostIpsListPools200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostIpsListPools200ResponseInner>> postIpsListPoolsWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsListPools");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PostIpsListPools200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostIpsListPools200ResponseInner>>() {};
        return apiClient.invokeAPI("/ips/list-pools", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ip pool info
     * Describes a single dedicated IP pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsPoolInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsPoolInfo200Response postIpsPoolInfo(PostIpsPoolInfoRequest body) throws RestClientException {
        return postIpsPoolInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get ip pool info
     * Describes a single dedicated IP pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsPoolInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsPoolInfo200Response> postIpsPoolInfoWithHttpInfo(PostIpsPoolInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsPoolInfo");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsPoolInfo200Response> localReturnType = new ParameterizedTypeReference<PostIpsPoolInfo200Response>() {};
        return apiClient.invokeAPI("/ips/pool-info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Request additional ip
     * Requests an additional dedicated IP for your account. Accounts may have one outstanding request at any time, and provisioning requests are processed within 24 hours.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsProvision200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsProvision200Response postIpsProvision(PostIpsProvisionRequest body) throws RestClientException {
        return postIpsProvisionWithHttpInfo(body).getBody();
    }

    /**
     * Request additional ip
     * Requests an additional dedicated IP for your account. Accounts may have one outstanding request at any time, and provisioning requests are processed within 24 hours.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsProvision200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsProvision200Response> postIpsProvisionWithHttpInfo(PostIpsProvisionRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsProvision");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsProvision200Response> localReturnType = new ParameterizedTypeReference<PostIpsProvision200Response>() {};
        return apiClient.invokeAPI("/ips/provision", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set custom dns
     * Configures the custom DNS name for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsSetCustomDns200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsSetCustomDns200Response postIpsSetCustomDns(PostIpsSetCustomDnsRequest body) throws RestClientException {
        return postIpsSetCustomDnsWithHttpInfo(body).getBody();
    }

    /**
     * Set custom dns
     * Configures the custom DNS name for a dedicated IP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsSetCustomDns200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsSetCustomDns200Response> postIpsSetCustomDnsWithHttpInfo(PostIpsSetCustomDnsRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsSetCustomDns");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsSetCustomDns200Response> localReturnType = new ParameterizedTypeReference<PostIpsSetCustomDns200Response>() {};
        return apiClient.invokeAPI("/ips/set-custom-dns", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Move ip to different pool
     * Moves a dedicated IP to a different pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsSetPool200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsSetPool200Response postIpsSetPool(PostIpsSetPoolRequest body) throws RestClientException {
        return postIpsSetPoolWithHttpInfo(body).getBody();
    }

    /**
     * Move ip to different pool
     * Moves a dedicated IP to a different pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsSetPool200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsSetPool200Response> postIpsSetPoolWithHttpInfo(PostIpsSetPoolRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsSetPool");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsSetPool200Response> localReturnType = new ParameterizedTypeReference<PostIpsSetPool200Response>() {};
        return apiClient.invokeAPI("/ips/set-pool", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start ip warmup
     * Begins the warmup process for a dedicated IP. During the warmup process, the Transactional API will gradually increase the percentage of your mail that is sent over the warming-up IP, over a period of roughly 30 days. The rest of your mail will be sent over shared IPs or other dedicated IPs in the same pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostIpsStartWarmup200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostIpsStartWarmup200Response postIpsStartWarmup(PostIpsStartWarmupRequest body) throws RestClientException {
        return postIpsStartWarmupWithHttpInfo(body).getBody();
    }

    /**
     * Start ip warmup
     * Begins the warmup process for a dedicated IP. During the warmup process, the Transactional API will gradually increase the percentage of your mail that is sent over the warming-up IP, over a period of roughly 30 days. The rest of your mail will be sent over shared IPs or other dedicated IPs in the same pool.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostIpsStartWarmup200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostIpsStartWarmup200Response> postIpsStartWarmupWithHttpInfo(PostIpsStartWarmupRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postIpsStartWarmup");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/x-php", "application/x-yaml; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostIpsStartWarmup200Response> localReturnType = new ParameterizedTypeReference<PostIpsStartWarmup200Response>() {};
        return apiClient.invokeAPI("/ips/start-warmup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
