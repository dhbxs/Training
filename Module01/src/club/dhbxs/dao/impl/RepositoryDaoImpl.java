package club.dhbxs.dao.impl;

import club.dhbxs.bean.Repository;
import club.dhbxs.dao.RepositoryDao;
import club.dhbxs.utils.JdbcUtils;
import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RepositoryDaoImpl
 * @Description
 * @Author 17235
 * @Date 2020/6/17 下午 1:28
 * @Version 1.0
 **/
public class RepositoryDaoImpl extends BaseDao implements RepositoryDao {

    @Override
    public int addRepository(Repository repository) {
        String sql = "INSERT INTO repository(re_id,re_name,re_num,re_price,re_buynum,re_descrip,img_url) VALUES (?,?,?,?,?,?,?);";
        return update(sql, repository.getReId(), repository.getReName(), repository.getReNum(), repository.getRePrice(), repository.getReBuyNum(), repository.getReDescrip(), repository.getImgUrl());
    }

    @Override
    public int deleteRepository(Integer id) {
        String sql = "delete from repository where re_id = ?;";
        return update(sql, id);
    }

    @Override
    public int updateRepository(Repository repository) {
        String sql = "UPDATE repository SET re_name=?,re_num=?,re_price=?,re_buynum=?,re_descrip=?,img_url=? WHERE re_id=?;";
        return update(sql, repository.getReName(), repository.getReNum(), repository.getRePrice(), repository.getReBuyNum(), repository.getReDescrip(), repository.getImgUrl(), repository.getReId());
    }

    @Override
    public Repository queryRepositoryById(Integer id) {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        Repository repository = null;

        try {
            con = JdbcUtils.getConnection();
            String sql = "select * from repository where re_id=?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                repository = new Repository();
                repository.setReName(rs.getString("re_name"));
                repository.setReId(rs.getInt("re_id"));
                repository.setReDescrip(rs.getString("re_descrip"));
                repository.setReNum(rs.getInt("re_num"));
                repository.setRePrice(rs.getBigDecimal("re_price"));
                repository.setReBuyNum(rs.getInt("re_buynum"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closePreparedStatement(pstm);
            JdbcUtils.closeConnection(con);
        }
        return repository;
    }

    @Override
    public List<Repository> queryRepositories() {

        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;

        List<Repository> repositorys = new ArrayList<Repository>();
        try {
            con = JdbcUtils.getConnection();
            String sql = "select * from repository";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            Repository repository = null;
            while (rs.next()) {
                repository = new Repository();
                repository.setReId(rs.getInt("re_id"));
                repository.setReName(rs.getString("re_name"));
                repository.setReNum(rs.getInt("re_num"));
                repository.setRePrice(rs.getBigDecimal("re_price"));
                repository.setReBuyNum(rs.getInt("re_buynum"));
                repository.setReDescrip(rs.getString("re_descrip"));
                repository.setImgUrl(rs.getString("img_url"));
                repositorys.add(repository);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.closeResultSet(rs);
            JdbcUtils.closePreparedStatement(pstm);
            JdbcUtils.closeConnection(con);
        }
        return repositorys;
    }
}
