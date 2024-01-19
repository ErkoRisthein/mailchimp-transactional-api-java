package io.github.erkoristhein.mailchimp.api;

import io.github.erkoristhein.mailchimp.ApiClient;

import io.github.erkoristhein.mailchimp.model.PostExportsActivity200Response;
import io.github.erkoristhein.mailchimp.model.PostExportsActivityRequest;
import io.github.erkoristhein.mailchimp.model.PostExportsInfo200Response;
import io.github.erkoristhein.mailchimp.model.PostExportsInfoRequest;
import io.github.erkoristhein.mailchimp.model.PostExportsList200ResponseInner;
import io.github.erkoristhein.mailchimp.model.PostExportsListRequest;
import io.github.erkoristhein.mailchimp.model.PostExportsRejects200Response;
import io.github.erkoristhein.mailchimp.model.PostExportsRejectsRequest;
import io.github.erkoristhein.mailchimp.model.PostExportsWhitelist200Response;

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
public class ExportsApi {
    private ApiClient apiClient;

    public ExportsApi() {
        this(new ApiClient());
    }

    public ExportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Export activity history
     * Begins an export of your activity history. The activity will be exported to a zip archive containing a single file named activity.csv in the same format as you would be able to export from your account&#39;s activity view. It includes the following fields: Date, Email Address, Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any custom metadata fields, they will be included in the exported data.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostExportsActivity200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostExportsActivity200Response postExportsActivity(PostExportsActivityRequest body) throws RestClientException {
        return postExportsActivityWithHttpInfo(body).getBody();
    }

    /**
     * Export activity history
     * Begins an export of your activity history. The activity will be exported to a zip archive containing a single file named activity.csv in the same format as you would be able to export from your account&#39;s activity view. It includes the following fields: Date, Email Address, Sender, Subject, Status, Tags, Opens, Clicks, Bounce Detail. If you have configured any custom metadata fields, they will be included in the exported data.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostExportsActivity200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostExportsActivity200Response> postExportsActivityWithHttpInfo(PostExportsActivityRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsActivity");
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

        ParameterizedTypeReference<PostExportsActivity200Response> localReturnType = new ParameterizedTypeReference<PostExportsActivity200Response>() {};
        return apiClient.invokeAPI("/exports/activity", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Export Allowlist
     * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostExportsWhitelist200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostExportsWhitelist200Response postExportsAllowlist(PostExportsRejectsRequest body) throws RestClientException {
        return postExportsAllowlistWithHttpInfo(body).getBody();
    }

    /**
     * Export Allowlist
     * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostExportsWhitelist200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostExportsWhitelist200Response> postExportsAllowlistWithHttpInfo(PostExportsRejectsRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsAllowlist");
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

        ParameterizedTypeReference<PostExportsWhitelist200Response> localReturnType = new ParameterizedTypeReference<PostExportsWhitelist200Response>() {};
        return apiClient.invokeAPI("/exports/allowlist", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View export info
     * Returns information about an export job. If the export job&#39;s state is &#39;complete&#39;, the returned data will include a URL you can use to fetch the results. Every export job produces a zip archive, but the format of the archive is distinct for each job type. The api calls that initiate exports include more details about the output format for that job type.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostExportsInfo200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostExportsInfo200Response postExportsInfo(PostExportsInfoRequest body) throws RestClientException {
        return postExportsInfoWithHttpInfo(body).getBody();
    }

    /**
     * View export info
     * Returns information about an export job. If the export job&#39;s state is &#39;complete&#39;, the returned data will include a URL you can use to fetch the results. Every export job produces a zip archive, but the format of the archive is distinct for each job type. The api calls that initiate exports include more details about the output format for that job type.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostExportsInfo200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostExportsInfo200Response> postExportsInfoWithHttpInfo(PostExportsInfoRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsInfo");
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

        ParameterizedTypeReference<PostExportsInfo200Response> localReturnType = new ParameterizedTypeReference<PostExportsInfo200Response>() {};
        return apiClient.invokeAPI("/exports/info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List exports
     * Returns a list of your exports.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return List&lt;PostExportsList200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PostExportsList200ResponseInner> postExportsList(PostExportsListRequest body) throws RestClientException {
        return postExportsListWithHttpInfo(body).getBody();
    }

    /**
     * List exports
     * Returns a list of your exports.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;List&lt;PostExportsList200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PostExportsList200ResponseInner>> postExportsListWithHttpInfo(PostExportsListRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsList");
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

        ParameterizedTypeReference<List<PostExportsList200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<PostExportsList200ResponseInner>>() {};
        return apiClient.invokeAPI("/exports/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Export denylist
     * Begins an export of your rejection denylist. The denylist will be exported to a zip archive containing a single file named rejects.csv that includes the following fields: email, reason, detail, created_at, expires_at, last_event_at, expires_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostExportsRejects200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostExportsRejects200Response postExportsRejects(PostExportsRejectsRequest body) throws RestClientException {
        return postExportsRejectsWithHttpInfo(body).getBody();
    }

    /**
     * Export denylist
     * Begins an export of your rejection denylist. The denylist will be exported to a zip archive containing a single file named rejects.csv that includes the following fields: email, reason, detail, created_at, expires_at, last_event_at, expires_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostExportsRejects200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostExportsRejects200Response> postExportsRejectsWithHttpInfo(PostExportsRejectsRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsRejects");
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

        ParameterizedTypeReference<PostExportsRejects200Response> localReturnType = new ParameterizedTypeReference<PostExportsRejects200Response>() {};
        return apiClient.invokeAPI("/exports/rejects", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Export Allowlist
     * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return PostExportsWhitelist200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostExportsWhitelist200Response postExportsWhitelist(PostExportsRejectsRequest body) throws RestClientException {
        return postExportsWhitelistWithHttpInfo(body).getBody();
    }

    /**
     * Export Allowlist
     * Begins an export of your rejection allowlist. The allowlist will be exported to a zip archive containing a single file named allowlist.csv that includes the following fields: email, detail, created_at.
     * <p><b>200</b> - 
     * @param body  (required)
     * @return ResponseEntity&lt;PostExportsWhitelist200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostExportsWhitelist200Response> postExportsWhitelistWithHttpInfo(PostExportsRejectsRequest body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling postExportsWhitelist");
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

        ParameterizedTypeReference<PostExportsWhitelist200Response> localReturnType = new ParameterizedTypeReference<PostExportsWhitelist200Response>() {};
        return apiClient.invokeAPI("/exports/whitelist", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
