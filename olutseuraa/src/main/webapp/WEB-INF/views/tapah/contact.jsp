

<div class="reveal" id="contact" data-reveal data-close-on-click="true" data-animation-in="scale-in-up" data-animation-out="scale-out-down">
  <h4>Kerro, miten voisimme kehitt�� palveluamme.</h4>
  <form action="palautetta" method="POST" id="palauteform">
  <div class="row">
    <div class="small-6 columns">
      <label>S�hk�posti
        <input type="email" maxlength="50" placeholder="...ei ole pakko t�ytt��" name="sposti">
      </label>
    </div>
    <div class="small-6 columns">
      <label>Nimi
        <input type="text" maxlength="50" name="nimi" placeholder="...eik� t�t�k��n">
      </label>
    </div>
     <div class="small-12 columns">
      <label>Otsikko
        <input type="text" maxlength="50" name="otsikko" placeholder="Mit� palautteesi koskee?">
      </label>
    </div>
    <div class="small-12 columns">
    <label>Palaute
    <textarea placeholder="Kirjoita palautteesi t�h�n laatikkoon (max 500 merkki�)" name="palaute" maxLength="500"></textarea>
    </label>
    </div>
  </div>
  <button type="submit" class="button float-center small success">L�het� <i class="fi-upload small"></i></button>
</form>
  <button class="close-button" data-close aria-label="Close reveal" type="button">
    <span aria-hidden="true">&times;</span>
  </button>
</div>

