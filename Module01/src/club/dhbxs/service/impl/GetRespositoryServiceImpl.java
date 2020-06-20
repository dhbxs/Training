package club.dhbxs.service.impl;

import club.dhbxs.bean.Repository;
import club.dhbxs.dao.RepositoryDao;
import club.dhbxs.dao.impl.RepositoryDaoImpl;
import club.dhbxs.service.GetRespositoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GetRespositoryService
 * @Description
 * @Author 17235
 * @Date 2020/6/18 上午 9:40
 * @Version 1.0
 **/
public class GetRespositoryServiceImpl implements GetRespositoryService {
    @Override
    public List<Repository> getRespoository() {

        List<Repository> r = new ArrayList<>();
        RepositoryDao repository = new RepositoryDaoImpl();
        r = repository.queryRepositories();
        return r;
    }

    @Override
    public Repository getRepositoryById(int id) {
        Repository r1 = new Repository();
        RepositoryDao repository = new RepositoryDaoImpl();
        r1 = repository.queryRepositoryById(id);
        return r1;
    }
}
