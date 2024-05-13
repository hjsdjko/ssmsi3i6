package com.entity.model;

import com.entity.ZhoubiancanyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 周边餐饮
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-12 20:48:36
 */
public class ZhoubiancanyinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 餐饮类型
	 */
	
	private String canyinleixing;
		
	/**
	 * 餐饮图片
	 */
	
	private String canyintupian;
		
	/**
	 * 餐饮简介
	 */
	
	private String canyinjianjie;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 价格
	 */
	
	private Float price;
				
	
	/**
	 * 设置：餐饮类型
	 */
	 
	public void setCanyinleixing(String canyinleixing) {
		this.canyinleixing = canyinleixing;
	}
	
	/**
	 * 获取：餐饮类型
	 */
	public String getCanyinleixing() {
		return canyinleixing;
	}
				
	
	/**
	 * 设置：餐饮图片
	 */
	 
	public void setCanyintupian(String canyintupian) {
		this.canyintupian = canyintupian;
	}
	
	/**
	 * 获取：餐饮图片
	 */
	public String getCanyintupian() {
		return canyintupian;
	}
				
	
	/**
	 * 设置：餐饮简介
	 */
	 
	public void setCanyinjianjie(String canyinjianjie) {
		this.canyinjianjie = canyinjianjie;
	}
	
	/**
	 * 获取：餐饮简介
	 */
	public String getCanyinjianjie() {
		return canyinjianjie;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setPrice(Float price) {
		this.price = price;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}
			
}
