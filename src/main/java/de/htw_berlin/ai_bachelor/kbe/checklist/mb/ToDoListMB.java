package de.htw_berlin.ai_bachelor.kbe.checklist.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDo;
import de.htw_berlin.ai_bachelor.kbe.checklist.model.ToDoList;

//TODO
@ManagedBean
@SessionScoped
public class ToDoListMB implements Serializable {

	private static final long serialVersionUID = 1L;

    private ToDoList toDoList;
	private List<ToDo> toDos =  new ArrayList<ToDo>();
	private List<String> selectedToDos = new ArrayList<String>();
	
	public ToDoListMB() {
		super();
		//TODO
	}    

	//TODO
	public List<ToDo> getToDos() {
		return toDos;
	}
	public void setToDos(List<ToDo> toDos){
		this.toDos=toDos;
	}
	public List<String> getSelectedToDos(){
		return selectedToDos;
	}
	public void setSelectedToDos(List<String> selectedToDos){
		this.selectedToDos = selectedToDos;
	}
	//Should be called if the Button "Speichern" is pushed.
	//Needs configuration in the faces-config.xml.
    public String save() {
    	return "save";
    }
}
