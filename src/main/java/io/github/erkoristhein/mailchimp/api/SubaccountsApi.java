package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;
import io.github.erkoristhein.mailchimp.BaseApi;

import io.github.erkoristhein.mailchimp.model.PostSubaccountsAdd200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsAddRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsDelete200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsDeleteRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsListRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsPause200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsPauseRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsResume200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsResumeRequest;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsUpdate200Response;
import io.github.erkoristhein.mailchimp.model.PostSubaccountsUpdateRequest;

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
public class SubaccountsApi extends BaseApi {

    public SubaccountsApi() {
        super(new ApiClient());
    }

    public SubaccountsApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Add subaccount
     * Add a new subaccount.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsAdd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsAdd200Response postSubaccountsAdd(PostSubaccountsAddRequest body) throws RestClientException {
        return postSubaccountsAddWithHttpInfo(body).getBody();
    }

    /**
     * Add subaccount
     * Add a new subaccount.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsAdd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsAdd200Response> postSubaccountsAddWithHttpInfo(PostSubaccountsAddRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsAdd");
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

        ParameterizedTypeReference<PostSubaccountsAdd200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsAdd200Response>() {};
        return apiClient.invokeAPI("/subaccounts/add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete subaccount
     * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsDelete200Response postSubaccountsDelete(PostSubaccountsDeleteRequest body) throws RestClientException {
        return postSubaccountsDeleteWithHttpInfo(body).getBody();
    }

    /**
     * Delete subaccount
     * Delete an existing subaccount. Any email related to the subaccount will be saved, but stats will be removed and any future sending calls to this subaccount will fail.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsDelete200Response> postSubaccountsDeleteWithHttpInfo(PostSubaccountsDeleteRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsDelete");
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

        ParameterizedTypeReference<PostSubaccountsDelete200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsDelete200Response>() {};
        return apiClient.invokeAPI("/subaccounts/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get subaccount info
     * Given the ID of an existing subaccount, return the data about it.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsInfo200Response postSubaccountsInfo(PostSubaccountsInfoRequest body) throws RestClientException {
        return postSubaccountsInfoWithHttpInfo(body).getBody();
    }

    /**
     * Get subaccount info
     * Given the ID of an existing subaccount, return the data about it.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsInfo200Response> postSubaccountsInfoWithHttpInfo(PostSubaccountsInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsInfo");
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

        ParameterizedTypeReference<PostSubaccountsInfo200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsInfo200Response>() {};
        return apiClient.invokeAPI("/subaccounts/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List subaccounts
     * Get the list of subaccounts defined for the account, optionally filtered by a prefix.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostSubaccountsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostSubaccountsList200ResponseInner> postSubaccountsList(PostSubaccountsListRequest body) throws RestClientException {
        return postSubaccountsListWithHttpInfo(body).getBody();
    }

    /**
     * List subaccounts
     * Get the list of subaccounts defined for the account, optionally filtered by a prefix.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostSubaccountsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostSubaccountsList200ResponseInner>> postSubaccountsListWithHttpInfo(PostSubaccountsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsList");
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

        ParameterizedTypeReference<List<PostSubaccountsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostSubaccountsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/subaccounts/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pause subaccount
     * Pause a subaccount&#39;s sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsPause200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsPause200Response postSubaccountsPause(PostSubaccountsPauseRequest body) throws RestClientException {
        return postSubaccountsPauseWithHttpInfo(body).getBody();
    }

    /**
     * Pause subaccount
     * Pause a subaccount&#39;s sending. Any future emails delivered to this subaccount will be queued for a maximum of 3 days until the subaccount is resumed.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsPause200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsPause200Response> postSubaccountsPauseWithHttpInfo(PostSubaccountsPauseRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsPause");
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

        ParameterizedTypeReference<PostSubaccountsPause200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsPause200Response>() {};
        return apiClient.invokeAPI("/subaccounts/pause", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Resume subaccount
     * Resume a paused subaccount&#39;s sending.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsResume200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsResume200Response postSubaccountsResume(PostSubaccountsResumeRequest body) throws RestClientException {
        return postSubaccountsResumeWithHttpInfo(body).getBody();
    }

    /**
     * Resume subaccount
     * Resume a paused subaccount&#39;s sending.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsResume200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsResume200Response> postSubaccountsResumeWithHttpInfo(PostSubaccountsResumeRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsResume");
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

        ParameterizedTypeReference<PostSubaccountsResume200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsResume200Response>() {};
        return apiClient.invokeAPI("/subaccounts/resume", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update subaccount
     * Update an existing subaccount.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostSubaccountsUpdate200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostSubaccountsUpdate200Response postSubaccountsUpdate(PostSubaccountsUpdateRequest body) throws RestClientException {
        return postSubaccountsUpdateWithHttpInfo(body).getBody();
    }

    /**
     * Update subaccount
     * Update an existing subaccount.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostSubaccountsUpdate200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostSubaccountsUpdate200Response> postSubaccountsUpdateWithHttpInfo(PostSubaccountsUpdateRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postSubaccountsUpdate");
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

        ParameterizedTypeReference<PostSubaccountsUpdate200Response> localReturnType = new ParameterizedTypeReference<PostSubaccountsUpdate200Response>() {};
        return apiClient.invokeAPI("/subaccounts/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
