package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	private static int todoCount = 0;
	
	//to initiate static list or variable you need static block
	static {
		todos.add(new Todo(++todoCount,"teknath","learn springboot",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"tarun","learn java",
				LocalDate.now().plusYears(2),false));
		todos.add(new Todo(++todoCount,"teknath","learn cubol",
				LocalDate.now().plusYears(3),false));
		todos.add(new Todo(++todoCount,"tarun","learn C++",
				LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"teknath","learn AWS",
				LocalDate.now().plusYears(2),false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;  //to be continued
	}
	
	
	public void addTodo(String username, String description ,LocalDate targetDate , boolean done) {
		Todo todo = new Todo(++todoCount,username,description,targetDate,done);
		todos.add(todo);
	}

}
