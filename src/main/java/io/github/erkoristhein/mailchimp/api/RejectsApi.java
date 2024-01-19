package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostRejectsAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostRejectsAddRequest;
import io.github.erkoristhein.mailchimp.model.PostRejectsDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostRejectsDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostRejectsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostRejectsListRequest;

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
public class RejectsApi {
    private ApiClient apiClient;

    public RejectsApi() {
        this(new ApiClient());
    }

    public RejectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add email to denylist
     * Adds an email to your email rejection denylist. Addresses that you add manually will never expire and there is no reputation penalty for removing them from your denylist. Attempting to denylist an address that has been added to the allowlist will have no effect.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostRejectsAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostRejectsAdd200Response postRejectsAdd(PostRejectsAddRequest body) throws RestClientException {
        return postRejectsAddWithHttpInfo(body).getBody();
    }

    /**
     * Add email to denylist
     * Adds an email to your email rejection denylist. Addresses that you add manually will never expire and there is no reputation penalty for removing them from your denylist. Attempting to denylist an address that has been added to the allowlist will have no effect.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostRejectsAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostRejectsAdd200Response> postRejectsAddWithHttpInfo(PostRejectsAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postRejectsAdd");
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

        ParameterizedTypeReference<PostRejectsAdd200Response> localReturnType = new ParameterizedTypeReference<PostRejectsAdd200Response>() {};
        return apiClient.invokeAPI("/rejects/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete email from denylist
     * Deletes an email rejection. There is no limit to how many rejections you can remove from your denylist, but keep in mind that each deletion has an affect on your reputation.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostRejectsDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostRejectsDelete200Response postRejectsDelete(PostRejectsDeleteRequest body) throws RestClientException {
        return postRejectsDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete email from denylist
     * Deletes an email rejection. There is no limit to how many rejections you can remove from your denylist, but keep in mind that each deletion has an affect on your reputation.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostRejectsDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostRejectsDelete200Response> postRejectsDeleteWithHttpInfo(PostRejectsDeleteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postRejectsDelete");
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

        ParameterizedTypeReference<PostRejectsDelete200Response> localReturnType = new ParameterizedTypeReference<PostRejectsDelete200Response>() {};
        return apiClient.invokeAPI("/rejects/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List denylisted emails
     * Retrieves your email rejection denylist. You can provide an email address to limit the results. Returns up to 1000 results. By default, entries that have expired are excluded from the results; set include_expired to true to include them.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostRejectsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostRejectsList200ResponseInner> postRejectsList(PostRejectsListRequest body) throws RestClientException {
        return postRejectsListWithHttpInfo(body).getBody();
    }

    /**
     * List denylisted emails
     * Retrieves your email rejection denylist. You can provide an email address to limit the results. Returns up to 1000 results. By default, entries that have expired are excluded from the results; set include_expired to true to include them.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostRejectsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostRejectsList200ResponseInner>> postRejectsListWithHttpInfo(PostRejectsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postRejectsList");
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

        ParameterizedTypeReference<List<PostRejectsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostRejectsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/rejects/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
