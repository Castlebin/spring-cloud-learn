启动服务后 通过 $YOUR_HOST/zipkin/ 页面即可访问zipkin管理界面

@EnableZipkinServer 这种方式已经废弃，详情查看官方文档。

今后推荐直接使用docker或者已经编译好的jar来启动一个zipkin server即可

eg: zipkin-server-2.9.4-exec.jar

