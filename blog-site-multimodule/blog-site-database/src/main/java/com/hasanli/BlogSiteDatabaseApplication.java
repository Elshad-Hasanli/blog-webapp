package com.hasanli;

import com.hasanli.entity.*;
import com.hasanli.service.inter.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.util.List;

@SpringBootApplication
public class BlogSiteDatabaseApplication {

	@Autowired
	SubscribersServiceInter subscribersServiceInter;
	public static void main(String[] args) {
		SpringApplication.run(BlogSiteDatabaseApplication.class, args);
	}


}
