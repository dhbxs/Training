package club.dhbxs.service;

import club.dhbxs.bean.Repository;

import java.util.List;

public interface GetRespositoryService {
    public List<Repository> getRespoository();
    public Repository getRepositoryById(int id);
}
