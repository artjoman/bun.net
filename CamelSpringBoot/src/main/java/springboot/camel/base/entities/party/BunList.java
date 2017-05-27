package springboot.camel.base.entities.party;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BunList {

private List<Bun> bunList = null;

public List<Bun> getBunList() {
return bunList;
}

public void setBunList(List<Bun> bunList) {
this.bunList = bunList;
}

}