package com.ty.task3;

public class ArrayTask1 {
	public static int[] trans(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] % 2;
		}
		return a;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 6 };
		int[] result = trans(arr);
		int even = 0;
		int odd = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0) {
				even++;
			} else {
				odd++;
			}
		}
		if (result.length % 2 == 0) {
			if (even % 2 == 0 || odd % 2 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		} else {
			if (even % 2 == 1 && odd % 2 == 0 || odd % 2 == 1 && even % 2 == 0) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

}
