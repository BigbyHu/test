package com.test;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class DK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.集合转换为JSONArray对象
		//
		//
		/*Map map = new HashMap();
        map.put("name", "kava");
        map.put("bool", Boolean.TRUE);
        map.put("int", new Integer(1));
        map.put("array", new String[]{"a","b"});
        map.put("func", "function(){return 3;}");
        
        JSONObject jo = JSONObject.fromObject(map);
        System.out.println(jo);*/
		
		
		//2.JSON对象转换为String字符串
		//
		//
		//创建JSONObject对象
        JSONObject json = new JSONObject();
        
        //向json中添加数据
        json.put("username", "wanglihong");
        json.put("height", 12.5);
        json.put("age", 24);
        
        //创建JSONArray数组，并将json添加到数组
        JSONArray array = new JSONArray();
        array.add(0, json);
        
        //转换为字符串
        String jsonStr = array.toString();
        
      //System.out.println(json);
        //System.out.println(jsonStr);
        //解析JSON
        /*JSONObject jsonOb= new JSONObject(jsonStr);  
        JSONArray jsonArray=jsonOb.getJSONArray("users");*/  
        for(int i=0;i<array.size();i++){  
            JSONObject user=(JSONObject) array.get(i);  
            //String userName=(String) user.getJSONObject(jsonStr);
            	System.out.println(user.toString());
        } 
        
	}

}
