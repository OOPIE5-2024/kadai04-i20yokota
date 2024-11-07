package kadai04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;

public class Ex04 {

	private JFrame frame;
	private JPanel colorPanel;
	private CurrentColor crrntBckColor = new CurrentColor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex04 window = new Ex04();
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
	public Ex04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel btnPanel = new JPanel();
		frame.getContentPane().add(btnPanel, BorderLayout.NORTH);

		JButton btnRed = new JButton("red");
		btnRed.setForeground(new Color(255, 38, 0));
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crrntBckColor.changeRed();	//赤色を変更
				colorPanel.setBackground(crrntBckColor.getColor());
			}
		});
		btnPanel.add(btnRed);

		JButton btnGreen = new JButton("green");
		btnGreen.setForeground(new Color(0, 249, 0));
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crrntBckColor.changeGreen();	//緑色を変更
				colorPanel.setBackground(crrntBckColor.getColor());
			}
		});
		btnPanel.add(btnGreen);

		JButton btnBlue = new JButton("blue");
		btnBlue.setForeground(new Color(4, 50, 255));
		btnBlue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				crrntBckColor.changeBlue();	//青色を変更
				colorPanel.setBackground(crrntBckColor.getColor());
			}
		});
		btnPanel.add(btnBlue);
		
		colorPanel = new JPanel();
		colorPanel.setBackground(crrntBckColor.getColor());
		frame.getContentPane().add(colorPanel, BorderLayout.CENTER);
	}

}
