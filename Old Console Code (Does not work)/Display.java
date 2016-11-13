import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.io.PrintStream;
import java.awt.Font;

public class Display extends JFrame
{
	private JPanel contentPane;
	
	public Display()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 550);
		
		JTextArea area = new JTextArea( "Hello", 100, 100 );
		area.setBounds(0, 0, 450, 550);
		area.setLineWrap(true);
		area.setFont(new Font("Lucida Console", Font.PLAIN, 20));
		area.setEditable(false);
		
        contentPane = new JPanel();
		setContentPane( contentPane );
		contentPane.setLayout(null);
		contentPane.add( area );
		
		PrintStream con = new PrintStream( new TextAreaOutputStream( area, 100 ) );
		System.setOut(con);
		System.setErr(con);
	}
	
	public static void main( String[] args )
	{
		try {
			Display frame = new Display();
			frame.setVisible(true);
			new Menu();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}