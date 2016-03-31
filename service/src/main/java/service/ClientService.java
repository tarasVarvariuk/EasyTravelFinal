package service;

import java.util.List;

import dao.DAOFactory;
import entity.Client;

public class ClientService {
    
    public void addClient(Client client) {
        DAOFactory.getInstance().getClientDAO().addElement(client);
    }
    
    public void updateClient(Client client) {
        DAOFactory.getInstance().getClientDAO().updateElement(client);
    }
    
    public Client getClientById(Integer clientId) {
        return DAOFactory.getInstance().getClientDAO()
                .getElementByID(clientId);
    }
    
    public List<Client> getAllClients() {
        return DAOFactory.getInstance().getClientDAO()
                .getAllElements();
    }
    
    public void deleteClient(Client client) {
        DAOFactory.getInstance().getClientDAO().deleteElement(client);
    }
    
    public List<String> findAllCountriesClietnVisited(Integer clientId) {
        return DAOFactory.getInstance().getClientDAO().getAllCountriesClientVisited(clientId);
    }

}