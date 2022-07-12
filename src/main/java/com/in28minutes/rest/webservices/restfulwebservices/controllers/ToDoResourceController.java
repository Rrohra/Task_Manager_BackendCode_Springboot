package com.in28minutes.rest.webservices.restfulwebservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservices.beans.Todo;
import com.in28minutes.rest.webservices.restfulwebservices.services.TodoHardcodedService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ToDoResourceController {
	
	@Autowired
	private TodoHardcodedService todoService; //this si the service as in Angular
	
	//TodoHardcodedService x =new TodoHardcodedService();  //alternatice to this is to use @Component/@Service in hardcodedService and use Autowired to type variable over in controleer
	
	@GetMapping(path="/{username}/todoservice")
	public List<Todo> getAllTodos(@PathVariable String username){
		return todoService.findAll(username);   //retriveal method ko call
	}
	
	@DeleteMapping(path="/{username}/todoservice/{todoId}")
	public ResponseEntity deleteTodoForUser(@PathVariable String username,@PathVariable int todoId) {
		String response =todoService.deleteTodo(username, todoId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@RequestMapping(path="/{id}/todoservice/update", method = RequestMethod.PATCH) //http://localhost:8080/${id}/todoservice/update
	public ResponseEntity<Todo> updateTodo( @PathVariable int id, @RequestBody Todo todo) {
		Todo response =todoService.updateTodo(todo);
		return new ResponseEntity<Todo>(response, HttpStatus.OK);
	}
	
	@RequestMapping(path="/{user}/todoservice/createtodo", method = RequestMethod.POST)
	public ResponseEntity<Todo> createTodo(@PathVariable String user, @RequestBody Todo todo){
		Todo response=todoService.createTodo(todo);
		return new ResponseEntity<Todo>(response, HttpStatus.OK);
	}

}
