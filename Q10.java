package com.xyz;

class Q{
public static void main(String[] args) {
        int[][] a=new int [5][5];
        int c=1;
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++){
        a[i][j]=c;
        c++;
        }
        }
        for(int i=0;i<5;i++)
        {
        for(int j=0;j<5;j++)
        {
        Integer x=a[i][j];
        System.out.print(x.toString()+" ");
        }
        System.out.println();
        }
        }
        }

