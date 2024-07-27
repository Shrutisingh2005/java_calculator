package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class calc {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String op;
	String Answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 468, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBack = new JButton("\uF0E7");
		btnBack.setFont(new Font("Wingdings", Font.BOLD, 24));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace = null ;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText()) ;
					str.deleteCharAt(textField.getText().length()-1);
					Backspace = str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBack.setBounds(10, 96, 100, 75);
		frame.getContentPane().add(btnBack);
		
		JButton btnClr = new JButton("CLR");
		btnClr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClr.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnClr.setBounds(120, 96, 100, 75);
		frame.getContentPane().add(btnClr);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBounds(10, 351, 100, 75);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBounds(120, 351, 100, 75);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBounds(230, 351, 100, 75);
		frame.getContentPane().add(btn9);
		
		JButton btndivide = new JButton("/");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/" ;
			}
		});
		btndivide.setFont(new Font("Tahoma", Font.BOLD, 30));
		btndivide.setBounds(345, 351, 100, 75);
		frame.getContentPane().add(btndivide);
		
		JButton btnmultiply = new JButton("*");
		btnmultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*" ;
			}
		});
		btnmultiply.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnmultiply.setBounds(345, 266, 100, 75);
		frame.getContentPane().add(btnmultiply);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-" ;
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnminus.setBounds(345, 181, 100, 75);
		frame.getContentPane().add(btnminus);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+" ;	
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnplus.setBounds(345, 96, 100, 75);
		frame.getContentPane().add(btnplus);
		
		JButton btndouble0 = new JButton("00");
		btndouble0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btndouble0.getText();
				textField.setText(number);
			}
		});
		btndouble0.setFont(new Font("Tahoma", Font.BOLD, 30));
		btndouble0.setBounds(229, 96, 100, 75);
		frame.getContentPane().add(btndouble0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.setBounds(10, 181, 100, 75);
		frame.getContentPane().add(btn1);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setBounds(10, 266, 100, 75);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBounds(120, 266, 100, 75);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.setBounds(120, 181, 100, 75);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBounds(229, 181, 100, 75);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBounds(229, 266, 100, 75);
		frame.getContentPane().add(btn6);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn0.setBounds(10, 436, 100, 75);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDot.setBounds(120, 436, 100, 75);
		frame.getContentPane().add(btnDot);
		
		JButton btnequal = new JButton("=");
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(op == "+")
				{
					result = first + second ;
					answer = String.format("%.2f", result) ;
					textField.setText(answer);
				}
				else if(op == "-")
				{
					result = first - second ;
					answer = String.format("%.2f", result) ;
					textField.setText(answer);
				}
				else if(op == "*")
				{
					result = first * second ;
					answer = String.format("%.2f", result) ;
					textField.setText(answer);
				}
				else if(op == "/")
				{
					result = first / second ;
					answer = String.format("%.2f", result) ;
					textField.setText(answer);
				}
				else if(op == "%")
				{
					result = first % second ;
					answer = String.format("%.2f", result) ;
					textField.setText(answer);
				}
				
			}
		});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnequal.setBounds(230, 436, 100, 75);
		frame.getContentPane().add(btnequal);
		
		JButton btnpercentage = new JButton("%");
		btnpercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "%" ;
			}
		});
		btnpercentage.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnpercentage.setBounds(345, 436, 100, 75);
		frame.getContentPane().add(btnpercentage);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField.setBounds(10, 10, 434, 76);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
