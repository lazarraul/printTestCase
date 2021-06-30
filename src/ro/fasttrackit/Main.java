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
        System.out.println("\tTC_DS_01\t Verify Login Functionality");
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

        System.out.println();
        System.out.println("\tTC_DS_02\t Check functionality of products button");
        System.out.println("Test-Data1:Check the following products button Concrete Hat, Steel Gloves, Wooden Bacon, Frozen Mouse");
        System.out.println("Test-Data2:Check the following products button Awesome Granit chips, Metal Chair, Soft Shirt, Gorgeous Soft Pizza");
        System.out.println("Pre-req:Login with TC_DC_01 steps");
        System.out.println();

        ArrayList<String> id1 = new ArrayList<String>();
        id1.add("\t\t1");
        id1.add("\t\t2");
        id1.add("\t\t3");
        {
            int i = 0;
            while (i < id1.size()) {
                i++;
            }
        }
        //adding number id
        ArrayList<String> aItem1 = new ArrayList<String>();
        aItem1.add("\t\t\t\t\t\tOpen Home Page products");
        aItem1.add("\t\t\t\t\t\tClick on any button specified in Test-Data 1");
        aItem1.add("\t\t\t\t\t\tClick on any button specified in Test-Data 2");

        {
            int i = 0;
            while (i < aItem1.size()) {
                i++;
            }
        }

        //adding Action Item

        ArrayList<String> eResults1 = new ArrayList<String>();
        eResults1.add("\t\t\t\t\t\t\t\t\tPage is displayed");
        eResults1.add("\t\t\tProduct are added in shopping cart");
        eResults1.add("\t\t\tProduct are added in shopping cart");

        {
            int i = 0;
            while (i < eResults1.size()) {
                i++;
            }
        }

        //adding Expected Results

        ArrayList<String> pf1 = new ArrayList<String>();
        pf1.add("\t\t\t\t\t\t\t\t\t\t\tPASS");
        pf1.add("\t\t\t\t\t\t\tPASS");
        pf1.add("\t\t\t\t\t\t\tFAIL");

        for (int i = 0; i < aItem1.size(); i++) {
            System.out.println(id1.get(i) + aItem1.get(i) + eResults1.get(i) + pf1.get(i)); }




    }
}
