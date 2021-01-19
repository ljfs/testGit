package com.study.web.mysql.dao;

import java.awt.geom.Area;
import java.util.List;

import com.study.web.annotation.MyBatisDao;
import com.study.web.basedao.SimpleDao;
import com.study.web.entity.City;
import com.study.web.entity.Province;

/**
 * AreaDao�ӿ��еĳ��󷽷��Ե�����Ϣ������ɾ�Ĳ飬<br>
 * ������Ϊ�ײ����Աʹ�ã���ͨ����Ա����ͨ��Աֻ�ܽ��в�ѯ�ͻ�ȡid<br>
 * @version 1.0
 * @author ������
 *
 */
@MyBatisDao
public interface ArearDao extends SimpleDao<Area> {
	/**
	 * ���󷽷�ִ��ȫ����ѯ<br>
	 * ��ѯ��Ӧ�����ݱ�Ϊ������ʡ�ݣ�
	 * @return
	 * ����һ�麬��ʡ�ݣ���ŵļ���
	 */
	List<Province> queryProvice();
	/**
	 * ���󷽷����ڲ�ѯ���е�ʡ��<br>
	 * ��ѯʱ��Ҫ�������<br>
	 * @param id
	 * id��Ŷ�Ӧ���ݱ��г��еı��<br>
	 * @return
	 * ����һ�鼯��
	 */
	List<Province> queryProvinceById(Province id);
	/**
	 * ���󷽷�ͨ������ʡ�ݵ���Ϣֱ�Ӳ�ѯʡ��<br>
	 * ���ڷ���һ��ʡ�ݵļ���<br>
	 * @param province
	 * ����Ĳ���Ϊʡ�ݵ�������ɵ��ַ���
	 * @return
	 * ����һ��ʡ�ݵļ��ϣ���Ҫ���ڻ�ȡʡ�ݵ�id��
	 */
	List<Province> queryProvinceByName(String province);
	/**
	 * ��ѯȫ���ĳ�����Ϣ
	 * @return
	 * ����һ�����ڳ�����Ϣ�ļ���
	 */
	List<City> queryCity();
	/**
	 * ͨ���������ڵ�ʡ�ݱ�Ų�ѯ������ӵĳ����Լ���ѡʡ�ݵ���Ϣ<br>
	 * ���ҳ�һ��ʡ���а����ĳ��м���<br>
	 * @param id
	 * �����id������Ӧ���ݿ��г��б��ʡ��id��ţ�<br>
	 * ͨ�����������ϵ��ȡʡ�ݱ��е�ʡ��id<br>
	 * @return
	 * ����������ʡ�ݵĳ�����Ϣ����
	 */
	List<City> queryCityByProvinceId(City id);
	/**
	 * ͨ�����е�id���ҳ���<br>
	 * �Գ��н��о�ȷ����<br>
	 * @param id
	 * ����Ĳ�����Ӧ���ݱ��е�id��<br>
	 * id�е�Լ��Ϊ�ǿգ�����1��Ψһ<br>
	 * @return
	 * ����һ�����ϣ���Ҫ�������е���Ϣ(�����ѯ)
	 */
	List<City> queryCityById(City id);
	/**
	 * ���ڳ��а��ճ��е����ƽ��в�ѯ<br>
	 * ��ѯ֮��ֱ�ӻ�ȡ���е���Ϣ<br>
	 * @param city
	 * �������Ϊ�������ƣ�<br>
	 * ����Ϊ�ַ���<br>
	 * @return
	 * ����һ�����еļ���
	 */
	List<City> queryCityByName(String city);
	/**
	 * ͨ������һ��ʡ�ݵ����в������ʡ��<br>
	 * @param province
	 * ����Ĳ���Ϊʡ�ݵ�ʵ��
	 * @return
	 * ����һ���������֣����Ϊ1��ʾ��ӳɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int addProvince(Province province);
	/**
	 * ͨ������һ�����е����в�����ӳ���<br>
	 * @param city
	 * ����һ�����е�ʵ����
	 * @return
	 * ����һ���������֣����Ϊ1��ʾ��ӳɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int addCity(City city);
	/**
	 * �޸�ʡ����Ϣ�����ڶ�Ӧ�������εı䶯
	 * @param province
	 * ����һ��ʡ�ݵ���
	 * @return
	 * ����һ���������֣����Ϊ1��ʾ�޸ĳɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int updateProvince(Province province);
	/**
	 * ����һ�����е�ֵ�������޸ĳ���
	 * @param city
	 * ����һ�����е�ʵ���� 
	 * @return
	 * ����һ���������֣����Ϊ1��ʾ�޸ĳɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int updateCity(City city);
	/**
	 * ͨ��ʡ�ݵ����ƶ�ʡ�ݽ���ɾ��<br>
	 * @param province
	 * ����Ĳ���Ϊʡ�����ƣ�<br>
	 * �βε�������������е�������ͬ��<br>
	 * ��������ͬһ�ֲ������ò���Ϊ�ַ������Ͳ���
	 * @return
	 * ����һ���������֣����Ϊ1��ʾɾ���ɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int deleteProvinceByName(String province);
	/**
	 * ͨ��ʡ�ݵ�idɾ��ʡ��<br>
	 * @param id
	 * ����һ��ʡ�ݵ�id���<br>
	 * @return
	 * ����һ���������֣����Ϊ1��ʾɾ���ɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int deleteProvinceById(Province id);
	/**
	 * ͨ�����е�idɾ������
	 * @param id
	 * ����һ�����е�id���
	 * @return
	 * ����һ���������֣����Ϊ1��ʾɾ���ɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int deleteCityById(int id);
	/**
	 * ͨ�����е�����ֱ��ɾ������
	 * @param city
	 * ������е�����
	 * @return
	 * ����һ���������֣����Ϊ1��ʾɾ���ɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int deleteCityByName(String city);
	/**
	 * ͨ����ѯ���б������Ӧ��ʡ������ɾ��������Ϣ
	 * @param id
	 * ����ʡ�ݵ�id���
	 * @return
	 * ����һ���������֣����Ϊ1��ʾɾ���ɹ���<br>
	 * ���Ϊ0��ʾ���ʧ�ܣ����ݱ�������ʡ�ݣ�<br>
	 * ����֮ǰ�����÷�����Ŀ��ʼֵΪ-1
	 */
	int deleteCityByProvinceId(int id);
}
