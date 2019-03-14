## 1. Jelenlegi helyzet
A program az oktatás jelenlegi problémáira kínál megoldást, mely egy sokkal inkább interaktívabb és rugalmasabb tanulást biztosít a tanulóknak számára akár az iskola keretein kívül is. 

A felmerülő problémák megoldásai:
- a diákok az igényeikhez mérten tudják használni
- teljesítmény alapú jutalom rendszer
- interaktív és játékos számonkérés a tananyagokat követően
- modern, aktuális technológiákat használó igényes rendszer

Így egy modernebb gondolatú, a gyerekek számára interaktívabb, és, játékosabb tanulási lehetőséget kívánunk biztosítani, amit bárhol és bármikor tudnak használni a tanuláshoz. 
## 2. Vágyálom rendszer
## 3. Követelménylista
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
A program eléréséhez a diákok számára egy webhelyrol kell letölteni egy applikációt, a tanárok egy webes felületen kell regisztráljanak.
Az elso funkciók a regisztrációs képernyok, ez 2 felületbol áll. Az elson eldöntheto, hogy regisztrálunk e, vagy érvényes hozzáférés birtokában
bejelentkezünk a rendszerbe. Amennyiben még nem rendelkezünk fiókkal a 2. felületre érkezünk a regisztráció gombra való kattintást követoen.
Itt szükséges adatokként meg kell adnunk a felhasználónevet, email címet, jelszót, valamint annak megerosítését. Ezeket az adatokat egy külön adatbázisban javasoljuk eltárolni, 
amihez további felületeket hozunk létre. 
**6.2.milyen felhasználók vannak a rendszerben(hallgató, tanár etc), hogyan jön létre a szerepkör**
A regisztrációs panelen 2 féle különbözo szerepkör közül választhatunk, ha hallgatóként regisztrálunk, akkor a sikeres feliratkozást követoen egy applikáció
töltodik le a mobiltelefonunkra, melynek futtatásával hívjuk elo a programot. Tanárként egy webes felületre érkezünk.
A tanár felületén 2 panel jelenik meg, "osztályok menedzselése" és "játékok listája" nevekkel. Ha az "osztályok menedzselését" megnyitjuk, akkor 3 panel jelenik meg,
osztály létrehozása, osztály aktivitása, diákok elért eredményei. Ha az osztály létrehozására nyomunk, akkor egy fül ugrik fel középen: kérem adja meg a kívánt osztályt pl. 11.C, ennek 
beírását követoen megjelenik egy új felület, ahol egy tábla található a felület nagy részén, még pontosan nem definiált adatokkal, a bal oldalon egy kis sávban variációs 
lehetoségek vannak gombok formájában. Hallgató hozzáadása, hallgató törlése, üzenet írása. Ha hallgatót akarunk törölni, vagy hozzáadni, akkor a választott gombra nyomunk, miután
felugrik középen egy kisebb menüsor, itt meg kell adni a hallagtó nevét, neptun kódját, majd a sor alján található töröl, vagy hozzáad paranccsal erosíthetjük meg a szándékot.
A tanár akár egyénenként is írhat, vagy csoportosan is üzenetet a hallgatóknak pl: Józsi csináld meg az x játék 3-as modulját még kétszer, vagy Mindenkinek - Jövo héten dolgozat.
Az üzenet írása gombra való kattintás után egy új ablak ugrik fel, mely részekre van osztva, elszeparálva nagy részben az üzenet írására, az üzenet témája, mint fejléc, az üzenet címzettjei,
ahol felsorolással, vagy az osztály nevével hivatkozhatunk a címzettekre.
A játékok listájára kattintva két panel jelenik meg a játék beállítások, valamint a statisztikák. Az elsovel a tanár módosíthat, játszhat és egyéb még fejlesztés alatt álló cselekményeket végezhet.
A másodikkal az osztályok, valamint az egyes diákok által elért teszteredményeket tároló fül jelenik meg. Itt választható a prezentáció módja, diagramm, függvény, táblázat etc., valamint a lekért
adatok is megadhatóak, így számos szempontból elemezhetové válnak az eltárolt adatok.
Ezekhez szükségünk van egy újabb adatbázis modellre, a fent ismertetett és bemutatott felületekre, a gombok, menük, egyéb funkciók megvalósítására, valamint egy szerver-kliens kapcsolat létesítéséhez
tervezett modellre.
Diákként a belépést követoen megjelennek a témakörök. ABC sorrendben fentrol lefelé haladva lehet áttekinteni oket pl: irodalom.. matematika.. történelem.., alapból az elso 3 leckét mutatja a mobiltelefon 
kijelzoje közvetlenül a témakör megnevezése alatt. Balról jobbra haldva ABC sorrendben mehetünk végig a leckéken pl. Arany János.. Balassa Bálint.. Petofi Sándor.. . A konkrét leckére kattintva eloször a leckéhez
tartozó leírás, ismeretanyag, az elsajátítandó dolgok következnek, majd azok végiglapozását követoen egy vizsga gombra kattintva lehet számot adni a tudásról. Itt majd különféle tesztek lesznek jelenleg feleletválasztós
3 rossz és egy jó válasz jelenik meg a képernyon, a jóra kattintva extra információk, érdekességek jelennek meg pluszban az adott anyagról. Azt is kiírja, hogy mennyi idot vett igénybe a válaszadás és ez
hány pontot ért. Teljesítés után tovább gombra nyomva visszatérünk a témakörökhöz.

Jelenlegi üzleti folyamatok modellje még nem áll rendelkezésre, elkészültét követoen a fentiek bovíthetok.


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
- __*Regisztráció:*__ Az applikáció elindítása után, a kezdőképernyőn a *Regisztráció* gomb segítségével tudunk regisztrálni. A gomb lenyomása után megadhatjuk adatainkat *(Felhasználónév, E-mail, Jelszó, Jelszó megerősítése)*, majd a *Regisztráció* gomb megnyomásával, amennyiben helyes adatokat adtunk meg, a *''Sikeres regisztráció''* üzenet fogad minket, melyet a *Folytatás* gomb lenyomásával nyugtázhatunk, mellyel együtt a be is léptet a rendszer.
- __*Bejelentkezés:*__ Az applikáció elindítás után, a kezdőképernyőn a *Bejelentkezés* gomb segítségével tudunk belépni a fiókunkba, amennyiben már előtte regisztráltunk egyet. A gomb lenyomása után megadhatjuk a bejelentkezéshez szükséges adataink *(Felhasználónév, Jelszó)*, és amennyiben helyes adatokat adtunk meg, úgy a *Bejelentkezés* gomb lenyomásával sikeresen beléphetünk a fiókunkba.
- __*Elfelejtett jelszó*__: Ammenyiben elfelejtettük jelszavunkat, úgy az applikáció elindítása utána, a *Bejelentkezés* gomb lenyomása után, az *Elfelejtett jelszó* szövegre kattintva kérhetjük jelszavunk változtatását, melyhez e-mailben fogjuk megkapni az utasításokat. Itt a helyes e-mail megadása után, a *Jelszó változtatás* gombra rányomva, az *''Ellenőrizd az e-mail fiókod!''* üzenet fog fogadni minket, amennyiben sikerült kiküldeni az e-mailt. A *Folytatás* gombra nyomva visszakerülünk a bejelentkezési menübe.
- __*Tananyag kiválasztása*__: Sikeres bejelentkezést követően, rögtön a tananyagok listája fogad minket, de az alsó menü, bal oldali ikonját lenyomva bármikor visszatérhetünk ide. Itt kategóriánként *(Magyar irodalom, Történelem, Matek, stb.)* láthatjuk felsorolva az adott anyagokat. A megnézéséhez, csupán rákell nyomni az általunk kiválasztott tananyagra. A tananyagon belül az oldalak között, az oldal balra, és jobbra húzásával tudunk lapozni előre hátra. Minden tananyag végén, egy vizsga fogad minket.
- __*Vizsgázás*__: Minden tananyag végén találhatunk egy vizsgát, melyet a *Vizsga* gomb lenyomásával tudunk elkezdeni.
- __*Ranglista*__: A rendszer az elért pontszámaink alapján ranglistát állít fel. Ezen ranglistát a bejelentkezést követően a bal alsó menünk a középső  :trophy: ikonját lenyomva tekinthetjük meg. Az első nézetben az összesített pontok alapján felállított ranglistát láthatjuk, míg a felső menüben, adott tantárgynak megfelelő ikon lenyomásával nézhetjük meg tantárgyanként is a ranglistát.
- __*Profil adatok*__: Megtekinthetjük, illetve szerkeszthetjük is profilunkat. Ezt, a bejelentkezést követően, a bal alsó menünk jobb szélső :bust_in_silhouette: ikon lenyomását követően tehetjük meg. Itt tekinthetjük meg a fiókunkkal kapcsolatos adatokat *(Előrehaladás, elkészült tananyagok száma, pontszámok, stb.)*. A jobb felül találtható *fogaskerés* ikonra nyomva pedig beállíthatjuk profilunkat, illetve megváltoztathatjuk adatainkat.

__10.2 Webes felület__

## 11. Funkció – követelmény megfeleltetés
## 12. Fogalomszótár
