

# PostTemplatesRenderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**templateName** | **String** | the immutable name of a template that exists in the user&#39;s account |  |
|**templateContent** | [**List&lt;PostTemplatesRenderRequestTemplateContentInner&gt;**](PostTemplatesRenderRequestTemplateContentInner.md) | an array of template content to render. Each item in the array should be a struct with two keys - name: the name of the content block to set the content for, and content: the actual content to put into the block |  |
|**mergeVars** | [**List&lt;PostTemplatesRenderRequestMergeVarsInner&gt;**](PostTemplatesRenderRequestMergeVarsInner.md) | optional merge variables to use for injecting merge field content. If this is not provided, no merge fields will be replaced. |  [optional] |



