package com.alipay.config;

public class AlipayConfig {
	// �̻�appid
	public static String APPID = "";
	// ˽Կ pkcs8��ʽ��
	public static String RSA_PRIVATE_KEY = "";
	// �������첽֪ͨҳ��·�� ��http://����https://��ʽ������·�������ܼ�?id=123�����Զ����������������������������
	public static String notify_url = "http://�̻����ص�ַ/alipay.trade.wap.pay-JAVA-UTF-8/notify_url.jsp";
	// ҳ����תͬ��֪ͨҳ��·�� ��http://����https://��ʽ������·�������ܼ�?id=123�����Զ���������������������������� �̻������Զ���ͬ����ת��ַ
	public static String return_url = "http://�̻����ص�ַ/alipay.trade.wap.pay-JAVA-UTF-8/return_url.jsp";
	// �������ص�ַ
	public static String URL = "https://openapi.alipay.com/gateway.do";
	// ����
	public static String CHARSET = "UTF-8";
	// ���ظ�ʽ
	public static String FORMAT = "json";
	// ֧������Կ
	public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjrEVFMOSiNJXaRNKicQuQdsREraftDA9Tua3WNZwcpeXeh8Wrt+V9JilLqSa7N7sVqwpvv8zWChgXhX/A96hEg97Oxe6GKUmzaZRNh0cZZ88vpkn5tlgL4mH/dhSr3Ip00kvM4rHq9PwuT4k7z1DpZAf1eghK8Q5BgxL88d0X07m9X96Ijd0yMkXArzD7jg+noqfbztEKoH3kPMRJC2w4ByVdweWUT2PwrlATpZZtYLmtDvUKG/sOkNAIKEMg3Rut1oKWpjyYanzDgS7Cg3awr1KPTl9rHCazk15aNYowmYtVabKwbGVToCAGK+qQ1gT3ELhkGnf3+h53fukNqRH+wIDAQAB";
	// ��־��¼Ŀ¼
	public static String log_path = "/log";
	// RSA2
	public static String SIGNTYPE = "RSA2";
}
