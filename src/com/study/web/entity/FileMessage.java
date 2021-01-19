package com.study.web.entity;

import java.util.Date;

/**
 * <br>�ļ���ϸ��Ϣ</br>
 * @author ������
 * @version 1.0
 *
 */
public class FileMessage {
	/**
	 * <br>�ϴ��ļ�����id��ţ������ֶ�</br>
	 */
	private int id;
	/**
	 * <br>�ϴ��ļ�����ϵ����</br>
	 */
	private int fileOfSubjectParentId;
	/**
	 * <br>�ϴ��ļ�������Ŀ���</br>
	 */
	private int fileOfSubjectId;
	/**
	 * <br>�ϴ��ļ�����</br>
	 */
	private int fileTypeId;
	/**
	 * <br>�ϴ��ļ���׺��</br>
	 */
	private int filenameId;
	/**
	 * <br>�ϴ��ļ�����</br>
	 */
	private String fileText;
	/**
	 * <br>�ϴ��ļ��ĳ�Ա���</br>
	 */
	private int fileUpperId;
	/**
	 * <br>�ļ���С</br>
	 */
	private int fileSize;
	/**
	 * <br>�ļ��Ϻ�״̬���</br>
	 */
	private int fileStatueId;
	/**
	 * <br>�ļ��ϴ����ڱ��</br>
	 */
	private Date fileSaveDate;
	/**
	 * <br>�ļ��ϴ�ͼ����</br>
	 */
	private int fileIconId;
	/**
	 * <br>�����ļ�����Ӧ�ķ�����IP��ַ���</br>
	 */
	private int fileSaveIPId;
	/**
	 * <br>�Ƿ�����רҵ����</br>
	 */
	private int specialty;
	/**
	 * <br>�ļ����״̬</br>
	 */
	private int passed = 1;
	/**
	 * <br>�ļ��������</br>
	 */
	private Date passedDate;
	/**
	 * <br>�޲ι��췽��</br>
	 */
	public FileMessage() {
		super();
	}
	/**
	 * <br>�вι��췽��</br>
	 * @param fileOfSubjectParentId
	 * <br>�ϴ��ļ�����ϵ����</br>
	 * @param fileOfSubjectId
	 * <br>�ϴ��ļ�������Ŀ���</br>
	 * @param fileTypeId
	 * <br>�ļ�����</br>
	 * @param filenameId
	 * <br>�ļ���׺��</br>
	 * @param fileText
	 * <br>�ļ�����</br>
	 * @param fileUpperId
	 * <br>�ļ��ϴ���Ա</br>
	 * @param fileSize
	 * <br>�ļ���С</br>
	 * @param fileStatueId
	 * <br>�ļ�״̬���</br>
	 * @param fileSaveDate
	 * <br>�ļ��ϴ�����</br>
	 * @param fileIconId
	 * <br>�ļ�ͼ����</br>
	 * @param fileSaveIPId
	 * <br>�ļ��洢������IP��ַ���</br>
	 * @param specialty
	 * <br>�Ƿ�����רҵ����</br>
	 * @param passed
	 * <br>�ļ����״̬</br>
	 * @param passedDate
	 * <br>�ļ��������</br>
	 */
	public FileMessage(int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, String fileText, int fileUpperId,
			int fileSize, int fileStatueId, Date fileSaveDate, int fileIconId,
			int fileSaveIPId, int specialty, int passed, Date passedDate) {
		super();
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileText = fileText;
		this.fileUpperId = fileUpperId;
		this.fileSize = fileSize;
		this.fileStatueId = fileStatueId;
		this.fileSaveDate = fileSaveDate;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
		this.specialty = specialty;
		this.passed = passed;
		this.passedDate = passedDate;
	}
	/**
	 * <br>�вι��췽������������������ļ���������ļ�����</br>
	 * @param fileOfSubjectParentId
	 * <br>�ϴ��ļ�����ϵ����</br>
	 * @param fileOfSubjectId
	 * <br>�ϴ��ļ�������Ŀ���</br>
	 * @param fileTypeId
	 * <br>�ļ�����</br>
	 * @param filenameId
	 * <br>�ļ���׺��</br>
	 * @param fileText
	 * <br>�ļ�����</br>
	 * @param fileUpperId
	 * <br>�ļ��ϴ���Ա</br>
	 * @param fileSize
	 * <br>�ļ���С</br>
	 * @param fileStatueId
	 * <br>�ļ�״̬���</br>
	 * @param fileIconId
	 * <br>�ļ�ͼ����</br>
	 * @param fileSaveIPId
	 * <br>�ļ��洢������IP��ַ���</br>
	 * @param specialty
	 * <br>�Ƿ�����רҵ����</br>
	 * @param passed
	 * <br>�ļ����״̬</br>
	 */
	public FileMessage(int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, String fileText, int fileUpperId,
			int fileSize, int fileStatueId, int fileIconId, int fileSaveIPId,
			int specialty, int passed) {
		super();
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileText = fileText;
		this.fileUpperId = fileUpperId;
		this.fileSize = fileSize;
		this.fileStatueId = fileStatueId;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
		this.specialty = specialty;
		this.passed = passed;
	}
	/**
	 * <br>�вι��췽����������������������������ֶ���Ϣ</br>
	 * @param fileText
	 * <br>�ļ�����</br>
	 * @param fileSize
	 * <br>�ļ���С</br>
	 * @param specialty
	 * <br>�Ƿ�����רҵ����</br>
	 * @param passed
	 * <br>�ļ����״̬</br>
	 */
	public FileMessage(String fileText, int fileSize, int specialty, int passed) {
		super();
		this.fileText = fileText;
		this.fileSize = fileSize;
		this.specialty = specialty;
		this.passed = passed;
	}
	/**
	 * <br>�вι��췽������Ӧ�������еļ�</br>
	 * @param id
	 * <br>�ϴ��ļ�����id��ţ������ֶ�</br>
	 * @param fileOfSubjectParentId
	 * <br>�ϴ��ļ�������Ŀ���</br>
	 * @param fileOfSubjectId
	 * <br>�ϴ��ļ�������Ŀ���</br>
	 * @param fileTypeId
	 * <br>�ϴ��ļ�����</br>
	 * @param filenameId
	 * <br>�ϴ��ļ���׺��</br>
	 * @param fileUpperId
	 * <br>�ϴ��ļ��ĳ�Ա���</br>
	 * @param fileStatueId
	 * <br>�ļ��Ϻ�״̬���</br>
	 * @param fileIconId
	 * <br>�ļ��ϴ�ͼ����</br>
	 * @param fileSaveIPId
	 * <br>�����ļ�����Ӧ�ķ�����IP��ַ���</br>
	 */
	public FileMessage(int id, int fileOfSubjectParentId, int fileOfSubjectId,
			int fileTypeId, int filenameId, int fileUpperId, int fileStatueId,
			int fileIconId, int fileSaveIPId) {
		super();
		this.id = id;
		this.fileOfSubjectParentId = fileOfSubjectParentId;
		this.fileOfSubjectId = fileOfSubjectId;
		this.fileTypeId = fileTypeId;
		this.filenameId = filenameId;
		this.fileUpperId = fileUpperId;
		this.fileStatueId = fileStatueId;
		this.fileIconId = fileIconId;
		this.fileSaveIPId = fileSaveIPId;
	}
	/**
	 * <br>�вι��췽������������</br>
	 * @param fileSaveDate
	 * <br>�ļ��ϴ�����</br>
	 * @param passedDate
	 * <br>�ļ����ͨ������</br>
	 */
	public FileMessage(Date fileSaveDate, Date passedDate) {
		super();
		this.fileSaveDate = fileSaveDate;
		this.passedDate = passedDate;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFileOfSubjectParentId() {
		return fileOfSubjectParentId;
	}
	
	public void setFileOfSubjectParentId(int fileOfSubjectParentId) {
		this.fileOfSubjectParentId = fileOfSubjectParentId;
	}
	
	public int getFileOfSubjectId() {
		return fileOfSubjectId;
	}
	
	public void setFileOfSubjectId(int fileOfSubjectId) {
		this.fileOfSubjectId = fileOfSubjectId;
	}
	
	public int getFileTypeId() {
		return fileTypeId;
	}
	
	public void setFileTypeId(int fileTypeId) {
		this.fileTypeId = fileTypeId;
	}
	
	public int getFilenameId() {
		return filenameId;
	}
	
	public void setFilenameId(int filenameId) {
		this.filenameId = filenameId;
	}
	
	public String getFileText() {
		return fileText;
	}
	
	public void setFileText(String fileText) {
		this.fileText = fileText;
	}
	
	public int getFileUpperId() {
		return fileUpperId;
	}
	
	public void setFileUpperId(int fileUpperId) {
		this.fileUpperId = fileUpperId;
	}
	
	public int getFileSize() {
		return fileSize;
	}
	
	public void setFileSize(int fileSize) {
		this.fileSize = fileSize;
	}
	
	public int getFileStatueId() {
		return fileStatueId;
	}
	
	public void setFileStatueId(int fileStatueId) {
		this.fileStatueId = fileStatueId;
	}
	
	public Date getFileSaveDate() {
		return fileSaveDate;
	}
	
	public void setFileSaveDate(Date fileSaveDate) {
		this.fileSaveDate = fileSaveDate;
	}
	
	public int getFileIconId() {
		return fileIconId;
	}
	
	public void setFileIconId(int fileIconId) {
		this.fileIconId = fileIconId;
	}
	
	public int getFileSaveIPId() {
		return fileSaveIPId;
	}
	
	public void setFileSaveIPId(int fileSaveIPId) {
		this.fileSaveIPId = fileSaveIPId;
	}
	
	public int getSpecialty() {
		return specialty;
	}
	/**
	 * <br>�ļ��Ƿ�Ϊרҵ����</br>
	 * @param specialty
	 * <br>�������͵�1��0������Ĭ�ϸ�ֵΪ0</br>
	 */
	public void setSpecialty(int specialty) {
		//�ж�specialty��ֵ�Ƿ�Ϊ1��0
		if ((specialty == 0) || (specialty ==1)) {
			/*
			 * ��������ֵΪ1��0��
			 * ��ִ�и�ֵ����
			 */
			this.specialty = specialty;
		}else {
			//����ֱ��Ĭ�ϸ�ֵΪ0
			this.specialty = 0;
		}
		
	}
	
	public int getPassed() {
		return passed;
	}
	/**
	 * <br>�ж��ļ���˵�״̬</br>
	 * @param passed
	 * <br>��������������0~3֮��</br>
	 */
	public void setPassed(int passed) {
		//�жϴ���Ĳ����Ƿ�Ϊ0~3֮�������
		if ((passed == 0)||(passed ==1)||(passed == 2)||(passed == 3)) {
			/*
			 * �������������ִ�и�ֵ������
			 * ����ֵΪ1��ʾΪ����ˣ�
			 * ����ֵΪ2��ʾ����ͨ����
			 * ����ֵΪ3��ʾ��ȫͨ����
			 * ����ֵΪ0��ʾ��ͨ��
			 */
			this.passed = passed;
		}else if (passed != 1 && passed > 0) {
			/*
			 * ���ִ��ʱ�����ֵ��Ϊ1��
			 * ���Ҵ���0��
			 * �����ݲ������κβ���
			 * 
			 */
		}
	}
	
	public Date getPassedDate() {
		return passedDate;
	}
	
	public void setPassedDate(Date passedDate) {
		this.passedDate = passedDate;
	}
}