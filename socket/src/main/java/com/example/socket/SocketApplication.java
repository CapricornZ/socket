package com.example.socket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SocketApplication.class, args);
	}

	@Autowired
	private EchoServer tcpServer;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.tcpServer.start();
		
	}
}
