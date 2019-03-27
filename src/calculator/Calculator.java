package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Calculator extends JFrame {

	double Fnum;
	double Snum;
	double result;
	String answer;
	String Opp;

	JTextArea txt_area = new JTextArea(2, 5);

	JButton btn_Zero = new JButton(" 0 "); // creating field for button
	JButton btn_One = new JButton(" 1 ");
	JButton btn_Two = new JButton(" 2 ");
	JButton btn_Three = new JButton(" 3 ");
	JButton btn_Four = new JButton(" 4 ");
	JButton btn_Five = new JButton(" 5 ");
	JButton btn_Six = new JButton(" 6 ");
	JButton btn_Seven = new JButton(" 7 ");
	JButton btn_Eight = new JButton(" 8 ");
	JButton btn_Nine = new JButton(" 9 ");
	JButton btn_Add = new JButton(" + ");
	JButton btn_Sub = new JButton(" - ");
	JButton btn_Divides = new JButton(" / ");
	JButton btn_Multi = new JButton(" * ");
	JButton btn_Equals = new JButton(" = ");
	JButton btn_Clr = new JButton(" CLEAR ");
	JButton btn_Dot = new JButton(" . ");

	public Calculator() {
		createGUI();
		showFrame();
	}

	private void createGUI() {
		this.add(txt_area, BorderLayout.NORTH);

		txt_area.setFont(new Font("Display", Font.ITALIC, 24));
		txt_area.setLineWrap(true);
		txt_area.setWrapStyleWord(true);
		txt_area.setForeground(Color.WHITE);
		txt_area.setBackground(Color.black);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());

		buttonPanel.setBackground(Color.GRAY);

		btn_Zero.setBackground(Color.DARK_GRAY);
		btn_Zero.setOpaque(true);
		btn_One.setBackground(Color.DARK_GRAY);
		btn_One.setOpaque(true);
		btn_Two.setBackground(Color.DARK_GRAY);
		btn_Two.setOpaque(true);
		btn_Three.setBackground(Color.DARK_GRAY);
		btn_Three.setOpaque(true);
		btn_Four.setBackground(Color.DARK_GRAY);
		btn_Four.setOpaque(true);
		btn_Five.setBackground(Color.DARK_GRAY);
		btn_Five.setOpaque(true);
		btn_Six.setBackground(Color.DARK_GRAY);
		btn_Six.setOpaque(true);
		btn_Seven.setBackground(Color.DARK_GRAY);
		btn_Seven.setOpaque(true);
		btn_Eight.setBackground(Color.DARK_GRAY);
		btn_Eight.setOpaque(true);
		btn_Nine.setBackground(Color.DARK_GRAY);
		btn_Nine.setOpaque(true);
		btn_Add.setBackground(Color.DARK_GRAY);
		btn_Add.setOpaque(true);
		btn_Sub.setBackground(Color.DARK_GRAY);
		btn_Sub.setOpaque(true);
		btn_Equals.setBackground(Color.DARK_GRAY);
		btn_Equals.setOpaque(true);
		btn_Divides.setBackground(Color.DARK_GRAY);
		btn_Divides.setOpaque(true);
		btn_Multi.setBackground(Color.DARK_GRAY);
		btn_Multi.setOpaque(true);
		btn_Dot.setBackground(Color.DARK_GRAY);
		btn_Dot.setOpaque(true);

		// TODO: add some buttons to the panel
		buttonPanel.add(btn_Eight);
		buttonPanel.add(btn_Nine);
		buttonPanel.add(btn_Add);
		buttonPanel.add(btn_Six);
		buttonPanel.add(btn_Seven);
		buttonPanel.add(btn_Sub);
		buttonPanel.add(btn_Four);
		buttonPanel.add(btn_Five);
		buttonPanel.add(btn_Multi);
		buttonPanel.add(btn_Two);
		buttonPanel.add(btn_Three);
		buttonPanel.add(btn_Divides);
		buttonPanel.add(btn_Zero);
		buttonPanel.add(btn_One);
		buttonPanel.add(btn_Equals);
		buttonPanel.add(btn_Dot);
		buttonPanel.add(btn_Clr);

		this.add(buttonPanel, BorderLayout.CENTER); // adding button layout to frame

		/*
		 * Add action listeners
		 */

		btn_Zero.addActionListener(new ActionListener() { // Listens for when a button is pressed and then uses it
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("0".toString()); // tells the button what to print in box if clicked
			}
		});

		btn_One.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("1".toString());
			}
		});

		btn_Add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				Fnum = Double.parseDouble(txt_area.getText());
				txt_area.setText("");
				Opp = "+";
				// txt_area.append("+".toString());
			}
		});

		btn_Two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("2".toString());
			}
		});

		btn_Three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("3".toString());
			}
		});

		btn_Sub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				Fnum = Double.parseDouble(txt_area.getText());
				txt_area.setText("");
				Opp = "-";
				// txt_area.append("-".toString());
			}
		});

		btn_Four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("4".toString());
			}
		});

		btn_Five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("5".toString());
			}
		});

		btn_Multi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				Fnum = Double.parseDouble(txt_area.getText());
				txt_area.setText("");
				Opp = "*";
			}
		});

		btn_Six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("6".toString());
			}
		});

		btn_Seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("7".toString());
			}
		});

		btn_Divides.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {

				Fnum = Double.parseDouble(txt_area.getText());
				txt_area.setText("");
				Opp = "/";
			}
		});

		btn_Eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("8".toString());
			}
		});

		btn_Nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append("9".toString());
			}
		});

		btn_Equals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				String answer;
				Snum = Double.parseDouble(txt_area.getText());

				if (Fnum <= 0) {
					System.out.println("ERROR: ReEnter Equation. . . ");
				} else {
					if (Opp == "+") {
						result = Fnum + Snum;
						answer = String.format("%.2f", result);
						txt_area.setText(answer);
					} else if (Opp == "-") {
						result = Fnum - Snum;
						answer = String.format("%.2f", result);
						txt_area.setText(answer);
					} else if (Opp == "*") {
						result = Fnum * Snum;
						answer = String.format("%.2f", result);
						txt_area.setText(answer);
					} else if (Opp == "/") {
						result = Fnum / Snum;
						answer = String.format("%.2f", result);
						txt_area.setText(answer);
					}  {
						

					}
				}
			}
		});

		btn_Clr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.setText(null);
			}
		});

		btn_Dot.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent f) {
				txt_area.append(".".toString());
			}
		});

	}

	private void showFrame() { // creating frame
		this.setSize(275, 325); // setting the pixels
		this.setTitle(" Anthony's Calculator "); // title of window
		this.setVisible(true); // shows the window

		txt_area.setEditable(false);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setForeground(Color.black);

	}
	private void setIcon() { 
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("AD_LOGO.jpg")));
	}
}
