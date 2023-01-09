package com.gec.wiki.config;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
//如果不加这个注解就只会扫描该包所在位置及其子包，因为换了位置 扫描多个包@ComponentScan("com.gec","com.test")
@ComponentScan("com.gec.wiki")
@SpringBootApplication
@MapperScan("com.gec.wiki.mapper")
public class WikiApplication
{
    private static final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main( String[] args )
    {
        //SpringApplication.run(WikiApplication.class,args);
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("地址：\thttp://127.0.0.1:{}",env.getProperty("server.port"));
    }
}
