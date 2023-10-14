
# ChangeFileOperation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | **String** | new or updated file content, must be base64 encoded |  [optional]
**fromPath** | **String** | old path of the file to move |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) | indicates what to do with the file | 
**path** | **String** | path to the existing or new file | 
**sha** | **String** | sha is the SHA for the file that already exists, required for update or delete |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CREATE | &quot;create&quot;
UPDATE | &quot;update&quot;
DELETE | &quot;delete&quot;



