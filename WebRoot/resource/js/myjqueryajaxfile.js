/**
 * ��ȡ��ť��ID
 * @param elementId
 */
function getstudentInfo (btnElementId) {
	var btn = document.getElementById(btnElementId);
}
/**
 * ��ȡ�ļ����Ƶ��ı�ID
 * @param elementId
 * @returns �����ı�ֵ
 */
function elementValue(txtelementId){
	var txt = document.getElementById(txtelementId).value;
	return txt;
}
/**
 * 
 * @param txtelementId
 */
function getTextElement(txtelementId) {
	var tElement = document.getElementById(txtelementId);
}
/**
 * ��ȡԪ����ֵ���뺯�����ж϶�Ӧ��Servlet�Ƿ�ƥ��
 * @param elementId ����Ԫ��ID
 * @param servletName �����Ӧ��Servlet
 * @param keyword ����������
 */
function ajaxResource(elementId,servletName,keyword){
	var ajaxofjavascript;
	//��ȡ�ı���ֵ
	var names = getTextElement(elementId);
	var values = elementValue(elementId);
	ajaxofjavascript = getReqiest();
	ajaxofjavascript.onreadystatechange = callback;
	ajaxofjavascript.open("GET",servletName+"?"+names+"=",values);
	ajaxofjavascript.setRequestHeader("Content-type","application/x-www-from-urlencoded");
	ajaxofjavascript.send("keyword"+keyword);
}
/**
 * ��ʼ��jsҪ���ݵ�����
 * @returns ���ݲ�ͬ�������ִ�в�ͬ�Ĳ���
 */
function getReqiest(){
	try {
		return new XMLHttpRequest();
	} catch (e) {
		// TODO: handle exception
		return new ActiveXObject("Microsoft.XMLHTTP");
	}
}
/**
 * 
 * @param elementId
 */
function callback(elementId){
	if (ajaxofjavascript.readyState == 4) {
		if (ajaxofjavascript ==200) {
			//��ȡ��ʾ��Ϣ
			var btntest = getstudentInfo(elementId);
			btntest.innerHTML = "";
		}
	}
}