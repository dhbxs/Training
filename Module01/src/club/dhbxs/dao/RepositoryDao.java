package club.dhbxs.dao;

import club.dhbxs.bean.Repository;

import java.util.List;

/**
 * @author 17235
 */
public interface RepositoryDao {

    /**
     * 向数据库中repository表添加商品
     *
     * @param repository
     * @return
     */
    int addRepository(Repository repository);

    /**
     * 从数据库中repository表删除商品数据
     *
     * @param id
     * @return
     */
    int deleteRepository(Integer id);

    /**
     * 更新数据库中得商品数据
     *
     * @param repository
     * @return
     */
    int updateRepository(Repository repository);

    /**
     * 根据id号查找数据库中得商品
     *
     * @param id
     * @return
     */
    Repository queryRepositoryById(Integer id);

    /**
     * 将数据库中所有的商品信息捞出来放到List集合里
     *
     * @return
     */
    List<Repository> queryRepositories();

}
