package com.example.confluent;

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

	static List<String> descriptions = Arrays.asList("the great", "for life", "go get 'em!", "live it up");

	public static void main(String[] args) {
		SpringApplication.run(FruitSourceApplication.class, args);
	}

	@InboundChannelAdapter(channel = Source.OUTPUT, poller = @Poller(fixedDelay = "1000"))
	public Fruit confluentHandler() {
		String fruit = fruits.get(new Random().nextInt(fruits.size()));
		String description = descriptions.get(new Random().nextInt(descriptions.size()));
		Fruit newFruit = new Fruit(fruits.indexOf(fruit), fruit, fruit.toUpperCase() + " - " + description,
				(fruits.indexOf(fruit) % 3));
		logger.info("Sending = " + newFruit);
		return newFruit;
	}
}
