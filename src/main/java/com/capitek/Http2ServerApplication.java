package com.capitek;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http2.Http2Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Http2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Http2ServerApplication.class,args);
    }


    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addAdditionalTomcatConnectors(createH2cConnector());
        tomcat.addConnectorCustomizers();
        return tomcat;
    }

    private Connector createH2cConnector() {
        Connector connector = new Connector();
        Http2Protocol http2Protocol = new Http2Protocol();
        connector.addUpgradeProtocol(http2Protocol);
        connector.setPort(8443);
        return connector;
    }


}
