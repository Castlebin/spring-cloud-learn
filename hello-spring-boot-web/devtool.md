加入了devtools，IDEA默认不生效，需要配置：

IDEA配置：

当我们修改了Java类后，IDEA默认是不自动编译的，而spring-boot-devtools又是
监测classpath下的文件发生变化才会重启应用，所以需要设置IDEA的自动编译：

（1）File-Settings-Compiler-Build Project automatically



（2）ctrl + shift + alt + /，选择Registry,
勾上 Compiler autoMake allow when app running



测试

修改类–>保存：应用会重启
修改配置文件–>保存：应用会重启
修改页面–>保存：应用不会重启，但会重新加载，页面会刷新
（原理是将spring.thymeleaf.cache设为false，参考:Spring Boot配置模板引擎）

可以发现还是有用的，修改Java类后自动重启
（大型项目还是建议修改时不要启动应用，否则每次修改都重启，慢死）

