package com.greatlearning.paymoney.transaction;

public class Transaction {
	public int transaction[], n, m, targetVal[];

	public Transaction(int n) {
		this.transaction = new int[n];
	}

	public void setTransaction(int x) {
		n = transaction.length;
		for (int i = 0; i < n; i++)
			this.transaction[i] = x;
	}

	public void setTargetSize(int m) {
		this.targetVal = new int[m];
	}

	public void checkTarget() {
		int i, sum = 0, j=0;
		boolean flag=false;
		while (j<targetVal.length) {
			System.out.println("***For targetValue["+(j+1)+"]="+targetVal[j]+"***");
			for (i = 0; i < transaction.length; i++) {
				sum += transaction[i];
				if (sum >= targetVal[j]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("TargetValue "+targetVal[j]+" was achieved after " + (i + 1) + " transaction(s)\n\n");
			else
				System.out.println("TargetValue "+targetVal[j]+" was not achieved\n\n");
			j++;
		}
	}
}
