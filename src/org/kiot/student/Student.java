package org.kiot.student;

import java.util.Scanner;

/**
 *	Student class performs student operations
 *	@version 04/03/2022
 *  @author praveen kandhan
 */
public class Student {
	Scanner scanner = new Scanner(System.in);
	public boolean checkLoanEligibilty() {
		System.out.println("are you having marksheet?(yes/no)");
		String markSheet = scanner.next();
		if(markSheet.equals("yes")) {
			System.out.println();
			System.out.print("are you having KYC documents like aadhar card?"
					+ "(yes/no)");
			String kyc = scanner.next();
			if(kyc.equals("yes")) {
				System.out.println("are you having income proof of parents/"
						+ "guardian?(yes/no)");
				String incomeProof = scanner.next();
				if(incomeProof.equals("yes")) {
					System.out.println("are you having admission proof of "
							+ "Canada university?(yes/no)");
					String admissionProof = scanner.next();
					if(admissionProof.equals("yes")) {
						System.out.println("are you having Passport?(yes/no)");
						String passport = scanner.next();
						if(passport.equals("yes")) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
