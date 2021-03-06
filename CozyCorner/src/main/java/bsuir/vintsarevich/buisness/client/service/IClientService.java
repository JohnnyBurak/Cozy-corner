package bsuir.vintsarevich.buisness.client.service;

import bsuir.vintsarevich.entity.Client;
import bsuir.vintsarevich.entity.Order;
import bsuir.vintsarevich.exception.service.ServiceException;
import bsuir.vintsarevich.exception.service.ServiceLogicException;

import java.util.List;

public interface IClientService {
    Client signUp(String name, String surname,
                  String login, String password, String email) throws ServiceException, ServiceLogicException;

    Client signIn(String clientLogin, String clientPassword);

    List<Client> getAllClients() throws ServiceException;

    boolean countPoints(Order order) throws ServiceException;

    boolean clearPoints(Integer clientId) throws ServiceException ;

    boolean deleteClient(Integer id) throws ServiceException;

    boolean changeClientStatus(Integer clientId) throws ServiceException;

    boolean checkPassword(String password, Integer id) throws ServiceException;

    boolean findClientByLogin(String login) throws ServiceException;

    Client findClientByEmail(String email) throws ServiceException;

    boolean changePassword(String password, Integer id) throws ServiceException;

    boolean editPoint(Integer clientId, Double clientPoint) throws ServiceException;

    Client getClientById(Integer clientId) throws ServiceException;
}
