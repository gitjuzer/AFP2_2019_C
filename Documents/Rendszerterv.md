## 1. A rendszer célja

A rendszer célja, hogy tanulási lehetőséget biztosítson a diákok számára játékos formában, illetve egy könnyen menedzselhető felületet a tanárok számára, akik feltölthetik ide tananyagaikat. A diákok kiválaszhatnak tananyagokat, amiknek a végére érve egy játékos feladványt kitöltve mérettethetik meg tudásukat. A teljesítményeket mind a diákok, mind a tanárok képesek követni egy ranglista által. Így próbáljuk a diákokat motiválni a tanulásra, és elérni, hogy úgy fejlődhessenek, hogy közbe jól érzik magukat.

## 2. Projekt terv

Projekt terv: Itt soroljuk fel a rendszer létrehozásához rendelkezésre álló erőforrásokat. Ezek
közül a két legfontosabb az emberek és az idő. Fontos tisztázni a felelősségi köröket. Itt adjuk
meg az ütemterv alapján a mérföldköveket. Részei:

**Projekt szerepkörök, felelősségek**
- szerepkörök
    - scrum master: Bettenbuk Dániel
    - senior fejlesztők: 1. Csutorás Péter, 2. Berényi Szabolcs, 3.Guth Dániel, 4.  Hajas Gábor
    - junior fejlesztők: 1. Dudás Bálint, 2. Gajdár Krisztián, 3. Szűcs Norbert, 4. Offenbacher Géza, 5. Lázár Dávid,  6. Veréb Dávid,                            7. Vincze Flórián, 8. Dávid Gergely, 9. Madaras József Károly
- felelősségek:
    - scrum master: A Scrum mester felügyeli és megkönnyíti a folyamat fenntartását, segíti a csapatot, ha problémába ütközik, illetve                      felügyeli, hogy mindenki betartja-e a Scrum alapvető
                   szabályait. Ilyen például, hogy a Sprint időtartama nem térhet el az előre megbeszélttől, még akkor sem, ha az                          elvállalt munka nem lesz kész. Lényegében ő a projekt menedzser.
    - senior fejlesztő: A junior fejlesztők munkájának felügyelete és megkönnyítése tanácsadás által, segíthetnek kisebb projektelemek                           elkészítésében is.
    - junior fejlesztő: A projekt elkészítése.
**Projekt munkások és felelősségeik**
- Webfelület: Guth Dániel, Gajdár Krisztián, Veréb Dávid
- Mobilalkalmazás: Hajas Gábor, Berényi Szabolcs, Dudás Bálint, Szűcs Norbert, Offenbacher Géza
- Backend: Lázár Dávid, Madaras József Károly, Dávid Gergely, Vincze Flórián

A projekt ezen fázisa még tervezés alatt, a pontos feladatok még nem kerültek megállapításra, TODO
**Ütemterv, Mérföldkövek**
2019. 04. 04. A rendszerterv elkészítésének végdátuma
2019. 04. 18. Adatbázis, kezelőfelület, szerver-kliens és néhány egyszerűbb funkció implementálása, első átfogó tesztek
2019. 05. 09. Bonyolultabb funkciók, extra adatbázisok, tananyagok, mintavizsgák feltöltése, alpha tesztre kész
2019. 05. 23. A program átadásának céldátuma

by Vincze Flórián,Dávid Gergely

## 3. Üzleti folyamatok modellje
## 4. Követelmények

Modul | Megnevezés | Hogyan elégítjük ki a követelményt?
---|---|---
<architektúra terv hivatkozás> | Regisztráció | funkcionálos terv hivatkozás |
 - | Bejelentkezés |  |
 - | Kijelentkezés |  |
 - | Elfelejtett jelszó |  |
 - | Általános beállítások |  |
 - | Témák kilistázása |  |
 - | Teszt |  |
 - | Profil előrehaladás |  |
 - | Ranglista | |
 - | G_Offline | |

## 5. Funkcionális terv
## 6. Fizikai környezet
Szervergép a backend futtatásához, számítógép, telefon a felhasználói oldalon.

## 7. Absztrakt domain modell
![Alt text](./Abstract Domain Modell Diagram.png)
<img src="./Abstract Domain Modell Diagram.png">

 Megnevezés | Mezők | Leírás | Kapcsolat
---|---|---|---
 User | id, name, passwd, e-mail | Abstract user osztály | Gyermek osztályai: Lecture, Student, Admin
 Class | id, name, school | A Class egy osztályt valósít meg | Az osztály egy iskolához tartozik
 Student | birth, xp | Tanulókat valósít meg | A User gyermekosztálya
 Teacher | lectures | Tanárokat valósít meg | A User gyermekosztálya és leckék tartoznak hozzá
 Lecture | id, title, subject, description, content | Leckéket valósít meg | Egy lecke egy tanárhoz tartozik és van egy tesztje
 Task | id, subject, lecture, type,  question, answers| Teszteket valósít meg | Minden leckéhez egy teszt tartozik
 Admin |  | Adminokat valósít meg | A User gyermekosztálya

## 8. Architekturális terv
A rendszer 3 rétegből fog állni. Adatbázis réteg az első, erre épül egy logikai réteg, majd a prezentációs réteg. A prezentációs réteg 2 részből fog állni, egy webes felület és egy mobil alkalmazás. A logikai rétek köti össze az adatbázis és prezentációs réteget. A felmerülő változásokat a webes felületen automatikusan frissítésre kerülnek, a felhasználóknak ezzel kapcsolatban nincs teendője. Mobil alkalmazás esetén az alkalmazás automtikusan frissül, amennyiben ez nincs engedélyezve figyelmeztető üzenet jelenik meg az elérhető frissítésről. Meghatározott tervezési minták és alapelvek betartásával a rendszer könnyen és következetesen bővíthető. A rendszer modulokból és pluginekből fog áll, ezzel is a bővtést megkönnyítve.

Modul | ID | Név | V. | Kifejtés
--- | ---| --- | --- | ---
KU01 | U_Reg | Regisztráció | 0.2 | A felület eléréséhez felhasználói fiók szükséges. Ehhez természetesen elengedhetetlen egy regisztrációs felület is.
| KU02 | U_Login | Bejelentkezés | 0.2 | A felület eléréséhez bejelentkezés szükséges. A felhasználó ezután tudja elérni a különböző funkciókat, illetve a szerver az ő fiókjához csatoltan tárol különböző adatokat.
| KU03 | U_Logout | Kijelentkezés | 0.2 | Ha a kliens felhasználót szeretne cserélni akkor elengedhetetlen egy kijelentkező felület. Ezután a kliens visszatér a bejelentkező képernyőre
| KU04 | U_FPW | Elfelejtett jelszó | 0.2 | Ha a kliens elfelejti a jelszavát akkor valamilyen módon vissza kell tudnia szerezni, anélkül hogy huzamosabb időt és energiát kellene belefektetnie. Ezt egy email bevitelével megteheti, amire kiküldjük az adott emailhez tartozó felhasználó jelszavát.
| KU05 | U_Perm | Jogosultság | 0.3 | A jogosultság rendszere elengedhetetlen ahhoz, hogy bizonyos felhasználóknak engedélyt tudjunk adni komolyabb dolgokhoz, míg egy általános felhasználónak ne engedjünk ilyent.
| KU06 | U_Opt | Általános beállítások | 0.4 | Mind a mobil, mind a webes felületen elérhetővé kell tennie egy beállítások felületet ahol a felhasználó egyedi preferanciák alapján képes lesz beállítani dolgokat (Pl.: Nyelv, Értesítések, Felhasználó adatainak módosítása)
 KV01 | V_Topics | Témák kilistázása | 0.5 | A felhasználó kitudja listáztatni az adott témákat (Pl.: Irodalom / Matematika / Történelem)
| KV02 | V_SubTops | Altémák | 0.5 | A felhasználó miután kiválasztja az általa kívánt témát, ezen belül lesznek altémák is (Pl.: Történelem esetén a 2. világháború)
| KV03 | V_Exam | Teszt | 0.6 | Ha egy felhasználó kiválasztotta az általa kívánt témát és altémát lehetősége lesz olvasni az adott témakörben és egy teszt kitöltésére is, amiben megtudhatja mennyire jól értelmezte az adott témakört.
| KV04 | V_MarkedEx | Kiértékelt tesztek | 0.6 | Egy teszt kitöltése után a felhasználó láthatja az elért pontszámát, de ezt tároljuk, és bármikor megtekinthető újra, hogy hogyan is szerepelt a tesztben. Erre alapul majd a ranglista.
KG01 | G_Progress | Profil előrehaladás | 0.7 | Minden témában több altéma van. Ezek kitöltésének állapotát témakörökre bontva, százalékos értékkel tároljuk.
| KG02 | G_Leaderb | Ranglista | 0.8 | Itt megtalálható lesz egy felületen, az adott témakörre, vagy összesített pontszám alapján a legjobb értékelést kapott felhasználók.
| KG03 | G_Noti | Értesítések | 1.0 | A kész program értesítéseket küldhet a felhasználónak különböző események alatt (Pl.: Új témakör érhető el)
| KG03 | G_Offline | Offline működés | 1.1 | A programnak tárolnia kell a felhasználó jelenlegi előrehaladását, akkor is ha valamiért nem tud csatlakozni a szerverre. Az adatokat akkor fogja továbbítani a szerver felé, ha újra kapcsolatot tud létesíteni vele.

A logikai réteg jogkörtől függően enged hozzáférést az adatokhoz az adatbázisban ezzel fenntartva a biztonságot.
## 9. Adatbázis terv
## 10. Implementációs terv
## 11. Tesztterv
## 12. Telepítési terv
A rendszer  bevezetésekor szükség  lehet  a  személyzet  képzésére, mely  szintén megállapodás tárgyát képezi,   figyelembe   véve   a   ráfordítások   nagyságát.   Ez   a   lépés   nagyban   javíthata   a   rendszer hatékonyságát, illetve segíti a szoftver „személyre szabását”, a jogosultsági szintek helyes beállítását.
## 13. Karbantartási terv
Az  üzemeltetés  a  rendszergazda  feladata.  A  rendszergazda  lehet  a  megrendelő  munkatársa,  vagy külső munkaerő is. Az üzemeltetés során elvárás:
- a rendszeres biztonsági mentés
- meghibásodás esetén az utolsó konzisztens állapot visszaállítása
- a rendszer frissítése
- az általános átvizsgálás során észlelt hibák javítása
- bejelentések során érkezett hibák javítása
- a munkatársak igényeinek folyamatos figyelése és felmérése
- biztonsági beállítások folyamatos felülvizsgálata és szükség esetén korrigálásuk.
