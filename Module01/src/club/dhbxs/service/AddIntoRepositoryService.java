package club.dhbxs.service;

import club.dhbxs.bean.Repository;

public interface AddIntoRepositoryService {
    /**
     * 传一个商品对象，将其添加到数据库中
     *
     * @param repository
     */
    public void addRepository(Repository repository);
}
