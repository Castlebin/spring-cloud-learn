1. 启动多个eureka-server, 打开两个终端窗口，cd 到eureka-server目录，分别执行
    
    
    mvn spring-boot:run -Dspring.profiles.active=peer1
    
    mvn spring-boot:run -Dspring.profiles.active=peer2
    
即可启动两个Eureka Server

记住在hosts文件中添加：
    
    
    127.0.0.1   peer1
    127.0.0.1   peer2
    
可以看到尽管eureka-client的配置文件中，写的注册地址只注册到了peer1，
但打开peer2，可以发现eureka-client也已经注册到peer2了

