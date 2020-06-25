package club.dhbxs.service.impl;

import club.dhbxs.dao.RepositoryDao;
import club.dhbxs.dao.impl.RepositoryDaoImpl;
import club.dhbxs.service.DeleteFromRepositoryService;

/**
 * @ClassName DeleteFromRepositoryImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/19 下午 7:43
 * @Version 1.0
 **/
public class DeleteFromRepositoryServiceImpl implements DeleteFromRepositoryService {

    @Override
    public Boolean delete(String id) {
        Integer iD = Integer.valueOf(id);
        RepositoryDao repositoryDao = new RepositoryDaoImpl();
        int i = repositoryDao.deleteRepository(iD);
        if (i > 0) {
            return true;
        }
        return false;
    }
}
