/*
 * Phone.com API
 * This is a Phone.com api Swagger definition
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apisupport@phone.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.ApplicationFull;
import io.swagger.client.model.ListApplications;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationsApi {
    private ApiClient apiClient;

    public ApplicationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getAccountApplication */
    private com.squareup.okhttp.Call getAccountApplicationCall(Integer accountId, Integer applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/applications/{application_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()))
        .replaceAll("\\{" + "application_id" + "\\}", apiClient.escapeString(applicationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAccountApplicationValidateBeforeCall(Integer accountId, Integer applicationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getAccountApplication(Async)");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new ApiException("Missing the required parameter 'applicationId' when calling getAccountApplication(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getAccountApplicationCall(accountId, applicationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Show details of an individual application
     * 
     * @param accountId Account ID (required)
     * @param applicationId Application ID (required)
     * @return ApplicationFull
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationFull getAccountApplication(Integer accountId, Integer applicationId) throws ApiException {
        ApiResponse<ApplicationFull> resp = getAccountApplicationWithHttpInfo(accountId, applicationId);
        return resp.getData();
    }

    /**
     * Show details of an individual application
     * 
     * @param accountId Account ID (required)
     * @param applicationId Application ID (required)
     * @return ApiResponse&lt;ApplicationFull&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationFull> getAccountApplicationWithHttpInfo(Integer accountId, Integer applicationId) throws ApiException {
        com.squareup.okhttp.Call call = getAccountApplicationValidateBeforeCall(accountId, applicationId, null, null);
        Type localVarReturnType = new TypeToken<ApplicationFull>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Show details of an individual application (asynchronously)
     * 
     * @param accountId Account ID (required)
     * @param applicationId Application ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAccountApplicationAsync(Integer accountId, Integer applicationId, final ApiCallback<ApplicationFull> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAccountApplicationValidateBeforeCall(accountId, applicationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationFull>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAccountApplications */
    private com.squareup.okhttp.Call listAccountApplicationsCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/accounts/{account_id}/applications".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "account_id" + "\\}", apiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filtersId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[id]", filtersId));
        if (filtersName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "filters[name]", filtersName));
        if (sortId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[id]", sortId));
        if (sortName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[name]", sortName));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (fields != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAccountApplicationsValidateBeforeCall(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling listAccountApplications(Async)");
        }
        
        
        com.squareup.okhttp.Call call = listAccountApplicationsCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of applications you have defined
     * Get a list of an account available applications
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ListApplications
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListApplications listAccountApplications(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        ApiResponse<ListApplications> resp = listAccountApplicationsWithHttpInfo(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields);
        return resp.getData();
    }

    /**
     * Get a list of applications you have defined
     * Get a list of an account available applications
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @return ApiResponse&lt;ListApplications&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListApplications> listAccountApplicationsWithHttpInfo(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields) throws ApiException {
        com.squareup.okhttp.Call call = listAccountApplicationsValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, null, null);
        Type localVarReturnType = new TypeToken<ListApplications>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of applications you have defined (asynchronously)
     * Get a list of an account available applications
     * @param accountId Account ID (required)
     * @param filtersId ID filter (optional)
     * @param filtersName Name filter (optional)
     * @param sortId ID sorting (optional)
     * @param sortName Name sorting (optional)
     * @param limit Max results (optional)
     * @param offset Results to skip (optional)
     * @param fields Field set (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAccountApplicationsAsync(Integer accountId, List<String> filtersId, List<String> filtersName, String sortId, String sortName, Integer limit, Integer offset, String fields, final ApiCallback<ListApplications> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listAccountApplicationsValidateBeforeCall(accountId, filtersId, filtersName, sortId, sortName, limit, offset, fields, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListApplications>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
