

# CreateHookOption

CreateHookOption options when create a hook

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**authorizationHeader** | **String** |  |  [optional] |
|**branchFilter** | **String** |  |  [optional] |
|**config** | **Map&lt;String, String&gt;** | CreateHookOptionConfig has all config options in it required are \&quot;content_type\&quot; and \&quot;url\&quot; Required |  |
|**events** | **List&lt;String&gt;** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FORGEJO | &quot;forgejo&quot; |
| DINGTALK | &quot;dingtalk&quot; |
| DISCORD | &quot;discord&quot; |
| GITEA | &quot;gitea&quot; |
| GOGS | &quot;gogs&quot; |
| MSTEAMS | &quot;msteams&quot; |
| SLACK | &quot;slack&quot; |
| TELEGRAM | &quot;telegram&quot; |
| FEISHU | &quot;feishu&quot; |
| WECHATWORK | &quot;wechatwork&quot; |
| PACKAGIST | &quot;packagist&quot; |



