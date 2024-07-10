package Controller;

import Dao.UserDao;
import Entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserController {
    private UserDao userDao;

    public UserController() {
        this.userDao = new UserDao();
    }

    public void addUser(User user) {
        // Kullanıcı bilgilerini doğrulama işlemleri

        // Örneğin, kullanıcı adının benzersiz olup olmadığını kontrol etme
        if (!isUsernameUnique(user.getUsername())) {
            throw new IllegalArgumentException("Kullanıcı adı zaten mevcut.");
        }

        try {
            userDao.addUser(user);
        } catch (SQLException e) {
            // Hata yönetimi
            e.printStackTrace();
            // Gerekirse uygun bir şekilde hata yönetimi yapılabilir
        }
    }

    private boolean isUsernameUnique(String username) {
        // Kullanıcı adının veritabanında benzersiz olup olmadığını kontrol etme işlemi
        try {
            List<User> existingUsers = userDao.getAllUsers();
            for (User u : existingUsers) {
                if (u.getUsername().equals(username)) {
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Gerekirse uygun bir şekilde hata yönetimi yapılabilir
        }
        return true;
    }

    // Diğer kullanıcı yönetimi işlemleri (güncelleme, silme, vs.) buraya eklenebilir
}
