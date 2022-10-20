package com.Dizi;

import java.util.Scanner;

public class DiziTersCev {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eleman Sayısını Giriniz");
		int Eleman = scan.nextInt();
		int gecici;
		int [] dizi = new int[Eleman];
		for(int i=0;i<Eleman;i++) {
			System.out.println("Sayıları Giriniz");
			int sayı = scan.nextInt();
			dizi[i]=sayı;
		}
		for(int i=dizi.length-1;i>=0;i--) { // 1. yol
			System.out.print(dizi[i]+ " ");
		}// 1. yol bıttı
        System.out.println();
        for (int i=0;i<dizi.length/2;i++) {// 2. yol 
        	gecici=dizi[i];
        	dizi[i]=dizi[dizi.length-i-1];
        	dizi[dizi.length-i-1]=gecici;
        }// 2. yol bıttı
        for (int i=0;i<dizi.length;i++) System.out.print(dizi[i]+" ");
        	
	}

}
