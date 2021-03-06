package com.example.appender;

import com.example.common.Fruit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.handler.annotation.SendTo;

@SpringBootApplication
@EnableBinding(Processor.class)
public class AppenderApplication {

	@Value("${SPRING_APPLICATION_INDEX:${spring.cloud.stream.instanceIndex:0}}")
	private String currentApplicationIndexInEnvVar;

	@Value("${SPRING.CLOUD.STREAM.INSTANCE_COUNT:${spring.cloud.stream.instanceCount:0}}")
	private String totalInstanceCountInEnvVar;

	Logger logger = LoggerFactory.getLogger(AppenderApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppenderApplication.class, args);
	}

	@StreamListener(Processor.INPUT)
	@SendTo(Processor.OUTPUT)
	public Fruit appendHandler(Fruit fruit) {
		fruit.setTotalInstanceCount(
				totalInstanceCountInEnvVar == null ? -1 : Integer.parseInt(totalInstanceCountInEnvVar));
		fruit.setCurrentAppInstance(
				currentApplicationIndexInEnvVar == null ? -1 : Integer.parseInt(currentApplicationIndexInEnvVar));
		logger.info("currentApplicationIndexInEnvVar = " + fruit.getCurrentAppInstance() + " instanceCount = "
				+ fruit.getTotalInstanceCount() + " For Fruit = "
				+ fruit);
		return fruit;
	}
}
