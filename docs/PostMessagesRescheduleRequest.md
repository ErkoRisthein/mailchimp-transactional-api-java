

# PostMessagesRescheduleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | a valid api key |  |
|**id** | **String** | a scheduled email id, as returned by any of the messages/send calls or messages/list-scheduled |  |
|**sendAt** | **OffsetDateTime** | the new UTC timestamp when the message should sent. Mandrill can&#39;t time travel, so if you specify a time in past the message will be sent immediately; for future dates, you&#39;re limited to one year from the date of scheduling. |  |



