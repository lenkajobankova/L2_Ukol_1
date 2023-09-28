import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Booking {
    private Guest guest, guest2;
    private Room room;
    private LocalDate dateFrom, dateTo;
    private boolean isHoliday;

    //region Konstruktory
    //Konstruktor pro zadání jednoho hosta
    public Booking(Guest guest, Room room, LocalDate dateFrom, LocalDate dateTo,
                   boolean isHoliday){
        this.guest = guest;
        this.room = room;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.isHoliday = isHoliday;
    }

    //Konstruktor pro zadání dvou hostů
    public Booking(Guest guest2, Guest guest, Room room, LocalDate dateFrom, LocalDate dateTo,
                   boolean isHoliday){
        this(guest, room, dateFrom, dateTo, isHoliday);
        this.guest2 = guest2;
    }
    public Booking(Guest guest, Room room){
        this(guest, room, LocalDate.now(), LocalDate.now().plusDays(6), true);
    }

    //endregion

    //region Přístupové metody
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

    public String getDateFrom() {
        return dateFrom.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)).toString();
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo.format(DateTimeFormatter.ofLocalizedDate
                (FormatStyle.MEDIUM)).toString();
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
    //endregion
}
