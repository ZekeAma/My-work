package WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class windobuilder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windobuilder frame = new windobuilder();
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
	public windobuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		newlblHelloWorld();
		
	}

	private void newlblHelloWorld() {
		JLabel lbHelloWorld = new JLabel("Hello World");
		lbHelloWorld.setOpaque(true);
		lbHelloWorld.setBackground(new Color(240, 230, 140));
		lbHelloWorld.setForeground(new Color(0, 0, 139));
		lbHelloWorld.setHorizontalAlignment(SwingConstants.CENTER);
		lbHelloWorld.setFont(new Font("Microsoft YaHei Light", Font.BOLD, 22));
		contentPane.add(lbHelloWorld, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("button west");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("button north");
		contentPane.add(btnNewButton_1, BorderLayout.NORTH);
	}

}
