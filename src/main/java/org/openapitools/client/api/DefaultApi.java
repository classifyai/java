/*
 * Classify
 * Classify Custom Image Recognition Service
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@inoven.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createNewModel
     * @param modelName Set a name for your model (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to create a new model </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNewModelCall(String modelName, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_name", modelName));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createNewModelValidateBeforeCall(String modelName, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'modelName' is set
        if (modelName == null) {
            throw new ApiException("Missing the required parameter 'modelName' when calling createNewModel(Async)");
        }
        

        okhttp3.Call localVarCall = createNewModelCall(modelName, _callback);
        return localVarCall;

    }

    /**
     * Create New Model
     * Create a new custom image recognition model
     * @param modelName Set a name for your model (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to create a new model </td><td>  -  </td></tr>
     </table>
     */
    public void createNewModel(String modelName) throws ApiException {
        createNewModelWithHttpInfo(modelName);
    }

    /**
     * Create New Model
     * Create a new custom image recognition model
     * @param modelName Set a name for your model (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to create a new model </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> createNewModelWithHttpInfo(String modelName) throws ApiException {
        okhttp3.Call localVarCall = createNewModelValidateBeforeCall(modelName, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create New Model (asynchronously)
     * Create a new custom image recognition model
     * @param modelName Set a name for your model (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to create a new model </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createNewModelAsync(String modelName, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = createNewModelValidateBeforeCall(modelName, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteModel
     * @param modelId You can find your model ids from Classify Dashboard. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to delete this model. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteModelCall(String modelId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_id", modelId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteModelValidateBeforeCall(String modelId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling deleteModel(Async)");
        }
        

        okhttp3.Call localVarCall = deleteModelCall(modelId, _callback);
        return localVarCall;

    }

    /**
     * Delete Model
     * Delete Model
     * @param modelId You can find your model ids from Classify Dashboard. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to delete this model. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteModel(String modelId) throws ApiException {
        deleteModelWithHttpInfo(modelId);
    }

    /**
     * Delete Model
     * Delete Model
     * @param modelId You can find your model ids from Classify Dashboard. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to delete this model. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteModelWithHttpInfo(String modelId) throws ApiException {
        okhttp3.Call localVarCall = deleteModelValidateBeforeCall(modelId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Model (asynchronously)
     * Delete Model
     * @param modelId You can find your model ids from Classify Dashboard. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Deleted. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to delete this model. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteModelAsync(String modelId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteModelValidateBeforeCall(modelId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getModelsList
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Query executed succesfully. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No projects created yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You don&#39;t have authorization to get the model list. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getModelsListCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getModelsListValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getModelsListCall(_callback);
        return localVarCall;

    }

    /**
     * Get Models List
     * Get the list of of models created 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Query executed succesfully. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No projects created yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You don&#39;t have authorization to get the model list. </td><td>  -  </td></tr>
     </table>
     */
    public void getModelsList() throws ApiException {
        getModelsListWithHttpInfo();
    }

    /**
     * Get Models List
     * Get the list of of models created 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Query executed succesfully. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No projects created yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You don&#39;t have authorization to get the model list. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> getModelsListWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getModelsListValidateBeforeCall(null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Get Models List (asynchronously)
     * Get the list of of models created 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Query executed succesfully. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> No projects created yet. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You don&#39;t have authorization to get the model list. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getModelsListAsync(final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = getModelsListValidateBeforeCall(_callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagImageByUrl
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param imageUrl Provide image url to predict (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagImageByUrlCall(String modelId, String imageUrl, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/predict_by_image_url";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_id", modelId));
        }

        if (imageUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("image_url", imageUrl));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagImageByUrlValidateBeforeCall(String modelId, String imageUrl, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling tagImageByUrl(Async)");
        }
        
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new ApiException("Missing the required parameter 'imageUrl' when calling tagImageByUrl(Async)");
        }
        

        okhttp3.Call localVarCall = tagImageByUrlCall(modelId, imageUrl, _callback);
        return localVarCall;

    }

    /**
     * Tag Image by Using Image Url
     * Predict image tags by providing image url
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param imageUrl Provide image url to predict (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public void tagImageByUrl(String modelId, String imageUrl) throws ApiException {
        tagImageByUrlWithHttpInfo(modelId, imageUrl);
    }

    /**
     * Tag Image by Using Image Url
     * Predict image tags by providing image url
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param imageUrl Provide image url to predict (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> tagImageByUrlWithHttpInfo(String modelId, String imageUrl) throws ApiException {
        okhttp3.Call localVarCall = tagImageByUrlValidateBeforeCall(modelId, imageUrl, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Tag Image by Using Image Url (asynchronously)
     * Predict image tags by providing image url
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param imageUrl Provide image url to predict (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagImageByUrlAsync(String modelId, String imageUrl, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagImageByUrlValidateBeforeCall(modelId, imageUrl, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for tagLocalImage
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param file  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagLocalImageCall(String modelId, File file, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/predict";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_id", modelId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null) {
            localVarFormParams.put("file", file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call tagLocalImageValidateBeforeCall(String modelId, File file, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling tagLocalImage(Async)");
        }
        

        okhttp3.Call localVarCall = tagLocalImageCall(modelId, file, _callback);
        return localVarCall;

    }

    /**
     * Predict by Image
     * Send a local image to tag
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param file  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public void tagLocalImage(String modelId, File file) throws ApiException {
        tagLocalImageWithHttpInfo(modelId, file);
    }

    /**
     * Predict by Image
     * Send a local image to tag
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param file  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> tagLocalImageWithHttpInfo(String modelId, File file) throws ApiException {
        okhttp3.Call localVarCall = tagLocalImageValidateBeforeCall(modelId, file, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Predict by Image (asynchronously)
     * Send a local image to tag
     * @param modelId Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. (required)
     * @param file  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Custom trained model prediction response. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query, image format and image size. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized for this operation. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call tagLocalImageAsync(String modelId, File file, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = tagLocalImageValidateBeforeCall(modelId, file, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateModel
     * @param modelName Model Name (required)
     * @param modelId Model id to be renamed. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfull </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to edit this model. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateModelCall(String modelName, String modelId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (modelName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_name", modelName));
        }

        if (modelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_id", modelId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "x-api-key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateModelValidateBeforeCall(String modelName, String modelId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'modelName' is set
        if (modelName == null) {
            throw new ApiException("Missing the required parameter 'modelName' when calling updateModel(Async)");
        }
        
        // verify the required parameter 'modelId' is set
        if (modelId == null) {
            throw new ApiException("Missing the required parameter 'modelId' when calling updateModel(Async)");
        }
        

        okhttp3.Call localVarCall = updateModelCall(modelName, modelId, _callback);
        return localVarCall;

    }

    /**
     * Update Model
     * Update Model Name
     * @param modelName Model Name (required)
     * @param modelId Model id to be renamed. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfull </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to edit this model. </td><td>  -  </td></tr>
     </table>
     */
    public void updateModel(String modelName, String modelId) throws ApiException {
        updateModelWithHttpInfo(modelName, modelId);
    }

    /**
     * Update Model
     * Update Model Name
     * @param modelName Model Name (required)
     * @param modelId Model id to be renamed. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfull </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to edit this model. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> updateModelWithHttpInfo(String modelName, String modelId) throws ApiException {
        okhttp3.Call localVarCall = updateModelValidateBeforeCall(modelName, modelId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Update Model (asynchronously)
     * Update Model Name
     * @param modelName Model Name (required)
     * @param modelId Model id to be renamed. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfull </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request, parameter or format error. Please check your query. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> You are not authorized to edit this model. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateModelAsync(String modelName, String modelId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateModelValidateBeforeCall(modelName, modelId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}