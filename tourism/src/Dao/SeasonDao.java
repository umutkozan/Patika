package Dao;

import Entity.Season;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SeasonDao {
    private Connection connection;

    public SeasonDao() {
        this.connection = DatabaseConnection.getConnection();
    }

    public void addSeason(Season season) throws SQLException {
        String sql = "INSERT INTO season (hotel_id, start_date, end_date) VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, season.getHotelId());
        pstmt.setDate(2, new java.sql.Date(season.getStartDate().getTime()));
        pstmt.setDate(3, new java.sql.Date(season.getEndDate().getTime()));
        pstmt.executeUpdate();
    }

    public List<Season> getAllSeasons() throws SQLException {
        String sql = "SELECT * FROM season";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Season> seasons = new ArrayList<>();
        while (rs.next()) {
            Season season = new Season();
            season.setSeasonId(rs.getInt("season_id"));
            season.setHotelId(rs.getInt("hotel_id"));
            season.setStartDate(rs.getDate("start_date"));
            season.setEndDate(rs.getDate("end_date"));
            seasons.add(season);
        }
        return seasons;
    }
}