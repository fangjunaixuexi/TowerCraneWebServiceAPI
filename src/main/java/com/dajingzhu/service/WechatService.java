package com.dajingzhu.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.dajingzhu.bean.TextMessage;
import com.dajingzhu.utils.WechatMessageUtil;

public class WechatService {


	 public String processRequest(HttpServletRequest request) {
	        Map<String, String> map = WechatMessageUtil.xmlToMap(request);
	        // 发送方帐号（一个OpenID）
	        String fromUserName = map.get("FromUserName");
	        // 开发者微信号
	        String toUserName = map.get("ToUserName");
	        // 消息类型
	        String msgType = map.get("MsgType");
	        // 默认回复一个"success"
	        String responseMessage = "success";
	        // 对消息进行处理
	        if (WechatMessageUtil.MESSAGE_TEXT.equals(msgType)) {// 文本消息
	        	System.out.println("传来的是text");
	            TextMessage textMessage = new TextMessage();
	            textMessage.setMsgType(WechatMessageUtil.MESSAGE_TEXT);
	            textMessage.setToUserName(fromUserName);
	            textMessage.setFromUserName(toUserName);
	            textMessage.setCreateTime(System.currentTimeMillis());
	            textMessage.setContent("我已经受到你发来的消息了");
	            System.out.println(textMessage);
	            responseMessage = WechatMessageUtil.textMessageToXml(textMessage);
	            System.out.println(responseMessage);
	        }
	        return responseMessage;
	      
	 
	          
	    }
	       

}
