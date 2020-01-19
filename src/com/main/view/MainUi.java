package com.main.view;
import javafx.application.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.main.controller.*;
public class MainUi extends Application{
	TextField addInput = new TextField();
	//Initiate Class
	MainCtr ctr = new MainCtr("streamFile.txt");
	

	@Override
	public void start(Stage stage) throws Exception {
		
		
		//Layout
		GridPane MainLayout = new GridPane();
		
		//Obervable list
		ObservableList<String> listValues = FXCollections.observableArrayList("Sonke", "Vusi", "Zama","Thuli");
		
		//Filter input
		TextField filterInput = new TextField();
		
		Button addButton = new Button("Add");
		Button filterButton = new Button("Filter");
		ListView<String> listView = new ListView<String>(listValues);
		
			
		//Add events
		addButton.addEventHandler(ActionEvent.ACTION, addButtonEvent);
		
		
		
		MainLayout.setAlignment(Pos.CENTER);
		MainLayout.setVgap(5); 
		MainLayout.setHgap(5);
		MainLayout.setPadding(new Insets(10));
		//Add Controls
		
		MainLayout.add(filterInput, 0, 0 );
		MainLayout.add(filterButton, 1, 0 );
		MainLayout.add(listView, 0, 1 );
		MainLayout.add(addInput, 0, 2 );
		MainLayout.add(addButton, 1, 2 );
		
		GridPane.setColumnSpan(listView, 2);
		
		Scene MainScene = new Scene(MainLayout);
		stage.setScene(MainScene);
		stage.setTitle("Exam Project");
		
		stage.show();
		
	}
	
	
	//Add button 
	EventHandler<ActionEvent> addButtonEvent = new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
			// TODO Auto-generated method stub			
			String text = addInput.getText();
			ctr.addUser(text);
		}
		
	};
	
	
	 
	
	
	public static void main(String[] args){
		
		MainUi.launch(args);
	}
	

}
