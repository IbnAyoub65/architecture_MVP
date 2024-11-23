

import presenter.ClientPresenter;
import presenter.ClientPresenterImpl;
import repositories.ClientRepository;
import repositories.ClientRepositoryImpl;
import views.ClientView;
import views.ClientViewImpl;

public class Main {
    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepositoryImpl();
        ClientView clientView = new ClientViewImpl(null);

        ClientPresenter clientPresenter = new ClientPresenterImpl(clientView, clientRepository);

        ((ClientViewImpl) clientView).setPresenter(clientPresenter);

        ((ClientViewImpl) clientView).afficherMenu();
    }
}
