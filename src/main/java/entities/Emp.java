package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp {
	@Id
		private int ecode;
		private String ename;
		private String desg;
		private int salary;
		public int getEcode() {
			return ecode;
		}
		public void setEcode(int ecode) {
			this.ecode = ecode;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Emp(int ecode, String ename, String desg, int salary) {
			super();
			this.ecode = ecode;
			this.ename = ename;
			this.desg = desg;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Emp [ecode=" + ecode + ", ename=" + ename + ", desg="
					+ desg + ", salary=" + salary + "]";
		}
		public Emp() {
			super();
		}
		public Emp(int ecode) {
			super();
			this.ecode = ecode;
		}
		
		
		
}
