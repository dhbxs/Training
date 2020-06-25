package club.dhbxs.service.impl;

import club.dhbxs.bean.Repository;
import club.dhbxs.service.CartService;
import club.dhbxs.service.GetRespositoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CartServiceImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/18 下午 1:19
 * @Version 1.0
 **/
public class CartServiceImpl implements CartService {
    @Override
    public List<Repository> getCart(String[] ids) {
        GetRespositoryService getRespositoryService = new GetRespositoryServiceImpl();
        List<Repository> repositories = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            Repository repository = getRespositoryService.getRepositoryById(Integer.parseInt(ids[i]));
            repositories.add(repository);
        }
        return repositories;
    }

    @Override
    public List<Repository> deleteFromList(List<Repository> repositories, String s) {
        for (int i = repositories.size() - 1; i >= 0; i--) {
            Repository repository = repositories.get(i);
            if (repository.getReId().equals(Integer.valueOf(s))) {
                repositories.remove(repository);
            }
        }
        return repositories;
    }
}
