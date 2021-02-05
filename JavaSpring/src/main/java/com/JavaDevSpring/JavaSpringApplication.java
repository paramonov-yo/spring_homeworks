package com.JavaDevSpring;

import com.JavaDevSpring.dao.BookDAO;
import com.JavaDevSpring.model.Book;
import com.JavaDevSpring.repository.AuthorRepository;
import com.JavaDevSpring.repository.BookRepository;
import com.JavaDevSpring.repository.CommentRepository;
import com.JavaDevSpring.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//Author, Genre, Book, Comment


@SpringBootApplication
public class JavaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringApplication.class, args);
	}


	}



