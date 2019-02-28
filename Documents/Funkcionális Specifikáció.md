## 1. Áttekintés

Az alkalmazás célja játékos módú iskolai tanulmányokat kiegészítő tanulási lehetőség biztosítása általános iskolásoknak.
Web-en és Android-on futó alkalmazás. A tananyagok tantárgyak, azon belül pedig témakörök szerint vannak osztályozva. A témakörökben a diákok tananyagot és ahhoz tartozó teszteket (kiegészítős, feleletválasztós, összekötős, közelítős) találnak. Ezek megoldására idő és pontosság alapján pontszámot kapnak a tanulók. Az eredmények megjelennek az adott feladat mellett, illetve az összesített pontszám megjelenik egy külön menüpontban. (összesített pontszámok).

by: [Gajdár Krisztián](https://www.github.com/gajdikuka)

## 2. Jelenlegi Helyzet
Az oktatásért felelős szervek hierarchikus rendszerében legalul foglalnak helyet az iskolák. Ebből adodóan nem azok alakítják ki a tanrendet akik a tanulók érdekeit tartják szem előtt.

Jelenleg az oktatás:
- szigorú a diákokhoz
- a tanárok nem tudnák párhuzamosan foglalkozni a diákokkal
- nincs lehetőség a diákok egyéni igényeihez igazodni
- lexikális tudásközpontú, stresszes, nem motiváló, nem játékos
- elméleti alapú, nagyon kevés gyakorlattal
- XX. századi, elavult módszereket használó

Mindezek miatt a mai oktatás alapvetően nyomasztó és demotiváló hatással bír.

## 3. Vágyálom Rendszer 

**3.1. Terjedés: kik használják a rendszert**

A program általános iskolás és gimnazista diákok számára készül, tanulásfejlesztés, játékos tanulás témakörében. Célja elosegíteni a "játszva tanulást",
így lekötvén akár a hiperaktív gyermekek figyelmét is, élvezetté tenni a felkészülést és segíteni a preferencia szerzést. Sikeres adaptáció esetén a program 
elterjedhet akár az összes magyarországi oktatási intézményben, akár külföldi, határontúli területeken is megjelenhet, késobb lefordítható más nyelvekre.

**3.2. Egyénileg kiválaszthatja a feladatokat, amelyekkel segíti a hiányosságait**

A program tartalmazni fogja valamennyi az adott célcsoport számára szükséges tantárgyat, a modulokat mind a diák, mind a tanár, mind a szülo kiválaszthatja.
Az iskolában gyengébb diák eloször egyszeru feladatokat kap, felkelti az érdeklodését, különféle játékmódokon sajátítja el a tudást, késobb aztán egyre összetettebbé
válnak a feladatok, egészen akár a tantárgyi maximum eléréséig. Korban fiatalabb gyerekek sugó és menürendszer segítségével érthetik meg a játékot,
valamint szaktanáraik, akik alapfokú képzésben fognak részesülni a program használatát illetoen tájékoztatást is tudnak nyújtani.
Idosebb gyerekek saját maguk számára szerkeszthetik a féléves/éves tantárgyi elomenetellel párhuzamosan a modulokat, így hozzásegítve oket a jó eredmények 
eléréséhez. A tanárok folyamatosan nyomon tudják követni az osztályaik valamennyi tanulója által elkészített, megoldott modulokat, melyekbol megállapíthatja
és kiküszöbölheti fobb hibáik, gyengeségeik és a tanórák keretein belül megoldásokat javasolhat azok megoldására.

**3.3. Honnan indult, hol tart most, mi a célja idotávok**

A program nyomon követi a diák fejlodését az adott modulok tükrében. Grafikonok, statisztikai adatok segítségével elemezheto a programban eltöltött ido hasznossága, 
akár az órán szerzett érdemjeggyel is összehasonlítható, így felmérve, hogy mik a nehezebb, érzékenyebb, esetleg téves és javításra szoruló koncepciók. A tanárral együttmuködve
rövid távon a hallgató tanulmányi eredményének enyhe javulása, majd késobb miután a használat otthon is rendszeressé vált így az unalmas házi feladatok intézményét felváltva
a diákban rejlo potenciál maximális kihasználása.

**3.4. Folyamatosan frissül és bovül az új igényeknek megfeleloen**

Minden félév végén a tanárok a diák programhasználati logjait, adathalmazait, valamint enaplós érdemjegyeit a fejlesztocsapat segítségére, rendelkezésére szolgáltatják.
Így a programozók és a velük együttmuködo magasan képzett oktatástechnikai munkatársak, a programban résztvevo szaktanárok és a szaktárca képviseloi elemzik az egyes
modulokat és fejlesztéseket állítanak hadrendbe. A rendszeren folyamatosan képzett stábok dolgoznak a minél magasabb fokú eredményesség elérése céljából.

**3.5. Rendszer specifikációs álmok**

A program muködtetéséhez elegendo más hasonló programok mintájára egy mobiltelefon, vagy személyi számítógépes környezet, melyhez nagyjából 300 megabyte szabad 
területnyi letöltést kell hozzáférhetové tenni. A rendszer fejlesztoi részére szükséges egy 30 db egyenként 400.000 Ft piaci értéku laptop, melyen a fejlesztést, a karbantartást és
a mantiss rendszeru hibajavítást, valamint a git alapú verzió frissítéseket el lehet végezni. Szükséges még továbbá egy nagy kapacitású szerverterem, 3 számítógéppel, hogy a
rendszergazdák az adattárolást, valamint a dataanalitikusok programjainak muködtetését azokon el lehessen végezni.

Készítette: Gergely Dávid és Vincze Flórián

## 4. Funkcionális Követelmények

## 5. Rendszerre vonatkozó törvények, szabványok, ajánlások

**5.1. Szerzői jogszabályok:**
- A törvény szerint az eredeti számítógépes program az azt létrehozó személy vagy vállalat szellemi tulajdona. A számítógépes programokat szerzői jogi törvény védi, amely kimondja, hogy az ilyen művek engedély nélküli másolása törvénybe ütköző cselekedet. (Magyarországon a szerzői jogokat az 1999. évi LXXVI. törvény szabályozza)
- Licenszerződés(amennyiben van)

**5.2. Adatvédelmi jogszabályok:**
- AZ EURÓPAI PARLAMENT ÉS A TANÁCS (EU) 2016/679 RENDELETE
(2016. április 27.)
a természetes személyeknek a személyes adatok kezelése tekintetében történő védelméről és az ilyen adatok szabad áramlásáról, valamint a 95/46/EK rendelet hatályon kívül helyezéséről (általános adatvédelmi rendelet)
- MMXI. évi CXII. törvény az információs önrendelkezési jogról és az információszabadságról ( Infotv.)

## 6. Jelenlegi Üzleti Folyamatok Modellje

## 7. Igényelt Üzleti Folyamatok

Szórakoztató tanulási folyamat:

A cél, hogy a diák kellemesen érezze magát a tanulással eltöltött idő alatt, valamint a feladatok és tananyag a lehető legjobban kösse le a figyelmét. Ezáltal a tanuló szívesebben tölti tanulással az idejét és annak hatékonysága is nő.

Egészséges versenyszellem megteremtése:

Egy nem túl komoly vetélkedés a diákok körében ösztönző hatással van jobb eredmények elérésére.

Hangsúly a csapatmunkán:

A csapatmunkához való szoktatás már a tanulmányok elején fontos feladat. Törekedni kell arra, hogy a diákok hozzászokjanak több személlyel való együttes munkára, feladatok felosztására valamint a hatékony kommunikációra a csapaton belül.

Elérhetőség:

A tananyagot biztosítani kell, hogy az bármikor elérhető legyen a diák számára, valamint az anyag kényelmesen vehető nem túl nagy „részekre” legyen felbontva.

## 8. Követelmény Lista

**Mik a rendszer fontos tulajdonágai**

Fontos, hogy tartalmazzon felhasználói rendszert
Szükséges, hogy a felhasználók különböző jogosultságokkal rendelkezzenek
Szülséges, hogy a felhasználók adatai megfelelően titkosított módon legyenek tárolva
Legyenek témakörök
Legyenek különböző tananyagok
Legyenek vizsgák, amelyek a tananyagok végén jelennek meg
Fontos, hogy ne mindig ugyanaz a vizsga jelenjen meg

**Kérem, mondja el forgatókönyv szerűen, hogyan szeretné használni a rendszert a belépéstől a kilépésig!**

Az alkalmazás megnyitása után. kiválasztom a bejelentkezés opciót, ahol egy felhasználónév és egy jelszó segítségével bejelentkezek. A főmenüben kiválasztom a számomra megfelelő tananyagot és feldolgozom azt, majd a végén egy "vizsgával" ellenőrzöm a tudásom.  A vizsga kitöltése után megtekinthetem a az általam elért pontszámot a leaderboardson, ahol a többi felhasználó is megjelenik rangsorba helyezve, a szerint, hogy ki érte el a legtöbb pontot.

**Milyen kivételes helyzetekre kell felkészülni?**

Ha bizonyos kapcsolatok nem hozhatóak létre (Pl.: adatbázis, a kliensből)
Frissítés esetén verzióeltérés figyelése korábbi verzióra
Ha a kliens elveszti a kapcsolatot a szerverrel, a szerver erre reagáljon

Modul | ID | Név | V. | Kifejtés
--- | ---| --- | --- | ---
Felület | F0 | Wireframe elkészítése | 0.1 | A program által később használandó felület grafikus tervének elkészítése az összes használandó platformon.
| | FW1 | Webes felület prototípusának elkészítése | 0.2 | Wireframe alapján, a webes felület felépítése.
| | FA1 | Mobilapp felület prototípusának elkészítése | 0.2b | Wireframe alapján, a mobilos alkalmazás felületének felépítése.
| | Fx | A felületek véglegesítése | 1 | A program releasekor használatos felületet ekkor érjük el, nagyobb változtatást nem igényel.
Adatbázis | A0 | Adatbázis tervezés | 0.1 | Használandó adatbázis kiválasztása, illetve a későbbiekben használatos adatbázis struktúrájának kigondolása
| | A1 | Adatbázis létrehozása | 0.2 | A kigondolt terv alapján felvinni a táblákat és elemeiket.
| | A2 | Adatbázis tesztelése | 0.3 | A létrehozott adatbázis struktúrájának tesztelése véletlenszerű adatokkal, constraintek jól működnek-e.
| | Ax | Adatbázis véglegesítés | 1 | A program releasekor ezt az adatbázis struktúrát fogjuk használni, nagyobb változtatást nem igényel.
Back-end | B0 | A backend struktúra kigondolása | 0.1 | A program háttérje mögött álló elemek kigondolása: Milyen függvényekre lesz szükségünk az apphoz, milyen dbconnectort használjunk hozzá stb

Készitette: [Dudás Bálint](https://www.github.com/DudiVok) és [Szűcs Norbert](https://www.github.com/norbert-szucs)

## 9. Riportok

## 10. Fogalomszótár
