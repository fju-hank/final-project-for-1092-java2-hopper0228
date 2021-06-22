package com.fju;

import java.util.Scanner;

public class Tester {
        public static void main(String[] args) {
            int total=0;
            int count;
            int id;
            int addfood=1;
            int bill;
            int ordercount=0,lastcount=0;
            int [][] order = new int[100][100];
            Meau[] meaus = new Meau[4];
            meaus[0] = new Meau1();
            meaus[1] = new Meau2();
            meaus[2] = new Meau3();
            meaus[3] = new Meau4();
            System.out.println("====================");
            System.out.println("Welcome, what do you want to eat?");
            Scanner scan = new Scanner(System.in);
            while (addfood==1) {
                System.out.println("====================");
                System.out.println("ID  name         price");
                for(Meau meau : meaus)
                {
                    System.out.println(meau.id+"\t"+ meau.name+"\t"+ meau.price+"\t");
                }
                System.out.println("====================");
                System.out.println("Please enter according to the menu number (ID number)");
                id = scan.nextInt();
                count = scan.nextInt();
                ordercount++;
                order[ordercount][0]=id;
                order[ordercount][1]=count;
                for(Meau meau : meaus)
                {
                    if(id == meau.id)
                    {
                        total = total+ meau.count(count, meau.price);
                    }
                }
                System.out.println("====================");
                System.out.print("total : ");
                System.out.println(total);
                lastcount+=+count;
                System.out.println("count : "+lastcount);
                System.out.println("To continue to purchase, please press 1\nTo confirm the order,please press 2");
                addfood = scan.nextInt();
            }
            System.out.println("====================");
            System.out.println("your order");
            for(int i=1;i<=ordercount;i++)
            {
                for(Meau meau : meaus)
                {
                    if(order[i][0]== meau.id)
                    {
                        System.out.println(meau.name+"*"+order[i][1]);
                    }
                }
            }
            System.out.println("total money : "+total);
            System.out.println("====================");
            System.out.println("To confirm the checkout, please press 1\nTo discard the bill,please press 4");
            bill = scan.nextInt();
            if(bill==1)
            {
                System.out.println("====================");
                System.out.println("Your order has been received, please wait while the meal is being prepared");
                System.out.println("====================");
            }
            else
            {
                System.out.println("Thank you for wasting a lot of time with our memory, welcome to come again^^");
            }
        }
    }

