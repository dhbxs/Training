package club.dhbxs.service.impl;

import club.dhbxs.bean.Repository;
import club.dhbxs.dao.RepositoryDao;
import club.dhbxs.dao.impl.RepositoryDaoImpl;
import club.dhbxs.service.AddIntoRepositoryService;

/**
 * @ClassName AddIntoRepositoryService
 * @Description
 * @Author 17235
 * @Date 2020/6/19 下午 7:04
 * @Version 1.0
 **/
public class AddIntoRepositoryServiceImpl implements AddIntoRepositoryService {
    @Override
    public void addRepository(Repository repository) {
        RepositoryDao repositoryDao = new RepositoryDaoImpl();
        repositoryDao.addRepository(repository);
    }
}
