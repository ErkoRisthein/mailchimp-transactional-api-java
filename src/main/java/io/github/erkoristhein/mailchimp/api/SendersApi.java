package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostSendersAddDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostSendersAddDomainRequest;
import io.github.erkoristhein.mailchimp.model.PostSendersCheckDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostSendersDomains200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostSendersInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostSendersInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostSendersList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostSendersTimeSeries200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostSendersVerifyDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostSendersVerifyDomainRequest;

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
public class SendersApi {
    private ApiClient apiClient;

    public SendersApi() {
        this(new ApiClient());
    }

    public SendersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add sender domain
     * Adds a sender domain to your account. Sender domains are added automatically as you send, but you can use this call to add them ahead of time.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSendersAddDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSendersAddDomain200Response postSendersAddDomain(PostSendersAddDomainRequest body) throws RestClientException {
        return postSendersAddDomainWithHttpInfo(body).getBody();
    }

    /**
     * Add sender domain
     * Adds a sender domain to your account. Sender domains are added automatically as you send, but you can use this call to add them ahead of time.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSendersAddDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSendersAddDomain200Response> postSendersAddDomainWithHttpInfo(PostSendersAddDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersAddDomain");
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

        ParameterizedTypeReference<PostSendersAddDomain200Response> localReturnType = new ParameterizedTypeReference<PostSendersAddDomain200Response>() {};
        return apiClient.invokeAPI("/senders/add-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check domain settings
     * Checks the SPF and DKIM settings for a domain, as well the domain verification. If you haven&#39;t already added this domain to your account, it will be added automatically.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSendersCheckDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSendersCheckDomain200Response postSendersCheckDomain(PostSendersAddDomainRequest body) throws RestClientException {
        return postSendersCheckDomainWithHttpInfo(body).getBody();
    }

    /**
     * Check domain settings
     * Checks the SPF and DKIM settings for a domain, as well the domain verification. If you haven&#39;t already added this domain to your account, it will be added automatically.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSendersCheckDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSendersCheckDomain200Response> postSendersCheckDomainWithHttpInfo(PostSendersAddDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersCheckDomain");
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

        ParameterizedTypeReference<PostSendersCheckDomain200Response> localReturnType = new ParameterizedTypeReference<PostSendersCheckDomain200Response>() {};
        return apiClient.invokeAPI("/senders/check-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List sender domains
     * Returns the sender domains that have been added to this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostSendersDomains200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostSendersDomains200ResponseInner> postSendersDomains(PostExportsListRequest body) throws RestClientException {
        return postSendersDomainsWithHttpInfo(body).getBody();
    }

    /**
     * List sender domains
     * Returns the sender domains that have been added to this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostSendersDomains200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostSendersDomains200ResponseInner>> postSendersDomainsWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersDomains");
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

        ParameterizedTypeReference<List<PostSendersDomains200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostSendersDomains200ResponseInner>>() {};
        return apiClient.invokeAPI("/senders/domains", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get sender info
     * Return more detailed information about a single sender, including aggregates of recent stats.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSendersInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSendersInfo200Response postSendersInfo(PostSendersInfoRequest body) throws RestClientException {
        return postSendersInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get sender info
     * Return more detailed information about a single sender, including aggregates of recent stats.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSendersInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSendersInfo200Response> postSendersInfoWithHttpInfo(PostSendersInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersInfo");
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

        ParameterizedTypeReference<PostSendersInfo200Response> localReturnType = new ParameterizedTypeReference<PostSendersInfo200Response>() {};
        return apiClient.invokeAPI("/senders/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List account senders
     * Return the senders that have tried to use this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostSendersList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostSendersList200ResponseInner> postSendersList(PostExportsListRequest body) throws RestClientException {
        return postSendersListWithHttpInfo(body).getBody();
    }

    /**
     * List account senders
     * Return the senders that have tried to use this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostSendersList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostSendersList200ResponseInner>> postSendersListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersList");
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

        ParameterizedTypeReference<List<PostSendersList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostSendersList200ResponseInner>>() {};
        return apiClient.invokeAPI("/senders/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View sender history
     * Return the recent history (hourly stats for the last 30 days) for a sender.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostSendersTimeSeries200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostSendersTimeSeries200ResponseInner> postSendersTimeSeries(PostSendersInfoRequest body) throws RestClientException {
        return postSendersTimeSeriesWithHttpInfo(body).getBody();
    }

    /**
     * View sender history
     * Return the recent history (hourly stats for the last 30 days) for a sender.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostSendersTimeSeries200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostSendersTimeSeries200ResponseInner>> postSendersTimeSeriesWithHttpInfo(PostSendersInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersTimeSeries");
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

        ParameterizedTypeReference<List<PostSendersTimeSeries200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostSendersTimeSeries200ResponseInner>>() {};
        return apiClient.invokeAPI("/senders/time-series", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify domain
     * Sends a verification email in order to verify ownership of a domain. Domain verification is a required step to confirm ownership of a domain. Once a domain has been verified in a Transactional API account, other accounts may not have their messages signed by that domain unless they also verify the domain. This prevents other Transactional API accounts from sending mail signed by your domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSendersVerifyDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSendersVerifyDomain200Response postSendersVerifyDomain(PostSendersVerifyDomainRequest body) throws RestClientException {
        return postSendersVerifyDomainWithHttpInfo(body).getBody();
    }

    /**
     * Verify domain
     * Sends a verification email in order to verify ownership of a domain. Domain verification is a required step to confirm ownership of a domain. Once a domain has been verified in a Transactional API account, other accounts may not have their messages signed by that domain unless they also verify the domain. This prevents other Transactional API accounts from sending mail signed by your domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSendersVerifyDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSendersVerifyDomain200Response> postSendersVerifyDomainWithHttpInfo(PostSendersVerifyDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSendersVerifyDomain");
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

        ParameterizedTypeReference<PostSendersVerifyDomain200Response> localReturnType = new ParameterizedTypeReference<PostSendersVerifyDomain200Response>() {};
        return apiClient.invokeAPI("/senders/verify-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
