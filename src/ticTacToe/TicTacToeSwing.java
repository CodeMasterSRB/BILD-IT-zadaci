package ticTacToe;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

class TicTacToeSwing extends JFrame implements ItemListener, ActionListener {
	/**
		 * 
		 */

	TicTacToeSwing() {
		//set name on top of the window
		super("Krizic kruzic");

		// set liquidlf look and feel
		try {
			UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
			// UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassStyleWrapper.class");
		} catch (Exception e) {

		}

		CheckboxGroup cbg = new CheckboxGroup();
		cb1 = new Checkbox("vs PC", cbg, false);
		cb2 = new Checkbox("vs PRIJATELJA", cbg, false);
		cb1.setBounds(120, 80, 100, 80);
		cb2.setBounds(120, 150, 100, 80);
		add(cb1);
		add(cb2);
		cb1.addItemListener(this);
		cb2.addItemListener(this);

		validS = true;
		type = true;
		set = true;
		
		//create picture of X(krizic) and O (kruzic)
		i1 = new ImageIcon(this.getClass().getResource("X.png"));
		i2 = new ImageIcon(this.getClass().getResource("O.png"));
		i11 = new ImageIcon(this.getClass().getResource("X.png"));
		i22 = new ImageIcon(this.getClass().getResource("O.png"));

		setLayout(null);
		setSize(330, 450);

		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// eof constructor

	private static final long serialVersionUID = 1L;

	int i, j, ii, jj, x, y, yes;
	
	//possible states
	int stateA[][] = { { 10, 1, 2, 3, 11 }, { 10, 1, 4, 7, 11 }, { 10, 1, 5, 9, 11 }, { 10, 2, 5, 8, 11 },
			{ 10, 3, 5, 7, 11 }, { 10, 3, 6, 9, 11 }, { 10, 4, 5, 6, 11 }, { 10, 7, 8, 9, 11 } };
	int stateB[][] = { { 10, 1, 2, 3, 11 }, { 10, 1, 4, 7, 11 }, { 10, 1, 5, 9, 11 }, { 10, 2, 5, 8, 11 },
			{ 10, 3, 5, 7, 11 }, { 10, 3, 6, 9, 11 }, { 10, 4, 5, 6, 11 }, { 10, 7, 8, 9, 11 } };

	boolean validS, type, set;

	Icon i1, i2, icon, i11, i22;
	Checkbox cb1, cb2;
	JLabel l1, l2;
	JButton b[] = new JButton[9];
	JButton resetGame;

	public void checkS(int num1) {
		for (ii = 0; ii <= 7; ii++) {
			for (jj = 1; jj <= 3; jj++) {
				if (stateA[ii][jj] == num1) {
					stateA[ii][4] = 11;
				}

			} // eof for jj

		} // eof for ii
	}// eof check

	// computer plays
	public void computerLogic(int num) {

		for (i = 0; i <= 7; i++) {
			for (j = 1; j <= 3; j++) {
				if (stateA[i][j] == num) {
					stateA[i][0] = 11;
					stateA[i][4] = 10;
				}
			}
		}
		for (i = 0; i <= 7; i++) { // for 1
			set = true;
			if (stateA[i][4] == 10) { // if 1
				int count = 0;
				for (j = 1; j <= 3; j++) { // for 2
					if (b[(stateA[i][j] - 1)].getIcon() != null) { // if 2
						count++;
					} // eof if 2
					else {
						yes = stateA[i][j];
					}
				} // eof for 2
				if (count == 2) { // if 2
					b[yes - 1].setIcon(i2);
					this.checkS(yes);
					set = false;
					break;
				} // eof if 2
			} // eof if 1
			else if (stateA[i][0] == 10) {
				for (j = 1; j <= 3; j++) { // for2
					if (b[(stateA[i][j] - 1)].getIcon() == null) { // if 1
						b[(stateA[i][j] - 1)].setIcon(i2);
						this.checkS(stateA[i][j]);
						set = false;
						break;
					} // eof if1
				} // eof for 2
				if (set == false)
					break;
			} // eof elseif

			if (set == false)
				break;
		} // eof for 1

	}// eof complogic

	// method which print all buttons and set their bounds in window
	public void showButton() {

		x = 10;
		y = 10;
		j = 0;
		for (i = 0; i <= 8; i++, x += 100, j++) {
			b[i] = new JButton();
			if (j == 3) {
				j = 0;
				y += 100;
				x = 10;
			}
			b[i].setBounds(x, y, 100, 100);
			add(b[i]);
			b[i].addActionListener(this);
		} // eof for

		// set bound for button Resetuj
		resetGame = new JButton("RESETUJ");
		resetGame.setBounds(100, 350, 100, 50);
		add(resetGame);
		resetGame.addActionListener(this);

	}// eof showButton

	public void itemStateChanged(ItemEvent e) {
		if (cb1.getState()) {
			type = false;
		}

		else if (cb2.getState()) {
			type = true;
		}
		remove(cb1);
		remove(cb2);
		repaint(0, 0, 330, 450);
		showButton();
	}// eof itemstate

	public void actionPerformed(ActionEvent e) {
		// friend plays
		if (type == true)// logicfriend
		{
			if (e.getSource() == resetGame) {
				for (i = 0; i <= 8; i++) {
					b[i].setIcon(null);
				} // eof for
			} else {
				for (i = 0; i <= 8; i++) {
					if (e.getSource() == b[i]) {

						if (b[i].getIcon() == null) {
							if (validS == true) {
								icon = i2;
								validS = false;
							} else {
								icon = i1;
								validS = true;
							}
							b[i].setIcon(icon);
						}
					}
				} // eof for
			} // eof else
		} // eof logic friend
		else if (type == false) { // computer logic
			if (e.getSource() == resetGame) {
				for (i = 0; i <= 8; i++) {
					b[i].setIcon(null);
				} // eof for
				for (i = 0; i <= 7; i++)
					for (j = 0; j <= 4; j++)
						stateA[i][j] = stateB[i][j]; // again initialsing array
			} else { // computer logic
				for (i = 0; i <= 8; i++) {
					if (e.getSource() == b[i]) {
						if (b[i].getIcon() == null) {
							b[i].setIcon(i1);
							if (b[4].getIcon() == null) {
								b[4].setIcon(i2);
								this.checkS(5);
							} else {
								this.computerLogic(i);
							}
						}
					}
				} // eof for
			}
		} // eof complogic

		for (i = 0; i <= 7; i++) {

			Icon icon1 = b[(stateA[i][1] - 1)].getIcon();
			Icon icon2 = b[(stateA[i][2] - 1)].getIcon();
			Icon icon3 = b[(stateA[i][3] - 1)].getIcon();
			if ((icon1 == icon2) && (icon2 == icon3) && (icon1 != null)) {
				if (icon1 == i1) {
					b[(stateA[i][1] - 1)].setIcon(i11);
					b[(stateA[i][2] - 1)].setIcon(i11);
					b[(stateA[i][3] - 1)].setIcon(i11);
					JOptionPane.showMessageDialog(TicTacToeSwing.this, "Vi ste pobijedili, pritisnite RESETUJ");
					break;
				} else if (icon1 == i2) {
					b[(stateA[i][1] - 1)].setIcon(i22);
					b[(stateA[i][2] - 1)].setIcon(i22);
					b[(stateA[i][3] - 1)].setIcon(i22);
					JOptionPane.showMessageDialog(TicTacToeSwing.this, "Nazalost racunar je pobijedio, pritisnite RESETUJ");
					break;
				}
			}
		}

	}// eof actionperformed

	public static void main(String[] args) {
		// Test
		new TicTacToeSwing();
	}// eof main
}// eof class