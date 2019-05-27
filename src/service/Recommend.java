package service;
import java.util.List;

import pojo.MyFansPOJO;

public interface Recommend {
	List<MyFansPOJO> GetRecommend(String UserNumber) throws Exception;
}
