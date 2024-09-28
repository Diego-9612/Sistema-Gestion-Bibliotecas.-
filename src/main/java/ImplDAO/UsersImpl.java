package ImplDAO;

import dataBase.DataBase;
import interfacesDAO.UsersInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Users;

/**
 *
 * @author Diego Guerrero
 */
public class UsersImpl extends DataBase implements UsersInterface {

    @Override
    public void registerUser(Users user) throws Exception {
        try {
            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("INSERT INTO users(names, surname, secondSurname, college, numberCarnet, address, phone, email) VALUES (?,?,?,?,?,?,?,?);")) {
                st.setString(1, user.getNames());
                st.setString(2, user.getSurname());
                st.setString(3, user.getSecondSurname());
                st.setString(4, user.getCollege());
                st.setString(5, user.getNumberCarnet());
                st.setString(6, user.getAddress());
                st.setString(7, user.getPhone());
                st.setString(8, user.getEmail());
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
    }

    @Override
    public void modifyUser(Users user) throws Exception {
        try {
            this.connect();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET names = ?, surname = ?, secondSurname = ?, college = ?, numberCarnet = ?, address = ?, phone = ?, email = ? WHERE userID = ?;");
            st.setString(1, user.getNames());
            st.setString(2, user.getSurname());
            st.setString(3, user.getSecondSurname());
            st.setString(4, user.getCollege());
            st.setString(5, user.getNumberCarnet());
            st.setString(6, user.getAddress());
            st.setString(7, user.getPhone());
            st.setString(8, user.getEmail());
            st.setInt(9, user.getUserID());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }
    }

    @Override
    public void deleteUser(int userId) throws Exception {
        try {
            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("DELETE FROM users WHERE userID = ?;")) {
                st.setInt(1, userId);
                st.executeUpdate();
            }
        } catch (SQLException e) {
            throw e;
        } finally {
            this.disconnect();
        }

    }

    @Override
    public List<Users> listUsers(String names) throws Exception {

        List<Users> lista = null;
        try {

            this.connect();
            String Query = names.isEmpty() ? "SELECT * FROM users;" : "SELECT * FROM users WHERE names LIKE '%" + names + "%';";

            try (PreparedStatement st = this.conexion.prepareStatement(Query)) {
                lista = new ArrayList();
                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        Users user = new Users();
                        user.setUserID(rs.getInt("userID"));
                        user.setNames(rs.getString("names"));
                        user.setSurname(rs.getString("surname"));
                        user.setSecondSurname(rs.getString("secondSurname"));
                        user.setCollege(rs.getString("college"));
                        user.setNumberCarnet(rs.getString("numberCarnet"));
                        user.setAddress(rs.getString("address"));
                        user.setPhone(rs.getString("phone"));
                        user.setEmail(rs.getString("email"));
                        user.setSanctions(rs.getBoolean("sanctions"));
                        user.setSanctionsMoney(rs.getDouble("sanctionsMoney"));
                        lista.add(user);
                    }
                }
            }

        } catch (SQLException e) {
            throw e;

        } finally {
            this.disconnect();
        }
        return lista;

    }

    @Override
    public Users getUserByID(int userId) throws Exception {
        Users user = new Users();

        try {

            this.connect();
            try (PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM users WHERE userID = ? LIMIT 1;")) {
                st.setInt(1, userId);
                try (ResultSet rs = st.executeQuery()) {
                    while (rs.next()) {
                        user.setUserID(rs.getInt("userID"));
                        user.setNames(rs.getString("names"));
                        user.setSurname(rs.getString("surname"));
                        user.setSecondSurname(rs.getString("secondSurname"));
                        user.setCollege(rs.getString("college"));
                        user.setNumberCarnet(rs.getString("numberCarnet"));
                        user.setAddress(rs.getString("address"));
                        user.setPhone(rs.getString("phone"));
                        user.setEmail(rs.getString("email"));
                    }
                    rs.close();
                    st.close();
                }
            }

        } catch (SQLException e) {
            throw e;

        } finally {
            this.disconnect();
        }
        return user;

    }

}
