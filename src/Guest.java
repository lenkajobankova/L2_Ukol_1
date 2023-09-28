import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Guest {
    private String name;
    private LocalDate born;
    private String description;

    //region Konstruktory

    public Guest(String name, LocalDate born) {
        this.name = name;
        this.born = born;
    }

    //endregion

    //region Přistupové metody

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }
    public String getBornCZ(){
        return born.format(DateTimeFormatter.
                ofLocalizedDate(FormatStyle.MEDIUM)).toString();
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    //Volitelná metoda getDescription s českým formátem data narození
    public String getDescription(){
        description = getName()+" (nar. "+getBorn().format
                (DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)).toString()+")";
        return description;
    }

    //endregion
}
