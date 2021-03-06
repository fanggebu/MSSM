<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--输出,条件,迭代标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%>
<!--数据格式化标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%>
<!--数据库相关标签库-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%>
<!--常用函数标签库-->
<%@ page isELIgnored="false"%>
<!--支持EL表达式，不设的话，EL表达式不会解析-->
 
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户管理列表</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/layui/layui/css/layui.css"
	media="all">
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body style="width:1060px;height:600px;">
	<h1>用户</h1>
	<table class="layui-hide" id="test" lay-filter="test"></table>

	<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
  </div>
</script>

	<script type="text/html" id="barDemo">
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>


	<script
		src="${pageContext.request.contextPath}/static/layui/layui/layui.js"
		charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

	<script>
		layui.use('table', function() {
			var table = layui.table;

			table.render({
				elem : '#test',
				url : '${pageContext.request.contextPath}/user/user_list.action',
				toolbar : '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
				,
				defaultToolbar : [ 'filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
					title : '提示',
					layEvent : 'LAYTABLE_TIPS',
					icon : 'layui-icon-tips'
				} ],
				title : '用户数据表',
				cols: [[
					{type : 'checkbox',fixed : 'left'},
				      {field:'id', width:80, title: 'ID', sort: true}
				      ,{field:'username', width:80, title: '用户名'}
				      ,{field:'sex', width:80, title: '性别', sort: true}
				      ,{field:'city', width:80, title: '城市'}
				      ,{field:'sign', title: '签名', minWidth: 150}
				      ,{field:'head_image', width:80, title: '头像', sort: true}
				      ,{field:'classify', width:80, title: '职业'}
				      ,{fixed : 'right',title : '操作',toolbar : '#barDemo',width : 150}
				    ]],
				/* cols : [ [ {
					type : 'checkbox',
					fixed : 'left'
				}, {
					field : 'id',
					title : 'ID',
					width : 80,
					fixed : 'left',
					unresize : true,
					sort : true
				}, {
					field : 'username',
					title : '用户名',
					width : 120,
					edit : 'text'
				}, {
					field : 'email',
					title : '邮箱',
					width : 150,
					edit : 'text',
					templet : function(res) {
						return '<em>' + res.email + '</em>'
					}
				}, {
					field : 'sex',
					title : '性别',
					width : 80,
					edit : 'text',
					sort : true
				}, {
					field : 'city',
					title : '城市',
					width : 100
				}, {
					field : 'sign',
					title : '签名'
				}, {
					field : 'experience',
					title : '积分',
					width : 80,
					sort : true
				}, {
					field : 'ip',
					title : 'IP',
					width : 120
				}, {
					field : 'logins',
					title : '登入次数',
					width : 100,
					sort : true
				}, {
					field : 'joinTime',
					title : '加入时间',
					width : 120
				}, {
					fixed : 'right',
					title : '操作',
					toolbar : '#barDemo',
					width : 150
				} ] ], */
				page : true
			});

			//头工具栏事件
			table.on('toolbar(test)', function(obj) {
				var checkStatus = table.checkStatus(obj.config.id);
				switch (obj.event) {
				case 'getCheckData':
					var data = checkStatus.data;
					layer.alert(JSON.stringify(data));
					break;
				case 'getCheckLength':
					var data = checkStatus.data;
					layer.msg('选中了：' + data.length + ' 个');
					break;
				case 'isAll':
					layer.msg(checkStatus.isAll ? '全选' : '未全选');
					break;

				//自定义头工具栏右侧图标 - 提示
				case 'LAYTABLE_TIPS':
					layer.alert('这是工具栏右侧自定义的一个图标按钮');
					break;
				}
				;
			});

			//监听行工具事件
			table.on('tool(test)', function(obj) {
				var data = obj.data;
				//console.log(obj)
				if (obj.event === 'del') {
					layer.confirm('真的删除行么', function(index) {
						obj.del();
						layer.close(index);
					});
				} else if (obj.event === 'edit') {
					layer.prompt({
						formType : 2,
						value : data.email
					}, function(value, index) {
						obj.update({
							email : value
						});
						layer.close(index);
					});
				}
			});
		});
	</script>

</body>
</html>