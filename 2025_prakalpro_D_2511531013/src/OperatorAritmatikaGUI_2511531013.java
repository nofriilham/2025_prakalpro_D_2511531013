package pekan8_2511531013;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531013 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan ,"Peringatan",JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan ,"Peringantan",JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531013 frame = new OperatorAritmatikaGUI_2511531013();
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
	public OperatorAritmatikaGUI_2511531013() {
		setTitle("Program Operator Aritmatika");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 414, 260);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(52, 27, 274, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 58, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Angka 2");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1_1.setBounds(10, 80, 44, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(10, 114, 44, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(10, 162, 44, 12);
		contentPane.add(lblNewLabel_1_3);
		
		txtAngka1 = new JTextField();
		txtAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka1.setBounds(76, 55, 68, 18);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka2.setBounds(76, 77, 68, 18);
		contentPane.add(txtAngka2);
		txtAngka2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(76, 159, 68, 18);
		contentPane.add(txtHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(76, 114, 66, 20);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int Hasil ;
			public void actionPerformed(ActionEvent e) {
				if(txtAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan Angka 1");
				}	else if(txtAngka2.getText().trim().isEmpty()) {
						pesanPeringatan("Inputkan Angka 2");
				}	else {
					try {
						int a= Integer.valueOf(txtAngka1.getText());
						int b= Integer.parseInt(txtAngka2.getText());
						int c= cbOperator.getSelectedIndex();
						if (c==0) {Hasil= a+b; }
						if (c==1) {Hasil= a-b;}
						if (c==2) {Hasil= a*b;}
						if (c==3) {Hasil= a/b;}
						if (c==4) {Hasil= a%b;}
						txtHasil.setText(String.valueOf(Hasil));
						
					}
						catch (NumberFormatException ex) {
							pesanEror("Angka 1 dan 2 tidak Valid");
						}
					}
				
					
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnNewButton.setBounds(165, 114, 84, 20);
		contentPane.add(btnNewButton);

	}
}
