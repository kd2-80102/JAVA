package com.mysol_14_q1;

public class PartyVotes {
	private String Party;
	private int votes;
	
	public PartyVotes() {
		
	}

	public PartyVotes(String party, int votes) {
		super();
		Party = party;
		this.votes = votes;
	}

	public String getParty() {
		return Party;
	}

	public void setParty(String party) {
		Party = party;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	@Override
	public String toString() {
		return "PartyVotes [Party=" + Party + ", votes=" + votes + "]";
	}
	
	
}
