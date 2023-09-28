public class Room {
    private int roomNumber, numberOfBeds, pricePerNight;
    private boolean isBalcony, isSea;

    //region Konstruktory

    public Room(int roomNumber, int numberOfBeds, boolean isBalcony, boolean isSea, int pricePerNight){
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.isBalcony = isBalcony;
        this.isSea = isSea;
        this.pricePerNight = pricePerNight;
    }

    //endregion

    //region Přístupové metody

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }
    public String isBalcony(){
        if (isBalcony==true){
            return " s balkonem";
        }
        else {
            return " bez balkonu";
        }
    }

    public void setBalcony(boolean balcony) {
        isBalcony = balcony;
    }
    public String isSea(){
        if (isSea==true){
            return " a s výhledem na moře";
        }
        else {
            return " a bez výhledu na moře";
        }
    }

    public void setSea(boolean sea) {
        isSea = sea;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    //endregion
}
