package com.dajingzhu.utils;

import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dajingzhu.bean.WeChatContext;


/**
 * 微信工具
 * @Author wuwz
 * @TypeName WeChatUtil
 */
@SuppressWarnings("unchecked")
public abstract class WeChatUtil {
	
	// access_token有效毫秒记录数
	public static long ACCESS_TOKEN_TIME = 0;
	
	// jsapi_ticket有效毫秒记录数
	public static long JSAPI_TICKET_TIME = 0;
	
	// jsapi_ticket有效毫秒记录数
	public static Map<String,String> tempData = new HashMap<String, String>();
	
	// 微信配置上下文
		public static WeChatContext context = WeChatContext.getInstance();	

	
	// 获取关注用户
	public static JSONObject getUsersJSON(String token) {
		
		try {
			
			//请求接口地址
			String requestUrl = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=ACCESS_TOKEN";
			
			//请求参数
			requestUrl=requestUrl.replace("ACCESS_TOKEN", token);  
			
			//发起请求
			String result = HttpUtil.httpRequest(requestUrl, "GET", requestUrl);
			
			if(result != null && !"".equals(result)) {
				return JSON.parseObject(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	// 获取关注用户的OpenIds
	public static JSONArray getOpenIds(String token) {
		try {
			JSONObject usersJsonObj = getUsersJSON(token);
			
			return (usersJsonObj.getJSONObject("data")).getJSONArray("openid");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
