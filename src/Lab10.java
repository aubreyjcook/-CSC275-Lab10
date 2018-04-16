import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class Lab10 extends JFrame{
	private JList<String> selectionList;
	
	public Lab10() {
		DefaultListModel<String> listModel = new DefaultListModel<>();
		listModel.addElement("Math");
		listModel.addElement("Computer");
		listModel.addElement("Physics");
		listModel.addElement("Chemistry");
		
		selectionList = new JList<>(listModel);
		add(selectionList);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("JList Example");
		this.setSize(200,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Lab10();
			}
		});
	}
	
	

}
