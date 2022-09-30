package movie.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.web.multipart.MultipartFile;

public class MovieBean {

	private int m_num; // ��ȣ
	@Size(min=10, max=10, message="��ȭ�ڵ� 10�ڸ� �Է�(����+�����ڵ�+��ȣ)")
	private String m_code; // �ڵ�
	@NotBlank(message="��ȭ�� �Է�")
	private String m_name; // �̸�
	@NotBlank(message="�帣 �Է�")
	private String m_genre; // �帣
	@NotBlank(message="������ ÷��")
	private String m_img; // ������
	@NotBlank(message="��û��� �Է�")
	private String m_grade; // ��û����
	@NotBlank(message="���۱��� �Է�")
	private String m_nation; // ���۱���
	@NotBlank(message="���� �Է�")
	private String m_pd; // ����
	@NotBlank(message="�⿬ �Է�")
	private String m_actor; // ���
	@Pattern(regexp="[0-9]+$",message="����Ÿ�� ���� �Է�")
	private String m_runtime; // ����Ÿ��
	@NotBlank(message="������ �Է�")
	private String m_date; // ������
	@NotBlank(message="������ �Է�")
	private String m_enddate; // ������
	@NotBlank(message="�ٰŸ� �Է�")
	private String m_info; // ����
	@Pattern(regexp="[0-9]+$",message="�������� ���� �Է�")
	private String m_view; // ��������
	private String m_like; // ���ƿ�

	private double m_per; // ������
	private String m_review; // ����
	private double m_star; // ����
	
	private MultipartFile upload; // a.jpg X
	public MultipartFile getUpload() {
		return upload;
	}
	public void setUpload(MultipartFile upload) { // upload=a.jpg X
		System.out.println("setUpload(MultipartFile upload)");
		this.upload = upload;
		System.out.println("setUpload upload:" + upload);
		System.out.println("upload.getName():"+upload.getName());
		System.out.println("upload.getOriginalFilename():"+upload.getOriginalFilename());
		this.m_img = upload.getOriginalFilename();
	}
	
	public MovieBean() {
		super();
	}
	
	public MovieBean(int m_num, String m_code, String m_name, String m_genre, String m_img, String m_grade,
			String m_nation, String m_pd, String m_actor, String m_runtime, String m_date, String m_enddate,
			String m_info, String m_view, String m_like, double m_per, String m_review, double m_star,
			MultipartFile upload) {
		super();
		this.m_num = m_num;
		this.m_code = m_code;
		this.m_name = m_name;
		this.m_genre = m_genre;
		this.m_img = m_img;
		this.m_grade = m_grade;
		this.m_nation = m_nation;
		this.m_pd = m_pd;
		this.m_actor = m_actor;
		this.m_runtime = m_runtime;
		this.m_date = m_date;
		this.m_enddate = m_enddate;
		this.m_info = m_info;
		this.m_view = m_view;
		this.m_like = m_like;
		this.m_per = m_per;
		this.m_review = m_review;
		this.m_star = m_star;
		this.upload = upload;
	}

	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_code() {
		return m_code;
	}
	public void setM_code(String m_code) {
		this.m_code = m_code;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_genre() {
		return m_genre;
	}
	public void setM_genre(String m_genre) {
		this.m_genre = m_genre;
	}
	public String getM_img() {
		return m_img;
	}
	public void setM_img(String m_img) {
		this.m_img = m_img;
	}
	public String getM_grade() {
		return m_grade;
	}
	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}
	public String getM_nation() {
		return m_nation;
	}
	public void setM_nation(String m_nation) {
		this.m_nation = m_nation;
	}
	public String getM_pd() {
		return m_pd;
	}
	public void setM_pd(String m_pd) {
		this.m_pd = m_pd;
	}
	public String getM_actor() {
		return m_actor;
	}
	public void setM_actor(String m_actor) {
		this.m_actor = m_actor;
	}
	public String getM_runtime() {
		return m_runtime;
	}
	public void setM_runtime(String m_runtime) {
		this.m_runtime = m_runtime;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_enddate() {
		return m_enddate;
	}
	public void setM_enddate(String m_enddate) {
		this.m_enddate = m_enddate;
	}
	public String getM_info() {
		return m_info;
	}
	public void setM_info(String m_info) {
		this.m_info = m_info;
	}
	public String getM_view() {
		return m_view;
	}
	public void setM_view(String m_view) {
		this.m_view = m_view;
	}
	public double getM_per() {
		return m_per;
	}
	public void setM_per(double m_per) {
		this.m_per = m_per;
	}
	public String getM_review() {
		return m_review;
	}
	public void setM_review(String m_review) {
		this.m_review = m_review;
	}
	public double getM_star() {
		return m_star;
	}
	public void setM_star(double m_star) {
		this.m_star = m_star;
	}
	public String getM_like() {
		return m_like;
	}
	public void setM_like(String m_like) {
		this.m_like = m_like;
	}
}
