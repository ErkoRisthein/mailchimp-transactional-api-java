package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostMetadataAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostMetadataAddRequest;
import io.github.erkoristhein.mailchimp.model.PostMetadataDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostMetadataDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostMetadataList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostMetadataUpdate200Response;
import io.github.erkoristhein.mailchimp.model.PostMetadataUpdateRequest;

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
public class MetadataApi {
    private ApiClient apiClient;

    public MetadataApi() {
        this(new ApiClient());
    }

    public MetadataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add metadata field
     * Add a new custom metadata field to be indexed for the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMetadataAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMetadataAdd200Response postMetadataAdd(PostMetadataAddRequest body) throws RestClientException {
        return postMetadataAddWithHttpInfo(body).getBody();
    }

    /**
     * Add metadata field
     * Add a new custom metadata field to be indexed for the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMetadataAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMetadataAdd200Response> postMetadataAddWithHttpInfo(PostMetadataAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMetadataAdd");
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

        ParameterizedTypeReference<PostMetadataAdd200Response> localReturnType = new ParameterizedTypeReference<PostMetadataAdd200Response>() {};
        return apiClient.invokeAPI("/metadata/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete metadata field
     * Delete an existing custom metadata field. Deletion isn&#39;t instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMetadataDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMetadataDelete200Response postMetadataDelete(PostMetadataDeleteRequest body) throws RestClientException {
        return postMetadataDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete metadata field
     * Delete an existing custom metadata field. Deletion isn&#39;t instataneous, and /metadata/list will continue to return the field until the asynchronous deletion process is complete.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMetadataDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMetadataDelete200Response> postMetadataDeleteWithHttpInfo(PostMetadataDeleteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMetadataDelete");
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

        ParameterizedTypeReference<PostMetadataDelete200Response> localReturnType = new ParameterizedTypeReference<PostMetadataDelete200Response>() {};
        return apiClient.invokeAPI("/metadata/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List metadata fields
     * Get the list of custom metadata fields indexed for the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostMetadataList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostMetadataList200ResponseInner> postMetadataList(PostExportsListRequest body) throws RestClientException {
        return postMetadataListWithHttpInfo(body).getBody();
    }

    /**
     * List metadata fields
     * Get the list of custom metadata fields indexed for the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostMetadataList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostMetadataList200ResponseInner>> postMetadataListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMetadataList");
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

        ParameterizedTypeReference<List<PostMetadataList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostMetadataList200ResponseInner>>() {};
        return apiClient.invokeAPI("/metadata/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update metadata field
     * Update an existing custom metadata field.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostMetadataUpdate200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostMetadataUpdate200Response postMetadataUpdate(PostMetadataUpdateRequest body) throws RestClientException {
        return postMetadataUpdateWithHttpInfo(body).getBody();
    }

    /**
     * Update metadata field
     * Update an existing custom metadata field.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostMetadataUpdate200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostMetadataUpdate200Response> postMetadataUpdateWithHttpInfo(PostMetadataUpdateRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postMetadataUpdate");
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

        ParameterizedTypeReference<PostMetadataUpdate200Response> localReturnType = new ParameterizedTypeReference<PostMetadataUpdate200Response>() {};
        return apiClient.invokeAPI("/metadata/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
