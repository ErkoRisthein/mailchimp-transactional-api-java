

# PostIpsSetPool200Response

Information about the updated state of the dedicated IP

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ip** | **String** | the ip address |  [optional] |
|**createdAt** | **OffsetDateTime** | the date and time that the dedicated IP was created as a UTC string in YYYY-MM-DD HH:MM:SS format |  [optional] |
|**pool** | **String** | the name of the pool that this dedicated IP belongs to |  [optional] |
|**domain** | **String** | the domain name (reverse dns) of this dedicated IP |  [optional] |
|**customDns** | [**PostIpsList200ResponseInnerCustomDns**](PostIpsList200ResponseInnerCustomDns.md) |  |  [optional] |
|**warmup** | [**PostIpsList200ResponseInnerWarmup**](PostIpsList200ResponseInnerWarmup.md) |  |  [optional] |



