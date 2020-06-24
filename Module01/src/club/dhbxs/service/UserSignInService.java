package club.dhbxs.service;

import club.dhbxs.bean.User;

public interface UserSignInService {

    public User verify(User u);

    public User verifyAdmin(User u);
}
