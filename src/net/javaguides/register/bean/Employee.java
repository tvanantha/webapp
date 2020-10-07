package net.javaguides.register.bean;

import java.io.Serializable;

public class Employee implements Serializable {
	
		public static final long serialVersionUID = 1L;
		private String Username;
		private String Email;
		private String Password;
		private String Confirm__Password;
		public String getUsername() {
			return Username;
		}
		public void setUsername(String username) {
			Username = username;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getConfirm__Password() {
			return Confirm__Password;
		}
		public void setConfirm__Password(String confirm__Password) {
			Confirm__Password = confirm__Password;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		
		
	
		
		
}
