package com.study.web.basedao;

import java.util.List;

public interface SimpleDao<T> extends BaseDao {
	/**
	 * ͨ��id��ȡ������Ϣ
	 * @param id ��������
	 * @return ����ʵ����
	 */
	T getId(int id);
	/**
	 * ͨ��ʵ������Ҷ���
	 * @param entity ʵ����
	 * @return ʵ������ɵļ���
	 */
	List<T> findList(T entity);
	/**
	 * �������������ݱ��еļ���
	 * @return ���ؼ���
	 */
	List<T> findAllList();
	/**
	 * ��ȡһ��ʵ����
	 * @param entity
	 * @return
	 */
	T get(T entity);
	/**
	 * ͨ��id���Ҽ���
	 * @param id ʵ�����id
	 * @return ����һ������
	 */
	List<T> findListById(int id);
	/**
	 * ͨ�����ƻ�ȡ����
	 * @param name ʵ�����ʵ������
	 * @return ����һ������
	 */
	List<T> findIdByName(String name);
	/**
	 * ���һ��ʵ����
	 * @param entity ����ʵ�����
	 * @return ������ӵ�����
	 */
	int insert(T entity);
	/**
	 * ����һ��ʵ����
	 * @param entity ����ʵ����
	 * @return ���ظ�������
	 */
	int update(T entity);
	/**
	 * ͨ��idɾ��ʵ����
	 * @param id ʵ������
	 * @return ����ɾ��������
	 */
	int deleteById(int id);
	/**
	 * ����ʵ����ɾ����Ϣ
	 * @param entity
	 * @return ����ִ������
	 */
	int deleteByEntity(T entity);
	/**
	 * ͨ��id�߼�ɾ��ʵ������Ϣ
	 * @param id ʵ������
	 * @return ���ء�ɾ����������
	 */
	int heddenEntityById(int id);
}
