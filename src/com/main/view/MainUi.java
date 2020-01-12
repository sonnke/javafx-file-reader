package com.main.view;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class MainUi extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		//Layout
		GridPane MainLayout = new GridPane();
		
		//Obervable list
		ObservableList<String> listValues = FXCollections.observableArrayList("Sonke", "Vusi", "Zama","Thuli");
		
		//Filter input
		TextField filterInput = new TextField();
		TextField addInput = new TextField();
		Button addButton = new Button("Add");
		Button filterButton = new Button("Filter");
		ListView<String> listView = new ListView<String>(listValues);
		
		
		
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
	
	public static void main(String[] args){
		
		MainUi.launch(args);
	}
	

}
