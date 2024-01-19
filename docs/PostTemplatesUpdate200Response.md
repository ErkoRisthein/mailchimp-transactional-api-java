

# PostTemplatesUpdate200Response

the template that was updated

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**slug** | **String** | the immutable unique code name of the template |  [optional] |
|**name** | **String** | the name of the template |  [optional] |
|**labels** | **List&lt;String&gt;** | the list of labels applied to the template |  [optional] |
|**code** | **String** | the full HTML code of the template, with mc:edit attributes marking the editable elements - draft version |  [optional] |
|**subject** | **String** | the subject line of the template, if provided - draft version |  [optional] |
|**fromEmail** | **String** | the default sender address for the template, if provided - draft version |  [optional] |
|**fromName** | **String** | the default sender from name for the template, if provided - draft version |  [optional] |
|**text** | **String** | the default text part of messages sent with the template, if provided - draft version |  [optional] |
|**publishName** | **String** | the same as the template name - kept as a separate field for backwards compatibility |  [optional] |
|**publishCode** | **String** | the full HTML code of the template, with mc:edit attributes marking the editable elements that are available as published, if it has been published |  [optional] |
|**publishSubject** | **String** | the subject line of the template, if provided |  [optional] |
|**publishFromEmail** | **String** | the default sender address for the template, if provided |  [optional] |
|**publishFromName** | **String** | the default sender from name for the template, if provided |  [optional] |
|**publishText** | **String** | the default text part of messages sent with the template, if provided |  [optional] |
|**publishedAt** | **OffsetDateTime** | the date and time the template was last published as a UTC string in YYYY-MM-DD HH:MM:SS format, or null if it has not been published |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time the template was first created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**updatedAt** | **OffsetDateTime** | the date and time the template was last modified as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**isBrokenTemplate** | **Boolean** | indicates if the template is malformed or corrupt |  [optional] |



