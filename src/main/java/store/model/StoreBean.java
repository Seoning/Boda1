package store.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

public class StoreBean {
	private int s_num;
	
	@NotEmpty(message = "��ǰ ī�װ��� �������� �ʾҽ��ϴ�.")
	private String s_code;
	
	@NotEmpty(message= "���� ȭ���� �������� �ʾҽ��ϴ�.")
	private String s_image;
	
	@Size(min = 2, max = 10, message = "��ǰ �̸��� �ּ� 2�ڸ� �ִ� 10�ڸ��Դϴ�.")
	private String s_name;
	
	@Range(min = 1000, message="������ �ּ� 1000�� �̻��Դϴ�.")
	private String s_price;
	
	@Range(min = 1, message="��� ������ �ּ� 1�� �̻��Դϴ�.")
	private String s_stock;
	
	@Length(min = 5,max = 20,message = "��ǰ�� ���� ������ �ּ� 5�ڸ� �ִ� 20�ڸ��Դϴ�.")
	private String s_content;
	
	@Min(value = 1, message="����Ʈ�� �ּ� 1�̻��Դϴ�.")
	private String s_point;
	
	private MultipartFile upload;
	
	public String getS_stock() {
		return s_stock;
	}

	public void setS_stock(String s_stock) {
		this.s_stock = s_stock;
	}

	public void setUpload(MultipartFile upload) { 
		System.out.println("setUpload(MultipartFile upload)");
		this.upload = upload;
		System.out.println("setUpload upload:" + upload);
		System.out.println("upload.getName():"+upload.getName()); 
		System.out.println("upload.getOriginalFilename():"+upload.getOriginalFilename()); 
		this.s_image = upload.getOriginalFilename();
	}
	
	public MultipartFile getUpload() {
		return upload;
	}
	
	
	public String getS_point() {
		return s_point;
	}
	public void setS_point(String s_point) {
		this.s_point = s_point;
	}
	public String getS_image() {
		return s_image;
	}
	public void setS_image(String s_image) {
		this.s_image = s_image;
	}
	public int getS_num() {
		return s_num;
	}
	public void setS_num(int s_num) {
		this.s_num = s_num;
	}
	public String getS_code() {
		return s_code;
	}
	public void setS_code(String s_code) {
		this.s_code = s_code;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_price() {
		return s_price;
	}
	public void setS_price(String s_price) {
		this.s_price = s_price;
	}
	public String getS_content() {
		return s_content;
	}
	public void setS_content(String s_content) {
		this.s_content = s_content;
	}
	
	
}
