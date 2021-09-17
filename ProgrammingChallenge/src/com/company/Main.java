package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        Scanner input= new Scanner(System.in);
        System.out.println("type a letter followed by a number:");
        String message =input.next().toLowerCase();
        int start=0;
        int num=Integer.parseInt(message.substring(1));
        for(int i=0;i<26;i++){
            if(alphabet.charAt(i)==message.charAt(0)){
                start=i;
            }
        }
        for(int i=start;i<(num+start);i++){
            if(i<26){
                System.out.println(alphabet.charAt(i));
            }
            else{
                i=i-26;
                start=start-26;
            }
        }
    }
}
