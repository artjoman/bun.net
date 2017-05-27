package springboot.camel.base.entities.party;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bun {

private String partyId;
private String quantity;
private String productType;
private String time;
private String location;
private String source;

public String getPartyId() {
return partyId;
}

public void setPartyId(String partyId) {
this.partyId = partyId;
}

public String getQuantity() {
return quantity;
}

public void setQuantity(String quantity) {
this.quantity = quantity;
}

public String getProductType() {
return productType;
}

public void setProductType(String productType) {
this.productType = productType;
}

public String getTime() {
return time;
}

public void setTime(String time) {
this.time = time;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
}

@Override
public String toString() {
	return "Bun [partyId=" + partyId + ", quantity=" + quantity + ", productType=" + productType + ", time=" + time
			+ ", location=" + location + ", source=" + source + "]";
}

}