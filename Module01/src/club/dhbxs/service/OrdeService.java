package club.dhbxs.service;

import club.dhbxs.bean.Repository;
import club.dhbxs.bean.User;

import java.util.List;

/**
 * @author 17235
 */
public interface OrdeService {
    void buy(List<Repository> repositories, String[] address, User user);

}
