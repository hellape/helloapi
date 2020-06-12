package com.example.helloapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloapiApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public Message displayMessage() {
		return new Message();
	}

	static class Message {
		private String text = "Hello World!";

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

}
