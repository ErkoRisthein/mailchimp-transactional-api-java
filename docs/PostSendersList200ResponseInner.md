

# PostSendersList200ResponseInner

the information on each sending address in the account

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | the sender&#39;s email address |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the sender was first seen by Mandrill as a UTC date string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**sent** | **Integer** | the total number of messages sent by this sender |  [optional] |
|**hardBounces** | **Integer** | the total number of hard bounces by messages by this sender |  [optional] |
|**softBounces** | **Integer** | the total number of soft bounces by messages by this sender |  [optional] |
|**rejects** | **Integer** | the total number of rejected messages by this sender |  [optional] |
|**complaints** | **Integer** | the total number of spam complaints received for messages by this sender |  [optional] |
|**unsubs** | **Integer** | the total number of unsubscribe requests received for messages by this sender |  [optional] |
|**opens** | **Integer** | the total number of times messages by this sender have been opened |  [optional] |
|**clicks** | **Integer** | the total number of times tracked URLs in messages by this sender have been clicked |  [optional] |
|**uniqueOpens** | **Integer** | the number of unique opens for emails sent for this sender |  [optional] |
|**uniqueClicks** | **Integer** | the number of unique clicks for emails sent for this sender |  [optional] |



