import javax.swing.text.View;
import controllers.ManagePeople;
import models.Person;
import views.ViewConsol;

public class App {
    public static void main(String[] args) throws Exception {

        ViewConsol vista = new ViewConsol();
        ManagePeople mP = new ManagePeople(vista);
        mP.sortPeopleByAge();
        mP.sortByName();

    }
}
