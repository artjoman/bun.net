package springboot.camel.base.entities.party;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PartyList {

private List<Party> party = null;

public List<Party> getPartyList() {
return party;
}

public void setPartyList(List<Party> party) {
this.party = party;
}

}