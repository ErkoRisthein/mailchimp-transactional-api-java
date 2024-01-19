package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundAddDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundAddDomainRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundAddRoute200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundAddRouteRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundCheckDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundCheckDomainRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundDeleteDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundDeleteRoute200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundDeleteRouteRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundDomains200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostInboundRoutes200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostInboundRoutesRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundSendRaw200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostInboundSendRawRequest;
import io.github.erkoristhein.mailchimp.model.PostInboundUpdateRoute200Response;
import io.github.erkoristhein.mailchimp.model.PostInboundUpdateRouteRequest;

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
public class InboundApi {
    private ApiClient apiClient;

    public InboundApi() {
        this(new ApiClient());
    }

    public InboundApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add inbound domain
     * Add an inbound domain to your account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundAddDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundAddDomain200Response postInboundAddDomain(PostInboundAddDomainRequest body) throws RestClientException {
        return postInboundAddDomainWithHttpInfo(body).getBody();
    }

    /**
     * Add inbound domain
     * Add an inbound domain to your account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundAddDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundAddDomain200Response> postInboundAddDomainWithHttpInfo(PostInboundAddDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundAddDomain");
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

        ParameterizedTypeReference<PostInboundAddDomain200Response> localReturnType = new ParameterizedTypeReference<PostInboundAddDomain200Response>() {};
        return apiClient.invokeAPI("/inbound/add-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add mailbox route
     * Add a new mailbox route to an inbound domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundAddRoute200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundAddRoute200Response postInboundAddRoute(PostInboundAddRouteRequest body) throws RestClientException {
        return postInboundAddRouteWithHttpInfo(body).getBody();
    }

    /**
     * Add mailbox route
     * Add a new mailbox route to an inbound domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundAddRoute200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundAddRoute200Response> postInboundAddRouteWithHttpInfo(PostInboundAddRouteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundAddRoute");
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

        ParameterizedTypeReference<PostInboundAddRoute200Response> localReturnType = new ParameterizedTypeReference<PostInboundAddRoute200Response>() {};
        return apiClient.invokeAPI("/inbound/add-route", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check domain settings
     * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundCheckDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundCheckDomain200Response postInboundCheckDomain(PostInboundCheckDomainRequest body) throws RestClientException {
        return postInboundCheckDomainWithHttpInfo(body).getBody();
    }

    /**
     * Check domain settings
     * Check the MX settings for an inbound domain. The domain must have already been added with the add-domain call.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundCheckDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundCheckDomain200Response> postInboundCheckDomainWithHttpInfo(PostInboundCheckDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundCheckDomain");
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

        ParameterizedTypeReference<PostInboundCheckDomain200Response> localReturnType = new ParameterizedTypeReference<PostInboundCheckDomain200Response>() {};
        return apiClient.invokeAPI("/inbound/check-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete inbound domain
     * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundDeleteDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundDeleteDomain200Response postInboundDeleteDomain(PostInboundCheckDomainRequest body) throws RestClientException {
        return postInboundDeleteDomainWithHttpInfo(body).getBody();
    }

    /**
     * Delete inbound domain
     * Delete an inbound domain from the account. All mail will stop routing for this domain immediately.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundDeleteDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundDeleteDomain200Response> postInboundDeleteDomainWithHttpInfo(PostInboundCheckDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundDeleteDomain");
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

        ParameterizedTypeReference<PostInboundDeleteDomain200Response> localReturnType = new ParameterizedTypeReference<PostInboundDeleteDomain200Response>() {};
        return apiClient.invokeAPI("/inbound/delete-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete mailbox route
     * Delete an existing inbound mailbox route.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundDeleteRoute200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundDeleteRoute200Response postInboundDeleteRoute(PostInboundDeleteRouteRequest body) throws RestClientException {
        return postInboundDeleteRouteWithHttpInfo(body).getBody();
    }

    /**
     * Delete mailbox route
     * Delete an existing inbound mailbox route.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundDeleteRoute200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundDeleteRoute200Response> postInboundDeleteRouteWithHttpInfo(PostInboundDeleteRouteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundDeleteRoute");
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

        ParameterizedTypeReference<PostInboundDeleteRoute200Response> localReturnType = new ParameterizedTypeReference<PostInboundDeleteRoute200Response>() {};
        return apiClient.invokeAPI("/inbound/delete-route", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List inbound domains
     * List the domains that have been configured for inbound delivery.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostInboundDomains200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostInboundDomains200ResponseInner> postInboundDomains(PostExportsListRequest body) throws RestClientException {
        return postInboundDomainsWithHttpInfo(body).getBody();
    }

    /**
     * List inbound domains
     * List the domains that have been configured for inbound delivery.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostInboundDomains200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostInboundDomains200ResponseInner>> postInboundDomainsWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundDomains");
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

        ParameterizedTypeReference<List<PostInboundDomains200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostInboundDomains200ResponseInner>>() {};
        return apiClient.invokeAPI("/inbound/domains", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List mailbox routes
     * List the mailbox routes defined for an inbound domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostInboundRoutes200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostInboundRoutes200ResponseInner> postInboundRoutes(PostInboundRoutesRequest body) throws RestClientException {
        return postInboundRoutesWithHttpInfo(body).getBody();
    }

    /**
     * List mailbox routes
     * List the mailbox routes defined for an inbound domain.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostInboundRoutes200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostInboundRoutes200ResponseInner>> postInboundRoutesWithHttpInfo(PostInboundRoutesRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundRoutes");
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

        ParameterizedTypeReference<List<PostInboundRoutes200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostInboundRoutes200ResponseInner>>() {};
        return apiClient.invokeAPI("/inbound/routes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Send mime document
     * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostInboundSendRaw200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostInboundSendRaw200ResponseInner> postInboundSendRaw(PostInboundSendRawRequest body) throws RestClientException {
        return postInboundSendRawWithHttpInfo(body).getBody();
    }

    /**
     * Send mime document
     * Take a raw MIME document destined for a domain with inbound domains set up, and send it to the inbound hook exactly as if it had been sent over SMTP.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostInboundSendRaw200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostInboundSendRaw200ResponseInner>> postInboundSendRawWithHttpInfo(PostInboundSendRawRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundSendRaw");
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

        ParameterizedTypeReference<List<PostInboundSendRaw200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostInboundSendRaw200ResponseInner>>() {};
        return apiClient.invokeAPI("/inbound/send-raw", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update mailbox route
     * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostInboundUpdateRoute200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostInboundUpdateRoute200Response postInboundUpdateRoute(PostInboundUpdateRouteRequest body) throws RestClientException {
        return postInboundUpdateRouteWithHttpInfo(body).getBody();
    }

    /**
     * Update mailbox route
     * Update the pattern or webhook of an existing inbound mailbox route. If null is provided for any fields, the values will remain unchanged.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostInboundUpdateRoute200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostInboundUpdateRoute200Response> postInboundUpdateRouteWithHttpInfo(PostInboundUpdateRouteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postInboundUpdateRoute");
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

        ParameterizedTypeReference<PostInboundUpdateRoute200Response> localReturnType = new ParameterizedTypeReference<PostInboundUpdateRoute200Response>() {};
        return apiClient.invokeAPI("/inbound/update-route", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
