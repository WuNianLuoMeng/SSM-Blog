package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbHome;
import pojo.TbHomeExample;

public interface TbHomeMapper {
    long countByExample(TbHomeExample example);

    int deleteByExample(TbHomeExample example);

    int deleteByPrimaryKey(Integer blogid);

    int insert(TbHome record);

    int insertSelective(TbHome record);

    List<TbHome> selectByExampleWithBLOBs(TbHomeExample example);

    List<TbHome> selectByExample(TbHomeExample example);

    TbHome selectByPrimaryKey(Integer blogid);

    int updateByExampleSelective(@Param("record") TbHome record, @Param("example") TbHomeExample example);

    int updateByExampleWithBLOBs(@Param("record") TbHome record, @Param("example") TbHomeExample example);

    int updateByExample(@Param("record") TbHome record, @Param("example") TbHomeExample example);

    int updateByPrimaryKeySelective(TbHome record);

    int updateByPrimaryKeyWithBLOBs(TbHome record);

    int updateByPrimaryKey(TbHome record);
}