package club.dhbxs.service;

import club.dhbxs.bean.Repository;

/**
 * @author 17235
 */
public interface AddIntoRepositoryService {
    /**
     * 传一个商品对象，将其添加到数据库中
     *
     * @param repository
     */
    void addRepository(Repository repository);

    void revise(Repository repository);
}
