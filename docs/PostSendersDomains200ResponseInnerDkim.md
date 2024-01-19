

# PostSendersDomains200ResponseInnerDkim

details about the domain's DKIM record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**valid** | **Boolean** | whether the domain&#39;s DKIM record is valid for use with Mandrill |  [optional] |
|**validAfter** | **OffsetDateTime** | when the domain&#39;s DKIM record will be considered valid for use with Mandrill as a UTC string in YYYY-MM-DD HH:MM:SS format. If set, this indicates that the record is valid now, but was previously invalid, and Mandrill will wait until the record&#39;s TTL elapses to start using it. |  [optional] |
|**error** | **String** | an error describing the DKIM record, or null if the record is correct |  [optional] |



