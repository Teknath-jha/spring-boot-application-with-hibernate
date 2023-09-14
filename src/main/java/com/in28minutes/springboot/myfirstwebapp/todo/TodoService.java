package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	//to initiate static list or variable you need static block
	static {
		todos.add(new Todo(1,"teknath","learn springboot",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(2,"tarun","learn java",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(3,"teknath","learn cubol",
				LocalDate.now().plusYears(3),false));
		todos.add(new Todo(4,"tarun","learn C++",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(5,"teknath","learn AWS",
				LocalDate.now().plusYears(2),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;  //to be continued
	}

}
