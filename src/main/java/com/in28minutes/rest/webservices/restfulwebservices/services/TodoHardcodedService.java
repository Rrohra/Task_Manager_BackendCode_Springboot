package com.in28minutes.rest.webservices.restfulwebservices.services;
//this is todo service  + dao
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.in28minutes.rest.webservices.restfulwebservices.beans.Todo;
 
@Service  //necessary warna Autowired not detect the type ka error aaega
public class TodoHardcodedService {

	//here we want lIst of TODO
	private static List<Todo> todos_ser = new ArrayList();
	private static int idCounter =0;
	
	static {
		todos_ser.add(new Todo(++idCounter,"in28minutes","This description is of task Rohit", new Date(), true ));
		todos_ser.add(new Todo(++idCounter,"mahima","This description is of task mahima", new Date(), true ));
		todos_ser.add(new Todo(++idCounter,"Srichti","This description is of task Srihti", new Date(), true ));
		todos_ser.add(new Todo(++idCounter,"Shreya","This description is of task Shreya", new Date(), true ));
	}
	
	//retrueeval mathod
	public List<Todo> findAll(String user){
		return todos_ser.stream().filter(t->user.equals(t.getUsername())).collect(Collectors.toList());
	}

	public String deleteTodo(String username, int todoId) {
		// TODO Auto-generated method stub
		for(Todo todo_item : todos_ser ) { 
			   if(todo_item.getId() == todoId-1) { 
			       todos_ser.remove(todoId-1);
			       return "Entry deleted";
			       
			   }
			}
		return "errors deleting entry";
	}
	
	public Todo updateTodo(Todo todo) {
//		this.deleteTodo(todo.getUsername(), todo.getId());
		Todo res = this.todos_ser.get(todo.getId()-1);
		System.out.println(res.getDescription());
		res.setDescription(todo.getDescription());
		res.setTragetDate(todo.getTragetDate());
		System.out.println(res.getDescription());
		Todo res1 = this.todos_ser.get(todo.getId()-1);
		System.out.println(res1.getDescription());
		return res;
	}
	
	public Todo createTodo(Todo todo) {
		todo.setId(++idCounter);
		this.todos_ser.add(todo);
		return todo;
	}
	
}
