import java.time.LocalDate;

public class Booking {
    private Guest guest, guest2;
    private Room room;
    private LocalDate dateFrom, dateTo;

    //Metoda pro zadání jednoho hosta s daty pobytu
    public Booking(Guest guest, Room room, LocalDate dateFrom, LocalDate dateTo){
        this.guest = guest;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    //Metoda pro zadání dvou hostů s daty pobytu
    public Booking(Guest guest, Guest guest2, Room room, LocalDate dateFrom, LocalDate dateTo){
        this.guest = guest;
        this.guest2 = guest2;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    //Metoda pro zadání jednoho hosta s pobytem ode dněška na 6 dní
    public Booking(Guest guest, Room room){
        this.guest = guest;
        this.room = room;
        this.dateFrom = LocalDate.now();
        this.dateTo = LocalDate.now().plusDays(6);
    }

    //Metoda pro zadání dvou hostů s pobytem ode dněška na 6 dní
    public Booking(Guest guest, Guest guest2, Room room){
        this.guest = guest;
        this.guest2 = guest2;
        this.room = room;
        this.dateFrom = LocalDate.now();
        this.dateTo = LocalDate.now().plusDays(6);
    }

    public Guest getGuest() {

        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest2() {
        return guest2;
    }

    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
