package CalcGUI;

import javax.swing.*;

import CalcEngine.CalcEngine;

import java.awt.*;
import java.awt.event.*;

public class CalcGUI extends JFrame{

	private static final int WIDTH=450;
	private static final int HEIGHT=350;
	
	private static JLabel investmentAmountL, yearlyInterestRateL, yearsL, futureInvestmentValueL;
	private static JTextField investmentAmountTF, yearlyInterestRateTF, yearsTF, futureInvestmentValueTF;
	private static JButton calculateB, exitB;
	
	
	private static CalculateButtonHandler cbHandler;
	private static ExitButtonHandler ebHandler;
	
	public static void CalcGUI(){
		
		investmentAmountL = new JLabel("Enter the Amount: ", SwingConstants.RIGHT);
		yearlyInterestRateL = new JLabel("Enter Yearly Rate in decimal: ", SwingConstants.RIGHT);
		yearsL = new JLabel("Enter the Years: ", SwingConstants.RIGHT);
		futureInvestmentValueL = new JLabel("Future Value: ",SwingConstants.RIGHT);
		
		investmentAmountTF = new JTextField(10);
		yearlyInterestRateTF = new JTextField(10);
		yearsTF = new JTextField(10);
		futureInvestmentValueTF = new JTextField(10);
		
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);
		
		JFrame frame = new JFrame();
		frame.setBounds(WIDTH,WIDTH,HEIGHT,HEIGHT);
		frame.setTitle("Future Value");
		Container pane = frame.getContentPane();
		pane.setLayout(new GridLayout(5,2));
		
		pane.add(investmentAmountL);
		pane.add(investmentAmountTF);
		pane.add(yearlyInterestRateL);
		pane.add(yearlyInterestRateTF);
		pane.add(yearsL);
		pane.add(yearsTF);
		pane.add(futureInvestmentValueL);
		pane.add(futureInvestmentValueTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private static class CalculateButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CalcEngine engine = new CalcEngine();
			double futureInvestmentValue, yearlyInterestRate, investmentAmount,years;
			investmentAmount=Double.parseDouble(investmentAmountTF.getText());
			yearlyInterestRate=Double.parseDouble(yearlyInterestRateTF.getText());
			years=Double.parseDouble(yearsTF.getText());
			futureInvestmentValue = engine.futureInvestmentValue(investmentAmount, yearlyInterestRate, years);
			futureInvestmentValueTF.setText(""+futureInvestmentValue);
		}
	}
	
	private static class ExitButtonHandler implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		CalcGUI();

	}

}