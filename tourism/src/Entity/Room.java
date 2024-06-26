package Entity;

public class Room {
    private int roomId;
    private int hotelId;
    private int seasonId;
    private int pensionTypeId;
    private String roomType;
    private double nightlyRateAdult;
    private double nightlyRateChild;
    private int stock;
    private int bedCount;
    private int squareMeters;
    private boolean hasTv;
    private boolean hasMinibar;
    private boolean hasConsole;
    private boolean hasSafe;
    private boolean hasProjector;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public int getPensionTypeId() {
        return pensionTypeId;
    }

    public void setPensionTypeId(int pensionTypeId) {
        this.pensionTypeId = pensionTypeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getNightlyRateAdult() {
        return nightlyRateAdult;
    }

    public void setNightlyRateAdult(double nightlyRateAdult) {
        this.nightlyRateAdult = nightlyRateAdult;
    }

    public double getNightlyRateChild() {
        return nightlyRateChild;
    }

    public void setNightlyRateChild(double nightlyRateChild) {
        this.nightlyRateChild = nightlyRateChild;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public boolean isHasMinibar() {
        return hasMinibar;
    }

    public void setHasMinibar(boolean hasMinibar) {
        this.hasMinibar = hasMinibar;
    }

    public boolean isHasConsole() {
        return hasConsole;
    }

    public void setHasConsole(boolean hasConsole) {
        this.hasConsole = hasConsole;
    }

    public boolean isHasSafe() {
        return hasSafe;
    }

    public void setHasSafe(boolean hasSafe) {
        this.hasSafe = hasSafe;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }
}