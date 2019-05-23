package controller.Task;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import controller.Blog.LookBlogController;
import mapper.TbBlogarticalMapper;

/**
 * 
 * 类名称：TimerTask   
 * 类描述：定时器任务
 *
 */
@Component
public class TimerTask {
	@Autowired
	private TbBlogarticalMapper mapper;
  @Scheduled(cron = "0/3 * * * * ?")//每隔5秒隔行一次 
  public void SaveTraffic()
  {
	  Map<Integer,Integer> map=LookBlogController.ReadBLogNumber;
	  for(Integer x:map.keySet()) {		  
		  mapper.MyUpdate(map.get(x), x);		  		  
	  }
  } 
}
