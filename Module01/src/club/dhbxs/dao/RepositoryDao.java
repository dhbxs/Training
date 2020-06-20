package club.dhbxs.dao;

import club.dhbxs.bean.Repository;

import java.util.List;

public interface RepositoryDao {

    /**
     * 向数据库中repository表添加商品
     *
     * @param repository
     * @return
     */
    public int addRepository(Repository repository);

    /**
     * 从数据库中repository表删除商品数据
     *
     * @param id
     * @return
     */
    public int deleteRepository(Integer id);

    /**
     * 更新数据库中得商品数据
     *
     * @param repository
     * @return
     */
    public int updateRepository(Repository repository);

    /**
     * 根据id号查找数据库中得商品
     *
     * @param id
     * @return
     */
    public Repository queryRepositoryById(Integer id);

    /**
     * 将数据库中所有的商品信息捞出来放到List集合里
     *
     * @return
     */
    public List<Repository> queryRepositories();

}
