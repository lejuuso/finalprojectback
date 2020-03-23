# finalprojectback
Koronaprojekti

1.Versio:
-Kaikkien Apua tarvitaan -ilmoitusten listautuminen
-Apua tarvitaan -ilmoituksen jättäminen

MVP:
-Apua tarvitaan -ilmoituksen jättäminen (jätä ilmoitus-nappula)
-Apua tarvitaan -ilmoitusten hakeminen & listaaminen kategorioiden &
alueen perusteella
-Ilmoituksen deletointi


Full product:
-Apua tarjotaan -ilmoituksen jättäminen
-Apua tarjotaan -ilmoitusten hakeminen & listaaminen kategorioiden &
alueen perusteella
-Search -kenttä

Nice to have features:
-Editoi ilmoitusta
-Postinumero konverttaa kaupunginosan nimeksi


Alue:
Helsinki, postinumeroina kategorisoituna


Kategoriat:
-Kaupassakäynti
-Lastenhoito
-Koiran ulkoilutus
-Ulkoiluseuraa
-Roskien vienti
-Muu

Ilmoituksen jättämisen ominaisuudet:
-Otsikko
-Etunimi (näkyy ilmoituksessa)
-Alue postinumerona
-Checkbox -valikko: kategoriat
-Kuvaus
-Sähköposti
-Valitse salasana (ilmoituksen poistamista varten)
-Hyväksyn ehdot!!! -täppä

Taulukko
-Id (randomgeneroitu) (int)
-Otsikko (String) varchar
-Nimi (String) varchar
-Alue (Postinumero) (Int)
-Sähköposti (String) varchar
-Kuvaus (String) text
-Kaupassakäynti (Boolean)
-Lastenhoito (Boolean)
-Koiran ulkoilutus (Boolean)
-Ulkoiluseuraa (Boolean)
-Roskien vienti (Boolean)
-Muu (Boolean)


Näkyvän ilmoituksen ominaisuudet
-Otsikko
-Etunimi
-Alue
-Pallukoina kaikki kategoriat, joihin henkilö tarvitsee apua
-Kuvaus
-Ota yhteyttä -nappula
-Poista ilmoitus -tekstinappula pienellä printillä nurkassa
