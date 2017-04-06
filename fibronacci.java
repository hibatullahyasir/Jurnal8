/*
2	 * To change this license header, choose License Headers in Project Properties.
3	 * To change this template file, choose Tools | Templates
4	 * and open the template in the editor.
5	 */
6	package Jurnal1;
7	
8	import java.util.Scanner;
9	
10	/**
11	 *
12	 * @author Praktikum
13	 */
14	public class Jurnal1 {
15	
16	    /**
17	     * @param args the command line arguments
18	     */
19	    public static void main(String[] args) {
20	        // TODO code application logic here
21	        
22	        int[] bil=new int[100];
23	        bil[0]=0;
24	        bil[1]=1;       
25	        int deret;
26	       
27	        Scanner input = new Scanner (System.in);
28	        System.out.print("Masukan jumlah deret : ");
29	        String data = input.nextLine();
30	        deret = Integer.parseInt(data);
31	       
32	        for(int i=0;i<deret;i++){
33	            System.out.print(bil[i]+" ");
34	            bil[i+2]=bil[i]+bil[i+1];
35	        }
36	    }
37	}