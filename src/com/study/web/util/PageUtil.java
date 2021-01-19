package com.study.web.util;

/**
 * 分页工具
 * @author 刘俊沣
 * @version 1.0
 * 
 */
public class PageUtil {
	/**
	 * 总行数
	 * @param totalCount
	 * 长度
	 * @param pageSize
	 * 传入页数
	 * @return
	 * 返回整型长度<br>
	 */
	public static int countTotalPages(int totalCount,int pageSize){
		//ͨ用三元运算符判断是否合法
		return totalCount % pageSize == 0? totalCount/pageSize:totalCount/pageSize +1;
	}
}
