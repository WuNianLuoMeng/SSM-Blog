package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.TbBloguser;
import pojo.TbBloguserExample;

public interface TbBloguserMapper {
    long countByExample(TbBloguserExample example);

    int deleteByExample(TbBloguserExample example);

    int deleteByPrimaryKey(String blogusernumber);

    int insert(TbBloguser record);

    int insertSelective(TbBloguser record);

    List<TbBloguser> selectByExample(TbBloguserExample example);

    TbBloguser selectByPrimaryKey(String blogusernumber);

    int updateByExampleSelective(@Param("record") TbBloguser record, @Param("example") TbBloguserExample example);

    int updateByExample(@Param("record") TbBloguser record, @Param("example") TbBloguserExample example);

    int updateByPrimaryKeySelective(TbBloguser record);

    int updateByPrimaryKey(TbBloguser record);
}