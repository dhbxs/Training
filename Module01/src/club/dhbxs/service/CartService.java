package club.dhbxs.service;

import club.dhbxs.bean.Repository;

import java.util.List;

public interface CartService {

    /**
     *
     * @param ids
     * @return
     */
    public List<Repository> getCart(String[] ids);

    public List<Repository> deleteFromList(List<Repository> repositories, String s);
}
