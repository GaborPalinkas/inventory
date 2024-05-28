package com.flamer.inventory;

import com.flamer.inventory.domain.user.entity.User;
import com.flamer.inventory.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
@RequiredArgsConstructor
public class InventoryApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	@Override
	public void run(String... args) {
		User user1 = User.builder()
				.name("Test Elek")
				.age(10)
				.birthday(LocalDate.now())
				.role("USER")
				.username("fasz")
				.password("test123")
				.build();
		userRepository.save(user1);
	}
}
