package club.dhbxs.service;

import club.dhbxs.bean.User;

/**
 * @author 17235
 */
public interface UserSignInService {

    User verify(User u);

    User verifyAdmin(User u);
}
