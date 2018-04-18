import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class Lab10 extends Application{	
	private Button btOK = new Button("Add Course");
	private Button btCancel = new Button("Close");
	
	JList<String> selectionList;
	
	@Override
	public void start(Stage primaryStage){
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		
		listModel.addElement("Math");
		listModel.addElement("Computer");
		listModel.addElement("Physics");
		listModel.addElement("Chemistry");
		
		selectionList = new JList<>(listModel);
		
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		
		gridPane.add(btOK, 1, 5);
		gridPane.add(btCancel, 2, 5);
		
		//gridPane.add(selectionList);
		
		gridPane.setAlignment(Pos.CENTER);
		btOK.setAlignment(Pos.BOTTOM_RIGHT);
		btCancel.setAlignment(Pos.BOTTOM_RIGHT);
		
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1);
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2);
		
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("Lab10");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	class OKHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			
		}
	}
	
	class CancelHandlerClass implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			System.exit(0);
		}
	}
/*
	public class JListSelection extends JFrame {
		private JList<String> selectionList;
		
		public JListSelection() {
			DefaultListModel<String> listModel = new DefaultListModel<>();
			listModel.addElement("Math");
			listModel.addElement("Computer");
			listModel.addElement("Physics");
			listModel.addElement("Chemistry");
			
			selectionList = new JList<>(listModel);
			add(selectionList);
			
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("JList Example");
			//this.setSize(200,200);
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Lab10();
			}
		});
	}
*/
}
