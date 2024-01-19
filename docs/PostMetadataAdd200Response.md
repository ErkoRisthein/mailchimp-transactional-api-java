

# PostMetadataAdd200Response

the information saved about the new metadata field

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | the unique identifier of the metadata field to update |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | the current state of the metadata field |  [optional] |
|**viewTemplate** | **String** | Mustache template to control how the metadata is rendered in your activity log |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DELETE | &quot;delete&quot; |
| INDEX | &quot;index&quot; |



