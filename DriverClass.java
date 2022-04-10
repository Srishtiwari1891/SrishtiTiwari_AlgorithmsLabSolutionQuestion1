package com.greatlearning.paymoney.driver;

import java.util.Scanner;
import com.greatlearning.paymoney.transaction.*;
import java.lang.IllegalArgumentException;

public class DriverClass extends IllegalArgumentException {

	public static void main(String[] args) {
		int n, m, i;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Size of transaction array:");
			n = sc.nextInt();
			Transaction objTran = new Transaction(n);
			System.out.println("Enter transaction values:");
			for (i = 0; i < n; i++) {
				objTran.setTransaction(sc.nextInt());
			}
			System.out.println("Enter Size of target array:");
			m = sc.nextInt();
			objTran.setTargetSize(m);
			System.out.println("Enter target value:");
			for (i = 0; i < m; i++) {
				objTran.targetVal[i] = sc.nextInt();
			}
			objTran.checkTarget();
		} catch (IllegalArgumentException e) {
			System.out.println("Please input only positive numbers");
			sc.next();
		} finally {
			sc.close();
		}
	}

}
