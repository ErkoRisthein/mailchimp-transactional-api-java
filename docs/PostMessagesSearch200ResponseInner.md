

# PostMessagesSearch200ResponseInner

the information for a single matching message

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ts** | **Integer** | the Unix timestamp from when this message was sent |  [optional] |
|**id** | **String** | the message&#39;s unique id |  [optional] |
|**sender** | **String** | the email address of the sender |  [optional] |
|**template** | **String** | the unique name of the template used, if any |  [optional] |
|**subject** | **String** | the message&#39;s subject line |  [optional] |
|**email** | **String** | the recipient email address |  [optional] |
|**tags** | **List&lt;String&gt;** | list of tags on this message |  [optional] |
|**opens** | **Integer** | how many times has this message been opened |  [optional] |
|**opensDetail** | [**List&lt;PostMessagesSearch200ResponseInnerOpensDetailInner&gt;**](PostMessagesSearch200ResponseInnerOpensDetailInner.md) | list of individual opens for the message |  [optional] |
|**clicks** | **Integer** | how many times has a link been clicked in this message |  [optional] |
|**clicksDetail** | [**List&lt;PostMessagesSearch200ResponseInnerClicksDetailInner&gt;**](PostMessagesSearch200ResponseInnerClicksDetailInner.md) | list of individual clicks for the message |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | sending status of this message |  [optional] |
|**metadata** | **Object** | any custom metadata provided when the message was sent |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| SENT | &quot;sent&quot; |
| BOUNCED | &quot;bounced&quot; |
| REJECTED | &quot;rejected&quot; |



