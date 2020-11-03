package project02;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class areafinder extends JFrame {
	JFrame frame1 = new JFrame();
	JFrame frame2 = new JFrame();
	JPanel jpmain = new JPanel();	
	JPanel jpsquare = new JPanel();
	JPanel jprectangle = new JPanel();
	JPanel jpcircle = new JPanel();
	JPanel jptriangle = new JPanel();
	JButton jbsquare = new JButton("Square");
	JButton jbrectangle = new JButton("Rectangle");
	JButton jbcircle = new JButton("Circle");
	JButton jbtriangle = new JButton("Triangle");
	JButton jbsquarearea = new JButton("Find Area");
	JButton jbback1 = new JButton("Back to Main Manu");
	JButton jbcler1 = new JButton("Clear");
	JButton jbback2 = new JButton("Back to Main Manu");
	JButton jbcler2 = new JButton("Clear");
	JButton jbrectanglearea = new JButton("Find Area");
	JButton jbcirclearea = new JButton("Find Area");
	JButton jbback3 = new JButton("Back to Main Manu");
	JButton jbcler3 = new JButton("Clear");
	JButton jbback4 = new JButton("Back to Main Manu");
	JButton jbcler4 = new JButton("Clear");
	JButton jbtrianglearea = new JButton("Find Area");
	JButton jbok = new JButton("OK");
	JLabel jl1 = new JLabel();
	JLabel jlsqurelength = new JLabel();
	JLabel jlsquarearea = new JLabel();
	JLabel jlsquareanswer = new JLabel();
	JLabel jlrectanglewidth = new JLabel();
	JLabel jlrectanglelength = new JLabel();
	JLabel jlrectanglearea = new JLabel();
	JLabel jlrectangleareaanswer = new JLabel();
	JLabel jlcircleradius = new JLabel();
	JLabel jlcirclearea = new JLabel();
	JLabel jlcircleareaanswer = new JLabel();
	JLabel jltrianglebase = new JLabel();
	JLabel jltriangleheight = new JLabel();
	JLabel jltrianglearea = new JLabel();
	JLabel jltriangleareaanswer = new JLabel();
	JLabel jlwichshape = new JLabel();
	JLabel jlframe2 = new JLabel();
	JLabel jlframeerror = new JLabel();
	JTextArea jtsquare = new JTextArea();
	JTextArea jtrectangle1 = new JTextArea();
	JTextArea jtrectangle2 = new JTextArea();
	JTextArea jtcircle = new JTextArea();
	JTextArea jttriangle1 = new JTextArea();
	JTextArea jttriangle2 = new JTextArea();
	Font font1 = new Font("Arial",Font.BOLD,20);
	Font font2 = new Font("Arial",Font.BOLD,15);
	Font font3 = new Font("Arial",Font.BOLD,40);
	
	String strsquarelength = "";
	double squarelength = 0;
	double squarearea = 0;
	String strsquarearea = "";
	
	String strrectanglelength = "";
	String strrectanglewidth = "";
	double rectanglelength = 0;
	double rectanglewidth = 0;
	double rectanglearea = 0;
	String strrectanglearea = "";
	
	String strcircleradius = "";
	double circleradius = 0;
	double circlearea = 0;
	String strcirclearea = "";
	
	String strtrianglebase = "";
	String strtriangleheight = "";
	double trianglebase = 0;
	double triangleheight = 0;
	double trianglearea = 0;
	String strtrianglearea = "";
	
	public areafinder() {
		frame1.setTitle("Area Finder");
		frame1.setSize(400,500);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame1.setLocationRelativeTo(null);
		frame1.setResizable(false);
		frame1.setLayout(null);
		
		frame2.setTitle("System Error");
		frame2.setSize(300,200);
		frame2.setVisible(false);
		frame2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame2.setLocationRelativeTo(null);
		frame2.setResizable(false);
		frame2.setLayout(null);
		
		
		jl1.setSize(100,20);
		jl1.setLocation(145,10);
		jl1.setFont(font1);
		jl1.setText("Welcome");
		
		jlframe2.setSize(300,30);
		jlframe2.setLocation(55,70);
		jlframe2.setText("Please Fill All Fields");
		jlframe2.setFont(font2);
		jlframeerror.setSize(300,50);
		jlframeerror.setLocation(50,20);
		jlframeerror.setText("ERROR!!");
		jlframeerror.setFont(font3);
		
		jlwichshape.setSize(400,20);
		jlwichshape.setLocation(40,40);
		jlwichshape.setFont(font2);
		jlwichshape.setText("Wich Shape Do You Want to Find the Area ?");
		
		jpmain.setSize(400,500);
		jpmain.setLayout(null);
		
		jpsquare.setSize(400,500);
		jpsquare.setLayout(null);
		jpsquare.setVisible(false);
		
		jprectangle.setSize(400,500);
		jprectangle.setLayout(null);
		jprectangle.setVisible(false);
		
		jpcircle.setSize(400,500);
		jpcircle.setLayout(null);
		jpcircle.setVisible(false);
		
		jptriangle.setSize(400,500);
		jptriangle.setLayout(null);
		jptriangle.setVisible(false);
		
		jbok.setSize(80,30);
		jbok.setLocation(100,120);
		jbok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				frame2.dispose();
			}
		});
		
		jbsquare.setSize(200,30);
		jbsquare.setLocation(90,80);
		jbsquare.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(false);
				jpsquare.setVisible(true);
			}
		});
		
		jbrectangle.setSize(200,30);
		jbrectangle.setLocation(90,130);
		jbrectangle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(false);
				jprectangle.setVisible(true);
			}
		});
		
		jbcircle.setSize(200,30);
		jbcircle.setLocation(90,180);
		jbcircle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(false);
				jpcircle.setVisible(true);
			}
		});
		
		jbtriangle.setSize(200,30);
		jbtriangle.setLocation(90,230);
		jbtriangle.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(false);
				jptriangle.setVisible(true);
			}
		});
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		jlsqurelength.setSize(200,25);
		jlsqurelength.setLocation(10,10);
		jlsqurelength.setText("Enter Length of one side :");
		jtsquare.setSize(200,25);
		jtsquare.setLocation(160,10);
		jlsquarearea.setSize(200,25);
		jlsquarearea.setLocation(150,100);
		jlsquareanswer.setSize(200,25);
		jlsquareanswer.setLocation(10,100);
		jbsquarearea.setSize(200,30);
		jbsquarearea.setLocation(90,230);
		jbsquarearea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jtsquare.getText().equals("")) {
					frame2.setVisible(true);
				}
				else {
				
				strsquarelength = jtsquare.getText();
				squarelength = Double.parseDouble(strsquarelength);
				squarearea = squarelength*squarelength;
				strsquarearea = Double.toString(squarearea);
				
				jlsquarearea.setText(strsquarearea);
				jlsquareanswer.setText("Area of The Square Is :");
				}
				
			}
		} );
		jbback1.setSize(200,30);
		jbback1.setLocation(90,280);
		jbback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(true);
				jpsquare.setVisible(false);
			}
		});
		
		jbcler1.setSize(200,30);
		jbcler1.setLocation(160,60);
		jbcler1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtsquare.setText(null);
				jlsquareanswer.setText(null);
				jlsquarearea.setText(null);
			}
		});
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		jlrectanglelength.setSize(200,25);
		jlrectanglelength.setLocation(10,10);
		jlrectanglewidth.setSize(200,25);
		jlrectanglewidth.setLocation(10,40);
		jlrectanglelength.setText("Enter Length of Rectangle :");
		jlrectanglewidth.setText("Enter Width of Rectangle :");
		jtrectangle1.setSize(200,25);
		jtrectangle1.setLocation(165,10);
		jtrectangle2.setSize(200,25);
		jtrectangle2.setLocation(165,40);
		jlrectanglearea.setSize(200,25);
		jlrectanglearea.setLocation(160,120);
		jlrectangleareaanswer.setSize(200,25);
		jlrectangleareaanswer.setLocation(10,120);
		jbrectanglearea.setSize(200,30);
		jbrectanglearea.setLocation(90,230);
		jbrectanglearea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jtrectangle1.getText().equals("") || jtrectangle2.getText().equals("")) {
					frame2.setVisible(true);
				}
				else {
				strrectanglelength = jtrectangle1.getText();
				strrectanglewidth = jtrectangle2.getText();
				rectanglelength = Double.parseDouble(strrectanglelength);
				rectanglewidth = Double.parseDouble(strrectanglewidth);
				rectanglearea = rectanglelength*rectanglewidth;
				strrectanglearea = Double.toString(rectanglearea);
				
				jlrectanglearea.setText(strrectanglearea);
				jlrectangleareaanswer.setText("Area of The Rectangle Is :");
				}
			}
		} );
		jbback2.setSize(200,30);
		jbback2.setLocation(90,280);
		jbback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(true);
				jprectangle.setVisible(false);
			}
		});
		
		jbcler2.setSize(200,30);
		jbcler2.setLocation(160,80);
		jbcler2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtrectangle1.setText(null);
				jtrectangle2.setText(null);
				jlrectangleareaanswer.setText(null);
				jlrectanglearea.setText(null);
			}
		});
		
		//////////////////////////////////////////////////////////////////////////////////////////////
		
		jlcircleradius.setSize(200,25);
		jlcircleradius.setLocation(10,10);
		jlcircleradius.setText("Enter Radius of Circle :");
		jtcircle.setSize(200,25);
		jtcircle.setLocation(160,10);
		jlcirclearea.setSize(200,25);
		jlcirclearea.setLocation(150,100);
		jlcircleareaanswer.setSize(200,25);
		jlcircleareaanswer.setLocation(10,100);
		jbcirclearea.setSize(200,30);
		jbcirclearea.setLocation(90,230);
		jbcirclearea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jtcircle.getText().equals("")) {
					frame2.setVisible(true);
				}
				else {
				strcircleradius = jtcircle.getText();
				circleradius = Double.parseDouble(strcircleradius);
				circlearea = 3.14*circleradius*circleradius;
				strcirclearea = Double.toString(circlearea);
				
				jlcirclearea.setText(strcirclearea);
				jlcircleareaanswer.setText("Area of The Circle Is :");
				}
			}
		} );
		jbback3.setSize(200,30);
		jbback3.setLocation(90,280);
		jbback3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(true);
				jpcircle.setVisible(false);
			}
		});
		
		jbcler3.setSize(200,30);
		jbcler3.setLocation(160,60);
		jbcler3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtcircle.setText(null);
				jlcircleareaanswer.setText(null);
				jlcirclearea.setText(null);
			}
		});
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		jltrianglebase.setSize(200,25);
		jltrianglebase.setLocation(10,10);
		jltriangleheight.setSize(200,25);
		jltriangleheight.setLocation(10,40);
		jltrianglebase.setText("Enter Base of Triangle :");
		jltriangleheight.setText("Enter Height of Triangle :");
		jttriangle1.setSize(200,25);
		jttriangle1.setLocation(160,10);
		jttriangle2.setSize(200,25);
		jttriangle2.setLocation(160,40);
		jltrianglearea.setSize(200,25);
		jltrianglearea.setLocation(160,120);
		jltriangleareaanswer.setSize(200,25);
		jltriangleareaanswer.setLocation(10,120);
		jbtrianglearea.setSize(200,30);
		jbtrianglearea.setLocation(90,230);
		jbtrianglearea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jttriangle1.getText().equals("") || jttriangle2.getText().equals("")) {
					frame2.setVisible(true);
				}
				else {
				strtrianglebase = jttriangle1.getText();
				strtriangleheight = jttriangle2.getText();
				trianglebase = Double.parseDouble(strtrianglebase);
				triangleheight = Double.parseDouble(strtriangleheight);
				trianglearea = 0.5*trianglebase*triangleheight;
				strtrianglearea = Double.toString(trianglearea);
				
				jltrianglearea.setText(strtrianglearea);
				jltriangleareaanswer.setText("Area of The Triangle Is :");
				}
			}
		} );
		jbback4.setSize(200,30);
		jbback4.setLocation(90,280);
		jbback4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jpmain.setVisible(true);
				jptriangle.setVisible(false);
			}
		});
		
		jbcler4.setSize(200,30);
		jbcler4.setLocation(160,80);
		jbcler4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jttriangle1.setText(null);
				jttriangle2.setText(null);
				jltriangleareaanswer.setText(null);
				jltrianglearea.setText(null);
			}
		});
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		jpmain.add(jbtriangle);
		jpmain.add(jbcircle);
		jpmain.add(jbrectangle);
		jpmain.add(jbsquare);
		jpmain.add(jl1);
		jpmain.add(jlwichshape);
		
		jpsquare.add(jlsqurelength);
		jpsquare.add(jtsquare);
		jpsquare.add(jbsquarearea);
		jpsquare.add(jlsquarearea);
		jpsquare.add(jlsquareanswer);
		jpsquare.add(jbback1);
		jpsquare.add(jbcler1);
		
		jprectangle.add(jlrectanglelength);
		jprectangle.add(jlrectanglewidth);
		jprectangle.add(jtrectangle1);
		jprectangle.add(jtrectangle2);
		jprectangle.add(jbrectanglearea);
		jprectangle.add(jlrectanglearea);
		jprectangle.add(jlrectangleareaanswer);
		jprectangle.add(jbback2);
		jprectangle.add(jbcler2);
		
		jpcircle.add(jlcircleradius);
		jpcircle.add(jtcircle);
		jpcircle.add(jbcirclearea);
		jpcircle.add(jlcirclearea);
		jpcircle.add(jlcircleareaanswer);
		jpcircle.add(jbback3);
		jpcircle.add(jbcler3);
		
		jptriangle.add(jltrianglebase);
		jptriangle.add(jltriangleheight);
		jptriangle.add(jttriangle1);
		jptriangle.add(jttriangle2);
		jptriangle.add(jbtrianglearea);
		jptriangle.add(jltrianglearea);
		jptriangle.add(jltriangleareaanswer);
		jptriangle.add(jbback4);
		jptriangle.add(jbcler4);
		
		frame1.add(jpmain);
		frame1.add(jpsquare);
		frame1.add(jprectangle);
		frame1.add(jpcircle);
		frame1.add(jptriangle);
		
		frame2.add(jlframe2);
		frame2.add(jlframeerror);
		frame2.add(jbok);
	}
	public static void main(String[] args) {
		areafinder obj = new areafinder();
	}
}
