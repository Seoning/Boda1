package theater.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

public class TheaterBean { //12
   private int t_num;
   @NotEmpty(message = "ÄÚµå¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   @Pattern(regexp = "^[a-z]{1,2}[0-9]+$", message="Áö¿ªÄÚµå¿Í ¼ıÀÚ¸¦ È¥ÇÕÇÏ¿© ÀÔ·ÂÇÏ¼¼¿ä") //¾Õ¿¡ ¾ËÆÄºª µÚ¿¡ ¼ıÀÚ
   private String t_code;
   @NotEmpty(message = "¼³¸³ÀÏÀ» ¼±ÅÃÇÏ¼¼¿ä.")
   private String t_day ;
   @NotBlank(message = "Áö¿ªÀ» ¼±ÅÃÇÏ¼¼¿ä.")
   private String t_region ;
   @NotBlank(message = "½Ã/±¸¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   private String t_gu ;
   @NotBlank(message = "³ª¸ÓÁö ÁÖ¼Ò¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   private String t_address;
   @NotBlank(message = "¿µÈ­°ü ÀÌ¸§À» ÀÔ·ÂÇÏ¼¼¿ä.")
   @Pattern(regexp = "^[A-Z|a-z]{4}[A-Z|a-z|°¡-ÆR]+$" , message="¾Õ¿¡ Boda¸¦ ºÙ¿©ÁÖ¼¼¿ä") //¾Õ¿¡ boda
   private String t_theater ;
   //@NotEmpty(message = "ÀÌ¹ÌÁö¸¦ ¼±ÅÃÇÏ¼¼¿ä.")
   private String t_img;
   @NotBlank(message = "ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   @Pattern(regexp = "^[0-9]{4}-+[0-9]{4}$", message = "-À» ÀÔ·ÂÇÏ¼¼¿ä") //-ÀÔ·ÂÇÊ¼ö
   private String t_tel;
   @NotBlank(message = "ÁÖÂ÷ °¡´É ¿©ºÎ¸¦ ¼±ÅÃÇÏ¼¼¿ä.")
   private String t_parking;
   @NotBlank(message = "»ó¿µ°üÀ» ÀÔ·ÂÇÏ¼¼¿ä.")
   @Pattern(regexp = "^[0-9]+$",message = "¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä") //¼ıÀÚ¸¸
   private String t_name ;
   @NotBlank(message = "ÁÂ¼®¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   @Pattern(regexp = "^[0-9]+$",message = "¼ıÀÚ¸¸ ÀÔ·ÂÇÏ¼¼¿ä") //¼ıÀÚ¸¸
   private String t_seat ;
   @NotBlank(message = "»ó¿µ Á¤º¸¸¦ ¼±ÅÃÇÏ¼¼¿ä.")
   private String t_premium ;
   
   @NotNull(message = "À§Ä¡Á¤º¸¸¦ ÀÔ·ÂÇÏ¼¼¿ä.")
   private String t_location;
   
   public String getT_location() {
      return t_location;
   }
   public void setT_location(String t_location) {
      this.t_location = t_location;
   }
   
   
   
   private int max;
   private int seat;
   private String mname;
   
   
   private MultipartFile upload; 
   
   public MultipartFile getUpload() {
      return upload;
   }
   public void setUpload(MultipartFile upload) {
      this.upload = upload;
      System.out.println("setUpload: "+upload);
      System.out.println("upload.getName(): "+upload.getName());
   
      
      this.t_img = upload.getOriginalFilename();
   }
   
   
   public int getMax() {
      return max;
   }
   public void setMax(int max) {
      this.max = max;
   }
   public int getSeat() {
      return seat;
   }
   public void setSeat(int seat) {
      this.seat = seat;
   }
   public String getT_parking() {
      return t_parking;
   }
   public void setT_parking(String t_parking) {
      this.t_parking = t_parking;
   }
   public String getT_address() {
      return t_address;
   }
   public void setT_address(String t_address) {
      this.t_address = t_address;
   }
   public String getT_img() {
      return t_img;
   }
   public void setT_img(String t_img) {
      this.t_img = t_img;
   }
   public String getT_tel() {
      return t_tel;
   }
   public void setT_tel(String t_tel) {
      this.t_tel = t_tel;
   }
   public int getT_num() {
      return t_num;
   }
   public void setT_num(int t_num) {
      this.t_num = t_num;
   }
   public String getT_code() {
      return t_code;
   }
   public void setT_code(String t_code) {
      this.t_code = t_code;
   }
   public String getT_day() {
      return t_day;
   }
   public void setT_day(String t_day) {
      this.t_day = t_day;
   }
   public String getT_region() {
      return t_region;
   }
   public void setT_region(String t_region) {
      this.t_region = t_region;
   }
   public String getT_gu() {
      return t_gu;
   }
   public void setT_gu(String t_gu) {
      this.t_gu = t_gu;
   }
   public String getT_theater() {
      return t_theater;
   }
   public void setT_theater(String t_theater) {
      this.t_theater = t_theater;
   }
   public String getT_name() {
      return t_name;
   }
   public void setT_name(String t_name) {
      this.t_name = t_name;
   }
   public String getT_seat() {
      return t_seat;
   }
   public void setT_seat(String t_seat) {
      this.t_seat = t_seat;
   }
   public String getT_premium() {
      return t_premium;
   }
   public void setT_premium(String t_premium) {
      this.t_premium = t_premium;
   }

   public TheaterBean(int t_num, String t_code, String t_day, String t_region, String t_gu, String t_address,
         String t_theater, String t_img, String t_tel, String t_parking, String t_name, String t_seat, String t_premium) {
      super();
      this.t_num = t_num;
      this.t_code = t_code;
      this.t_day = t_day;
      this.t_region = t_region;
      this.t_gu = t_gu;
      this.t_address = t_address;
      this.t_theater = t_theater;
      this.t_img = t_img;
      this.t_tel = t_tel;
      this.t_parking = t_parking;
      this.t_name = t_name;
      this.t_seat = t_seat;
      this.t_premium = t_premium;
   }
   public TheaterBean() {
      super();
   }
   public String getMname() {
      return mname;
   }
   public void setMname(String mname) {
      this.mname = mname;
   }
   
   
   
}