package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.BaseApi;

import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostWebhooksAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostWebhooksAddRequest;
import io.github.erkoristhein.mailchimp.model.PostWebhooksDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostWebhooksInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostWebhooksInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostWebhooksList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostWebhooksUpdate200Response;
import io.github.erkoristhein.mailchimp.model.PostWebhooksUpdateRequest;

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
public class WebhooksApi extends BaseApi {

    public WebhooksApi() {
        super(new ApiClient());
    }

    public WebhooksApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add webhook
     * Add a new webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostWebhooksAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostWebhooksAdd200Response postWebhooksAdd(PostWebhooksAddRequest body) throws RestClientException {
        return postWebhooksAddWithHttpInfo(body).getBody();
    }

    /**
     * Add webhook
     * Add a new webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostWebhooksAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostWebhooksAdd200Response> postWebhooksAddWithHttpInfo(PostWebhooksAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWebhooksAdd");
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

        ParameterizedTypeReference<PostWebhooksAdd200Response> localReturnType = new ParameterizedTypeReference<PostWebhooksAdd200Response>() {};
        return apiClient.invokeAPI("/webhooks/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete webhook
     * Delete an existing webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostWebhooksDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostWebhooksDelete200Response postWebhooksDelete(PostWebhooksInfoRequest body) throws RestClientException {
        return postWebhooksDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete webhook
     * Delete an existing webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostWebhooksDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostWebhooksDelete200Response> postWebhooksDeleteWithHttpInfo(PostWebhooksInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWebhooksDelete");
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

        ParameterizedTypeReference<PostWebhooksDelete200Response> localReturnType = new ParameterizedTypeReference<PostWebhooksDelete200Response>() {};
        return apiClient.invokeAPI("/webhooks/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get webhook info
     * Given the ID of an existing webhook, return the data about it.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostWebhooksInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostWebhooksInfo200Response postWebhooksInfo(PostWebhooksInfoRequest body) throws RestClientException {
        return postWebhooksInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get webhook info
     * Given the ID of an existing webhook, return the data about it.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostWebhooksInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostWebhooksInfo200Response> postWebhooksInfoWithHttpInfo(PostWebhooksInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWebhooksInfo");
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

        ParameterizedTypeReference<PostWebhooksInfo200Response> localReturnType = new ParameterizedTypeReference<PostWebhooksInfo200Response>() {};
        return apiClient.invokeAPI("/webhooks/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List webhooks
     * Get the list of all webhooks defined on the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostWebhooksList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostWebhooksList200ResponseInner> postWebhooksList(PostExportsListRequest body) throws RestClientException {
        return postWebhooksListWithHttpInfo(body).getBody();
    }

    /**
     * List webhooks
     * Get the list of all webhooks defined on the account.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostWebhooksList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostWebhooksList200ResponseInner>> postWebhooksListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWebhooksList");
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

        ParameterizedTypeReference<List<PostWebhooksList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostWebhooksList200ResponseInner>>() {};
        return apiClient.invokeAPI("/webhooks/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update webhook
     * Update an existing webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostWebhooksUpdate200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostWebhooksUpdate200Response postWebhooksUpdate(PostWebhooksUpdateRequest body) throws RestClientException {
        return postWebhooksUpdateWithHttpInfo(body).getBody();
    }

    /**
     * Update webhook
     * Update an existing webhook.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostWebhooksUpdate200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostWebhooksUpdate200Response> postWebhooksUpdateWithHttpInfo(PostWebhooksUpdateRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postWebhooksUpdate");
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

        ParameterizedTypeReference<PostWebhooksUpdate200Response> localReturnType = new ParameterizedTypeReference<PostWebhooksUpdate200Response>() {};
        return apiClient.invokeAPI("/webhooks/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
