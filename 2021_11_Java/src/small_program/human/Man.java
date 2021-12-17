package small_program.human;

public class Man {
	   private String name;
	   private int age;
	   private boolean brith;
	   private String gender;
	   private String location;
	   private String ddi;
	   private String tel;
	   
	   public Man() {
	      super();
	   }

	   public Man(String name, int age, boolean brith, String gender, String location, String ddi, String tel) {
	      super();
	      this.name = name;
	      this.age = age;
	      this.brith = brith;
	      this.gender = gender;
	      this.location = location;
	      this.ddi = ddi;
	      this.tel = tel;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public boolean isBrith() {
	      return brith;
	   }

	   public void setBrith(boolean brith) {
	      this.brith = brith;
	   }

	   public String getGender() {
	      return gender;
	   }

	   public void setGender(String gender) {
	      this.gender = gender;
	   }

	   public String getLocation() {
	      return location;
	   }

	   public void setLocation(String location) {
	      this.location = location;
	   }

	   public String getDdi() {
	      return ddi;
	   }

	   public void setDdi(String ddi) {
	      this.ddi = ddi;
	   }

	   public String getTel() {
	      return tel;
	   }

	   public void setTel(String tel) {
	      this.tel = tel;
	   }

	   @Override
	   public String toString() {
	      return "Man [name=" + name + ", age=" + age + ", brith=" + brith + ", gender=" + gender + ", location="
	            + location + ", ddi=" + ddi + ", tel=" + tel + "]";
	   }
	}
