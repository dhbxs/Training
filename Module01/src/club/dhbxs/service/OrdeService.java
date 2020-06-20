package club.dhbxs.service;

import club.dhbxs.bean.Repository;
import club.dhbxs.bean.User;

import java.util.List;

public interface OrdeService {
    public void buy(List<Repository> repositories, String[] address, User user);

}
