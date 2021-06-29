package ro.fasttrackit;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

       ArrayList<String> title = new ArrayList<String>();

        title.add("\t\tId");
        title.add("\t\t\t\t\tActionItem ");
        title.add("\t\t\t\t\t\t\t\t\t\t\tExpectedResults ");
        title.add("\t\t\t\t\t\t\t\t\t\t\tPass/Fail");
        System.out.println(title);
        //Title from my Test Case
        System.out.println("\tTC_DS_01");
        System.out.println("Pre-req:Username:dino,beetle,turtle,Password:choochoo");
        System.out.println();

        ArrayList<String> id = new ArrayList<String>();
        id.add("\t\t1");
        id.add("\t\t2");
        id.add("\t\t3");
        id.add("\t\t4");
        {
            int i = 0;
            while (i < id.size()) {
                i++;
            }
        }
        //adding number id
        ArrayList<String> aItem = new ArrayList<String>();
        aItem.add("\t\t\t\t\t\tOpen Home Page");
        aItem.add("\t\t\t\t\t\tClick on Login button in the right corner");
        aItem.add("\t\t\t\t\t\tType the username and password");
        aItem.add("\t\t\t\t\t\tClick on Login button ");

        {
            int i = 0;
            while (i < aItem.size()) {
                i++;
            }
        }

        //adding Action Item

        ArrayList<String> eResults = new ArrayList<String>();
        eResults.add("\t\t\t\t\t\t\t\t\t\t\tHome Page is open");
        eResults.add("\t\t\t\tForm with username and password is open");
        eResults.add("\t\t\t\t\t\t\tForm is complete");
        eResults.add("\t\t\t\t\t\t\t\t\tUser is logged in");

        {
            int i = 0;
            while (i < eResults.size()) {
                i++;
            }
        }

        //adding Expected Results

        ArrayList<String> pf = new ArrayList<String>();
        pf.add("\t\t\t\t\t\t\t\t\t\t\tPASS");
        pf.add("\t\t\t\t\t\tPASS");
        pf.add("\t\t\t\t\t\t\t\t\t\t\tPASS");
        pf.add("\t\t\t\t\t\t\t\t\t\t\tPASS");

        for (int i = 0; i < aItem.size(); i++) {
            System.out.println(id.get(i) + aItem.get(i) + eResults.get(i) + pf.get(i)); }
        //Pass OR Fail
        //end of test







    }
}
