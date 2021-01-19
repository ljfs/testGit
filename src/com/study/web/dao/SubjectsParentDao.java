package com.study.web.dao;

import java.util.List;

import com.study.web.entity.SubjectParent;

/**
 * SubjectsParentsDao���ڲ�����Ŀ���ڵ�ϵ��
 * @version 1.0
 * @author ������
 *
 */
public interface SubjectsParentDao {
	/**
	 * ���ڲ�ѯ���е�ϵ��
	 * @return
	 * ��������ϵ�����Ϣ
	 */
	List<SubjectParent> querySubjectParent();
	/**
	 * ͨ��ϵ��id��ѯϵ��
	 * @param id
	 * ϵ���id���
	 * @return
	 * ���ط��������ļ���
	 */
	List<SubjectParent> querySubjectParentById(int id);
	/**
	 * ͨ��ϵ������Ʋ�ѯϵ��
	 * @param name
	 * ϵ�������
	 * @return
	 * ���ط��������ļ���
	 */
	List<SubjectParent> querySubjectParentByName(String name);
	/**
	 * ���һ��ϵ��
	 * @param subjectParent
	 * ����һ��ϵ���ʵ������Ϣ
	 * @return
	 * ����ִ�е�����
	 */
	int addSubjectParent(SubjectParent subjectParent);
	/**
	 * 
	 * @param subjectParent
	 * 
	 * @return
	 * 
	 */
	int updateSubjectParent(SubjectParent subjectParent);
	/**
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 */
	int deleteSubjectParentById(int id);
	/**
	 * 
	 * @param name
	 * 
	 * @return
	 * 
	 */
	int deleteSubjectParentByName(String name);
}
