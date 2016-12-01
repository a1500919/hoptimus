
<%@ include file="head-include.jsp"%>
<body>
	<%@ include file="header.jsp"%>

	<div class="row align-middle">
	
	
	
		<div class="column small-12 medium-6 medium-offset-3">
		
		<div class="submitError">
			<c:if test="${param.UserExists eq true}" >
				  <h4>Kirjaudu sis��n liitty�ksesi tapahtumaan!</h4>
			</c:if>
			<c:if test="${param.cantJoin eq true}" >
				  <h4>Tapahtumaan liittyminen ei onnistunut!</h4>
			</c:if>
			<c:if test="${param.submitError eq true}" >
				  <h4>Tapahtui virhe liittyess� tapahtumaan!</h4>
			</c:if>
			<c:if test="${param.userNotExists eq true}" >
				  <h4>K�ytt�j�� ei l�ytynyt!</h4>
			</c:if>
		</div>
		
		<div class="submitSuccess">
			<c:if test="${param.submitSuccessActivate eq true}" >
				  <h4>Osallistuminen onnistui! Tarkista s�hk�postisi tilin aktivointia varten.</h4>
			</c:if>
		</div>

			<c:forEach items="${tapahtumat}" var="event" varStatus="iteration">

				<c:set var="pvm" value="${event.pvm}" />
				<fmt:formatDate pattern="MM" value="${pvm}" var="kk" />
				<c:set var="osallistujat" value="${fn:length(event.osallistujat)}" />
				<c:set var="maxMaara" value="${event.maxOsallistujamaara}" />

				<sec:authorize access="hasRole('ROLE_ADMIN')">
					<%@ include file="adminLaatikot.jsp"%>
				</sec:authorize>
				
				<sec:authorize access="!hasRole('ROLE_ADMIN')">
					<%@ include file="kayttajaLaatikot.jsp"%>
				</sec:authorize>
				
			</c:forEach>

		</div>
		
	<div id="instafeed" class="show column small-12 medium-3"><img border="0" alt="ig" src="resources/img/instagram_logo.png" width="150" height="150"><br></div>
	</div>

	<%@ include file="footer.jsp"%>