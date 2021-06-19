package com.fju;

import java.util.Scanner;

public class Tester {
        public static void main(String[] args) {
            int total=0;
            int count;
            int id;
            int ddd=1;
            int end;
            int b=0,c=0;
            int [][] a = new int[100][100];
            Box[] boxes = new Box[4];
            boxes[0] = new Box1();
            boxes[1] = new Box2();
            boxes[2] = new Box3();
            boxes[3] = new Box4();
            System.out.println("====================");
            System.out.println("Welcome, what do you want to eat?");
            Scanner scan = new Scanner(System.in);
            while (ddd==1) {
                System.out.println("====================");
                System.out.println("ID  name         price");
                for(Box box : boxes)
                {
                    System.out.println(box.id+"\t"+box.name+"\t"+ box.price+"\t");
                }
                System.out.println("====================");
                System.out.println("Please enter according to the menu number (ID number)");
                id = scan.nextInt();
                count = scan.nextInt();
                b++;
                a[b][0]=id;
                a[b][1]=count;
                for(Box box : boxes)
                {
                    if(id == box.id)
                    {
                        total = total+box.count(count, box.price);
                    }
                }
                System.out.println("====================");
                System.out.print("total : ");
                System.out.println(total);
                c=c+count;
                System.out.println("count : "+c);
                System.out.println("To continue to purchase, please press 1\nTo confirm the order,please press 2");
                ddd = scan.nextInt();
            }
            System.out.println("====================");
            System.out.println("your order");
            for(int i=1;i<=b;i++)
            {
                for(Box box: boxes)
                {
                    if(a[i][0]==box.id)
                    {
                        System.out.println(box.name+"*"+a[i][1]);
                    }
                }
            }
            System.out.println("total money : "+total);
            System.out.println("====================");
            System.out.println("To confirm the checkout, please press 1\nTo discard the bill,please press 4");
            end = scan.nextInt();
            if(end==1)
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

