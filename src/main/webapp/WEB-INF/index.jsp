<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--输出,条件,迭代标签库-->
<%--<%@ page isELIgnored="false"%> <!--支持EL表达式，不设的话，EL表达式不会解析--> --%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>

<html>
<head>
    <title>第一页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/datepicker/bootstrap-datetimepicker.min.css">
</head>
<script src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/static/datepicker/bootstrap-datetimepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/static/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/kindeditor-all.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/lang/zh_CN.js"></script>
<script src="${pageContext.request.contextPath}/static/kindeditor/plugins/code/prettify.js" ></script>
<script>
    KindEditor.ready(function (K) {
        var editor1 = K.create('textarea[name="article.content1"]', {
            cssPath: '${pageContext.request.contextPath}/static/kindeditor/plugins/code/prettify.css',
            uploadJson: '${pageContext.request.contextPath}/static/kindeditor/jsp/upload_json.jsp',
            fileManagerJson: '${pageContext.request.contextPath}/static/kindeditor/jsp/file_manager_json.jsp',
            allowFileManager: true,
            afterCreate: function () {
                var self = this;
                K.ctrl(document, 13, function () {
                    self.sync();
                    document.forms['example'].submit();
                });
                K.ctrl(self.edit.doc, 13, function () {
                    self.sync();
                    document.forms['example'].submit();
                });
            }
        });
        prettyPrint();
    });
</script>

<body>
<%--页面跳转与请求--%>
<div style="width:300px;height:150px;border: 1px solid black;">
    <%--点击按照发送ajax请求--%>
    <button id="btn">按钮</button>
    <%--点击跳转页面--%>
    <a class="btn btn-primary" href="<%=basePath%>home/index.action">dsa</a>
</div>
<div style="width:800px;height:150px;border: 1px solid black;">
    <p>日期插件：</p>
    <div class="form-group">
        <label for="at" class="col-sm-2 control-label">发布时间</label>
        <div class="col-sm-8 input-group date form_datetime " style="padding-left: 16px;padding-right: 16px;"
             data-date="1979-09-16T05:25:07Z" data-date-format="dd MM yyyy - HH:ii p" data-link-field="at">
            <input type="text" size="16" readonly class="form-control" value="" data-parsley-required="true">
            <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
            <span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
        </div>
        <input type="hidden" id="at" name="at" value=""/>
    </div>
</div>
<div style="width:800px;height:400px;border: 1px solid black;">
    <p>富文本插件：</p>
    <div id="mainContent">
        <form name="example" method="post" action="article_add.action">
            题目：
            <input type="text" name="article.title">
            <br/>
            内容：
            <textarea name="article.content1" cols="100" rows="8"></textarea>
            <br/>
            <input type="submit" name="button" value="提交"/>
            (提交快捷键: Ctrl + Enter)
        </form>
    </div>
</div>
</body>
<script>

    $("body").on("click", "#btn", function () {
        $.get(
            "<%=basePath%>home/index.action",
            "",
            function (data) {

            },
            "html"
        );
    });
</script>
<%--日期插件初始化--%>
<script>
    $(document).ready(function () {
        $('.form_datetime').datetimepicker({
            language: 'zh-CN',
            format:'yyyy-mm-dd hh:ii:ss',
            weekStart: 1,
            todayBtn: 1,
            autoclose: 1,
            todayHighlight: 1,
            startView: 2,
            forceParse: 0,
            showMeridian: 1
        });});
</script>
</html>
