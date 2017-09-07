import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JScrollPane;
    import javax.swing.JTextArea;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.lang.Math;

/**
 * Created by Deepanker on 9/6/2017.
 */
public class MoneyBot extends JFrame implements KeyListener {
    //
    JPanel p = new JPanel();
    //typing Area/

    JTextArea dialog=new JTextArea( rows: 20)
     private  JTextField textEnter = new JTextField();
    //chat Area
    private JTextArea txtChat = new JTextArea();


    public MoneyBot() {
        //Frame Attributes

        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setSize(600,600);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("MoneyBot");

        //Text Enter Atributes
        textEnter.setLocation(50,540);
        textEnter.setSize(400,30);

        //txt Chat Attributes
        txtChat.setLocation(15 ,5);
        txtChat.setSize(560,560);
        txtChat.setEditable(false);

        //Add items to frame
        this.add(textEnter);
        this.add(txtChat);


        //txt Action event
        textEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String uText = textEnter.getText();
                txtChat.append(("User : " + uText + "\n"));
                if (uText.contains("hi")||uText.contains("hello")){
                    botSay("Hello there");
                }
                else if(uText.contains("how are you")||uText.contains("whats up")||uText.contains("How are you")||uText.contains("Whats up"))
                {
                    int decider =(int) (Math.random()*2+1);
                    if(decider==1){
                        botSay("I'm fine");
                    }
                    else if(decider==2){
                        botSay("I'm fine,thanks");
                    }
                    botSay("I'm a money manager bot :-) ");
                    botSay("I can manage your expenses");
                    botSay("Can I manage your monthly expenditure ?");
                }
                else if(uText.contains("yes")){
                    botSay("Enter you monthly salary");
                }
                else{
                    int decider =(int) (Math.random()*3+1);
                    if(decider==1){
                        botSay("I did'nt get it");
                    }
                    else if(decider==2){
                        botSay("Please rephrase that ");
                    }
                    else if(decider==3){
                        botSay("???");
                    }
                }
                textEnter.setText("");
            }

        });

    }

    public void botSay(String s){
        txtChat.append("AI : "+ s + "\n");
    }
    public static void  main(String[] args)
    {
        new MoneyBot();
    }
}
