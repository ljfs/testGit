package com.study.web.dao;

import java.util.List;

import com.study.web.entity.Subjects;
/**
 * SubjectDao���ڹ���ѧϰ��Ŀ
 * @version 1.0
 * @author ������
 *
 */
public interface SubjectDao {
	/**
	 * ���ڲ�ѯ���е�ѧ����Ϣ
	 * @return
	 * ����һ���������ϰ�����Ŀ
	 */
	List<Subjects> querySubjects();
	/**
	 * ͨ��Id��Ų�ѯѧ����Ϣ
	 * @param id
	 * �����id����Ϊ��Ŀ��id���<br>
	 * ͨ��id���ֱ�Ӳ�ѯ��Ŀ
	 * @return
	 * �������һ������
	 */
	List<Subjects> querySubjectById(int id);
	/**
	 * ͨ����Ŀ��ϵ���ѯ��Ŀ
	 * @param parent
	 * ����Ĳ���Ϊ��Ŀϵ���ʵ���࣬<br>
	 * ���а������һ����Ŀ��ϵ��<br>
	 * ����ϵ���п��ܰ����˸���Ŀ
	 * @return
	 * �������з��������ļ���
	 */
	List<Subjects> querySubjectByParent(String parent);
	/**
	 * ͨ����Ŀ��ϵ���ѯ��Ŀ
	 * @param pid
	 * ����Ĳ���Ϊ��Ŀϵ��ı�ţ�<br>
	 * ���а������һ����Ŀ��ϵ��<br>
	 * ����ϵ���п��ܰ����˸���Ŀ
	 * @return
	 * �������з��������ļ���
	 */
	List<Subjects> querySubjectByParentId(int pid);
	/**
	 * ͨ����Ŀ�����Ʋ�ѯ��Ŀ��Ϣ
	 * @param name
	 * �������Ϊ��Ŀ������
	 * @return
	 * ���ط��������ļ���
	 */
	List<Subjects> querySubjectByName(String name);
	/**
	 * ���ѧ����Ϣ
	 * @param subjects
	 * ѧ����Ϣ��
	 * @return
	 * ����ִ�гɹ�������
	 */
	int addSubject(Subjects subjects);
	/**
	 * ͨ����Ŀ���ɾ����Ŀ
	 * @param id
	 * ��Ŀ���
	 * @return
	 * ����ִ�гɹ�������
	 */
	int deleteSubjectById(int id);
	/**
	 * ͨ����Ŀ����ɾ����Ŀ
	 * @param name
	 * ��Ŀ������
	 * @return
	 * ����ִ�е�����
	 */
	int deleteSubjectByName(String name);
	/**
	 * ͨ����Ŀ��ϵ����ɾ����Ŀ
	 * @param pid
	 * ��Ŀ��ϵ����
	 * @return
	 * ����ִ�е�����
	 */
	int deleteSubjectByParent(int pid);
	/**
	 * ���¿�Ŀ��Ϣ
	 * @param subjects
	 * �����Ŀ��ʵ������Ϣ
	 * @return
	 * ����ִ�гɹ�������
	 */
	int updateSubject(Subjects subjects);
}