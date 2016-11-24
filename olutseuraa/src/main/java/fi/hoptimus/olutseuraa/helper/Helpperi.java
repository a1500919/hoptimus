package fi.hoptimus.olutseuraa.helper;

import java.util.List;

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
			for(int j = 0; j < tapahtumat2.size(); j++) {
				
				if(j < tapahtumat2.size() && i < tapahtumat.size()) {
					//jos id sama, poista j�lkimm�isempi uudesta listasta
					if(tapahtumat.get(i).getId() == tapahtumat2.get(j).getId()) {
						
						//jos olemassa uudessa listassa ja ei sama indeksi
						if(tapahtumat2.get(j) != null && i != j) {
							
							//poista duplikaatti
							tapahtumat2.remove(j);
						}
					}
				}
				
			}
		}
		//jostain syyst� t�ss� kohtaa on viel� kaksi samaa tapahtumaa, tehr��s luuppi uurelleen
		List<Tapahtuma> tapahtumat3 = tapahtumat2;
		
		//lis�� uuteen listaan tapahtumat ilman duplikaatteja
		for(int i = 0; i < tapahtumat2.size(); i++) {
			for(int j = 0; j < tapahtumat3.size(); j++) {
				
				if(j <= tapahtumat3.size() && i <= tapahtumat2.size()) {
					//jos id sama, poista j�lkimm�isempi uudesta listasta
					if(tapahtumat2.get(i).getId() == tapahtumat3.get(j).getId()) {
						
						//jos olemassa uudessa listassa ja ei sama indeksi
						if(tapahtumat3.get(j) != null && i != j) {
							
							//poista duplikaatti
							tapahtumat3.remove(j);
						}
					}
				}
				
			}
		}
		/*//DEBUG
		 * System.out.println("tapahtumat2 sis�lt�:");
		for(int i = 0; i < tapahtumat.size(); i++) {
			System.out.println("tapahtuma id: " + tapahtumat.get(i).getId() + ", osallistujia: " + tapahtumat.get(i).getOsallistujamaara());
		}
		*/
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
