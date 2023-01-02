package meujogo.Modelo;
import javax.swing.JFrame;
import meujogoModelo.Fase;

@SuppressWarnings("serial")
//0
public class Container extends JFrame{
	public Container() {
		add(new Fase());
		setTitle("Nave Game");
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main (String []args) {
		new Container();
	}
}
