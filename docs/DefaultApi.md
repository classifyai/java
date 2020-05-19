# DefaultApi

All URIs are relative to *https://api.classifyai.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewModel**](DefaultApi.md#createNewModel) | **PUT** /models | Create New Model
[**deleteModel**](DefaultApi.md#deleteModel) | **DELETE** /models | Delete Model
[**getModelsList**](DefaultApi.md#getModelsList) | **GET** /models | Get Models List
[**indexByImageUrl**](DefaultApi.md#indexByImageUrl) | **GET** /index_by_image_url | Index by Using Image URL
[**indexImage**](DefaultApi.md#indexImage) | **POST** /index_image | Index Local Image
[**tagImageByUrl**](DefaultApi.md#tagImageByUrl) | **GET** /predict_by_image_url | Tag Image by Using Image Url
[**tagLocalImage**](DefaultApi.md#tagLocalImage) | **POST** /predict | Predict by Image
[**updateModel**](DefaultApi.md#updateModel) | **POST** /models | Update Model


<a name="createNewModel"></a>
# **createNewModel**
> createNewModel(modelName)

Create New Model

Create a new custom image recognition model

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelName = {"model_name":"\"Test model name\""}; // String | Set a name for your model
    try {
      apiInstance.createNewModel(modelName);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#createNewModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelName** | **String**| Set a name for your model |

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully created |  -  |
**400** | Bad request, parameter or format error. Please check your query. |  -  |
**401** | You are not authorized to create a new model |  -  |

<a name="deleteModel"></a>
# **deleteModel**
> deleteModel(modelId)

Delete Model

Delete Model

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | You can find your model ids from Classify Dashboard.
    try {
      apiInstance.deleteModel(modelId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| You can find your model ids from Classify Dashboard. |

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully Deleted. |  -  |
**400** | Bad request, parameter or format error. please check your query. |  -  |
**401** | You are not authorized to delete this model. |  -  |

<a name="getModelsList"></a>
# **getModelsList**
> String getModelsList()

Get Models List

Get the list of of models created 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      String result = apiInstance.getModelsList();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getModelsList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Query executed succesfully. |  -  |
**401** | You don&#39;t have authorization to get the model list. |  -  |

<a name="indexByImageUrl"></a>
# **indexByImageUrl**
> String indexByImageUrl(modelId, imageUrl)

Index by Using Image URL

Index by Using Image URL

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | Model ID
    String imageUrl = "imageUrl_example"; // String | Image URL
    try {
      String result = apiInstance.indexByImageUrl(modelId, imageUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#indexByImageUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Model ID |
 **imageUrl** | **String**| Image URL |

### Return type

**String**

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Image Indexed |  -  |
**400** | Bad request, parameter or format error. Please check your query, image format and image size. |  -  |
**401** | You are not authorized for this operation. |  -  |

<a name="indexImage"></a>
# **indexImage**
> String indexImage(modelId, file)

Index Local Image

Index Local Image

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | Model ID
    File file = new File("/path/to/file"); // File | 
    try {
      String result = apiInstance.indexImage(modelId, file);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#indexImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Model ID |
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Image Indexed |  -  |
**400** | Bad request, parameter or format error. Please check your query, image format and image size. |  -  |
**401** | You are not authorized for this operation. |  -  |

<a name="tagImageByUrl"></a>
# **tagImageByUrl**
> tagImageByUrl(modelId, imageUrl)

Tag Image by Using Image Url

Predict image tags by providing image url

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | Type your trained model id to predict. You get your model's id from Classify Dashboard.
    String imageUrl = "imageUrl_example"; // String | Provide image url to predict
    try {
      apiInstance.tagImageByUrl(modelId, imageUrl);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tagImageByUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. |
 **imageUrl** | **String**| Provide image url to predict |

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom trained model prediction response. |  -  |
**400** | Bad request, parameter or format error. Please check your query, image format and image size. |  -  |
**401** | You are not authorized for this operation. |  -  |

<a name="tagLocalImage"></a>
# **tagLocalImage**
> tagLocalImage(modelId, file)

Predict by Image

Send a local image to tag

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelId = "modelId_example"; // String | Type your trained model id to predict. You get your model's id from Classify Dashboard.
    File file = new File("/path/to/file"); // File | 
    try {
      apiInstance.tagLocalImage(modelId, file);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tagLocalImage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Type your trained model id to predict. You get your model&#39;s id from Classify Dashboard. |
 **file** | **File**|  | [optional]

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Custom trained model prediction response. |  -  |
**400** | Bad request, parameter or format error. Please check your query, image format and image size. |  -  |
**401** | You are not authorized for this operation. |  -  |

<a name="updateModel"></a>
# **updateModel**
> updateModel(modelName, modelId)

Update Model

Update Model Name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.classifyai.com");
    
    // Configure API key authorization: x-api-key
    ApiKeyAuth x-api-key = (ApiKeyAuth) defaultClient.getAuthentication("x-api-key");
    x-api-key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //x-api-key.setApiKeyPrefix("Token");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String modelName = "modelName_example"; // String | Model Name
    String modelId = "modelId_example"; // String | Model id to be renamed.
    try {
      apiInstance.updateModel(modelName, modelId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateModel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelName** | **String**| Model Name |
 **modelId** | **String**| Model id to be renamed. |

### Return type

null (empty response body)

### Authorization

[x-api-key](../README.md#x-api-key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfull |  -  |
**400** | Bad request, parameter or format error. Please check your query. |  -  |
**401** | You are not authorized to edit this model. |  -  |

