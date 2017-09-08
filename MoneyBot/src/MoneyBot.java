import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Deepanker on 9/6/2017.
 */
public class MoneyBot extends JFrame    {

    private JPanel p= new JPanel();
    private  JTextField textEnter = new JTextField();//typing Area
    private JLabel textEnterLabel = new JLabel("User Input");
    private Border B=BorderFactory.createLineBorder(Color.blue,5) ;

    private JTextArea txtChat = new JTextArea(20,50);//chat Area
    JLabel txtChatLabel = new JLabel("Chatting Area");
    JScrollPane scroll=new JScrollPane(
            txtChat,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
    );

    public MoneyBot() {
        //Frame Attributes
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setSize(600,550);
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("^-^ MoneyBot ^-^");


        //Text Enter Atributes
        textEnter.setLocation(100,400);
        textEnter.setSize(400,30);
        textEnter.setBackground(new Color(186, 184, 179));
        textEnterLabel.setLabelFor(textEnter);
        textEnterLabel.setBorder(B);
        add(textEnterLabel);

        //txt Chat Attributes
        txtChat.setLocation(150 ,5);
        txtChat.setSize(500,500);
        txtChat.setBackground(new Color(167, 172, 250));
        txtChat.setEditable(false);
        txtChat.setLineWrap(true);
        txtChatLabel.setLabelFor(txtChat);

        //Add items to frame
        this.add(textEnter);
        this.add(textEnterLabel);
         //this.add(txtChat);   if this add then chat box is not scrollable

        p.add(scroll);
        p.setBackground(new Color(72, 77, 72));
        this.add(p);
        p.setVisible(true);

        //txt Action event
        textEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String uText = textEnter.getText();

                txtChat.append(("\n=>User-- " + uText + "\n"));

                if (uText.contains("hi")||uText.contains("hello")|| uText.contains("Hi")||uText.contains("Hello")){
                    botSay("Hello there");
                    botSay("I'm a money manager bot :-) ");
                    botSay("I can manage your expenses");
                    botSay("Can I manage your monthly expenditure ?");
                }
                else if(uText.contains("ok thanks")||uText.contains("Ok thanks")||uText.contains("thanks")||uText.contains(" Thanks"))
                {
                    botSay("Ok,See you later !!");
                }
                else if (uText.contains("no")||uText.contains("No")||uText.contains("NO")||uText.contains("no thanks")){
                    botSay("ok thanks have a nice day :-)");
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

                    botSay("Can I manage your monthly expenditure ? Yes or No" );

                }
                else if(uText.contains("yes")||uText.contains("Yes")||uText.contains("ok")||uText.contains("Ok")) {
                    botSay("ok,So");
                    botSay("[Actually,I'm managing your expenditure on the basis of :-\n1.Food\n2.Bill\n3.Transport\n4.Other stuff\nAnd tell you how much atleast you have to save monthly. ");
                    botSay("Enter you monthly salary in Rupees (like Rs10000,Rs.20000 etc.:-)");

                }
                else if(uText.contains("10000000")||uText.contains("Rs.10000000")||uText.contains("rs.10000000")){
                    botSay("So in Rs.10000000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.2000000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs2500000)\n\t10% for Bills i.e Rs1000000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs1500000)\n\t30% on Others stuff i.e Rs3000000(clothing,household etc.");
                }
                else if(uText.contains("1000000")||uText.contains("Rs.1000000")||uText.contains("rs.1000000")){
                    botSay("So in Rs.1000000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.200000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs250000)\n\t10% for Bills i.e Rs100000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs150000)\n\t30% on Others stuff i.e Rs300000(clothing,household etc.");
                }

                else if(uText.contains("500000")||uText.contains("Rs.500000")||uText.contains("rs.500000")){
                    botSay("So in Rs.500000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.100000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs125000)\n\t10% for Bills i.e Rs50000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs75000)\n\t30% on Others stuff i.e Rs150000(clothing,household etc.");
                }

                else if(uText.contains("200000")||uText.contains("Rs.200000")||uText.contains("rs.200000")){
                    botSay("So in Rs.200000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.40000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs50000)\n\t10% for Bills i.e Rs20000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs30000)\n\t30% on Others stuff i.e Rs60000(clothing,household etc.");
                }
                else if(uText.contains("30000")||uText.contains("Rs.30000")||uText.contains("rs.30000")){
                    botSay("So in Rs.30000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.6000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs7500)\n\t10% for Bills i.e Rs3000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs4500)\n\t30% on Others stuff i.e Rs9000(clothing,household etc.");
                }
                else if(uText.contains("40000")||uText.contains("Rs.40000")||uText.contains("rs.40000")){
                    botSay("So in Rs.40000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.8000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs10000)\n\t10% for Bills i.e Rs4000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs6000)\n\t30% on Others stuff i.e Rs12000(clothing,household etc.");
                }
                else if(uText.contains("50000")||uText.contains("Rs.50000")||uText.contains("rs.50000")){
                    botSay("So in Rs.50000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.10000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs12500)\n\t10% for Bills i.e Rs5000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs7500)\n\t30% on Others stuff i.e Rs15000(clothing,household etc.");
                }
                else if(uText.contains("60000")||uText.contains("Rs.60000")||uText.contains("rs.60000")){
                    botSay("So in Rs.60000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.12000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs15000)\n\t10% for Bills i.e Rs6000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs9000)\n\t30% on Others stuff i.e Rs18000(clothing,household etc.");
                }
                else if(uText.contains("70000")||uText.contains("Rs.70000")||uText.contains("rs.70000")){
                    botSay("So in Rs.70000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.14000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs17500)\n\t10% for Bills i.e Rs7000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs10500)\n\t30% on Others stuff i.e Rs21000(clothing,household etc.");
                }
                else if(uText.contains("80000")||uText.contains("Rs.80000")||uText.contains("rs.80000")){
                    botSay("So in Rs.80000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.16000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs20000)\n\t10% for Bills i.e Rs8000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs12000)\n\t30% on Others stuff i.e Rs24000(clothing,household etc.");
                }
                else if(uText.contains("90000")||uText.contains("Rs.90000")||uText.contains("rs.90000")){
                    botSay("So in Rs.90000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.18000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs22500)\n\t10% for Bills i.e Rs9000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs13500)\n\t30% on Others stuff i.e Rs27000(clothing,household etc.");
                }
                else if(uText.contains("100000")||uText.contains("Rs.100000")||uText.contains("rs.100000")){
                    botSay("So in Rs.100000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.20000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs25000)\n\t10% for Bills i.e Rs10000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs15000)\n\t30% on Others stuff i.e Rs30000(clothing,household etc.");
                }

                else if(uText.contains("20000")||uText.contains("Rs.20000")||uText.contains("rs.20000")){
                    botSay("So in Rs.20000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.4000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs5000)\n\t10% for Bills i.e Rs2000(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs3000)\n\t30% on Others stuff(clothing,household etc.");
                }
                else if(uText.contains("10000")||uText.contains("Rs.10000")||uText.contains("rs.10000")){
                    botSay("So in Rs.10000");
                    botSay("you have to save at least 15% of your saving (i.e Rs.1500)");
                    botSay("So you can spend at most :\n\t30% on Food(i.e Rs3000)\n\t15% on Transport(i.e Rs1500)\n\t10% for Bills i.e Rs1000(like Electricity,Water etc.)\n\t30% on Others stuff(clothing,household etc.");
                }
                else if(uText.contains("15000")||uText.contains("Rs.15000")||uText.contains("rs.15000")){
                    botSay("So in Rs.15000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.3000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs3750)\n\t10% for Bills i.e Rs1500(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs2250)\n\t30% on Others stuff i.e Rs.4500(clothing,household etc.");
                }
                else if(uText.contains("25000")||uText.contains("Rs.25000")||uText.contains("rs.25000")){
                    botSay("So in Rs.25000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.5000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs6250)\n\t10% for Bills i.e Rs2500(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs3750)\n\t30% on Others stuff i.e Rs7500(clothing,household etc.");
                }
                else if(uText.contains("35000")||uText.contains("Rs.35000")||uText.contains("rs.35000")){
                    botSay("So in Rs.35000");
                    botSay("you have to save at least 20% of your saving (i.e Rs.7000)");
                    botSay("So you can spend at most :\n\t25% on Food(i.e Rs8750)\n\t10% for Bills i.e Rs3500(like Electricity,Water etc.)\n\t15% on Transport(i.e Rs5250)\n\t30% on Others stuff i.e Rs10500(clothing,household etc.");
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
        txtChat.append("=>Mr.Bot-- "+ s + "\n");
    }
    public static void  main(String[] args)
    {
        new MoneyBot();
    }
}
