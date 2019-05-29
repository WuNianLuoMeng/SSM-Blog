package rediscluster;

import redis.clients.jedis.JedisCluster;
import java.util.*;

import org.springframework.stereotype.Controller;
@Controller
public class MyJedisCluster {
	LinkedList<JedisCluster> list;
	public void setlist(LinkedList<JedisCluster> list) {
		this.list = list;
	}
}
