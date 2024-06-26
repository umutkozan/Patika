package Dao;

import Entity.Room;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDao {
    private Connection connection;

    public RoomDao() {
        this.connection = DatabaseConnection.getConnection();
    }

    public void addRoom(Room room) throws SQLException {
        String sql = "INSERT INTO room (hotel_id, season_id, pension_type_id, room_type, nightly_rate_adult, nightly_rate_child, stock, bed_count, square_meters, has_tv, has_minibar, has_console, has_safe, has_projector) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, room.getHotelId());
        pstmt.setInt(2, room.getSeasonId());
        pstmt.setInt(3, room.getPensionTypeId());
        pstmt.setString(4, room.getRoomType());
        pstmt.setDouble(5, room.getNightlyRateAdult());
        pstmt.setDouble(6, room.getNightlyRateChild());
        pstmt.setInt(7, room.getStock());
        pstmt.setInt(8, room.getBedCount());
        pstmt.setInt(9, room.getSquareMeters());
        pstmt.setBoolean(10, room.isHasTv());
        pstmt.setBoolean(11, room.isHasMinibar());
        pstmt.setBoolean(12, room.isHasConsole());
        pstmt.setBoolean(13, room.isHasSafe());
        pstmt.setBoolean(14, room.isHasProjector());
        pstmt.executeUpdate();
    }

    public List<Room> getAllRooms() throws SQLException {
        String sql = "SELECT * FROM room";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Room> rooms = new ArrayList<>();
        while (rs.next()) {
            Room room = new Room();
            room.setRoomId(rs.getInt("room_id"));
            room.setHotelId(rs.getInt("hotel_id"));
            room.setSeasonId(rs.getInt("season_id"));
            room.setPensionTypeId(rs.getInt("pension_type_id"));
            room.setRoomType(rs.getString("room_type"));
            room.setNightlyRateAdult(rs.getDouble("nightly_rate_adult"));
            room.setNightlyRateChild(rs.getDouble("nightly_rate_child"));
            room.setStock(rs.getInt("stock"));
            room.setBedCount(rs.getInt("bed_count"));
            room.setSquareMeters(rs.getInt("square_meters"));
            room.setHasTv(rs.getBoolean("has_tv"));
            room.setHasMinibar(rs.getBoolean("has_minibar"));
            room.setHasConsole(rs.getBoolean("has_console"));
            room.setHasSafe(rs.getBoolean("has_safe"));
            room.setHasProjector(rs.getBoolean("has_projector"));
            rooms.add(room);
        }
        return rooms;
    }

}