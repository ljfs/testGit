package com.study.web.dao;

import java.util.List;

import com.study.web.entity.PersionLogin;
/**
 * PersionLiginDao�ӿ�����ʵ�ֳ�Ա�ĵ�¼���ܣ�<br>
 * ע�Ṧ�ܣ����̨���û���ɾ�������޸Ĺ�����<br>
 * @version 1.0
 * @author ������
 *
 */
public interface PersionLoginDao {
	/**
	 * ���ڲ�ѯ���г�Ա�ĵ�¼����
	 * @return
	 * ��������һ����Ա�����ݼ���
	 */
	List<PersionLogin> queryPersionLoginData();
	/**
	 * ͨ�����ҳ�Ա�ı�ʶ�źͳ�Ա���������Ƿ�����ȷ��¼
	 * @param userid
	 * ��ʶ����������Ϊint��
	 * @param password
	 * �����Ӧ��Ϊ�ַ������Ͳ���
	 * @return
	 * �����ѯ�Ľ�������ڣ�����true��<br>
	 * ���򷵻�false
	 */
	boolean queryPersionLogin(int userid,String password);
	/**
	 * ͨ�������ѯ��Ա��Ϣ��<br>
	 * ��Ҫ���ڲ鿴�û��Ƿ�Ϸ���¼
	 * @param persionid
	 * �������͵ĳ�Ա���
	 * @param login
	 * �������л�ȡ�ĳ�Ա��¼���е���Ϣ
	 * @return
	 * ����Ϸ������ص�ֵΪ1
	 */
	int addPersionLogin(int persionid,PersionLogin login);
	/**
	 * 
	 * @param password
	 * @return
	 */
	int updatePassword(String password);
	
	int deletePersionLoginData(PersionLogin persionLogin);
	int deletePersionLoginById(int persionid);
}
