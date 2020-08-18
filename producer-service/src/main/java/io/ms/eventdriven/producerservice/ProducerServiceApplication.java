package io.ms.eventdriven.producerservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.stream.annotation.EnableBinding;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cloud.stream.messaging.Source;

@EnableDiscoveryClient
@SpringBootApplication
@EnableBinding({Source.class})
public class ProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerServiceApplication.class, args);
	}
}


@Log4j2
@RestController
@RequestMapping("/producer/")
class SendMessageController {

	public SendMessageController(Source source) {
		this.out = source.output();
	}

	final MessageChannel out;


	@PostMapping("send-message")
	public void write(@RequestBody ExternalMessage message){
		log.info("{}",message);
		Message<ExternalMessage> msg = MessageBuilder.withPayload(message).build();
		this.out.send(msg);
	}
}