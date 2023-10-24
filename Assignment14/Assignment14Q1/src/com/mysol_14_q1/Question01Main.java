package com.mysol_14_q1;

import java.util.Scanner;

public class Question01Main {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		try(CandidateDao dao = new CandidateDao()) {
//			
//			Candidate cd = new Candidate();
//			
//			cd.accept();
//			
//			int count = dao.save(cd);
//			
//			System.out.println("Candidates added: " + count);
//		} //dao.close()
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		try(CandidateDao dao = new CandidateDao()){
			System.out.print("Enter candidate id (to vote): ");
			int candidateId = sc.nextInt();
			
			System.out.print("Enter name: ");
			String name = sc.next();
			
			System.out.print("Enter party: ");
			String party = sc.next();
			
			Candidate cd = new Candidate();
			
			cd.setId(candidateId);
			cd.setName(name);
			cd.setParty(party);
			int cnt = dao.update(cd);
			System.out.println("Candidates updated: " + cnt);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
