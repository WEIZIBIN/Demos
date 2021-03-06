package github.weizibin.mapper;

import github.weizibin.po.KillGoods;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KillGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KillGoods record);

    int insertSelective(KillGoods record);

    KillGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(KillGoods record);

    int updateByPrimaryKey(KillGoods record);

    List<KillGoods> getAllInStock();
}