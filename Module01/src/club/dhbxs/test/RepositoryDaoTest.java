package club.dhbxs.test;

import club.dhbxs.bean.Repository;
import club.dhbxs.dao.RepositoryDao;
import club.dhbxs.dao.impl.RepositoryDaoImpl;
import club.dhbxs.utils.JdbcUtils;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class RepositoryDaoTest {

    private RepositoryDao repository = new RepositoryDaoImpl();

    @Test
    public void addRepository() {
        repository.addRepository(new Repository(null, "C语言程序设计", 199, new BigDecimal(49.8), 20, "很好", "https://i.loli.net/2020/06/17/z9BTaSbgZnroMIw.jpg"));
    }

    @Test
    public void deleteRepository() {
        repository.deleteRepository(7);
    }

    @Test
    public void updateRepository() {
        repository.updateRepository(new Repository(1, "C语言程序设计", 199, new BigDecimal(49.8), 20, "很好", "https://i.loli.net/2020/06/17/z9BTaSbgZnroMIw.jpg"));
    }

    @Test
    public void queryRepositoryById() {

        System.out.println(repository.queryRepositoryById(1));
    }

    @Test
    public void queryRepositories() {
        for (Repository repository : repository.queryRepositories()) {
            System.out.println(repository);
        }
    }
}