

# PostMessagesSearchTimeSeriesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**query** | **String** | the search terms to find matching messages for |  [optional] |
|**dateFrom** | **OffsetDateTime** | start date |  [optional] |
|**dateTo** | **OffsetDateTime** | end date |  [optional] |
|**tags** | **List&lt;String&gt;** | an array of tag names to narrow the search to, will return messages that contain ANY of the tags |  [optional] |
|**senders** | **List&lt;String&gt;** | an array of sender addresses to narrow the search to, will return messages sent by ANY of the senders |  [optional] |



