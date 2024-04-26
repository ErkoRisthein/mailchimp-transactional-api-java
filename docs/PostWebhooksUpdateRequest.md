

# PostWebhooksUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**id** | **BigDecimal** | the unique identifier of a webhook belonging to this account |  |
|**url** | **String** | the URL to POST batches of events. Requires webhook to exist. |  |
|**description** | **String** | an optional description of the webhook |  [optional] |
|**events** | **List&lt;Object&gt;** | an optional list of events that will be posted to the webhook |  [optional] |



