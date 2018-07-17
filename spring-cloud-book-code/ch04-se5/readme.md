建库：

    CREATE DATABASE `spring-cloud-book` /*!40100 COLLATE 'utf8mb4_bin' */;
    
    USE spring-cloud-book;

    CREATE TABLE `user` (
        `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
        `username` VARCHAR(25) NOT NULL,
        `nick` VARCHAR(50),
        `password` VARCHAR(50),
        PRIMARY KEY (`id`),
        UNIQUE INDEX `username` (`username`)
    );
    
    INSERT INTO `user` (`username`, `nick`, `password`) VALUES ('heller', 'heller', 'asdfyufefaefeafeafeafaewpfaefcdafjaewf2q30');
    
    
    
    
