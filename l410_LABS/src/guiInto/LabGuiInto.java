package guiInto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Component;

public class LabGuiInto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabGuiInto frame = new LabGuiInto();
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
	public LabGuiInto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);
		
		JLabel lbTitle = newLblTitle();
		contentPane.add(lbTitle, BorderLayout.NORTH);
		
		JButton btnWest = newBtn();
		contentPane.add(btnWest, BorderLayout.WEST);
		{
			JPanel textPanel = new JPanel();
			textPanel.setToolTipText("");
			textPanel.setBackground(new Color(112, 128, 144));
			contentPane.add(textPanel, BorderLayout.SOUTH);
			{
				panelJ(textPanel);
			}
			{
				TextField(textPanel);
				textField.setColumns(10);
			}
		}
		{
			JLabel lblNewLabel_1 = RedLabel();
			contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
		}
	}

	private JLabel RedLabel() {
		JLabel lblNewLabel_1 = new JLabel("HI");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 77));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(255, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		return lblNewLabel_1;
	}

	private void panelJ(JPanel textPanel) {
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textPanel.add(lblNewLabel);
	}

	private void TextField(JPanel textPanel) {
		textField = new JTextField();
		textField.setFont(textField.getFont().deriveFont(16f));
		textPanel.add(textField);
	}

	private JButton newBtn() {
		JButton btnWest = new JButton("West");
		btnWest.setAlignmentX(Component.CENTER_ALIGNMENT);
		return btnWest;
	}

	private JLabel newLblTitle() {
		JLabel lbTitle = new JLabel("New label");
		lbTitle.setForeground(new Color(50, 205, 50));
		lbTitle.setBackground(new Color(0, 0, 205));
		lbTitle.setOpaque(true);
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("Tahoma", Font.PLAIN, 33));
		return lbTitle;
	}

}
