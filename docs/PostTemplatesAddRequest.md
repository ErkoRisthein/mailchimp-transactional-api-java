

# PostTemplatesAddRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**name** | **String** | the name for the new template - must be unique |  |
|**fromEmail** | **String** | a default sending address for emails sent using this template |  [optional] |
|**fromName** | **String** | a default from name to be used |  [optional] |
|**subject** | **String** | a default subject line to be used |  [optional] |
|**code** | **String** | the HTML code for the template with mc:edit attributes for the editable elements |  [optional] |
|**text** | **String** | a default text part to be used when sending with this template |  [optional] |
|**publish** | **Boolean** | set to false to add a draft template without publishing |  [optional] |
|**labels** | **List&lt;String&gt;** | an optional array of up to 10 labels to use for filtering templates |  [optional] |



