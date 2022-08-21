import controller.DVDCollectionController;
import dao.DVDCollectionDao;
import dao.DVDCollectionDaoFileImpl;
import ui.DVDCollectionView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

public class EntryPoint_Main {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        DVDCollectionView myView = new DVDCollectionView(myIo);
        DVDCollectionDao myDao = new DVDCollectionDaoFileImpl();
        DVDCollectionController controller = new DVDCollectionController(myView, myDao);
        controller.run();
    }
}
