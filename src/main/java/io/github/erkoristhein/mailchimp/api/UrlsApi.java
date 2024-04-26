package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.BaseApi;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostSendersAddDomainRequest;
import io.github.erkoristhein.mailchimp.model.PostUrlsAddTrackingDomain200Response;
import io.github.erkoristhein.mailchimp.model.PostUrlsCheckTrackingDomainRequest;
import io.github.erkoristhein.mailchimp.model.PostUrlsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostUrlsSearchDeprecated200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostUrlsSearchDeprecatedRequest;
import io.github.erkoristhein.mailchimp.model.PostUrlsTimeSeries200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostUrlsTimeSeriesRequest;
import io.github.erkoristhein.mailchimp.model.PostUrlsTrackingDomains200ResponseInner;

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

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-26T17:07:48.465004+03:00[Europe/Helsinki]", comments = "Generator version: 7.5.0")
public class UrlsApi extends BaseApi {

    public UrlsApi() {
        super(new ApiClient());
    }

    public UrlsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add tracking domains
     * Add a tracking domain to your account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostUrlsAddTrackingDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostUrlsAddTrackingDomain200Response postUrlsAddTrackingDomain(PostSendersAddDomainRequest body) throws RestClientException {
        return postUrlsAddTrackingDomainWithHttpInfo(body).getBody();
    }

    /**
     * Add tracking domains
     * Add a tracking domain to your account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostUrlsAddTrackingDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostUrlsAddTrackingDomain200Response> postUrlsAddTrackingDomainWithHttpInfo(PostSendersAddDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsAddTrackingDomain");
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

        ParameterizedTypeReference<PostUrlsAddTrackingDomain200Response> localReturnType = new ParameterizedTypeReference<PostUrlsAddTrackingDomain200Response>() {};
        return apiClient.invokeAPI("/urls/add-tracking-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check cname settings
     * Checks the CNAME settings for a tracking domain. The domain must have been added already with the add-tracking-domain call.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostUrlsAddTrackingDomain200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostUrlsAddTrackingDomain200Response postUrlsCheckTrackingDomain(PostUrlsCheckTrackingDomainRequest body) throws RestClientException {
        return postUrlsCheckTrackingDomainWithHttpInfo(body).getBody();
    }

    /**
     * Check cname settings
     * Checks the CNAME settings for a tracking domain. The domain must have been added already with the add-tracking-domain call.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostUrlsAddTrackingDomain200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostUrlsAddTrackingDomain200Response> postUrlsCheckTrackingDomainWithHttpInfo(PostUrlsCheckTrackingDomainRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsCheckTrackingDomain");
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

        ParameterizedTypeReference<PostUrlsAddTrackingDomain200Response> localReturnType = new ParameterizedTypeReference<PostUrlsAddTrackingDomain200Response>() {};
        return apiClient.invokeAPI("/urls/check-tracking-domain", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List most clicked urls
     * Get the 100 most clicked URLs.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostUrlsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public List<PostUrlsList200ResponseInner> postUrlsList(PostExportsListRequest body) throws RestClientException {
        return postUrlsListWithHttpInfo(body).getBody();
    }

    /**
     * List most clicked urls
     * Get the 100 most clicked URLs.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostUrlsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<List<PostUrlsList200ResponseInner>> postUrlsListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsList");
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

        ParameterizedTypeReference<List<PostUrlsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostUrlsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/urls/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search most clicked urls
     * Return the 100 most clicked URLs that match the search query given.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostUrlsSearchDeprecated200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public List<PostUrlsSearchDeprecated200ResponseInner> postUrlsSearchDeprecated(PostUrlsSearchDeprecatedRequest body) throws RestClientException {
        return postUrlsSearchDeprecatedWithHttpInfo(body).getBody();
    }

    /**
     * Search most clicked urls
     * Return the 100 most clicked URLs that match the search query given.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostUrlsSearchDeprecated200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<List<PostUrlsSearchDeprecated200ResponseInner>> postUrlsSearchDeprecatedWithHttpInfo(PostUrlsSearchDeprecatedRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsSearchDeprecated");
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

        ParameterizedTypeReference<List<PostUrlsSearchDeprecated200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostUrlsSearchDeprecated200ResponseInner>>() {};
        return apiClient.invokeAPI("/urls/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get url history
     * Return the recent history (hourly stats for the last 30 days) for a URL
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostUrlsTimeSeries200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public List<PostUrlsTimeSeries200ResponseInner> postUrlsTimeSeries(PostUrlsTimeSeriesRequest body) throws RestClientException {
        return postUrlsTimeSeriesWithHttpInfo(body).getBody();
    }

    /**
     * Get url history
     * Return the recent history (hourly stats for the last 30 days) for a URL
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostUrlsTimeSeries200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<List<PostUrlsTimeSeries200ResponseInner>> postUrlsTimeSeriesWithHttpInfo(PostUrlsTimeSeriesRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsTimeSeries");
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

        ParameterizedTypeReference<List<PostUrlsTimeSeries200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostUrlsTimeSeries200ResponseInner>>() {};
        return apiClient.invokeAPI("/urls/time-series", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List tracking domains
     * Get the list of tracking domains set up for this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostUrlsTrackingDomains200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostUrlsTrackingDomains200ResponseInner> postUrlsTrackingDomains(PostExportsListRequest body) throws RestClientException {
        return postUrlsTrackingDomainsWithHttpInfo(body).getBody();
    }

    /**
     * List tracking domains
     * Get the list of tracking domains set up for this account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostUrlsTrackingDomains200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostUrlsTrackingDomains200ResponseInner>> postUrlsTrackingDomainsWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postUrlsTrackingDomains");
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

        ParameterizedTypeReference<List<PostUrlsTrackingDomains200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostUrlsTrackingDomains200ResponseInner>>() {};
        return apiClient.invokeAPI("/urls/tracking-domains", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}
