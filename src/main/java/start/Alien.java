package start;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Alien {

	@GeneratedValue
	@Id
	private int aid;
    
	@Column
	private String aname;

	@Column
	private String password;

	@OneToMany
	@JoinColumn(name = "user_id")
	private List<FileInfo> files = new ArrayList<>();

	
	public Alien() {
	}
	
	public Alien(@NotNull String aname, String password) {
		super();
		this.aname = aname;
		this.password = password;
	}

	public int getAid() {
		return aid;
	}

	public List<FileInfo> getFiles() {
		return files;
	}

	public void setFiles(List<FileInfo> files) {
		this.files = files;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", password=" + password + ", files=" + files + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
