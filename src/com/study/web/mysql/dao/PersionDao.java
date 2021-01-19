package com.study.web.mysql.dao;

import java.util.List;

import com.study.web.annotation.MyBatisDao;
import com.study.web.basedao.SimpleDao;
import com.study.web.entity.Persion;

@MyBatisDao
public interface PersionDao extends SimpleDao<Persion> {
	/**
	 * �ӿڳ��󷽷���������������ȫ���ĳ�Ա��Ϣ
	 * @return
	 * �ýӿڷ���һ����Ա����Ϣ�������ڱ����Ա��Ϣ
	 */
	List<Persion> queryAllPersion();
	/**
	 * �ӿڳ��󷽷�����ͨ����Ա���������ҳ�Ա��Ϣ
	 * @param name
	 * �������Ϊ����������Ϊ�ַ���
	 * @return
	 * ����һ�������г�Ա��Ϣ�ļ���
	 */
	List<Persion> queryPersionByName(String name);
	/**
	 * �ӿڳ��󷽷�����ͨ����Ա�������Ȳ��ҳ�Ա��Ϣ
	 * @param requation
	 * �������Ϊ��Ա��������
	 * @return
	 * ���ط��������ĳ�Ա����
	 */
	List<Persion> queryPersionByRequtation(int requation);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա���ڵĵ�����ѯ��Ա��Ϣ
	 * @param provlice
	 * ����ĵ�һ������Ϊ��Ա����ʡ��
	 * @param city
	 * ����ĵڶ�������Ϊ��Ա���ڵĳ���
	 * @return
	 * �������з��ϲ�ѯ�����ĳ�Ա����
	 */
	List<Persion> queryPersionByArear(String provlice,String city);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա���Ա��ѯ��Ա��Ϣ
	 * @param gender
	 * �������Ϊ�Ա�
	 * @return
	 * �������з��ϲ�ѯ�����ĵĳ�Ա����
	 */
	List<Persion> queryPersionBySex(String gender);
	/**
	 * �ӿڳ��󷽷�ͨ����ʼ��Ų�ѯһ����Ա����Ϣ
	 * @param id
	 * �������Ϊ��Ա�ı��
	 * ������ײ����Աʹ��
	 * @return
	 * ����һ����Ա����Ϣ
	 */
	List<Persion> queryPersionById(int id);
	/**
	 * �ӿڳ��󷽷�ͨ���ֻ��Ų�ѯ��Ա��Ϣ
	 * @param moblePhone
	 * ����Ĳ���Ϊ�ֻ�����ɵ��ַ���
	 * @return
	 * ����һ����Ա����Ϣ
	 */
	List<Persion> queryPersionByPhone(String moblePhone);
	/**
	 * �ӿڳ��󷽷�ͨ������������޲��ҳ�Ա����Ϣ
	 * @param minAge
	 * ���������
	 * @param maxAge
	 * ���������
	 * @return
	 * �������з��������ĳ�Ա����Ϣ
	 */
	List<Persion> queryPersionByAge(int minAge,int maxAge);
	/**
	 * �ӿڳ��󷽷��������ע���Ա����Ϣ
	 * @param persionlist
	 * ����Ĳ���Ϊһ����Ա��Ϣ�ļ��ϣ�����ó�Ա�����ڣ��򱣴��Ա����Ϣ
	 * @return
	 * ���ؽ�����Ϊ1��ע��ɹ�������ע��ʧ��
	 */
	int addPersion(List<Persion> persionlist);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա�ĳ�ʼ���ɾ����Ա
	 * @param id
	 * �������Ϊ��Ա�ı�ţ��ó��󷽷����޵ײ�����Աʹ��
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletepersionById(int id);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա��������ɾ����Ա����Ϣ
	 * @param name
	 * ����Ĳ���Ϊ��Ա������
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionByName(String name);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա���Ա�ɾ����Ա��Ϣ
	 * @param gender
	 * �������Ϊ���˵��Ա𣬸ó��󷽷����޵ײ�����Աʹ��
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionBySex(String gender);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա��������ɾ����Ա��Ϣ
	 * @param reputation
	 * �������Ϊ��Ա��������
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionByReputation(int reputation);
	/**
	 * ͨ����Ա���ڵ��������ɾ����Ա��Ϣ���ó��󷽷����޵ײ�����Աʹ��
	 * @param privince
	 * �������Ϊ��Ա��ʡ��
	 * @param city
	 * �������Ϊ��Ա�����ڳ���
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionByArea(String province,String city);
	/**
	 * �ӿڳ��󷽷�ͨ����Ա���ֻ���ɾ����Ա��Ϣ
	 * @param moblePhone
	 * �������Ϊ��Ա���ֻ���
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionByPhone(String moblePhone);
	/**
	 * ͨ�����������ɸѡ��ɾ����Ա��Ϣ���ó��󷽷����޵ײ�����Աʹ��
	 * @param minAge
	 * �������Ϊ��Ա�����������
	 * @param maxAge
	 * ����Ĳ���Ϊ��Ա�����������
	 * @return
	 * �������ֵΪ1��ʾɾ���ɹ�������ֵΪ0��ʾû���ҵ�ɾ���Ķ��󣬷���ֵΪ-1��ʾɾ��ʧ��
	 */
	int deletePersionByAge(int minAge,int maxAge);
	/**
	 * �ӿڳ��󷽷�ͨ������һ���Ա��Ϣ�ļ����޸�
	 * @param persionList
	 * �ò���Ϊһ�����ͼ��ϣ����ϵķ���Լ��Ϊ��Ա��
	 * @return
	 * �������ֵΪ1��ʾ���³ɹ�
	 */
	int executeUpdate(List<Persion> persionList);
	/**
	 * �ӿڳ��󷽷�ͨ��id��Ÿ��³�Ա����Ϣ
	 * @param id
	 * �������Ϊ��Ա�ı�ţ��ó��󷽷����޵ײ�����Աʹ��
	 * @return
	 * �������ֵΪ1��ʾ���³ɹ�
	 */
	int queryAndUpdateReputationById(int id);
	/**
	 * �ӿڳ��󷽷�ͨ�����ҳ�Ա���������³�Ա��Ϣ
	 * @param name
	 * �������Ϊ��Ա������
	 * @return
	 * �������ֵΪ1��ʾ���³ɹ�
	 */
	int queryAndUpdateReputationByName(String name);
	/**
	 * �ӿڳ��󷽷�ͨ��QQ�ŶԳ�Ա����Ϣ�����޸�
	 * @param qq
	 * �������Ϊ��Ա��qq
	 * @return
	 * �������ֵΪ1��ʾ���³ɹ�
	 */
	int queryAndUpdateReputationByQId(String qq);
	/**
	 * ��ѯ����ѧ��������
	 * @return
	 */
	int countPersion();
	/**
	 * ��ҳ��ѯ
	 * @param columns ����
	 * @param page ҳ��
	 * @return ���ؼ���
	 */
	List<Persion> queryPersonByPage(int columns,int page);
}