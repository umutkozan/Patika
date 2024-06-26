package Dao;

import Entity.Reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDao {
    private Connection connection;

    public ReservationDao() {
        this.connection = DatabaseConnection.getConnection();
    }

    public void addReservation(Reservation reservation) throws SQLException {
        String sql = "INSERT INTO reservation (room_id, customer_name, customer_contact, check_in_date, check_out_date, adult_count, child_count, total_price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, reservation.getRoomId());
        pstmt.setString(2, reservation.getCustomerName());
        pstmt.setString(3, reservation.getCustomerContact());
        pstmt.setDate(4, new java.sql.Date(reservation.getCheckInDate().getTime()));
        pstmt.setDate(5, new java.sql.Date(reservation.getCheckOutDate().getTime()));
        pstmt.setInt(6, reservation.getAdultCount());
        pstmt.setInt(7, reservation.getChildCount());
        pstmt.setDouble(8, reservation.getTotalPrice());
        pstmt.executeUpdate();
    }

    public List<Reservation> getAllReservations() throws SQLException {
        String sql = "SELECT * FROM reservation";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Reservation> reservations = new ArrayList<>();
        while (rs.next()) {
            Reservation reservation = new Reservation();
            reservation.setReservationId(rs.getInt("reservation_id"));
            reservation.setRoomId(rs.getInt("room_id"));
            reservation.setCustomerName(rs.getString("customer_name"));
            reservation.setCustomerContact(rs.getString("customer_contact"));
            reservation.setCheckInDate(rs.getDate("check_in_date"));
            reservation.setCheckOutDate(rs.getDate("check_out_date"));
            reservation.setAdultCount(rs.getInt("adult_count"));
            reservation.setChildCount(rs.getInt("child_count"));
            reservation.setTotalPrice(rs.getDouble("total_price"));
            reservations.add(reservation);
        }
        return reservations;
    }

    // Diğer CRUD işlemleri (update, delete) ekleyebilirsiniz
}
