package fi.hoptimus.olutseuraa.helper;

import java.util.ArrayList;
import java.util.List;

import fi.hoptimus.olutseuraa.bean.Henkilo;
import fi.hoptimus.olutseuraa.bean.Tapahtuma;

public class Helpperi {

	//poistaa duplikaatit ja yhdist�� osallistujam��r�t
	public static List<Tapahtuma> PoistaListastaDuplikaatit(List<Tapahtuma> tapahtumat) {
		
		tapahtumat = lisaaOsallistujaMaarat(tapahtumat);
		
		tapahtumat = poistaDuplikaatit(tapahtumat);
		
		return tapahtumat;
	}
	
	private static List<Tapahtuma> poistaDuplikaatit(List<Tapahtuma> tapahtumat) {
		
		List<Tapahtuma> tapahtumat2 = tapahtumat;
		
		//lis�� uuteen listaan tapahtumat ilman duplikaatteja
		for(int i = 0; i < tapahtumat.size(); i++) {
			for(int j = 1; j < tapahtumat2.size(); j++) {
				
				if(j < tapahtumat2.size() && i < tapahtumat.size()) {
					//jos id sama, poista j�lkimm�isempi uudesta listasta
					if(tapahtumat.get(i).getId() == tapahtumat2.get(j).getId()) {
						
						//jos olemassa uudessa listassa
						if(tapahtumat2.get(j) != null && i != j) {
							
							//poista duplikaatti
							tapahtumat2.remove(j);
						}
					}
				}
				
			}
		}
		return tapahtumat2;
	}

	public static List<Tapahtuma> lisaaOsallistujaMaarat(List<Tapahtuma> tapahtumat) {
		
		//lis�� listaan osallistujam��r�t
		for(int i = 0; i < tapahtumat.size(); i++) {
			for(int j = 0; j < tapahtumat.size(); j++) {
				//jos id sama, nosta osallistujam��r��
				if(tapahtumat.get(i).getId() == tapahtumat.get(j).getId()) {
					tapahtumat.get(i).setOsallistujamaara(tapahtumat.get(i).getOsallistujamaara() + 1);
				}
			}
		}
		return tapahtumat;
	}
	
}
