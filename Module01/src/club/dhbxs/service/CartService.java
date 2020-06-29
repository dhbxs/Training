package club.dhbxs.service;

import club.dhbxs.bean.Repository;

import java.util.List;

/**
 * @author 17235
 */
public interface CartService {

    /**
     * @param ids
     * @return
     */
    List<Repository> getCart(String[] ids);

    List<Repository> deleteFromList(List<Repository> repositories, String s);
}
