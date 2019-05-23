package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbBlogartical;
import pojo.TbBlogarticalExample;

public interface TbBlogarticalMapper {
    long countByExample(TbBlogarticalExample example);

    int deleteByExample(TbBlogarticalExample example);

    int deleteByPrimaryKey(Integer blogid);

    int insert(TbBlogartical record);

    int insertSelective(TbBlogartical record);

    List<TbBlogartical> selectByExampleWithBLOBs(TbBlogarticalExample example);

    List<TbBlogartical> selectByExample(TbBlogarticalExample example);

    TbBlogartical selectByPrimaryKey(Integer blogid);

    int updateByExampleSelective(@Param("record") TbBlogartical record, @Param("example") TbBlogarticalExample example);

    int updateByExampleWithBLOBs(@Param("record") TbBlogartical record, @Param("example") TbBlogarticalExample example);

    int updateByExample(@Param("record") TbBlogartical record, @Param("example") TbBlogarticalExample example);

    int updateByPrimaryKeySelective(TbBlogartical record);

    int updateByPrimaryKeyWithBLOBs(TbBlogartical record);

    int updateByPrimaryKey(TbBlogartical record);
    void MyUpdate(@Param("sum") Integer blogtraffic,@Param("id")Integer blogid);
}