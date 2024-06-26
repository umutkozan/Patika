package Controller;

import Entity.Hotel;

import java.util.List;

public class HotelController {
    private HotelService hotelService;

    public HotelController() {
        this.hotelService = new HotelService();
    }

    public void addHotel(Hotel hotel) {
        hotelService.addHotel(hotel);
        // Gerekirse ek işlemler yapabilirsiniz
    }

    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    // Diğer işlemler buraya eklenebilir (güncelleme, silme vb.)
}