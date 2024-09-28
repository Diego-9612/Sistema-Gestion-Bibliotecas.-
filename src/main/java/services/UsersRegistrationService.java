package services;

import ImplDAO.UsersImpl;
import interfacesDAO.UsersInterface;
import java.awt.Component;
import javax.swing.JOptionPane;
import models.Users;

/**
 *
 * @author Diego Guerrero
 */
public class UsersRegistrationService {

    public String saveUpdateUser(Component parentComponent, Users user) throws Exception {
        try {
            if (!validateFields(user)) {
                JOptionPane.showMessageDialog(parentComponent, "Debe Completar Todos los Campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                return user.getNames();
            }

            UsersInterface users = new UsersImpl();

            if (user.getUserID() == 0) {
                // Usuario nuevo
                users.registerUser(user);
                JOptionPane.showMessageDialog(parentComponent, "Usuario Registrado con EXITO", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Usuario existente
                users.modifyUser(user);
                JOptionPane.showMessageDialog(parentComponent, "Usuario Modificado con EXITO", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(parentComponent, "Ocurrió un ERROR al Guardar el Usuario\n" + e.getMessage(), "AVISO", JOptionPane.ERROR_MESSAGE);
            throw e;
        }
        return null;
    }

    private boolean validateFields(Users user) {
        return !user.getNames().isEmpty()
                && !user.getSurname().isEmpty()
                && !user.getSecondSurname().isEmpty()
                && !user.getCollege().isEmpty()
                && !user.getNumberCarnet().isEmpty()
                && !user.getAddress().isEmpty()
                && !user.getPhone().isEmpty()
                && !user.getEmail().isEmpty();
    }

}
