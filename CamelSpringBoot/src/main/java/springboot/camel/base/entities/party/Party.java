package springboot.camel.base.entities.party;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Party {

private String partyId;
private String partyName;
private String partyType;
private String phone;
private String email;
private String status;

public String getPartyId() {
return partyId;
}

public void setPartyId(String partyId) {
this.partyId = partyId;
}

public String getPartyName() {
return partyName;
}

public void setPartyName(String partyName) {
this.partyName = partyName;
}

public String getPartyType() {
return partyType;
}

public void setPartyType(String partyType) {
this.partyType = partyType;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getEmail() {
return email;
}

public void setEmail(String email) {
this.email = email;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

@Override
public String toString() {
	return "Party [partyId=" + partyId + ", partyName=" + partyName + ", partyType=" + partyType + ", phone=" + phone
			+ ", email=" + email + ", status=" + status + "]";
}

}