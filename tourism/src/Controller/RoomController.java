package Controller;

import Entity.Room;

import java.util.List;

public class RoomController {
    private RoomService roomService;

    public RoomController() {
        this.roomService = new RoomService();
    }

    public void addRoom(Room room) {
        roomService.addRoom(room);
        // Gerekirse ek işlemler yapabilirsiniz
    }

    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    // Diğer işlemler buraya eklenebilir (güncelleme, silme vb.)
}