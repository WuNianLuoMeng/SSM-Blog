package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbFans;
import pojo.TbFansExample;

public interface TbFansMapper {
    long countByExample(TbFansExample example);

    int deleteByExample(TbFansExample example);

    int deleteByPrimaryKey(Integer recordid);

    int insert(TbFans record);

    int insertSelective(TbFans record);

    List<TbFans> selectByExample(TbFansExample example);

    TbFans selectByPrimaryKey(Integer recordid);

    int updateByExampleSelective(@Param("record") TbFans record, @Param("example") TbFansExample example);

    int updateByExample(@Param("record") TbFans record, @Param("example") TbFansExample example);

    int updateByPrimaryKeySelective(TbFans record);

    int updateByPrimaryKey(TbFans record);
}