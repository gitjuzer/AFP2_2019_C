## 1. Áttekintés

Az alkalmazás célja játékos módú iskolai tanulmányokat kiegészítő tanulási lehetőség biztosítása általános iskolásoknak.
Az alkalmazás rendelkzik Web és Android felülettel, mindkettő módon elérhető az összes felhasználói funkció. A tananyagok tantárgyak, azon belül pedig témakörök szerint vannak osztályozva. A témakörökben a diákok tananyagot és ahhoz tartozó teszteket (kiegészítős, feleletválasztós, összekötős, közelítős) találnak. Ezek megoldására idő és pontosság alapján pontszámot kapnak a tanulók. Az eredmények megjelennek az adott feladat mellett, illetve az összesített pontszám megjelenik egy külön menüpontban. (összesített pontszámok).

by: [Gajdár Krisztián](https://www.github.com/gajdikuka)

## 2. Jelenlegi helyzet
Az oktatásért felelős szervek hierarchikus rendszerében legalul foglalnak helyet az iskolák. Ebből adodóan nem azok alakítják ki a tanrendet akik a tanulók érdekeit tartják szem előtt.

Jelenleg az oktatás:
- szigorú a diákokhoz
- a tanárok nem tudnák párhuzamosan foglalkozni a diákokkal
- nincs lehetőség a diákok egyéni igényeihez igazodni
- lexikális tudásközpontú, stresszes, nem motiváló, nem játékos
- elméleti alapú, nagyon kevés gyakorlattal
- XX. századi, elavult módszereket használó

Mindezek miatt a mai oktatás alapvetően nyomasztó és demotiváló hatással bír.

## 3. Vágyálom rendszer 

**3.1. Terjedés: kik használják a rendszert**

A program általános iskolás és gimnazista diákok számára készül, tanulásfejlesztés, játékos tanulás témakörében. Célja elősegíteni a "játszva tanulást",
így lekötvén akár a hiperaktív gyermekek figyelmét is, élvezetté tenni a felkészülést és segíteni a preferencia szerzést. Sikeres adaptáció esetén a program 
elterjedhet akár az összes magyarországi oktatási intézményben, akár külföldi, határontúli területeken is megjelenhet, később lefordítható más nyelvekre.

**3.2. Egyénileg kiválaszthatja a feladatokat, amelyekkel segíti a hiányosságait**

A program tartalmazni fogja valamennyi az adott célcsoport számára szükséges tantárgyat, a modulokat mind a diák, mind a tanár, mind a szülő kiválaszthatja.
Az iskolában gyengébb diák először egyszerű feladatokat kap, felkelti az érdeklődését, különféle játékmódokon sajátítja el a tudást, később aztán egyre összetettebbé
válnak a feladatok, egészen akár a tantárgyi maximum eléréséig. Korban fiatalabb gyerekek sugó és menürendszer segítségével érthetik meg a játékot,
valamint szaktanáraik, akik alapfokú képzésben fognak részesülni a program használatát illetoen tájékoztatást is tudnak nyújtani.
Idősebb gyerekek saját maguk számára szerkeszthetik a féléves/éves tantárgyi előmenetellel párhuzamosan a modulokat, így hozzásegítve oket a jó eredmények 
eléréséhez. A tanárok folyamatosan nyomon tudják követni az osztályaik valamennyi tanulója által elkészített, megoldott modulokat, melyekbol megállapíthatja
és kiküszöbölheti fobb hibáik, gyengeségeik és a tanórák keretein belül megoldásokat javasolhat azok megoldására.

**3.3. Honnan indult, hol tart most, mi a célja időtávok**

A program nyomon követi a diák fejlődését az adott modulok tükrében. Grafikonok, statisztikai adatok segítségével elemezhető a programban eltöltött ido hasznossága, 
akár az órán szerzett érdemjeggyel is összehasonlítható, így felmérve, hogy mik a nehezebb, érzékenyebb, esetleg téves és javításra szoruló koncepciók. A tanárral együttmuködve
rövid távon a hallgató tanulmányi eredményének enyhe javulása, majd később miután a használat otthon is rendszeressé vált így az unalmas házi feladatok intézményét felváltva
a diákban rejlő potenciál maximális kihasználása.

**3.4. Folyamatosan frissül és bovül az új igényeknek megfelelően**

Minden félév végén a tanárok a diák programhasználati logjait, adathalmazait, valamint enaplós érdemjegyeit a fejlesztőcsapat segítségére, rendelkezésére szolgáltatják.
Így a programozók és a velük együttmuködő magasan képzett oktatástechnikai munkatársak, a programban résztvevő szaktanárok és a szaktárca képviseloi elemzik az egyes
modulokat és fejlesztéseket állítanak hadrendbe. A rendszeren folyamatosan képzett stábok dolgoznak a minél magasabb fokú eredményesség elérése céljából.

**3.5. Rendszer specifikációs álmok**

A program muködtetéséhez elegendő más hasonló programok mintájára egy mobiltelefon, vagy személyi számítógépes környezet, melyhez nagyjából 300 megabyte szabad 
területnyi letöltést kell hozzáférhetové tenni. A rendszer fejlesztői részére szükséges egy 30 db egyenként 400.000 Ft piaci értékű laptop, melyen a fejlesztést, a karbantartást és
a mantiss rendszerű hibajavítást, valamint a git alapú verzió frissítéseket el lehet végezni. Szükséges még továbbá egy nagy kapacitású szerverterem, 3 számítógéppel, hogy a
rendszergazdák az adattárolást, valamint a dataanalitikusok programjainak muködtetését azokon el lehessen végezni.

Készítette: Gergely Dávid és [Vincze Flórián](https://www.github.com/Fagyesz)

## 4. Funkcionális követelmények

**4.1. Felhasználói lehetőségek**
- Ki és bejelentkeztetési lehetőség illetve regisztráció (Regisztráció külön diák és tanár részére).
- Személyes előrehaladás áttekintése, elvégzett leckék és elolvasott témakörök.
- Általános fiókbeállítások
- Ranglista témakörökre osztva

**4.2 Oktatási lehetőségek**
- Általános témakörök felsorolása
- Témakörökre osztott témák
- Témánkénti előrehaladás jelzése
- Infografika témánként
- Vizsgalehetőség az elolvasott témák után
- Offline elérhetőség a már megnyitott témáknál

**4.3 Feladattípusok**
- kvíz (feleletválasztás)
- párosítás
- szöveg kiegészítés felajánlott lehetőségek alapján
- tipp

Készítette: [Berényi Szabolcs](https://github.com/Szabbi97) és [Guth Dániel](https://github.com/Guth27)

## 5. Rendszerre vonatkozó törvények, szabványok, ajánlások

**5.1. Szerzői jogszabályok:**
- A törvény szerint az eredeti számítógépes program az azt létrehozó személy vagy vállalat szellemi tulajdona. A számítógépes programokat szerzői jogi törvény védi, amely kimondja, hogy az ilyen művek engedély nélküli másolása törvénybe ütköző cselekedet. (Magyarországon a szerzői jogokat az 1999. évi LXXVI. törvény szabályozza)
- Licenszerződés(amennyiben van)

**5.2. Adatvédelmi jogszabályok:**
- AZ EURÓPAI PARLAMENT ÉS A TANÁCS (EU) 2016/679 RENDELETE
(2016. április 27.)
a természetes személyeknek a személyes adatok kezelése tekintetében történő védelméről és az ilyen adatok szabad áramlásáról, valamint a 95/46/EK rendelet hatályon kívül helyezéséről (általános adatvédelmi rendelet)
- MMXI. évi CXII. törvény az információs önrendelkezési jogról és az információszabadságról ( Infotv.)

## 6. Jelenlegi üzleti folyamatok modellje

Komplex tanulástámogató rendszer fejlesztése.
1. A cégvezető felveszi a párt központi emberével a kapcsolatot, aki megfelelő politikai irányultság esetén továbbajánlja a KLIKK-hez.
2. A központi elképzelés szerint létrehozzuk a progromokat, úgy, hogy az aktuális uniós pályázatból finanszírozható legyen.
3. Prezentáljuk az elképzelést és a várható profitot, és ennek megoszlását a döntésben résztvevő embereknek, felvesszük a megfelelő tanácsadó cégeket a projekthez
4. Megadjuk a paramétereket a pályázatok kiírásához, a párt pályázatíró cége megírja számunkara a pályázatot.
5. Írunk valami programot, ha szerencsénk van, még működik is, próbáljuk elkerülni a sajtóvisszhangot.
6. Átadjuk a rendszert.
7. A pályázati pénzekből a tanácsadó cégeket kifizetjük.


## 7. Igényelt üzleti folyamatok

Szórakoztató tanulási folyamat:

A cél, hogy a diák kellemesen érezze magát a tanulással eltöltött idő alatt, valamint a feladatok és tananyag a lehető legjobban kösse le a figyelmét. Ezáltal a tanuló szívesebben tölti tanulással az idejét és annak hatékonysága is nő.

Egészséges versenyszellem megteremtése:

Egy nem túl komoly vetélkedés a diákok körében ösztönző hatással van jobb eredmények elérésére.

Hangsúly a csapatmunkán:

A csapatmunkához való szoktatás már a tanulmányok elején fontos feladat. Törekedni kell arra, hogy a diákok hozzászokjanak több személlyel való együttes munkára, feladatok felosztására valamint a hatékony kommunikációra a csapaton belül.

Elérhetőség:

A tananyagot biztosítani kell, hogy az bármikor elérhető legyen a diák számára, valamint az anyag kényelmesen vehető nem túl nagy „részekre” legyen felbontva.

## 8. Követelmény Lista

**Mik a rendszer fontos tulajdonságai**

Fontos, hogy tartalmazzon felhasználói rendszert
Szükséges, hogy a felhasználók különböző jogosultságokkal rendelkezzenek
Szülséges, hogy a felhasználók adatai megfelelően titkosított módon legyenek tárolva
Legyenek témakörök
Legyenek különböző tananyagok
Legyenek vizsgák, amelyek a tananyagok végén jelennek meg
Fontos, hogy ne mindig ugyanaz a vizsga jelenjen meg

**Kérem, mondja el forgatókönyvszerűen, hogyan szeretné használni a rendszert a belépéstől a kilépésig!**

Az alkalmazás megnyitása után kiválasztom a bejelentkezés opciót, ahol egy felhasználónév és egy jelszó segítségével bejelentkezek. A főmenüben kiválasztom a számomra megfelelő tananyagot és feldolgozom azt, majd a végén egy "vizsgával" ellenőrzöm a tudásom.  A vizsga kitöltése után megtekinthetem a az általam elért pontszámot a leaderboardson, ahol a többi felhasználó is megjelenik rangsorba helyezve, a szerint, hogy ki érte el a legtöbb pontot.

**Milyen kivételes helyzetekre kell felkészülni?**

Ha bizonyos kapcsolatok nem hozhatóak létre (Pl.: adatbázis, a kliensből)
Frissítés esetén verzióeltérés figyelése korábbi verzióra
Ha a kliens elveszti a kapcsolatot a szerverrel, a szerver erre reagáljon

Modul | ID | Név | V. | Kifejtés
--- | ---| --- | --- | ---
User | U_Reg | Regisztráció | 0.2 | A felület eléréséhez felhasználói fiók szükséges. Ehhez természetesen elengedhetetlen egy regisztrációs felület is.
| | U_Login | Bejelentkezés | 0.2 | A felület eléréséhez bejelentkezés szükséges. A felhasználó ezután tudja elérni a különböző funkciókat, illetve a szerver az ő fiókjához csatoltan tárol különböző adatokat.
| | U_Logout | Kijelentkezés | 0.2 | Ha a kliens felhasználót szeretne cserélni akkor elengedhetetlen egy kijelentkező felület. Ezután a kliens visszatér a bejelentkező képernyőre
| | U_FPW | Elfelejtett jelszó | 0.2 | Ha a kliens elfelejti a jelszavát akkor valamilyen módon vissza kell tudnia szerezni, anélkül hogy huzamosabb időt és energiát kellene belefektetnie. Ezt egy email bevitelével megteheti, amire kiküldjük az adott emailhez tartozó felhasználó jelszavát.
| | U_Perm | Jogosultság | 0.3 | A jogosultság rendszere elengedhetetlen ahhoz, hogy bizonyos felhasználóknak engedélyt tudjunk adni komolyabb dolgokhoz, míg egy általános felhasználónak ne engedjünk ilyent.
| | U_Opt | Általános beállítások | 0.4 | Mind a mobil, mind a webes felületen elérhetővé kell tennie egy beállítások felületet ahol a felhasználó egyedi preferanciák alapján képes lesz beállítani dolgokat (Pl.: Nyelv, Értesítések, Felhasználó adatainak módosítása)
Vizsga | V_Topics | Témák kilistázása | 0.5 | A felhasználó kitudja listáztatni az adott témákat (Pl.: Irodalom / Matematika / Történelem)
| | V_SubTops | Altémák | 0.5 | A felhasználó miután kiválasztja az általa kívánt témát, ezen belül lesznek altémák is (Pl.: Történelem esetén a 2. világháború)
| | V_Exam | Teszt | 0.6 | Ha egy felhasználó kiválasztotta az általa kívánt témát és altémát lehetősége lesz olvasni az adott témakörben és egy teszt kitöltésére is, amiben megtudhatja mennyire jól értelmezte az adott témakört.
| | V_MarkedEx | Kiértékelt tesztek | 0.6 | Egy teszt kitöltése után a felhasználó láthatja az elért pontszámát, de ezt tároljuk, és bármikor megtekinthető újra, hogy hogyan is szerepelt a tesztben. Erre alapul majd a ranglista.
Általános | G_Progress | Profil előrehaladás | 0.7 | Minden témában több altéma van. Ezek kitöltésének állapotát témakörökre bontva, százalékos értékkel tároljuk.
| | G_Leaderb | Ranglista | 0.8 | Itt megtalálható lesz egy felületen, az adott témakörre, vagy összesített pontszám alapján a legjobb értékelést kapott felhasználók.
| | G_Noti | Értesítések | 1.0 | A kész program értesítéseket küldhet a felhasználónak különböző események alatt (Pl.: Új témakör érhető el)
| | G_Offline | Offline működés | 1.1 | A programnak tárolnia kell a felhasználó jelenlegi előrehaladását, akkor is ha valamiért nem tud csatlakozni a szerverre. Az adatokat akkor fogja továbbítani a szerver felé, ha újra kapcsolatot tud létesíteni vele.

Készitette: [Dudás Bálint](https://www.github.com/DudiVok) és [Szűcs Norbert](https://www.github.com/norbert-szucs)

## 9. Riportok

## 10. Fogalomszótár

| Fogalom | Jelentés |
| ------- | -------- |
| Leaderboard | A felhasználók tesztjeit pontszám alapján rangsoroljuk. Ezek itt találhatóak meg. |
| Előrehaladás | Bizonyos témakörök több részből állnak. Az ezekkel való haladásukat tároljuk. |
| Offline működés | Az alkalmazás akkor is működjön, ha a szerver nem működik, vagy a kliens nem tud csatlakozni a kiszolgálóhoz. |
| Értesítés | Mobilos alkalmazás esetén vagy webes böngészőknél értesítéseket küldhetünk újabb témakörök létrejötte esetén |
