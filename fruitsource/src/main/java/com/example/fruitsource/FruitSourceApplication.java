package com.example.fruitsource;

import com.example.common.Fruit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
@EnableBinding(Source.class)
public class FruitSourceApplication {

	Logger logger = LoggerFactory.getLogger(FruitSourceApplication.class);

	static List<String> fruits = Arrays.asList("apple", "orange", "pineapple", "cherry", "peach");

	public static void main(String[] args) {
		SpringApplication.run(FruitSourceApplication.class, args);
	}

	@InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedDelay = "1000"))
	public Fruit sourceHandler() {
		String fruit = fruits.get(new Random().nextInt(fruits.size()));
		Fruit newFruit = new Fruit(fruits.indexOf(fruit), fruit);
		logger.info("Sending = " + newFruit);
		return newFruit;
	}
}
