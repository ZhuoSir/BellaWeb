<!DOCTYPE html>
<html lang="en">
<head>
    <title>登录</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- 移动设备 -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- 引入 Bootstrap -->
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/nav.css">
    <link rel="stylesheet" type="text/css" href="/css/base.css">
    <link rel="stylesheet" type="text/css" href="/css/color.css">
    <link rel="stylesheet" type="text/css" href="/css/login.css">

    <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<div id="login">
    <h1>Bella</h1>
    <form method="post" action="domain.html">
        <input type="text" placeholder="用户名" name="u"/>
        <input type="password" placeholder="密码" name="p"/>
        <button class="but but-blue" type="submit">登录</button>
        <button class="reg reg-green" type="button">注册</button>
        <a class="right">忘记密码</a>
    </form>
</div>

<!-- 包括所有已编译的插件 -->
<script src="/js/jquery.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript">

    $(".reg").click(function () {
        window.location.href = "register.html";
    });

</script>
</body>
</html>