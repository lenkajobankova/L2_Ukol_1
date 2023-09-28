import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Zadání hostů
        Guest guest1 = new Guest("Adéla Malíková",
                LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan Dvořáček",
                LocalDate.of(1995,5, 5));

        //Seznam hostů
        List<Guest> listOfGuests = new ArrayList<>();
        listOfGuests.add(guest1);
        listOfGuests.add(guest2);

        //Vytisknutí seznamu hostů s českým formátem data narození
        System.out.println("Hosté:");
        for (Guest guest :listOfGuests){
            System.out.println(guest.getName()+" (nar. "+ guest.getBornCZ()+")");
        };

        //Zkušební tisk metody getDescription
        System.out.println(guest1.getDescription());

        //Zadání pokojů
        Room room1 = new Room(1, 1,true,
                true,1000);
        Room room2 = new Room(2, 1,true,
                true,1000);
        Room room3 = new Room(3, 3,false,
                true,2400);

        //Seznam pokojů
        List<Room> listOfRooms = new ArrayList<>();
        listOfRooms.add(room1);
        listOfRooms.add(room2);
        listOfRooms.add(room3);

        //Popis pokojů
        System.out.println("\nNabízené pokoje:");
        for (Room room : listOfRooms){
            System.out.println("Pokoj č."+room.getRoomNumber()+" s počtem lůžek:"+
                    room.getNumberOfBeds()+room.isBalcony()+room.isSea()+
                    " a cenou "+room.getPricePerNight()+"Kč/noc.");
        };

        //Zadání rezervací
        Booking booking1 = new Booking(guest1,room1,
                LocalDate.of(2021,7,19),
                LocalDate.of(2021,7,26),
                false);

        Booking booking2 = new Booking(guest1, guest2, room3,
                LocalDate.of(2021,9,1),
                LocalDate.of(2021,9,14),
                true); //2 hosté

        Booking booking3 = new Booking(guest2, room2); //Pobyt ode dneška na 6 nocí

        //Seznam rezervací
        List<Booking> listOfBookings = new ArrayList<>();
        listOfBookings.add(booking1);
        listOfBookings.add(booking2);
        listOfBookings.add(booking3);

        //VYtisknutí seznamu rezervací
        System.out.println("\nRezervované termíny:");
        for (Booking booking : listOfBookings){
            System.out.println("Pokoj č."+booking.getRoom().getRoomNumber()+
                    " v termínu od "+booking.getDateFrom()+" do "+
                    booking.getDateTo()+"." );
        }

    }
}