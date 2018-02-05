<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
用例列表
<table>
    <tr>
        <th>用例名称</th>
        <th>操作</th>
    </tr>
    <#list caseList as case>
        <tr>
            <th>${case.name}</th>
            <th><a href="${request.contextPath}${case.url}">执行</a></th>
        </tr>
    </#list>
</table>

</body>
</html>