package ls.calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Dimension;
import java.util.HashMap;
import java.text.NumberFormat;


public class Calculator{
        
        public static Double answer = null;
        public static Double operand1 = null;
        public static Double operand2 = null;
        public static String operator = null;

	public static void main(String[] args){
		
		HashMap<String,JButton> calculatorButtons = new HashMap<>();
		
		JFrame calculatorWindow = new JFrame("Big Data ~ Calculator");
                calculatorWindow.setIconImage(new ImageIcon(Calculator.class.getResource("/calcinterface_reduced.jpg")).getImage());
		calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorWindow.setSize(900, 1200);
		
		JPanel base = new JPanel();
		base.setSize(900,1200);
		GridBagLayout gbl = new GridBagLayout();
		base.setLayout(gbl);
		Border border1 = BorderFactory.createLineBorder(Color.BLUE, 4);
		base.setBorder(border1);
		base.setLocation(0, 0);

		GeneralKeyBoardActivityListener gkbal = new GeneralKeyBoardActivityListener(calculatorButtons);
		base.addKeyListener(gkbal);
		base.setFocusable(true);
		base.requestFocusInWindow();

		calculatorWindow.getContentPane().add(base);

		JLabel screen = new JLabel(" ");
		screen.setOpaque(true);
		screen.setBackground(Color.blue);
		screen.setForeground(Color.white);
		screen.setHorizontalAlignment(SwingConstants.LEFT);
		Font font1 = new Font("TimesNewRoman", Font.BOLD, 50);
		screen.setFont(font1);
		Border border2 = BorderFactory.createLoweredBevelBorder();
		screen.setBorder(border2);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 6;
		base.add(screen,c);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth=1;
		JButton seven=new JButton("7");
		NormalButtonActionListener nbal = new NormalButtonActionListener(screen);
		seven.addActionListener(nbal);
		base.add(seven,c);
		calculatorButtons.put("7",seven);
		seven.setFocusable(false);
		seven.setBackground(Color.black);
		seven.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth=1;
		JButton eight=new JButton("8");
		nbal = new NormalButtonActionListener(screen);
		eight.addActionListener(nbal);
		base.add(eight,c);
		calculatorButtons.put("8",eight);
		eight.setFocusable(false);
		eight.setBackground(Color.black);
		eight.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth=1;
		JButton nine=new JButton("9");
		nbal = new NormalButtonActionListener(screen);
		nine.addActionListener(nbal);
		base.add(nine,c);
		calculatorButtons.put("9",nine);
		nine.setFocusable(false);
		nine.setBackground(Color.black);
		nine.setForeground(Color.white);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 1;
		c.gridwidth=1;
		JButton del=new JButton("DEL");
		DelButtonActionListener dbal = new DelButtonActionListener(screen, calculatorButtons);
		del.addActionListener(dbal);
		base.add(del,c);
		calculatorButtons.put("DEL",del);
		del.setFocusable(false);
		del.setBackground(Color.red);
		del.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 1;
		c.gridwidth=1;
		JButton ac=new JButton("AC");
		ACButtonActionListener acbal = new ACButtonActionListener(screen);
		ac.addActionListener(acbal);
		base.add(ac,c);
		calculatorButtons.put("AC",ac);
		ac.setFocusable(false);
		ac.setBackground(Color.red);
		ac.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth=1;
		JButton four=new JButton("4");
		nbal = new NormalButtonActionListener(screen);
		four.addActionListener(nbal);
		base.add(four,c);
		calculatorButtons.put("4",four);
		four.setFocusable(false);
		four.setBackground(Color.black);
		four.setForeground(Color.white);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth=1;
		JButton five=new JButton("5");
		nbal = new NormalButtonActionListener(screen);
		five.addActionListener(nbal);
		base.add(five,c);
		calculatorButtons.put("5",five);
		five.setFocusable(false);
		five.setBackground(Color.black);
		five.setForeground(Color.white);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 2;
		c.gridwidth=1;
		JButton six=new JButton("6");
		nbal = new NormalButtonActionListener(screen);
		six.addActionListener(nbal);
		base.add(six,c);
		calculatorButtons.put("6",six);
		six.setFocusable(false);
		six.setBackground(Color.black);
		six.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 2;
		c.gridwidth=1;
		JButton multiply=new JButton("\u00d7");
		OperatorButtonActionListener obal = new OperatorButtonActionListener(screen);
		multiply.addActionListener(obal);
		base.add(multiply,c);
		calculatorButtons.put("*",multiply);
		multiply.setFocusable(false);
		multiply.setBackground(Color.white);
		multiply.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 2;
		c.gridwidth=1;
		JButton divide=new JButton("\u00f7");
		obal = new OperatorButtonActionListener(screen);
		divide.addActionListener(obal);
		base.add(divide,c);
		calculatorButtons.put("/",divide);
		divide.setFocusable(false);
		divide.setBackground(Color.white);
		divide.setForeground(Color.black);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 3;
		c.gridwidth=1;
		JButton one=new JButton("1");
		nbal = new NormalButtonActionListener(screen);
		one.addActionListener(nbal);
		base.add(one,c);
		calculatorButtons.put("1",one);
		one.setFocusable(false);
		one.setBackground(Color.black);
		one.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 3;
		c.gridwidth=1;
		JButton two=new JButton("2");
		nbal = new NormalButtonActionListener(screen);
		two.addActionListener(nbal);
		base.add(two,c);
		calculatorButtons.put("2",two);
		two.setFocusable(false);
		two.setBackground(Color.black);
		two.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 3;
		c.gridwidth=1;
		JButton three=new JButton("3");
		nbal = new NormalButtonActionListener(screen);
		three.addActionListener(nbal);
		base.add(three,c);
		calculatorButtons.put("3",three);
		three.setFocusable(false);
		three.setBackground(Color.black);
		three.setForeground(Color.white);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 3;
		c.gridwidth=1;
		JButton addition=new JButton("+");
		obal = new OperatorButtonActionListener(screen);
		addition.addActionListener(obal);
		base.add(addition,c);
		calculatorButtons.put("+",addition);
		addition.setFocusable(false);
		addition.setBackground(Color.white);
		addition.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 3;
		c.gridwidth=1;
		JButton minus=new JButton("-");
		obal = new OperatorButtonActionListener(screen);
		minus.addActionListener(obal);
		base.add(minus,c);
		calculatorButtons.put("-",minus);
		minus.setFocusable(false);
		minus.setBackground(Color.white);
		minus.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 0;
		c.gridy = 4;
		c.gridwidth=1;
		JButton zero=new JButton("0");
		nbal = new NormalButtonActionListener(screen);
		zero.addActionListener(nbal);
		base.add(zero,c);
		calculatorButtons.put("0",zero);
		zero.setFocusable(false);
		zero.setBackground(Color.black);
		zero.setForeground(Color.white);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 1;
		c.gridy = 4;
		c.gridwidth=1;
		JButton dot=new JButton(".");
		DotButtonActionListener dobal
                        = new DotButtonActionListener(screen);
		dot.addActionListener(dobal);
		base.add(dot,c);
		calculatorButtons.put(".",dot);
		dot.setFocusable(false);
		dot.setBackground(Color.black);
		dot.setForeground(Color.white);
	
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 2;
		c.gridy = 4;
		c.gridwidth=1;
		JButton exp=new JButton("EXP");
		obal = new OperatorButtonActionListener(screen);
		exp.addActionListener(obal);
		base.add(exp,c);
		calculatorButtons.put("\u005e",exp);
		exp.setFocusable(false);
		exp.setBackground(Color.white);
		exp.setForeground(Color.black);
		
		c.fill = GridBagConstraints.BOTH;
		c.gridx = 3;
		c.gridy = 4;
		c.gridwidth=1;
		JButton ans=new JButton("Ans");
		AnsButtonActionListener abal = new AnsButtonActionListener(screen);
		ans.addActionListener(abal);
		base.add(ans,c);
		calculatorButtons.put("Ans",ans);
		ans.setFocusable(false);
		ans.setBackground(Color.white);
		ans.setForeground(Color.black);

		c.fill = GridBagConstraints.BOTH;
		c.gridx = 4;
		c.gridy = 4;
		c.gridwidth=1;
		JButton equals=new JButton("=");
		EqualsButtonActionListener ebal = new EqualsButtonActionListener(screen);
		equals.addActionListener(ebal);
		base.add(equals,c);
		calculatorButtons.put("=",equals);
		equals.setFocusable(false);
		equals.setBackground(Color.white);
		equals.setForeground(Color.black);
		
		screen.setPreferredSize(new Dimension(seven.getWidth()+eight.getWidth()+nine.getWidth()+del.getWidth()+ac.getWidth(),100));

		calculatorWindow.pack();
		calculatorWindow.setVisible(true);
		calculatorWindow.setResizable(false);
		
	}
}




class NormalButtonActionListener implements ActionListener{
	JLabel screen1;
	NormalButtonActionListener(JLabel screen2){
		screen1 = screen2;
	}
	@Override
        public void actionPerformed(ActionEvent e) {
            String valueKeyPressed;
            Double number;
            if (Calculator.operand1 == null) {
                valueKeyPressed = ((JButton) e.getSource()).getText();
                number = Double.valueOf(valueKeyPressed);
                Calculator.operand1 = number;
                screen1.setText(valueKeyPressed);
            } else {
                if (Calculator.operator == null) {
                valueKeyPressed = ((JButton) e.getSource()).getText();
                valueKeyPressed = screen1.getText().concat(valueKeyPressed);
                number = Double.valueOf(valueKeyPressed);
                Calculator.operand1 = number;
                screen1.setText(valueKeyPressed);
                } else {
                        if (Calculator.operand2 == null) {
                        valueKeyPressed = ((JButton) e.getSource()).getText();
                        number = Double.valueOf(valueKeyPressed);
                        Calculator.operand2 = number;
                        screen1.setText(screen1.getText().concat(valueKeyPressed));
                        }else{
                            valueKeyPressed = ((JButton) e.getSource()). getText();
                            valueKeyPressed = screen1.getText().concat(valueKeyPressed);
                            String slicer = Calculator.operator;
                            if (Calculator.operator.equalsIgnoreCase("/")) {
                                    slicer = "\\u00f7";  
                            }
                                if (Calculator.operator.equalsIgnoreCase("*")) {
                                    slicer = "\\u00d7";
                                }
                                if (Calculator.operator.equalsIgnoreCase("+")) {
                                    slicer = "\\u002b";
                                }
                                if (Calculator.operator.equalsIgnoreCase("^")) {
                                    slicer = "\\u005e";
                                }
                                System.out.println("screen content [" + screen1.getText() + "} before split with " + slicer);
                                number = Double.valueOf(valueKeyPressed.split(slicer) [1]);
                                Calculator.operand2 = number;
                                screen1.setText(valueKeyPressed);
                                System.out.println("operand1 = " + Calculator.operand1);
                                System.out.println("operand2 = " + Calculator.operand2);
                                System.out.println("operator = " + Calculator.operator);
            }
        }
    }
}
}
class DelButtonActionListener implements ActionListener{
        HashMap<String, JButton> calculatorButtons1;
	JLabel screen1;
	DelButtonActionListener(JLabel screen2, HashMap<String, JButton> calculatorButtons2){
		screen1=screen2;
                calculatorButtons1 = calculatorButtons2;
	}
	
        @Override
	public void actionPerformed(ActionEvent e) {
                if (Calculator.operand2 != null) {
                    
                    String op2string = Calculator.operand2.toString();
                    
                    if (op2string.substring(op2string.length() - 2). equalsIgnoreCase(".0")) {
                        op2string = op2string.substring(0, op2string.length() - 2);
                    }
                    if (op2string.length() > 1) {
                        op2string = op2string.substring(0, op2string.length() - 1);
                        Calculator.operand2 = Double.valueOf(op2string);
                        
                        String op2disp = Calculator.operator;
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "\u00f7";
                        }
                        if (Calculator.operator.equalsIgnoreCase("*")) {
                            op2disp = "\u00d7";
                        }
                        if (Calculator.operator.equalsIgnoreCase("+")) {
                            op2disp = "\u002b";
                        }
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "\u005e";
                        }
                        screen1.setText(Calculator.operand1 + op2disp + Calculator.operand2);
                }else {
                        Calculator.operand2 = null;
                        String op2disp = Calculator.operator;
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "\u00f7";
                        }
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "\u00d7";
                        }
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "\u002b";
                        }
                        if (Calculator.operator.equalsIgnoreCase("/")) {
                            op2disp = "/u005e";
                        }
                        screen1.setText(Calculator.operand1 + op2disp);
                    }
                }else{
                    if (Calculator.operator != null){
                        Calculator.operator = null;
                        screen1.setText(Calculator.operand1.toString());
                }else{
                        if (Calculator.operand1 != null) {
                            String op1string = Calculator.operand1.toString();
                            if (op1string.substring(op1string.length() - 2). equalsIgnoreCase(".0")) {
                                op1string = op1string.substring(0, op1string.length() - 2);
                            }
                            if (op1string.length() > 1){
                                op1string = op1string.substring(0, op1string.length() - 1);
                                Calculator.operand1 = Double.valueOf(op1string);
                                screen1.setText(Calculator.operand1.toString());
                            } else {
                                calculatorButtons1.get("ac").doClick();
                                Calculator.operand1 = null;
                                Calculator.operand2 = null;
                                Calculator.operator = null;
                            }
                        }
                    }
                }
            }
	}

class ACButtonActionListener implements ActionListener{
	JLabel screen1;
	ACButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		screen1.setText(" ");
	}
}
class GeneralKeyBoardActivityListener implements KeyListener{
	HashMap<String,JButton> calculatorButtons1;

	GeneralKeyBoardActivityListener(HashMap<String,JButton> calculatorButtons2){
		calculatorButtons1=calculatorButtons2;
	}
        @Override
	public void keyPressed(KeyEvent e) {
	}
        @Override
	public void keyReleased(KeyEvent e) {
	}
        @Override
	public void keyTyped(KeyEvent e) {
		char thekey=e.getKeyChar();
		System.out.println("the key typed = "+thekey);
		if(calculatorButtons1.containsKey(String.valueOf(thekey))){
			calculatorButtons1.get(String.valueOf(thekey)).doClick();
		}
	}
}	
class AnsButtonActionListener implements ActionListener{
	JLabel screen1;
	AnsButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		if(Calculator.answer != null){
			Calculator.operand2 = null;
			Calculator.operator = null;
			Calculator.operand1 = Calculator.answer;
			screen1.setText("" + Calculator.operand1);
		}
	}
}
class EqualsButtonActionListener implements ActionListener{
	JLabel screen1;
	EqualsButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		if(Calculator.operand1 != null && Calculator.operand2 != null){
			if(Calculator.operator.equalsIgnoreCase("^")){
				Calculator.answer = Math.pow(Calculator.operand1, Calculator.operand2);
			}
			if(Calculator.operator.equalsIgnoreCase("+")){
				Calculator.answer = Calculator.operand1 + Calculator.operand2;
			}
			if(Calculator.operator.equalsIgnoreCase("-")){
				NumberFormat nf = NumberFormat.getNumberInstance();
				Calculator.answer = Double.valueOf(nf.format(Calculator.operand1 - Calculator.operand2));
			}
			if(Calculator.operator.equalsIgnoreCase("*")){
				Calculator.answer = Calculator.operand1*Calculator.operand2;
			}
			if(Calculator.operator.equalsIgnoreCase("/")){
				if(Calculator.operand2 != 0) {
					Calculator.answer = Calculator.operand1/Calculator.operand2;
				} else {
					Calculator.answer = 0.0;
				}
			}
			Calculator.operand2 = null;
			Calculator.operator = null;
			Calculator.operand1 = Calculator.answer;
			screen1.setText("" + Calculator.operand1);
		}
	}
}
class EXPButtonActionListener implements ActionListener{
	JLabel screen1;
	EXPButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		if(screen1.getText().length()>1){
			screen1.setText(screen1.getText().concat("^"));
		}
	}
}

class DotButtonActionListener implements ActionListener{
	JLabel screen1;
	
        DotButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        
        @Override
        public void actionPerformed(ActionEvent e) {
	String valueKeyPressed = ((JButton) e.getSource()).getText();
	if(Calculator.operand1 != null) {
		if(Calculator.operator == null) {
			if (screen1.getText().contains(valueKeyPressed) ==false){
				if (screen1.getText().endsWith(".") == false){
					valueKeyPressed = screen1.getText()
                                                .concat(valueKeyPressed);
					Calculator.operand1=Double.valueOf(valueKeyPressed);
					screen1.setText(valueKeyPressed);
				}
			}
		}else{
			if (Calculator.operand2 != null) {
				String temp = "";
				if(Calculator.operator.equalsIgnoreCase("*")){
					temp = screen1.getText().split("\\u00d7")[1];
				} else {
					if (Calculator.operator.equalsIgnoreCase("/")){
						temp = screen1.getText().split("\\u00f7")[1];
					} else {
						if (Calculator.operator.equalsIgnoreCase("+")){
							temp = screen1.getText().split("\\u002b")[1];
						} else {
							if (Calculator.operator.equalsIgnoreCase("^")){
								temp = screen1.getText().split("\\u005e")[1];
							} else {
								temp = (screen1.getText().split(Calculator.operator))[1];
							}
						}
					}	
				}
				if (temp.contains(valueKeyPressed) == false) {
					if (temp.endsWith(".") == false) {
						temp =temp.concat(valueKeyPressed);
						valueKeyPressed = screen1.getText().concat(valueKeyPressed);
						Calculator.operand2 = Double.valueOf(temp);
						screen1.setText(valueKeyPressed);
					}
				}
			}
		}
	}
    }
}
class OperatorButtonActionListener implements ActionListener{
	JLabel screen1;
	OperatorButtonActionListener(JLabel screen2){
		screen1=screen2;
	}
        @Override
	public void actionPerformed(ActionEvent e) {
		String valueKeyPressed;
		if (Calculator.operand1 != null && Calculator.operand2 == null){
			valueKeyPressed=((JButton) e.getSource()).getText();
			if (valueKeyPressed.equalsIgnoreCase("exp")){
				Calculator.operator = "^";
				screen1.setText(Calculator.operand1.toString().concat(Calculator.operator));
			} else {
				if (valueKeyPressed.equalsIgnoreCase("\u00f7")){
					Calculator.operator="/";
					screen1.setText(Calculator.operand1.toString().concat("\u00d7"));
				} else {
					if (valueKeyPressed.equalsIgnoreCase("\u00d7")){
						Calculator.operator="*";
						screen1.setText(Calculator.operand1.toString().concat("\u00d7"));
					} else {
						Calculator.operator = valueKeyPressed;
						screen1.setText(Calculator.operand1.toString().concat(Calculator.operator));
					}
				}
			}
		}
		if (Calculator.operand1 != null && Calculator.operand2 !=null){
			valueKeyPressed = ((JButton) e.getSource()).getText();
			if (valueKeyPressed.equalsIgnoreCase("exp")){
				Calculator.operator="^";
				screen1.setText(Calculator.operand1 + "" + Calculator.operator + Calculator.operand2);
			} else {
				if (valueKeyPressed.equalsIgnoreCase("\u00f7")){
					Calculator.operator = "/";
					screen1.setText(Calculator.operand1.toString().concat("\u00f7") + Calculator.operand2);
				} else {
					if (valueKeyPressed.equalsIgnoreCase("\u00d7")){
						Calculator.operator = "*";
						screen1.setText(Calculator.operand1.toString().concat("\u00d7") + Calculator.operand2);
					} else {
						Calculator.operator = valueKeyPressed;
						screen1.setText(Calculator.operand1.toString().concat(Calculator.operator) + Calculator.operand2);
					}
				}
			}
                }
        }
    }