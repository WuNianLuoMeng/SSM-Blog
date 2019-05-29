package Util;

import java.util.List;

import redis.clients.jedis.JedisCluster;
public class MyJedisCLuster {
	private List<JedisCluster> list;
	public MyJedisCLuster(List<JedisCluster> list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	public List<JedisCluster> GetList(){
		return this.list;
	}
}
