## 1. Jelenlegi helyzet
A program az oktatás jelenlegi problémáira kínál megoldást, mely egy sokkal inkább interaktívabb és rugalmasabb tanulást biztosít a tanulóknak számára akár az iskola keretein kívül is. 

A felmerülő problémák megoldásai:
- a diákok az igényeikhez mérten tudják használni
- teljesítmény alapú jutalom rendszer
- interaktív és játékos számonkérés a tananyagokat követően
- modern, aktuális technológiákat használó igényes rendszer

Így egy modernebb gondolatú, a gyerekek számára interaktívabb, és, játékosabb tanulási lehetőséget kívánunk biztosítani, amit bárhol és bármikor tudnak használni a tanuláshoz. 
## 2. Vágyálom rendszer
A program elindításakor választhatunk, hogy oktatói, illetve tanulói felületre szeretnénk-e belépni.
Ezt kiválasztva lehetőségünk van regisztrálni, de míg diákként ez teljesen ingyenes és akadálymentes, oktatóként regisztrálni csak érvényes iskolai licenccel lehet, így megakadályozva, hogy
bárki használja a szoftvert.
Az oktatói felületre belépve több funkciót is észrevehetünk: 
   - 1. Osztályok menedzselése:
           - 1.1 Osztály létrehozása
           - 1.1.1 Diák hozzáadása osztályhoz
           - 1.1.2 Diák eltávolítása osztályból
           - 1.3 Osztály aktivitása
           - 1.4 Diákok gyakorlásainak eredményei
   - 2. Játékok listája:
           - 2.1 Játék módosítása
           - 2.1.1 Kérdés/lehetõség hozzadása
           - 2.1.2 Kérdés/lehetõség törlése
           - 2.1.3 Kérdés/lehetõség módosítása
           - 2.1.4 Játék aktiválása/deaktiválása
           - 2.2 Játékok statisztikái
	   
 Oktatóként képesek vagyunk osztályokat létrehozni, ezekbe diákokat invitálni, így képesek elindítani a gyakorló feladatokat, ezek mellett képesek vagyunk diákokat eltávolítani az osztályokból. Ezeknek az osztályoknak az aktivitását is követni lehet, illetve az egyes diákok eredményeit is képesek vagyunk megtekinteni.
 
 A játékokban szereplõ kérdéshalmazt képesek vagyunk bovíteni, ebbol kérdéseket törölni, vagy éppen módosítani. Ha szükséges, egyes játékokat ki is tudunk kapcsolni, ha az nem túl népszerû a diákoknál, vagy egy hosszadalmasabb kérdésreformot hajtanánk végre, és amint végeztünk ezzel, újra élesbe helyezhetjük a játékot. Meg tudjuk tekinteni az egyes játékok statisztikáit, például hogy mely játékot játsszák a legtöbben, melyben a legmagasabb 
a hibázási arány stb. 

 Ha tanulói felületbe jelentkezünk be, és még nem vagyunk beinvitálva egyetlen osztályba sem, akkor a programban nem vagyunk képesek semmit sem csinálni, ellenben ha meghívtak minket egy osztályba, láthatjuk az egyes játékokat, illetve a legjobb eredményünket az egyes játékokhoz
kapcsolódóan, és a próbálkozások számát.

## 3. Követelménylista
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
KU01 | U_Reg | Regisztráció | 0.2 | A felület eléréséhez felhasználói fiók szükséges. Ehhez természetesen elengedhetetlen egy regisztrációs felület is.
| KU02 | U_Login | Bejelentkezés | 0.2 | A felület eléréséhez bejelentkezés szükséges. A felhasználó ezután tudja elérni a különböző funkciókat, illetve a szerver az ő fiókjához csatoltan tárol különböző adatokat.
| KU03 | U_Logout | Kijelentkezés | 0.2 | Ha a kliens felhasználót szeretne cserélni akkor elengedhetetlen egy kijelentkező felület. Ezután a kliens visszatér a bejelentkező képernyőre
| KU04 | U_FPW | Elfelejtett jelszó | 0.2 | Ha a kliens elfelejti a jelszavát akkor valamilyen módon vissza kell tudnia szerezni, anélkül hogy huzamosabb időt és energiát kellene belefektetnie. Ezt egy email bevitelével megteheti, amire kiküldjük az adott emailhez tartozó felhasználó jelszavát.
| KU05 | U_Perm | Jogosultság | 0.3 | A jogosultság rendszere elengedhetetlen ahhoz, hogy bizonyos felhasználóknak engedélyt tudjunk adni komolyabb dolgokhoz, míg egy általános felhasználónak ne engedjünk ilyent.
| KU06 | U_Opt | Általános beállítások | 0.4 | Mind a mobil, mind a webes felületen elérhetővé kell tennie egy beállítások felületet ahol a felhasználó egyedi preferanciák alapján képes lesz beállítani dolgokat (Pl.: Nyelv, Értesítések, Felhasználó adatainak módosítása)
| KV01 | V_Opt | Tananyagok kezelése | 0.5 | A rendszerbe különböző tananyagokat kell felvinni, illetve azokat időközönkét módosítani is kell, amihez szükség van egy felületre.
| KV02 | V_Exam_Opt | Vizsgák kezelése | 0.5 | A vizsgák kezeléséhez elengedhetetlen egy felület, ahol új vizsgákat tudunk felvinni, a meglévőket szerkeszteni, illetve szükség esetén azokat tudjuk törölni.
| KV03 | V_Classes | Osztályok kezelése | 0.5 | A tanárok számára elengedhetetlen, hogy a diákok osztályokba legyenek sorolva, illetve azoknak az aktivitását is meg lehessen tekinteni. 
| KV04 | V_Topics | Témák kilistázása | 0.6 | A felhasználó kitudja listáztatni az adott témákat (Pl.: Irodalom / Matematika / Történelem)
| KV05 | V_SubTops | Altémák | 0.6 | A felhasználó miután kiválasztja az általa kívánt témát, ezen belül lesznek altémák is (Pl.: Történelem esetén a 2. világháború)
| KV06 | V_Exam | Teszt | 0.6 | Ha egy felhasználó kiválasztotta az általa kívánt témát és altémát lehetősége lesz olvasni az adott témakörben és egy teszt kitöltésére is, amiben megtudhatja mennyire jól értelmezte az adott témakört.
| KV07 | V_MarkedEx | Kiértékelt tesztek | 0.7 | Egy teszt kitöltése után a felhasználó láthatja az elért pontszámát, de ezt tároljuk, és bármikor megtekinthető újra, hogy hogyan is szerepelt a tesztben. Erre alapul majd a ranglista.
KG01 | G_Progress | Profil előrehaladás | 0.7 | Minden témában több altéma van. Ezek kitöltésének állapotát témakörökre bontva, százalékos értékkel tároljuk.
| KG02 | G_Leaderb | Ranglista | 0.8 | Itt megtalálható lesz egy felületen, az adott témakörre, vagy összesített pontszám alapján a legjobb értékelést kapott felhasználók.
| KG03 | G_Noti | Értesítések | 1.0 | A kész program értesítéseket küldhet a felhasználónak különböző események alatt (Pl.: Új témakör érhető el)
| KG03 | G_Offline | Offline működés | 1.1 | A programnak tárolnia kell a felhasználó jelenlegi előrehaladását, akkor is ha valamiért nem tud csatlakozni a szerverre. Az adatokat akkor fogja továbbítani a szerver felé, ha újra kapcsolatot tud létesíteni vele.

Készitette: [Dudás Bálint](https://www.github.com/DudiVok) és [Szűcs Norbert](https://www.github.com/norbert-szucs)


## 4. Rendszerre vonatkozó törvények, szabványok, ajánlások
## 5. Jelenlegi üzleti folyamatok modellje
Szóval milyen az iskola?
Az iskolában tanárok tanítják a diákokat, egyszerer több tucat diákra jut egyetlen tanár 45 perces órák vannak, közötte 10-15 perces szünetekkel.
Naponta általában 6-8 óra van.
A követelményeket törvények írják elő.
A jelenlegi rendszer rugalmatlan és nem veszi figyelembe a diák egyéni igényeit.
Központilag irányított, az előírásoktól 10%-ban lehet eltérni a tanárnak.
Csengetéskor elkezdődik az óra, mindenki bemegy a terembe, ellenőrzik a létszámot és a tanár elmondja a napi anyagot, szemlétetni és feladatokat ad za anyaggal kapcsolatban amiket a diákok megpróbálnak megoldani.
Ha szükséges a tanár seígtséget nyújt a kiosztott feladatok megoldásában.
Az órai anyaghoz kapcsolódó feladatokat otthoni munkára ad ki(házi feladat), kicsengetéskor vége lesz az órának és a tanár elhagyja a termet.
A diákok felkészülnek a következő órára, ahol szintén ugyanez történik.
A nap végére egy diáknak áltaálban 3-4 órányi otthoni munka jut a tanórán felül.
Gyakorlatilag 60 órás "munkahetekkel" dolgoznak a diákok éveken keresztül.
Ez nagyon demotiváló és kimerítő gyermekkorban.
Ez a folyamat 12 éven keresztül tart(ez kicsit több mint amit előremegfontolt nyereségvágyból elkövetett gyilkosságért szoktak adni)



## 6. Igényelt üzleti folyamatok modellje

**6.1.milyen fobb üzleti folyamatokat kell a rendszer megvalósítson**
A program eléréséhez a diákok számára egy webhelyről kell letölteni egy applikációt, a tanárok egy webes felületen kell regisztráljanak.
Az első funkciók a regisztrációs képernyok, ez 2 felületből áll. Az elsőn eldönthető, hogy regisztrálunk e, vagy érvényes hozzáférés birtokában
bejelentkezünk a rendszerbe. Amennyiben még nem rendelkezünk fiókkal a 2. felületre érkezünk a regisztráció gombra való kattintást követoen.
Itt szükséges adatokként meg kell adnunk a felhasználónevet, email címet, jelszót, valamint annak megerősítését. Ezeket az adatokat egy külön adatbázisban javasoljuk eltárolni, 
amihez további felületeket hozunk létre. 

**6.2.milyen felhasználók vannak a rendszerben(hallgató, tanár etc), hogyan jön létre a szerepkör**
A regisztrációs panelen 2 féle különbözo szerepkör közül választhatunk, ha hallgatóként regisztrálunk, akkor a sikeres feliratkozást követően egy applikáció
töltődik le a mobiltelefonunkra, melynek futtatásával hívjuk elő a programot. 
Tanárként egy webes felületre érkezünk.
A tanár felületén 2 panel jelenik meg, "osztályok menedzselése" és "játékok listája" nevekkel. Ha az "osztályok menedzselését" megnyitjuk, akkor 3 panel jelenik meg,
osztály létrehozása, osztály aktivitása, diákok elért eredményei.
Ha az osztály létrehozására nyomunk, akkor egy fül ugrik fel középen: kérem adja meg a kívánt osztályt pl. 11.C, ennek 
beírását követoen megjelenik egy új felület, ahol egy tábla található a felület nagy részén, még pontosan nem definiált adatokkal, a bal oldalon egy kis sávban variációs 
lehetőségek vannak gombok formájában. Hallgató hozzáadása, hallgató törlése, üzenet írása.Ha hallgatót akarunk törölni, vagy hozzáadni, akkor a választott gombra nyomunk, miután
felugrik középen egy kisebb menüsor, itt meg kell adni a hallagtó nevét, neptun kódját, majd a sor alján található töröl, vagy hozzáad paranccsal erosíthetjük meg a szándékot.
A tanár akár egyénenként is írhat, vagy csoportosan is üzenetet a hallgatóknak pl: Józsi csináld meg az x játék 3-as modulját még kétszer, vagy Mindenkinek - Jövő héten dolgozat.
Az üzenet írása gombra való kattintás után egy új ablak ugrik fel, mely részekre van osztva, elszeparálva nagy részben az üzenet írására, az üzenet témája, mint fejléc, az üzenet címzettjei,
ahol felsorolással, vagy az osztály nevével hivatkozhatunk a címzettekre.
A játékok listájára kattintva két panel jelenik meg a játék beállítások, valamint a statisztikák. Az elsovel a tanár módosíthat, játszhat és egyéb még fejlesztés alatt álló cselekményeket végezhet.
A másodikkal az osztályok, valamint az egyes diákok által elért teszteredményeket tároló fül jelenik meg. Itt választható a prezentáció módja, diagramm, függvény, táblázat etc., valamint a lekért
adatok is megadhatóak, így számos szempontból elemezhetové válnak az eltárolt adatok.
Ezekhez szükségünk van egy újabb adatbázis modellre, a fent ismertetett és bemutatott felületekre, a gombok, menük, egyéb funkciók megvalósítására, valamint egy szerver-kliens kapcsolat létesítéséhez
tervezett modellre.

Diákként a belépést követően megjelennek a témakörök. ABC sorrendben fentrol lefelé haladva lehet áttekinteni oket pl: irodalom.. matematika.. történelem.., alapból az elso 3 leckét mutatja a mobiltelefon 
kijelzoje közvetlenül a témakör megnevezése alatt. Balról jobbra haldva ABC sorrendben mehetünk végig a leckéken pl. Arany János.. Balassa Bálint.. Petőfi Sándor.. . A konkrét leckére kattintva eloször a leckéhez
tartozó leírás, ismeretanyag, az elsajátítandó dolgok következnek, majd azok végiglapozását követoen egy vizsga gombra kattintva lehet számot adni a tudásról. Itt majd különféle tesztek lesznek jelenleg feleletválasztós
3 rossz és egy jó válasz jelenik meg a képernyon, a jóra kattintva extra információk, érdekességek jelennek meg pluszban az adott anyagról. Azt is kiírja, hogy mennyi idot vett igénybe a válaszadás és ez
hány pontot ért. Teljesítés után tovább gombra nyomva visszatérünk a témakörökhöz.




## 7. Használati esetek
Szereplők:
- Tanár
- Diák

Tevékenységek:
- Tanár: 
	- azonosító alapú regisztráció
	- bejelentkezés tanárként
	- tananyagok létrehozása és kezelése
	- saját tananyagokkal kapcsolatos statisztikák megtekintése
	- profil szerkesztése
- Diák:
	- regisztráció diákként
	- bejelentkezés diákként
	- tananyag megtekintése
	- tesztek megoldása
	- statisztikák megtekintése
	- profil szerkesztése
## 8. Megfeleltetés, hogyan fedik le a használati esetek a követelményeket
## 9. Képernyő tervek
A képernyő tervek véglegesítés előtt a következő linken érhetőek el:
[https://xd.adobe.com/view/eff62009-2522-4066-7d5b-3c6d5682baeb-99c7/](https://xd.adobe.com/view/eff62009-2522-4066-7d5b-3c6d5682baeb-99c7/)

## 10. Forgatókönyv

__10.1 Applikációs felület (csak diákoknak)__
- __*10.1.1 Regisztráció:*__ Az applikáció elindítása után, a kezdőképernyőn a *Regisztráció* gomb segítségével tudunk regisztrálni. A gomb lenyomása után megadhatjuk adatainkat *(Felhasználónév, E-mail, Jelszó, Jelszó megerősítése)*, majd a *Regisztráció* gomb megnyomásával, amennyiben helyes adatokat adtunk meg, a *''Sikeres regisztráció''* üzenet fogad minket, melyet a *Folytatás* gomb lenyomásával nyugtázhatunk, mellyel együtt be is léptet a rendszer.
- __*10.1.2 Bejelentkezés:*__ Az applikáció elindítás után, a kezdőképernyőn a *Bejelentkezés* gomb segítségével tudunk belépni a fiókunkba, amennyiben már előtte regisztráltunk egyet. A gomb lenyomása után megadhatjuk a bejelentkezéshez szükséges adataink *(Felhasználónév, Jelszó)*, és amennyiben helyes adatokat adtunk meg, úgy a *Bejelentkezés* gomb lenyomásával sikeresen beléphetünk a fiókunkba.
- __*10.1.3 Elfelejtett jelszó*__: Ammenyiben elfelejtettük jelszavunkat, úgy az applikáció elindítása utána, a *Bejelentkezés* gomb lenyomása után, az *Elfelejtett jelszó* szövegre kattintva kérhetjük jelszavunk változtatását, melyhez e-mailben fogjuk megkapni az utasításokat. Itt a helyes e-mail megadása után, a *Jelszó változtatás* gombra rányomva, az *''Ellenőrizd az e-mail fiókod!''* üzenet fog fogadni minket, amennyiben sikerült kiküldeni az e-mailt. A *Folytatás* gombra nyomva visszakerülünk a bejelentkezési menübe.
- __*10.1.4 Tananyag kiválasztása*__: Sikeres bejelentkezést követően, rögtön a tananyagok listája fogad minket, de az alsó menü, bal oldali ikonját lenyomva bármikor visszatérhetünk ide. Itt kategóriánként *(Magyar irodalom, Történelem, Matek, stb.)* láthatjuk felsorolva az adott anyagokat. A megnézéséhez, csupán rákell nyomni az általunk kiválasztott tananyagra. A tananyagon belül az oldalak között, az oldal balra, és jobbra húzásával tudunk lapozni előre hátra. Minden tananyag végén, egy vizsga fogad minket.
- __*10.1.5 Vizsgázás*__: Minden tananyag végén találhatunk egy vizsgát, melyet a *Vizsga* gomb lenyomásával tudunk elkezdeni.
- __*10.1.6 Ranglista*__: A rendszer az elért pontszámaink alapján ranglistát állít fel. Ezen ranglistát a bejelentkezést követően a bal alsó menünk a középső  :trophy: ikonját lenyomva tekinthetjük meg. Az első nézetben az összesített pontok alapján felállított ranglistát láthatjuk, míg a felső menüben, adott tantárgynak megfelelő ikon lenyomásával nézhetjük meg tantárgyanként is a ranglistát.
- __*10.1.7 Profil adatok*__: Megtekinthetjük, illetve szerkeszthetjük is profilunkat. Ezt, a bejelentkezést követően, a bal alsó menünk jobb szélső :bust_in_silhouette: ikon lenyomását követően tehetjük meg. Itt tekinthetjük meg a fiókunkkal kapcsolatos adatokat *(Előrehaladás, elkészült tananyagok száma, pontszámok, stb.)*. A jobb felül találtható *fogaskerés* ikonra nyomva pedig beállíthatjuk profilunkat, illetve megváltoztathatjuk adatainkat.

__10.2 Webes felület__:
- __*10.2.1 Regisztráció:*__: A weboldal felkeresése után, a kezdőképernyőn a *Regisztráció* gomb segítségével tudunk regisztrálni. A gomb lenyomása utána, döntenünk kell, hogy tanári vagy diák fiókot szeretnénk létrehozni. A megfelelő hasábba megadhatjuk adatainkat *(Felhasználónév, E-mail, Jelszó, Jelszó megerősítése)*, majd a *Regisztráció* gomb megnyomásával, amennyiben helyes adatokat adtunk meg, a *''Sikeres regisztráció''* üzenet fogad minket, melyet a *Folytatás* gomb lenyomásával nyugtázhatunk, mellyel együtt be is léptet a rendszer.
- __*10.2.2 Bejelentkezés:*__:  A weboldal felkeresése után, a kezdőképernyőn a jobb felső sarokban található *Bejelentkezés* gomb segítségével tudunk belépni a fiókunkba, amennyiben már előtte regisztráltunk egyet. A gomb lenyomása után megadhatjuk a bejelentkezéshez szükséges adataink *(Felhasználónév, Jelszó)*, és amennyiben helyes adatokat adtunk meg, úgy a *Bejelentkezés* gomb lenyomásával sikeresen beléphetünk a fiókunkba.
- __*10.2.3 Elfelejtett jelszó*__: Ammenyiben elfelejtettük jelszavunkat, úgy a weboldal felkeresése utána, a jobb felső sarokban található *Bejelentkezés* gomb lenyomása után, az *Elfelejtett jelszó* szövegre kattintva kérhetjük jelszavunk változtatását, melyhez e-mailben fogjuk megkapni az utasításokat. Itt a helyes e-mail megadása után, a *Jelszó változtatás* gombra rányomva, az *''Ellenőrizd az e-mail fiókod!''* üzenet fog fogadni minket, amennyiben sikerült kiküldeni az e-mailt. A *Folytatás* gombra nyomva visszakerülünk a bejelentkezési menübe.
- __*10.2.4 Tananyag kiválasztása*__:  Sikeres bejelentkezést követően, rögtön a tananyagok listája fogad minket, de a bal oldali menü, *Tantárgyak* menüpontot kiválasztva bármikor visszatérhetünk ide. Itt kategóriánként *(Magyar irodalom, Történelem, Matek, stb.)* láthatjuk felsorolva az adott anyagokat. A megnézéséhez, csupán rákell nyomni az általunk kiválasztott tananyagra. A tananyagon belül az oldalak között, az oldal bal és jobb oldalán található nyilak lenyomásával tudunk közlekedni. Minden tananyag végén, egy vizsga fogad minket.
- __*10.2.5 Vizsgázás*__: Minden tananyag végén találhatunk egy vizsgát, melyet a *Vizsga* gomb lenyomásával tudunk elkezdeni.
- __*10.2.6 Ranglista*__: A rendszer az elért pontszámaink alapján ranglistát állít fel. Ezen ranglistát a bejelentkezést követően a bal oldali menü, *Ranglista* menüpontot kiválasztva tekinthetjük meg. Az első nézetben az összesített pontok alapján felállított ranglistát láthatjuk, míg a felső menüben, adott tantárgynak megfelelő ikon lenyomásával nézhetjük meg tantárgyanként is a ranglistát.
- __*10.2.7 Profil adatok*__: Megtekinthetjük, illetve szerkeszthetjük is profilunkat. Ezt, a bejelentkezést követően,  bal oldali menü, *Fiókom* menüpontot kiválasztva tehetjük meg. Itt tekinthetjük meg a fiókunkkal kapcsolatos adatokat *(Előrehaladás, elkészült tananyagok száma, pontszámok, stb.)*, illetve szerkeszthetjük adatainkat.

## 11. Funkció – követelmény megfeleltetés

1. Ki és bejelentkeztetési lehetőség illetve regisztráció (Regisztráció külön diák és tanár részére).
-regisztráció: A felület eléréséhez felhasználói fiók szükséges. Ehhez természetesen elengedhetetlen egy regisztrációs felület is.
-bejelentkezés: A felület eléréséhez bejelentkezés szükséges. A felhasználó ezután tudja elérni a különböző funkciókat, illetve a 
szerver az ő fiókjához csatoltan tárol különböző adatokat.
-kijelentkezés: Ha a kliens felhasználót szeretne cserélni akkor elengedhetetlen egy kijelentkező felület. Ezután a kliens visszatér a 
bejelentkező képernyőre
-elfelejtett jelszó: Ha a kliens elfelejti a jelszavát akkor valamilyen módon vissza kell tudnia szerezni, anélkül hogy huzamosabb időt 
és energiát kellene belefektetnie. Ezt egy email bevitelével megteheti, amire kiküldjük az adott emailhez tartozó felhasználó jelszavát.


2. Általános fiókbeállítások
-általános beállítások: Mind a mobil, mind a webes felületen elérhetővé kell tennie egy beállítások felületet ahol a felhasználó egyedi 
preferanciák alapján képes lesz beállítani dolgokat (Pl.: Nyelv, Értesítések, Felhasználó adatainak módosítása).
-jogosultság: A jogosultság rendszere elengedhetetlen ahhoz, hogy bizonyos felhasználóknak engedélyt tudjunk adni komolyabb dolgokhoz, 
míg egy általános felhasználónak ne engedjünk ilyent. Például a tanárok, akik szerkeszthetik akár a feladatokat, míg diákként erre nem 
nyílik mód.
-értesítések: A kész program értesítéseket küldhet a felhasználónak különböző események alatt (Pl.: Új témakör érhető el)

3. Ranglista témakörökre osztva
-kiértékelt tesztek: Egy teszt kitöltése után a felhasználó láthatja az elért pontszámát, de ezt tároljuk, és bármikor megtekinthető 
újra, hogy hogyan is szerepelt a tesztben. Erre alapul majd a ranglista.
-ranglista: Itt megtalálható lesz egy felületen, az adott témakörre, vagy összesített pontszám alapján a legjobb értékelést kapott 
felhasználók.

4. Általános témakörök felsorolása
A felhasználó kitudja listáztatni az adott témákat (Pl.: Irodalom / Matematika / Történelem)

5. Témakörökre osztott témák
A felhasználó miután kiválasztja az általa kívánt témát, ezen belül lesznek altémák is (Pl.: Történelem esetén a 2. világháború)

6. Témánkénti előrehaladás jelzése
-teszt: Ha egy felhasználó kiválasztotta az általa kívánt témát és altémát lehetősége lesz olvasni az adott témakörben és egy teszt 
kitöltésére is, amiben megtudhatja mennyire jól értelmezte az adott témakört. 
-profil előrehaladás: Minden témában több altéma van. Ezek kitöltésének állapotát témakörökre bontva, százalékos értékkel tároljuk.

7. Offline elérhetőség a már megnyitott témáknál
A programnak tárolnia kell a felhasználó jelenlegi előrehaladását, akkor is ha valamiért nem tud csatlakozni a szerverre. Az adatokat 
akkor fogja továbbítani a szerver felé, ha újra kapcsolatot tud létesíteni vele.

## 12. Fogalomszótár
