package olutseuraa.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import olutseuraa.bean.Tapahtuma;

public class TapahtumaDAOSpringJdbcImpl implements TapahtumaDAO {

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void talleta(Tapahtuma t) {
		String sql = "INSERT INTO Tapahtuma(nimi, pvm, aika, paikka, teema, osallistujat, isanta, kuvaus) VALUES(?,?,?,?,?,?,?,?)";
		Object[] parametrit = new Object[] { t.getNimi(), t.getPvm(), t.getAika(), t.getPaikka(), t.getTeema(), t.getOsallistujat(), t.getIsanta(), t.getKuvaus()};
		
		jdbcTemplate.update(sql , parametrit);
	}

	public List<Tapahtuma> haeKaikki() {
		String sql  = "SELECT id, nimi, pvm, aika, paikka, teema, osallistujat, isanta, kuvaus FROM Tapahtuma";
		RowMapper<Tapahtuma> mapper = new TapahtumaRowMapper();
		List<Tapahtuma> tapahtumat = jdbcTemplate.query(sql,mapper);
		return tapahtumat;
	}

}
