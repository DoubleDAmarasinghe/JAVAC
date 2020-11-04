import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomID extends JFrame 
{
	JFrame frm = new JFrame();
	JLabel jlb = new JLabel("Hit button to get a Random ID ");
	JLabel jlb2 = new JLabel("");
	JButton btn = new JButton("HIT");
	Random rand = new Random();
	
	private int low = 100;
	private int high = 199;
	private int result;
	
	public RandomID() 
	{
		frm.setTitle("Random_ID");
		frm.setSize(300,200);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frm.setLocationRelativeTo(null);
		frm.setResizable(false);
		frm.setLayout(null);
		
		jlb.setSize(200, 20);
		jlb.setLocation(50, 15);
		
		jlb2.setSize(200, 20);
		jlb2.setLocation(120, 100);
		
		btn.setSize(100, 35);
		btn.setLocation(80, 50);
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) 
			{
				result = rand.nextInt(high - low) + low;
				jlb2.setText(Integer.toString(result));
			}
		});
		
		frm.add(jlb);
		frm.add(btn);
		frm.add(jlb2);
		
	}
	public static void main(String[] args)
	{
		RandomID obj = new RandomID();
	}
}