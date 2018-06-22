package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//申明这是一个Eureka服务
@SpringBootApplication
public class EurekaServer {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaServer.class, args);

	}

}
