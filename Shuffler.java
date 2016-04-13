package Elevens;
import java.util.*;

public class Shuffler {
	public final static int SHUFFLE_COUNT = 8;
	public final static int VALUE_COUNT = 52;
	
	public static void perfectShuffle(int[] val) {
		int[] shuffled = new int[val.length];
		int k=0;
		for(int i=0; i<(val.length+1)/2; i++) {
			shuffled[k] = val[i];
			k+=2;
		}
		k=1;
		for(int i=(val.length+1)/2; i<val.length; i++) {
			shuffled[k] = val[i];
			k+=2;
		}
		for(int i=0; i<val.length; i++) {
			val[i] = shuffled[i];
		}
	}
	
	public static void selectionShuffle(int[] val) {
		Random rand = new Random();
		int[] shuffled = new int[val.length];
		for(int i=0; i<val.length; i++) {
			int k = rand.nextInt(val.length);
			int temp = val[i];
			val[i] = val[k];
			val[k] = temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
				 " consecutive perfect shuffles:");
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
				 " consecutive efficient selection shuffles:");
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) {
			values2[i] = i;
		}
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
