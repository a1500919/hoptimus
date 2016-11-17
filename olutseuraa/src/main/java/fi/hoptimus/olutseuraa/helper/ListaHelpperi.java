package fi.hoptimus.olutseuraa.helper;

import java.util.List;

import fi.hoptimus.olutseuraa.bean.Tapahtuma;

public class ListaHelpperi {

	//poistaa duplikaatit ja yhdistää osallistujamäärät
	public static List<Tapahtuma> PoistaListastaDuplikaatit(List<Tapahtuma> tapahtumat) {
		
		//lisää listaan osallistujamäärät
		for(int i = 0; i < tapahtumat.size(); i++) {
			for(int j = 0; j < tapahtumat.size(); j++) {
				//jos id sama, nosta osallistujamäärää
				if(tapahtumat.get(i).getId() == tapahtumat.get(j).getId()) {
					tapahtumat.get(i).setOsallistujamaara(tapahtumat.get(i).getOsallistujamaara() + 1);
				}
			}
		}
		
		List<Tapahtuma> tapahtumat2 = tapahtumat;
		
		//lisää uuteen listaan tapahtumat ilman duplikaatteja
		for(int i = 0; i < tapahtumat.size(); i++) {
			for(int j = 0; j < tapahtumat2.size(); j++) {
				
				//jos id sama, poista jälkimmäisempi uudesta listasta
				if(tapahtumat.get(i).getId() == tapahtumat2.get(j).getId()) {
					
					//jos olemassa uudessa listassa
					if(tapahtumat2.get(j) != null) {
						
						//poista duplikaatti
						tapahtumat2.remove(j);
					}
				}
			}
		}
		return tapahtumat2;
	}
}
