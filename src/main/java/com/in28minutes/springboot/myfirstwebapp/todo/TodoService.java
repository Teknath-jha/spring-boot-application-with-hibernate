package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	
	private static List<Todo> todos;
	
	//to initiate static list or variable you need static block
	static {
		todos.add(new Todo(1,"teknath","learn springboot",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1,"tarun","learn java",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(1,"teknath","learn cubol",
				LocalDate.now().plusYears(3),false));
		todos.add(new Todo(1,"tarun","learn C++",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1,"teknath","learn AWS",
				LocalDate.now().plusYears(2),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;  //to be continued
	}

}
