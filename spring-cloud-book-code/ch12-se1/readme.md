启动服务后 通过 $YOUR_HOST/zipkin/ 页面即可访问zipkin管理界面

@EnableZipkinServer 这种方式已经废弃，详情查看官方文档。

今后推荐直接使用docker或者已经编译好的jar来启动一个zipkin server即可

eg: zipkin-server-2.9.4-exec.jar


Zipkin 服务端

关于 Zipkin 的服务端，在使用 Spring Boot 2.x 版本后，官方就不推荐自行定制编译了，反而是直接提供了编译好的 jar 包来给我们使用，详情请看 upgrade to Spring Boot 2.0 NoClassDefFoundError UndertowEmbeddedServletContainerFactory · Issue #1962 · openzipkin/zipkin · GitHub

并且以前的@EnableZipkinServer也已经被打上了@Deprecated

If you decide to make a custom server, you accept responsibility for troubleshooting your build or configuration problems, even if such problems are a reaction to a change made by the OpenZipkin maintainers. In other words, custom servers are possible, but not supported.

EnableZipkinServer.javagithub.com/openzipkin/zipkin/blob/master/zipkin-server/src/main/java/zipkin/server/EnableZipkinServer.java
 

简而言之就是：私自改包，后果自负。

所以官方提供了一键脚本

复制
1
2
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
 

如果用 Docker 的话，直接

复制
1
docker run -d -p 9411:9411 openzipkin/zipkin
 

任一方式启动后，访问 http://localhost:9411/zipkin/ 就能看到界面了



