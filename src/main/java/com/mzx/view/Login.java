package com.mzx.view;

import javax.swing.*;

/**
 * @author ZhenXinMa
 * @date 2020/1/30 18:25
 */
public class Login extends JFrame {

    private JTextField textField_id;
    private JTextField textField_psw;

    private JButton button_login;
    private JButton button_register;

    private JLabel label_id;
    private JLabel label_psw;


    public Login(){
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,250,500,600);

        init();
    }

    public void init(){

        textField_id = new JTextField(20);
        textField_id.setBounds(200,120,200,30);
        this.add(textField_id);

        textField_psw = new JTextField(20);
        textField_psw.setBounds(200,190,200,30);
        this.add(textField_psw);

        label_id = new JLabel("账  号");
        label_id.setBounds(100,120,50,30);
        this.add(label_id);

        label_psw = new JLabel("密  码");
        label_psw.setBounds(100,190,50,30);
        this.add(label_psw);

        button_login = new JButton("登录");
        button_login.setBounds(200,280,100,50);
        this.add(button_login);

        button_register = new JButton("注册");
        button_register.setBounds(200,360,100,50);
        this.add(button_register);

    }

    public static void main(String[] args) {
        Login login = new Login();
    }


}
