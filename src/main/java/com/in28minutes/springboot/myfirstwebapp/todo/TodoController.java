package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private TodoService todoService;
	
	//for autowiring 
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		 List<Todo> todos=todoService.findByUsername("teknath");
		 model.put("todos", todos);
		return "listTodos";
	}
	
	
	@RequestMapping(value="add-todo",method=RequestMethod.GET)
	public String gotoAddTodoPage() {
		return "addTodo";
	}
	
	@RequestMapping(value="add-todo",method=RequestMethod.POST)
	public String addNewTodo(@RequestParam String description,ModelMap model) {
		String username = (String)model.get("name");
		todoService.addTodo(username, description, LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

}
