

# PostTemplatesUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**name** | **String** | the immutable name of an existing template |  |
|**fromEmail** | **String** | the new default sending address |  [optional] |
|**fromName** | **String** | the new default from name |  [optional] |
|**subject** | **String** | the new default subject line |  [optional] |
|**code** | **String** | the new code for the template |  [optional] |
|**text** | **String** | the new default text part to be used |  [optional] |
|**publish** | **Boolean** | set to false to update the draft version of the template without publishing |  [optional] |
|**labels** | **List&lt;String&gt;** | an optional array of up to 10 labels to use for filtering templates |  [optional] |



