package com.example.bananabankbe;

import com.example.bananabankbe.domain.UserTable;
import com.example.bananabankbe.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BananaBankBeApplication implements CommandLineRunner {
	@Autowired UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(BananaBankBeApplication.class, args);
	}

	@Override
	public void run(String ...args) {

		var user1 = new UserTable(1L, "Andrea", "Mancin", "andream", "kiwi", 0.00F);
		var user2 = new UserTable(2L, "Sara", "Obialero", "sarao", "banane", 20.00F);
		var user3 = new UserTable(3L, "Alessandro", "Agnello", "alessandroa", "maccheronico", 0.00F);
		var user4 = new UserTable(4L, "Alessandro", "Celi", "alessandroc", "darkside", 1000F);

		repository.save(user1);
		repository.save(user2);
		repository.save(user3);
		repository.save(user4);
	}

}
