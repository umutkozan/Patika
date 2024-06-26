package Dao;

import Entity.PensionType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PensionTypeDao {
    private Connection connection;

    public PensionTypeDao() {
        this.connection = DatabaseConnection.getConnection();
    }

    public void addPensionType(PensionType pensionType) throws SQLException {
        String sql = "INSERT INTO pension_type (hotel_id, type) VALUES (?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, pensionType.getHotelId());
        pstmt.setString(2, pensionType.getType());
        pstmt.executeUpdate();
    }

    public List<PensionType> getAllPensionTypes() throws SQLException {
        String sql = "SELECT * FROM pension_type";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<PensionType> pensionTypes = new ArrayList<>();
        while (rs.next()) {
            PensionType pensionType = new PensionType();
            pensionType.setPensionTypeId(rs.getInt("pension_type_id"));
            pensionType.setHotelId(rs.getInt("hotel_id"));
            pensionType.setType(rs.getString("type"));
            pensionTypes.add(pensionType);
        }
        return pensionTypes;
    }

}