import javax.swing.*;
import java.awt.Font;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

class Calculator extends JFrame{
  Font fnt1 = new Font("Arial", Font.BOLD, 40);
  Border brd = BorderFactory.createLineBorder(Color.black);

  JFrame frame1 = new JFrame();
  JTextArea jta = new JTextArea();
  JButton btn1 = new JButton("1");
  JButton btn2 = new JButton("2");
  JButton btn3 = new JButton("3");
  JButton btn4 = new JButton("4");
  JButton btn5 = new JButton("5");
  JButton btn6 = new JButton("6");
  JButton btn7 = new JButton("7");
  JButton btn8 = new JButton("8");
  JButton btn9 = new JButton("9");
  JButton sum = new JButton("+");
  JButton sub = new JButton("-");
  JButton max = new JButton("*");
  JButton ans = new JButton("=");
  JButton btn0 = new JButton("0");
  JButton dot = new JButton(".");
  JButton div = new JButton("/");
//variables
  String strnum1 = "";
  String strnum2 = "";
  String strtotal = "";

  float num1 = 0;
  float num2 = 0;
  float total = 0;

  String[] statement;



  public Calculator(){
    frame1.setTitle("My Calculator");
    frame1.setSize(450,600);
    frame1.setVisible(true);
    frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame1.setResizable(false);
    frame1.setLocationRelativeTo(null);
    frame1.setLayout(null);

    jta.setSize(400,100);
    jta.setLocation(20,20);
    jta.setBorder(brd);
    jta.setFont(fnt1);

//button1
    btn1.setSize(80,50);
    btn1.setLocation(20,400);
    btn1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("1");
      }
    });
//button2
    btn2.setSize(80,50);
    btn2.setLocation(120,400);
    btn2.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("2");
      }
    });
//button3
    btn3.setSize(80,50);
    btn3.setLocation(220,400);
    btn3.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("3");
      }
    });
    //button+
        sum.setSize(80,50);
        sum.setLocation(320,400);
        sum.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0)
          {
            jta.append("+");
          }
        });
//button4
    btn4.setSize(80,50);
    btn4.setLocation(20,320);
    btn4.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("4");
      }
    });
//button5
    btn5.setSize(80,50);
    btn5.setLocation(120,320);
    btn5.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("5");
      }
    });
//button6
    btn6.setSize(80,50);
    btn6.setLocation(220,320);
    btn6.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("6");
      }
    });

    //button-
        sub.setSize(80,50);
        sub.setLocation(320,320);
        sub.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0)
          {
            jta.append("-");
          }
        });

//button7
    btn7.setSize(80,50);
    btn7.setLocation(20,240);
    btn7.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0)
      {
        jta.append("7");
      }
    });

    //button8
        btn8.setSize(80,50);
        btn8.setLocation(120,240);
        btn8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0)
          {
            jta.append("8");
          }
        });

        //button*
            max.setSize(80,50);
            max.setLocation(320,240);
            max.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent arg0)
              {
                jta.append("*");
              }
            });
            //button9
                btn9.setSize(80,50);
                btn9.setLocation(220,240);
                btn9.addActionListener(new ActionListener(){
                  public void actionPerformed(ActionEvent arg0)
                  {
                    jta.append("9");
                  }
                });
                //button=
                    ans.setSize(80,50);
                    ans.setLocation(20,500);
                    ans.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent arg0)
                      {
                        if(jta.getText().contains("+"))
                        {
                          System.out.println("Contains");
                          statement = jta.getText().split("\\+");

                          strnum1 = statement[0];
                          strnum2 = statement[1];

                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);

                          total = num1 + num2;

                          strtotal = Float.toString(total);
                          jta.setText(strtotal);

                        }

                        if(jta.getText().contains("-"))
                        {
                          System.out.println("Contains");
                          statement = jta.getText().split("\\-");

                          strnum1 = statement[0];
                          strnum2 = statement[1];

                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);

                          total = num1 - num2;

                          strtotal = Float.toString(total);
                          jta.setText(strtotal);

                        }

                        if(jta.getText().contains("*"))
                        {
                          System.out.println("Contains");
                          statement = jta.getText().split("\\*");

                          strnum1 = statement[0];
                          strnum2 = statement[1];

                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);

                          total = num1 * num2;

                          strtotal = Float.toString(total);
                          jta.setText(strtotal);

                        }
                        if(jta.getText().contains("/"))
                        {
                          System.out.println("Contains");
                          statement = jta.getText().split("\\/");

                          strnum1 = statement[0];
                          strnum2 = statement[1];

                          num1 = Float.parseFloat(strnum1);
                          num2 = Float.parseFloat(strnum2);

                          total = num1 / num2;

                          strtotal = Float.toString(total);
                          jta.setText(strtotal);

                        }
                      }
                    });
                    //button0
                        btn0.setSize(80,50);
                        btn0.setLocation(120,500);
                        btn0.addActionListener(new ActionListener(){
                          public void actionPerformed(ActionEvent arg0)
                          {
                            jta.append("0");
                          }
                        });
                        //button dot
                            dot.setSize(80,50);
                            dot.setLocation(220,500);
                            dot.addActionListener(new ActionListener(){
                              public void actionPerformed(ActionEvent arg0)
                              {
                                jta.append(".");
                              }
                            });

                            //button/
                                div.setSize(80,50);
                                div.setLocation(320,500);
                                div.addActionListener(new ActionListener(){
                                  public void actionPerformed(ActionEvent arg0)
                                  {
                                    jta.append("/");
                                  }
                                });




    frame1.add(jta);
    frame1.add(btn1);
    frame1.add(btn2);
    frame1.add(btn3);
    frame1.add(btn4);
    frame1.add(btn5);
    frame1.add(btn6);
    frame1.add(btn7);
    frame1.add(btn8);
    frame1.add(btn9);
    frame1.add(sum);
    frame1.add(sub);
    frame1.add(max);
    frame1.add(ans);
    frame1.add(btn0);
    frame1.add(dot);
    frame1.add(div);


  }
  public static void main(String[] args) {
    Calculator obj = new Calculator();
  }
}
