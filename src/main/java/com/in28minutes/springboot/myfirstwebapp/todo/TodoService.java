package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;


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
	
	public void deleteById(int id) {
			
			Predicate<? super Todo> predicate 
									= todo -> todo.getId() == id;
			todos.removeIf(predicate);
		}


	public Todo findById(int id) {
		Predicate<? super Todo> predicate 
		= todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}


	public void updateTodo(@Valid Todo todo) {
		
		deleteById(todo.getId());
		todos.add(todo);
	}

}
