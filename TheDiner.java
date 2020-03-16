package breakfast;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
/*
 * Author:		Tyler Blanchard
 * Date:		9/27/2018
 * 
 * Descriptions:		This program takes orders for breakfast at a diner
 * 						using radio buttons. Asked for special info.
 */
public class TheDiner extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroupSauce = new ButtonGroup();
	private final ButtonGroup buttonGroupMeat = new ButtonGroup();
	private final ButtonGroup buttonGroupToast = new ButtonGroup();
	private final ButtonGroup buttonGroupEggStyle = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheDiner frame = new TheDiner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheDiner() {
		setTitle("Breakfast at the Diner");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEggStyle = new JLabel("How do you like your eggs?");
		lblEggStyle.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JRadioButton rdbtnOverEasy = new JRadioButton("Over Easy");
		rdbtnOverEasy.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroupEggStyle.add(rdbtnOverEasy);
		
		JRadioButton rdbtnHotSauce = new JRadioButton("Hot sauce");
		rdbtnHotSauce.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupSauce.add(rdbtnHotSauce);
		
		JRadioButton rdbtnTabasco = new JRadioButton("Tabasco");
		rdbtnTabasco.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupSauce.add(rdbtnTabasco);
		
		JRadioButton rdbtnNoHotSauce = new JRadioButton("No hot sauce");
		rdbtnNoHotSauce.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupSauce.add(rdbtnNoHotSauce);
		
		JLabel lblSauce = new JLabel("What kind of sauce?");
		lblSauce.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JLabel lblBreakfastMeat = new JLabel("Do you want bacon, ham, or sausage?");
		lblBreakfastMeat.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JRadioButton rdbtnBacon = new JRadioButton("Bacon");
		rdbtnBacon.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupMeat.add(rdbtnBacon);
		
		JRadioButton rdbtnHam = new JRadioButton("Ham");
		rdbtnHam.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupMeat.add(rdbtnHam);
		
		JRadioButton rdbtnSausage = new JRadioButton("Sausage");
		rdbtnSausage.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupMeat.add(rdbtnSausage);
		
		JLabel lblToast = new JLabel("What type of toast do you want?");
		lblToast.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JRadioButton rdbtnWhiteToast = new JRadioButton("White Toast");
		rdbtnWhiteToast.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupToast.add(rdbtnWhiteToast);
		
		JRadioButton rdbtnWheatToast = new JRadioButton("Wheat Toast");
		rdbtnWheatToast.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupToast.add(rdbtnWheatToast);
		
		JRadioButton rdbtnRyeToast = new JRadioButton("Rye Toast");
		rdbtnRyeToast.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupToast.add(rdbtnRyeToast);
		
		JRadioButton rdbtnScrambled = new JRadioButton("Scrambled");
		rdbtnScrambled.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupEggStyle.add(rdbtnScrambled);
		
		JRadioButton rdbtnSunnySideUp = new JRadioButton("Sunny Side Up");
		rdbtnSunnySideUp.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupEggStyle.add(rdbtnSunnySideUp);
		
		JRadioButton rdbtnPoached = new JRadioButton("Poached");
		rdbtnPoached.setFont(new Font("Dialog", Font.PLAIN, 14));
		buttonGroupEggStyle.add(rdbtnPoached);
		
		// Tell the user there order was sent to the kitchen after clicking btnOrderUp
		JButton btnOrderUp = new JButton("Order Up");
		btnOrderUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Your order was sent to the kitchen.");
			}
		});
		btnOrderUp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblSpecialInstructors = new JLabel("Special Instructors:");
		lblSpecialInstructors.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		JScrollPane scrollPaneSpecialInstructors = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblBreakfastMeat, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblToast, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnBacon, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnHam, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnSausage, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblSauce, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEggStyle, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 175, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSpecialInstructors, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(scrollPaneSpecialInstructors, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(btnOrderUp, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(rdbtnHotSauce, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnTabasco, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(rdbtnNoHotSauce, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addComponent(rdbtnWhiteToast, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnWheatToast, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(rdbtnRyeToast, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnOverEasy, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnScrambled, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnSunnySideUp, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(rdbtnPoached, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addGap(113))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEggStyle)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnOverEasy)
						.addComponent(rdbtnScrambled)
						.addComponent(rdbtnSunnySideUp)
						.addComponent(rdbtnPoached))
					.addGap(18)
					.addComponent(lblSauce)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnHotSauce)
						.addComponent(rdbtnTabasco)
						.addComponent(rdbtnNoHotSauce))
					.addGap(18)
					.addComponent(lblBreakfastMeat)
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnBacon)
						.addComponent(rdbtnHam)
						.addComponent(rdbtnSausage))
					.addGap(18)
					.addComponent(lblToast)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnWhiteToast)
						.addComponent(rdbtnWheatToast)
						.addComponent(rdbtnRyeToast))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblSpecialInstructors)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPaneSpecialInstructors, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrderUp, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(14))
		);
		
		JEditorPane editorPaneSpecialInstructors = new JEditorPane();
		editorPaneSpecialInstructors.setText("");
		scrollPaneSpecialInstructors.setViewportView(editorPaneSpecialInstructors);
		contentPane.setLayout(gl_contentPane);
	}
}
