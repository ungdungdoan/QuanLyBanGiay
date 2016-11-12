package AppQLgiay;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import AppQLgiay.BanGiay;
import AppQLgiay.BanGiayDAO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class appQLgiay extends JFrame  {

	private JPanel contentPane;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					appQLgiay frame = new appQLgiay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	/**
	 * Create the panel.
	 */
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btnXoa;
	private JButton btnSua;

	/**
	 * Create the panel.
	 */
	public appQLgiay() {
		setSize(600, 600);
		
		
		setBackground(new Color(255, 255, 255));
		setForeground(Color.BLUE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LO\u1EA0I");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(70, 61, 35, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblQunLBn = new JLabel("QU\u1EA2N L\u00DD B\u00C1N GI\u00C0Y");
		lblQunLBn.setBounds(189, 11, 218, 22);
		lblQunLBn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblQunLBn.setForeground(Color.RED);
		getContentPane().add(lblQunLBn);
		
		textField = new JTextField();
		textField.setBounds(115, 60, 170, 29);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblM = new JLabel("M\u00C3");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblM.setForeground(new Color(0, 0, 255));
		lblM.setBounds(352, 61, 35, 23);
		getContentPane().add(lblM);
		
		textField_1 = new JTextField();
		textField_1.setBounds(397, 60, 176, 29);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMuSc = new JLabel("M\u00C0U S\u1EAEC");
		lblMuSc.setForeground(Color.BLUE);
		lblMuSc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMuSc.setBounds(40, 107, 67, 11);
		getContentPane().add(lblMuSc);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 100, 176, 29);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("SIZE");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(341, 105, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(397, 100, 176, 29);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSoLuong = new JLabel("SO LUONG");
		lblSoLuong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSoLuong.setForeground(Color.BLUE);
		lblSoLuong.setBounds(24, 151, 84, 22);
		getContentPane().add(lblSoLuong);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 150, 176, 29);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblGia = new JLabel("GIA");
		lblGia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGia.setForeground(Color.BLUE);
		lblGia.setBounds(341, 151, 46, 22);
		getContentPane().add(lblGia);
		
		textField_5 = new JTextField();
		textField_5.setBounds(397, 150, 176, 29);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(24, 210, 549, 139);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 549, 137);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(model = new DefaultTableModel(
			new Object[][] {
	
			},
			new String[] {
				"LOAI", "MA", "MAU SAC", "SIZE", "SO LUONG", "GIA"
			}
			
		));		   
		scrollPane.setViewportView(table);

		
		
		
		JButton btnThem = new JButton("THEM");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				themGiay();
			}
		});
		btnThem.setForeground(Color.BLUE);
	
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnThem.setBounds(144, 395, 81, 36);
		getContentPane().add(btnThem);
		
		JButton btnSua = new JButton("CAP NHAT");
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				capnhatGiay();
				
			}
		});
		btnSua.setForeground(Color.BLUE);
		btnSua.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSua.setBounds(253, 395, 110, 36);
		getContentPane().add(btnSua);

		 btnXoa = new JButton("XOA");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				xoaGiay();
			}
			
		});
		//btnXoa.addActionListener(this);
		btnXoa.setForeground(Color.BLUE);
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoa.setBounds(383, 396, 72, 36);
		getContentPane().add(btnXoa);
		   init();
      
		   
	}

	protected void themGiay() {
		// TODO Auto-generated method stub
		BanGiay lop = new BanGiay();
		lop.setLoai(textField.getText());
		lop.setMa(textField_1.getText());
		lop.setMau(textField_2.getText());
		lop.setSize(textField_3.getText());
		lop.setSoluong(textField_4.getText());
		lop.setGia(textField_5.getText());
		BanGiayDAO.insertlop(lop);
		Object [] row = {lop.getLoai(),lop.getMa(),lop.getMau(),lop.getSize(),lop.getSoluong(),lop.getGia()};
	    model.addRow(row);

	
	}
	
	private void xoaRongTextfields() {
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
		textField_3.setText("");
		textField_4.setText("");
		textField_5.setText("");
		textField_1.requestFocus();
	}

	protected void xoaGiay() {
		// TODO Auto-generated method stub
		BanGiay lop = new BanGiay();
		int row = table.getSelectedRow();
		lop.setLoai(textField.getText());
		lop.setMa(textField_1.getText());
		lop.setMau(textField_2.getText());
		lop.setSize(textField_3.getText());
		lop.setSoluong(textField_4.getText());
		lop.setGia(textField_5.getText());
//		BanGiay lop = new BanGiay(textField.getText(),
//								  textField_1.getText(),
//								  textField_2.getText(),
//								  textField_3.getText(),
//								  textField_4.getText(),
//								  textField_5.getText());
		
		BanGiayDAO.delete(lop);
		
		
		
		model.removeRow(row);
		xoaRongTextfields();	
	}

	protected void capnhatGiay() {
		
		//int row = table.getSelectedRow();
		//JOptionPane.showMessageDialog(rootPane, "xin vui lòng chọn dòng cần sửa");
		BanGiay lop = new BanGiay();
		lop.setLoai(textField.getText());
		lop.setMa(textField_1.getText());
		lop.setMau(textField_2.getText());
		lop.setSize(textField_3.getText());
		lop.setSoluong(textField_4.getText());
		lop.setGia(textField_5.getText());
	
		BanGiayDAO.update(lop);
		//textField.setEditable(false);

//		Object [] row = {lop.getLoai(),lop.getMa(),lop.getMau(),lop.getSize(),lop.getSoluong(),lop.getGia()};
//		model.addRow(row);
//		
	}
	
	void init()
	{
		ArrayList<BanGiay> list = BanGiayDAO.getBanGiayAll();
		for(int i=0; i< list.size();i++)
		{
			BanGiay lop = list.get(i);
			Object[] row = {lop.getLoai(),lop.getMa(),lop.getMau(),lop.getSize(),lop.getSoluong(),lop.getGia()};
			model.addRow(row);
		}
	}
	
}
	


