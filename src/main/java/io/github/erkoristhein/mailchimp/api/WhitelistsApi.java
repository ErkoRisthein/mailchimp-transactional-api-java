package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.BaseApi;

import io.github.erkoristhein.mailchimp.model.PostAllowlistsAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsAddRequest;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostAllowlistsListRequest;

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
public class WhitelistsApi extends BaseApi {

    public WhitelistsApi() {
        super(new ApiClient());
    }

    public WhitelistsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add email to allowlist
     * Adds an email to your email rejection allowlist. If the address is currently on your denylist, that denylist entry will be removed automatically.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostAllowlistsAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostAllowlistsAdd200Response postWhitelistsAdd(PostAllowlistsAddRequest body) throws RestClientException {
        return postWhitelistsAddWithHttpInfo(body).getBody();
    }

    /**
     * Add email to allowlist
     * Adds an email to your email rejection allowlist. If the address is currently on your denylist, that denylist entry will be removed automatically.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostAllowlistsAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostAllowlistsAdd200Response> postWhitelistsAddWithHttpInfo(PostAllowlistsAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWhitelistsAdd");
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

        ParameterizedTypeReference<PostAllowlistsAdd200Response> localReturnType = new ParameterizedTypeReference<PostAllowlistsAdd200Response>() {};
        return apiClient.invokeAPI("/whitelists/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove email from allowlist
     * Removes an email address from the allowlist.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostAllowlistsDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostAllowlistsDelete200Response postWhitelistsDelete(PostAllowlistsDeleteRequest body) throws RestClientException {
        return postWhitelistsDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Remove email from allowlist
     * Removes an email address from the allowlist.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostAllowlistsDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostAllowlistsDelete200Response> postWhitelistsDeleteWithHttpInfo(PostAllowlistsDeleteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWhitelistsDelete");
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

        ParameterizedTypeReference<PostAllowlistsDelete200Response> localReturnType = new ParameterizedTypeReference<PostAllowlistsDelete200Response>() {};
        return apiClient.invokeAPI("/whitelists/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List allowlisted emails
     * Retrieves your email rejection allowlist. You can provide an email address or search prefix to limit the results. Returns up to 1000 results.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostAllowlistsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostAllowlistsList200ResponseInner> postWhitelistsList(PostAllowlistsListRequest body) throws RestClientException {
        return postWhitelistsListWithHttpInfo(body).getBody();
    }

    /**
     * List allowlisted emails
     * Retrieves your email rejection allowlist. You can provide an email address or search prefix to limit the results. Returns up to 1000 results.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostAllowlistsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostAllowlistsList200ResponseInner>> postWhitelistsListWithHttpInfo(PostAllowlistsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWhitelistsList");
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

        ParameterizedTypeReference<List<PostAllowlistsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostAllowlistsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/whitelists/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
