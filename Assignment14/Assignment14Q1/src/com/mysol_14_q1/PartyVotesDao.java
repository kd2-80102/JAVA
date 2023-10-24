package com.mysol_14_q1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PartyVotesDao implements AutoCloseable {
	
	private Connection con;
	
	public PartyVotesDao() throws SQLException {
		con = DbUtil.getConnection();
	}
	
	@Override
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	// get partywise total votes
    public List<PartyVotes> getPartywiseVotes() throws SQLException {
        List<PartyVotes> list = new ArrayList<>();
        String sql = "SELECT party, SUM(votes) AS totalVotes FROM candidates GROUP BY party";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String party = rs.getString("party");
                    int totalVotes = rs.getInt("totalVotes");
                    PartyVotes partyVotes = new PartyVotes(party, totalVotes);
                    list.add(partyVotes);
                }
            }
        }
        return list;
    }


}
