package by.it.telushko.jd01_12;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args){
        //A
        Task_A.taskA();

        //В-1;
        String text= "The summer holiday is over. It is time to think of the new school year. " +
                "And while some are eager to know their new teacher and meet their friends to tell " +
                "them about all their summer adventures, others are more worried about the new year. Here " +
                "are some tips for a smooth school year start that will help you beat the stress and organize your study environment.\n" +
                "Reconnecting with a healthy lifestyle\n" +
                "\n" +
                "During holidays, children have often been allowed to sleep late and eat a little of what they" +
                " wanted at any time. The first thing to do is to help yourself make a smooth start and not to wait" +
                " until the last day to find a healthy lifestyle. You should get used to have regular and reasonable hours " +
                "of sleep and to eat healthy food. This of course needs several days of \"rehabilitation\". The ideal thing is" +
                " to start reconnecting with a healthy lifestyle one week to ten days before school starts.\n";

        Task_B.task_B(text);
    }
}
