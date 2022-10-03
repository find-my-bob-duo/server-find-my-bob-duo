package com.example.serverfindmybobduo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//ERROR 10208 --- [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter  임시해결
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ServerFindMyBobDuoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerFindMyBobDuoApplication.class, args);
	}

}
