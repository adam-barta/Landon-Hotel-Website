package com.example.d387_sample_code;

import com.example.d387_sample_code.controller.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		WelcomeMessage welcomeMessageEnglish = new WelcomeMessage(Locale.US);
		WelcomeMessage welcomeMessageFrench = new WelcomeMessage(Locale.CANADA_FRENCH);

		Thread englishWelcomeThread = new Thread(welcomeMessageEnglish);
		Thread frenchWelcomeThread = new Thread(welcomeMessageFrench);

		englishWelcomeThread.start();
		frenchWelcomeThread.start();
	}

}
