SELECT h.etunimi, h.sukunimi, h.sahkoposti, h.id as henkId, t.id as TapId
	FROM Henkilo h
	LEFT JOIN randomOsallistuja o ON h.id = o.henkiloId
	LEFT JOIN Tapahtuma t ON t.id = o.tapahtumaId 
WHERE o.tapahtumaId = ?;