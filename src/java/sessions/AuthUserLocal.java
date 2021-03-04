/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entitys.Users;
import javax.ejb.Local;

/**
 *
 * @author BSUIR
 */
@Local
public interface AuthUserLocal {
    public Users getCurrentUser();
    public void setCurrentUser(Users currentUser);
}
