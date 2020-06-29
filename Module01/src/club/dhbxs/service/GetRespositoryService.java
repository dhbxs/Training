package club.dhbxs.service;

import club.dhbxs.bean.Repository;

import java.util.List;

/**
 * @author 17235
 */
public interface GetRespositoryService {
    List<Repository> getRespoository();

    Repository getRepositoryById(int id);
}
